package com.example.machenike.orangemusic10.Activity;

import android.content.Intent;
import android.os.Bundle;
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
import com.example.machenike.orangemusic10.adapter.SearchAdapter;
import com.example.machenike.orangemusic10.entity.Ranking;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity {
    private final String API ="https://music.niubishanshan.top/api/v2/music/songList/4";
    private List<Ranking.DataBean.SongListBean> list;
    private SearchAdapter adapter;
    @BindView(R.id.sv)
    SearchView sv;
    @BindView(R.id.lv)
    ListView lv;
    private CharSequence query1;
    private List<Ranking.DataBean.SongListBean> songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_music);
        ButterKnife.bind(this);
        adapter = new SearchAdapter(this);
        lv.setAdapter(adapter);
        AnimationSet set = new AnimationSet(false);
        Animation animation = new AlphaAnimation(0, 1);   //AlphaAnimation 控制渐变透明的动画效果
        animation.setDuration(300);     //动画时间毫秒数
        set.addAnimation(animation);    //加入动画集合

        LayoutAnimationController controller = new LayoutAnimationController(set, 1);

        ListView listview = (ListView) this.findViewById(R.id.lv);
        listview.setLayoutAnimation(controller);   //ListView 设置动画效果
        getData();

/*        lv.setTextFilterEnabled(true);
        //一开始不显示*/
 /*       lv.setVisibility(View.GONE);
        //搜索框不自动缩小为一个搜索图标，而是match_parent*/
        sv.setIconifiedByDefault(false);
        //显示搜索按钮
        sv.setSubmitButtonEnabled(true);
        //默认提示文本
        sv.setQueryHint("请输入歌曲名或歌手名");

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            //单击搜索按钮的监听
            @Override
            public boolean onQueryTextSubmit(String query) {
                query1 = sv.getQuery();
                Intent intent =new Intent(SearchActivity.this,Search1Activity.class);
                intent.putExtra("Searchsong",query1.toString());
                startActivity(intent);
                return false;
            }

            //输入字符的监听
            @Override
            public boolean onQueryTextChange(String newText) {
                if (TextUtils.isEmpty(newText)) {
                    lv.setVisibility(View.GONE);
                    lv.clearTextFilter();
                } else {
                    lv.setVisibility(View.VISIBLE);
                    lv.setFilterText(newText);

                }
                return true;
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (songList!=null){
                    String songName = songList.get(position).getSongName();
                    Intent intent = new Intent(SearchActivity.this,Search1Activity.class);
                    intent.putExtra("Searchsong",songName);
                    startActivity(intent);
                }
            }
        });
    }



    private void getData() {
        RequestParams params = new RequestParams(API);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<Ranking>() {
            @Override
            public void onSuccess(Ranking result) {
                if (result != null) {
                    Ranking.DataBean data = result.getData();
                    if (data != null) {
                        songList = data.getSongList();
                        adapter.setDatas(songList);
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