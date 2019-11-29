package com.example.machenike.orangemusic10.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.adapter.RankingListAdapter;
import com.example.machenike.orangemusic10.entity.Music;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class RankingListActivity extends AppCompatActivity {
    @BindView(R.id.btn_back)
    ImageView btnBack;
    @BindView(R.id.online_list)
    ListView onlineList;
    private List<Music.DataBean> list;
    private RankingListAdapter adapter;
    private Music.DataBean songID;
    private static final String API = "https://music.niubishanshan.top/api/v2/music/toplist";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ranking_list_view);
        ButterKnife.bind(this);
        adapter = new RankingListAdapter(this);
        onlineList.setAdapter(adapter);
        getData();
        list = new ArrayList<>();


        AnimationSet set = new AnimationSet(false);
        Animation animation = new AlphaAnimation(0, 1);   //AlphaAnimation 控制渐变透明的动画效果
        animation.setDuration(500);     //动画时间毫秒数
        set.addAnimation(animation);    //加入动画集合

        LayoutAnimationController controller = new LayoutAnimationController(set, 1);

        ListView listview = (ListView) this.findViewById(R.id.online_list);
        listview.setLayoutAnimation(controller);   //ListView 设置动画效果

        onlineList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Music.DataBean bean = list.get(position);
                int id1 = list.get(position).getId();
                Intent intent = new Intent(RankingListActivity.this, RankingActivity.class);
                intent.putExtra("songId", id1);
                intent.putExtra("position", position);
                intent.putExtra("title", bean.getTitle());
                intent.putExtra("listimg", bean.getPicUrl());
                startActivity(intent);

            }
        });
    }


    private void getData() {
        RequestParams params = new RequestParams(API);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<Music>() {
            @Override
            public void onSuccess(Music result) {
                list.addAll(result.getData());
                adapter.setmDatas(list);
                onlineList.setAdapter(adapter);
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

    @OnClick(R.id.btn_back)
    public void onViewClicked() {
        this.finish();
    }
}
