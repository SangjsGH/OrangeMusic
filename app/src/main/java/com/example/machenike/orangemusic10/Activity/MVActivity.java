package com.example.machenike.orangemusic10.Activity;


import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.dl7.player.media.IjkPlayerView;
import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.adapter.MvinfoAdapter;
import com.example.machenike.orangemusic10.entity.MVinfo;
import com.example.machenike.orangemusic10.utils.GlideRoundTransform;
import com.example.machenike.orangemusic10.utils.OkHttpUtiltwo;

import org.xutils.http.RequestParams;
import org.xutils.x;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MVActivity extends AppCompatActivity {
    @BindView(R.id.mv_list)
    ListView mvList;
    private List<MVinfo.DataBean.CommentlistBean> list = new ArrayList<>();
    private MvinfoAdapter adapter;
    private String MvID;
    private String MvTitle;
    private String SingerPic;
    private String SingerName;
    IjkPlayerView mPlayerView;
    ImageView singerImg;
    TextView mvTitle;
    TextView singerName;
    Uri mUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 隐藏状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mv_play);
        ButterKnife.bind(this);

        //mPlayerView 播放view
        mPlayerView = (IjkPlayerView) findViewById(R.id.player_view);
        singerImg = findViewById(R.id.singer_img);
        singerName = findViewById(R.id.singer_name);
        mvTitle = findViewById(R.id.mv_title);
        Intent intent = getIntent();
        MvID = intent.getStringExtra("mvId");
        MvTitle = intent.getStringExtra("mvTitle");
        SingerName = intent.getStringExtra("singerName");
        SingerPic = intent.getStringExtra("singerPic");
        mvTitle.setText(MvTitle);
        singerName.setText(SingerName);
        Glide.with(getApplicationContext()).load(SingerPic).transform(new CenterCrop(getApplicationContext()), new GlideRoundTransform(getApplicationContext(), 100))
                .into(singerImg);
        getData();
        String url = "https://v1.itooi.cn/tencent/mvUrl?id=" + MvID + "&quality=360";
        OkHttpUtiltwo.getRedirectsUrl(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("失败", "onFailure: ");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String locationURL = response.headers().get("Location");
                Log.e("地址", locationURL);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        playVideo(locationURL);
                    }
                });
            }
        });
        adapter = new MvinfoAdapter(this);
        mvList.setAdapter(adapter);

    }

    private void playVideo(String url) {
        //网址↓
        mUri = Uri.parse(url);
        mPlayerView.init()
                .setVideoPath(mUri)
                .setMediaQuality(IjkPlayerView.MEDIA_QUALITY_HIGH)
                .enableDanmaku()
                .start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPlayerView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPlayerView.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPlayerView.onDestroy();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mPlayerView.configurationChanged(newConfig);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (mPlayerView.handleVolumeKey(keyCode)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        if (mPlayerView.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    private void getData() {
        final String API = "https://v1.itooi.cn/tencent/comment/mv?id=" + MvID + "&page=0&pageSize=30";
        RequestParams params = new RequestParams(API);
//        params.addParameter("songListId","");
        x.http().get(params, new org.xutils.common.Callback.CommonCallback<MVinfo>() {
            @Override
            public void onSuccess(MVinfo result) {
                if (result != null) {
                    list.addAll(result.getData().getCommentlist());
                    adapter.setDatas(list);
                    mvList.setAdapter(adapter);
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

