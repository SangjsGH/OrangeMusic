package com.example.machenike.orangemusic10.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.Service.PlayService;
import com.example.machenike.orangemusic10.adapter.SearchAdapter1;
import com.example.machenike.orangemusic10.entity.Search1;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Search1Activity extends AppCompatActivity {
    private final String API = "https://music.niubishanshan.top/api/v2/music/search/";
    @BindView(R.id.sv)
    SearchView sv;
    @BindView(R.id.song_item)
    ListView songItem;
    private String url;
    private SearchAdapter1 adapter;
    private String Searchsong;
    private List<Search1.DataBean.SongListBean> songListBean=new ArrayList<>();
    private PlayService playService = new PlayService();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_view);
        ButterKnife.bind(this);
        adapter = new SearchAdapter1(this);
        songItem.setAdapter(adapter);
        AnimationSet set = new AnimationSet(false);
        Animation animation = new AlphaAnimation(0, 1);   //AlphaAnimation 控制渐变透明的动画效果
        animation.setDuration(300);     //动画时间毫秒数
        set.addAnimation(animation);    //加入动画集合

        LayoutAnimationController controller = new LayoutAnimationController(set, 1);

        ListView listview = (ListView) this.findViewById(R.id.song_item);
        listview.setLayoutAnimation(controller);   //ListView 设置动画效果
        Intent intent = getIntent();
        sv.setIconifiedByDefault(false);
        //显示搜索按钮
        sv.setSubmitButtonEnabled(true);
        //默认提示文本
        sv.setQueryHint("请输入歌曲名或歌手名");

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            //单击搜索按钮的监听
            @Override
            public boolean onQueryTextSubmit(String query) {
                Searchsong = sv.getQuery().toString();
                if (Searchsong!=null){

                    url =API+Searchsong;
                }
                    getData();
                return false;
            }

            //输入字符的监听
            @Override
            public boolean onQueryTextChange(String newText) {
                if (TextUtils.isEmpty(newText)) {
                    songItem.setVisibility(View.GONE);
                    songItem.clearTextFilter();
                } else {
                    songItem.setVisibility(View.VISIBLE);
                    songItem.setFilterText(newText);

                }
                return true;
            }
        });
        Searchsong = intent.getStringExtra("Searchsong");
        if (Searchsong!=null){
            url =API+Searchsong;
            getData();
            playSong();
        }
    }

    private void playSong(){
        songItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String songMid =songListBean.get(position).getSongMid();
                //String URL ="https://v1.itooi.cn/tencent/url?id="+songMid+"&quality=192";
                playService.playMusic(songMid);
                Intent intent = new Intent(Search1Activity.this,MusiconlineActivity.class);
               // intent.putExtra("songMid", songMid);
                startActivity(intent);
                // String URL ="https://v1.itooi.cn/tencent/url?id="+songMid+"&quality=192";

            }
        });
    }

    private void getData() {
        RequestParams params = new RequestParams(url);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<Search1>() {
            @Override
            public void onSuccess(Search1 result) {
                if (result != null) {
                    Search1.DataBean data = result.getData();
                    if (data != null) {
                        songListBean = data.getSongList();
                        adapter.setDatas(songListBean);
                        songItem.setAdapter(adapter);
                        songListBean.addAll(songListBean);
                    }
                }

            }



            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                System.out.println(ex);
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
}
