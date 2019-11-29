package com.example.machenike.orangemusic10.Activity;

import android.content.Intent;
import android.os.Bundle;
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
import com.example.machenike.orangemusic10.adapter.RankingAdapter;
import com.example.machenike.orangemusic10.entity.Ranking;
import com.example.machenike.orangemusic10.utils.NestedListView;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jp.wasabeef.glide.transformations.BlurTransformation;

public class RankingActivity extends AppCompatActivity {
    @BindView(R.id.ranking_list)
    NestedListView rankingList;
    @BindView(R.id.ranking_title)
    CollapsingToolbarLayout rankingTitle;
    @BindView(R.id.iv_background)
    ImageView ivBackground;
    @BindView(R.id.n_scroll_view)
    NestedScrollView nScrollView;
    @BindView(R.id.list_total)
    TextView listTotal;
    @BindView(R.id.ic_back)
    ImageView icBack;
    private List<Ranking.DataBean.SongListBean> list = new ArrayList<>();
    private List<Ranking.DataBean>list1 =new ArrayList<>();
    private RankingAdapter adapter;
    private int position;
    private int songId;
    private String title;
    private String url;
    private String listimg;
    private String total;
    private final String API = "https://music.niubishanshan.top/api/v2/music/songList/";
    private PlayService playService = new PlayService();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ranking_view);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        position = intent.getIntExtra("position", position);
        songId = intent.getIntExtra("songId", songId);
        title = intent.getStringExtra("title");
        listimg = intent.getStringExtra("listimg");
        url = API + songId;
        rankingTitle.setTitle(title);
        rankingList.setDividerHeight(2);
        adapter = new RankingAdapter(this);
        rankingList.setAdapter(adapter);
        AnimationSet set = new AnimationSet(false);
        Animation animation = new AlphaAnimation(0, 1);   //AlphaAnimation 控制渐变透明的动画效果
        animation.setDuration(300);     //动画时间毫秒数
        set.addAnimation(animation);    //加入动画集合

        LayoutAnimationController controller = new LayoutAnimationController(set, 1);

        ListView listview = (ListView) this.findViewById(R.id.ranking_list);
        listview.setLayoutAnimation(controller);   //ListView 设置动画效果
        getData();
        playSong();

    }

    private void playSong() {
        rankingList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String songMid = list.get(position).getSongMid();
                playService.playMusic(songMid);
                Intent intent = new Intent(RankingActivity.this, MusiconlineActivity.class);
                startActivity(intent);
            }
        });
    }

    private void getData() {
        RequestParams params = new RequestParams(url);
        x.http().get(params, new Callback.CommonCallback<Ranking>() {
            @Override
            public void onSuccess(Ranking result) {
                if (result != null) {
                    Ranking.DataBean data = result.getData();
                    Glide.with(RankingActivity.this).load(data.getTopInfo().getPicAlbum()).bitmapTransform(new BlurTransformation(RankingActivity.this, 5, 2)).into(ivBackground);
                    if (data != null) {
                        List<Ranking.DataBean.SongListBean> songList = data.getSongList();
                        int size = songList.size();
                        total = "(" + size + ")";
                        listTotal.setText(total);
                        adapter.setDatas(songList);
                        list.addAll(songList);

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

    @OnClick(R.id.ic_back)
    public void onViewClicked() {
        this.finish();
    }
}
