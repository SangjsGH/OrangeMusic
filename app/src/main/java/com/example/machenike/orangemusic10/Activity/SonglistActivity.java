package com.example.machenike.orangemusic10.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.Service.PlayService;
import com.example.machenike.orangemusic10.adapter.SonglistviewAdapter;
import com.example.machenike.orangemusic10.entity.Songlistview;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jp.wasabeef.glide.transformations.BlurTransformation;

public class SonglistActivity extends AppCompatActivity {
    /*    @BindView(R.id.list_img)
        ImageView listImg;*/
    @BindView(R.id.list_title)
    TextView listTitle;
    @BindView(R.id.list_listview)
    ListView listListview;
    @BindView(R.id.btn_back)
    ImageView btnBack;
    @BindView(R.id.list_zong)
    TextView listZong;
    @BindView(R.id.ic_bg)
    ImageView icBg;
    private List<Songlistview.DataBean.SonglistBean> list = new ArrayList<>();
    private SonglistviewAdapter adapter;
    private String songlistId;
    private String songlistName;
    private String songlistPic;
    private PlayService playService = new PlayService();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songlistview);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        songlistId = intent.getStringExtra("songlistId");
        getData();
        songlistName = intent.getStringExtra("songlistName");
        songlistPic = intent.getStringExtra("songlistPic");
        Glide.with(SonglistActivity.this).load(songlistPic).bitmapTransform(new BlurTransformation(SonglistActivity.this, 23, 4)).into(icBg);
        listTitle.setText(songlistName);
        adapter = new SonglistviewAdapter(this);
        listListview.setAdapter(adapter);
        playSong();
    }

    private void playSong() {
        listListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String songMid = list.get(position).getMid();
                // String URL ="https://v1.itooi.cn/tencent/url?id="+songMid+"&quality=192";
                playService.playMusic(songMid);
                Intent intent = new Intent(SonglistActivity.this, MusiconlineActivity.class);
                //intent.putExtra("songMid", songMid);
                startActivity(intent);


            }
        });
    }

    private void getData() {
        final String API = "https://v1.itooi.cn/tencent/songList?id=" + songlistId + "&pageSize=100&page=0";
        RequestParams params = new RequestParams(API);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<Songlistview>() {
            @Override
            public void onSuccess(Songlistview result) {
                list.addAll(result.getData().get(0).getSonglist());
                adapter.setDatas(list);
                int size = list.size();
                String total = "(" + size + ")";
                listZong.setText(total);
                listListview.setAdapter(adapter);
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
