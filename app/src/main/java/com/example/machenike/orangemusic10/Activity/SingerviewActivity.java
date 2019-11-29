package com.example.machenike.orangemusic10.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.Service.PlayService;
import com.example.machenike.orangemusic10.adapter.SingerviewAdapter;
import com.example.machenike.orangemusic10.entity.SingerView;
import com.example.machenike.orangemusic10.utils.NestedListView;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SingerviewActivity extends AppCompatActivity {
    @BindView(R.id.iv_background)
    ImageView ivBackground;
    @BindView(R.id.ic_back)
    ImageView icBack;
    @BindView(R.id.singer_name)
    CollapsingToolbarLayout singerName;
    @BindView(R.id.list_total)
    TextView listTotal;
    @BindView(R.id.singer_list)
    NestedListView singerList;
    @BindView(R.id.n_scroll_view)
    NestedScrollView nScrollView;
    private SingerviewAdapter adapter;
    private List<SingerView.DataBean> list =new ArrayList<>();
    private List<SingerView.DataBean.MusicDataBean> list1 =new ArrayList<>();
    private PlayService playService = new PlayService();
    private String singerMid;
    private String singerPic;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singerview);
        ButterKnife.bind(this);
        adapter =new SingerviewAdapter(this);
        singerList.setAdapter(adapter);
        Intent intent = getIntent();
        singerMid=intent.getStringExtra("singerMid");
        singerPic=intent.getStringExtra("singerPic");
        Glide.with(SingerviewActivity.this).load(singerPic).into(ivBackground);
        AnimationSet set = new AnimationSet(false);
        Animation animation = new AlphaAnimation(0, 1);   //AlphaAnimation 控制渐变透明的动画效果
        animation.setDuration(500);     //动画时间毫秒数
        set.addAnimation(animation);    //加入动画集合

        LayoutAnimationController controller = new LayoutAnimationController(set, 1);

        ListView listview = (ListView) this.findViewById(R.id.singer_list);
        listview.setLayoutAnimation(controller);   //ListView 设置动画效果
        getData();
        playSong();
    }

    private void getData() {
        String API ="https://v1.itooi.cn/tencent/song/artist?id="+singerMid;
        RequestParams params = new RequestParams(API);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<SingerView>() {
            @Override
            public void onSuccess(SingerView result) {
                if (result != null) {
                    singerName.setTitle(result.getData().get(0).getMusicData().getSinger().get(0).getName());
                    List<SingerView.DataBean> data = result.getData();
                    list.addAll(data);
                    adapter.setDatas(data);
                    singerList.setAdapter(adapter);
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
    private void playSong(){
        singerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String songMid =list.get(position).getMusicData().getSongmid();


                //String URL ="https://v1.itooi.cn/tencent/url?id="+songMid+"&quality=192";
                playService.playMusic(songMid);
                Intent intent = new Intent(SingerviewActivity.this,MusiconlineActivity.class);
                // intent.putExtra("songMid", songMid);
                startActivity(intent);
                // String URL ="https://v1.itooi.cn/tencent/url?id="+songMid+"&quality=192";

            }
        });
    }

    @OnClick(R.id.ic_back)
    public void onViewClicked() {
        finish();
    }
}
