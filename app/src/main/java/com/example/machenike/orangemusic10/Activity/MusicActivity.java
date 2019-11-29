package com.example.machenike.orangemusic10.Activity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.entity.Song;
import com.example.machenike.orangemusic10.utils.BlurUtil;
import com.example.machenike.orangemusic10.utils.Common;
import com.example.machenike.orangemusic10.utils.MergeImage;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MusicActivity extends AppCompatActivity {
    @BindView(R.id.music_bg_imgv)
    ImageView bgImgv;
    @BindView(R.id.music_down_imgv)
    ImageView downImg;
    @BindView(R.id.music_title_tv)
    TextView titleTv;
    @BindView(R.id.music_artist_tv)
    TextView artistTv;
    @BindView(R.id.music_disc_imagv)
    ImageView discImagv;
    @BindView(R.id.music_needle_imag)
    ImageView needleImagv;
    @BindView(R.id.music_current_tv)
    TextView currrentTv;
    @BindView(R.id.music_seekbar)
    SeekBar seekBar;
    @BindView(R.id.music_total_tv)
    TextView totalTv;
    @BindView(R.id.music_play_btn_loop_img)
    ImageView musicPlayBtnLoopImg;
    @BindView(R.id.music_prev_imgv)
    ImageView prevImgv;
    @BindView(R.id.music_pause_imgv)
    ImageView pauseImgv;
    @BindView(R.id.music_next_imgv)
    ImageView nextImgv;
    //定义activity_music.xml的控件对象
    //设置音乐播放模式
    private int i = 0;
    private int playMode = 0;
    private int buttonWitch = 0;
    private int position;
    private MediaPlayer mediaPlayer;
    private ImageView styleImg;
    private int totaltime;
    private boolean isStop;
    private ObjectAnimator objectAnimator = null;
    private RotateAnimation rotateAnimation = null;
    private RotateAnimation rotateAnimation2 = null;
    private String TAG = "MusicActivity";

    //Handler实现向主线程进行传值
    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            super.handleMessage(msg);
            seekBar.setProgress((int) (msg.what));
            currrentTv.setText(formatTime(msg.what));
        }
    };

    //MusicActivity onCreate（）方法
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musictwo);
        ButterKnife.bind(this);




        Intent intent = getIntent();                                                    //通过getIntent()方法实现intent信息的获取
        position = intent.getIntExtra("position", 0);            //获取position

        //intent实现页面的跳转，getActivity()获取当前的activity， MusicActivity.class将要调转的activity

        Intent intent1 = new Intent("TEST");
//intent.setAction("TEST");
        intent1.putExtra("position",position);
        intent1.setPackage(getPackageName());
        sendBroadcast(intent1);

        mediaPlayer = new MediaPlayer();
        prevAndnextplaying(Common.musicList.get(position).getPath());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {               //seekbar设置监听，实现指哪放到哪
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mediaPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    //prevAndnext() 实现页面的展现
    private void prevAndnextplaying(String path) {
        isStop = false;
        mediaPlayer.reset();
        titleTv.setText(Common.musicList.get(position).getName());
        artistTv.setText(Common.musicList.get(position).getSinger() + "--" + Common.musicList.get(position).getAlbum());
        pauseImgv.setImageResource(R.mipmap.ic_play_btn_pause);

        if (Common.musicList.get(position).getAlbumBip() != null) {
            Bitmap bgbm = BlurUtil.doBlur(Common.musicList.get(position).getAlbumBip(), 10, 5);//将专辑虚化
            bgImgv.setImageBitmap(bgbm);                                    //设置虚化后的专辑图片为背景
            Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.play_page_disc);//BitmapFactory.decodeResource用于根据给定的资源ID从指定的资源文件中解析、创建Bitmap对象。
            Bitmap bm = MergeImage.mergeThumbnailBitmap(bitmap1, Common.musicList.get(position).getAlbumBip());//将专辑图片放到圆盘中
            discImagv.setImageBitmap(bm);
        } else {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.zhuanji1);
            Bitmap bgbm1 = BlurUtil.doBlur(bitmap, 10, 5);//将专辑虚化
            bgImgv.setImageBitmap(bgbm1);
            Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.play_page_disc);
            Bitmap bm = MergeImage.mergeThumbnailBitmap(bitmap1, bitmap);
            discImagv.setImageBitmap(bm);
        }
        try {
            mediaPlayer.setDataSource(path);
            mediaPlayer.prepare();                   // 准备
            mediaPlayer.start();                        // 启动
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @RequiresApi(api = Build.VERSION_CODES.KITKAT)
                @Override
                public void onCompletion(MediaPlayer mp) {
                    if (!mediaPlayer.isPlaying()) {
                        setPlayMode();
                    }

                }
            });
        } catch (IllegalArgumentException | SecurityException | IllegalStateException
                | IOException e) {
            e.printStackTrace();
        }


        totalTv.setText(formatTime(Common.musicList.get(position).getLength()));
        seekBar.setMax(Common.musicList.get(position).getLength());

        MusicThread musicThread = new MusicThread();                                         //启动线程
        new Thread(musicThread).start();

        //实例化，设置旋转对象
        objectAnimator = ObjectAnimator.ofFloat(discImagv, "rotation", 0f, 360f);
        //设置转一圈要多长时间
        objectAnimator.setDuration(20000);
        //设置旋转速率
        objectAnimator.setInterpolator(new LinearInterpolator());
        //设置循环次数 -1为一直循环
        objectAnimator.setRepeatCount(-1);
        //设置转一圈后怎么转
        objectAnimator.setRepeatMode(ValueAnimator.RESTART);
        objectAnimator.start();

        rotateAnimation = new RotateAnimation(-25f, 0f, Animation.RELATIVE_TO_SELF, 0.3f, Animation.RELATIVE_TO_SELF, 0.1f);
        rotateAnimation.setDuration(500);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(0);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setStartOffset(500);
        needleImagv.setAnimation(rotateAnimation);
        rotateAnimation.cancel();


        rotateAnimation2 = new RotateAnimation(0f, -25f, Animation.RELATIVE_TO_SELF, 0.3f, Animation.RELATIVE_TO_SELF, 0.1f);
        rotateAnimation2.setDuration(500);
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        rotateAnimation2.setRepeatCount(0);
        rotateAnimation2.setFillAfter(true);
        needleImagv.setAnimation(rotateAnimation2);
        rotateAnimation2.cancel();


    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void setPlayMode() {
        if (playMode == 0)//全部循环
        {
            if (position == Common.musicList.size() - 1)//默认循环播放
            {
                position = 0;// 第一首
                mediaPlayer.reset();
                objectAnimator.pause();
                needleImagv.startAnimation(rotateAnimation2);
                prevAndnextplaying(Common.musicList.get(position).getPath());

            } else {
                position++;
                mediaPlayer.reset();
                objectAnimator.pause();
                needleImagv.startAnimation(rotateAnimation2);
                prevAndnextplaying(Common.musicList.get(position).getPath());
            }
        } else if (playMode == 1)//单曲循环
        {
            //position不需要更改
            mediaPlayer.reset();
            objectAnimator.pause();
            needleImagv.startAnimation(rotateAnimation2);
            prevAndnextplaying(Common.musicList.get(position).getPath());
        } else if (playMode == 2)//随机
        {
            position = (int) (Math.random() * Common.musicList.size());//随机播放
            mediaPlayer.reset();
            objectAnimator.pause();
            needleImagv.startAnimation(rotateAnimation2);
            prevAndnextplaying(Common.musicList.get(position).getPath());
        }
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    private void setBtnMode() {
        if (playMode == 0)//全部循环
        {
            if (position == Common.musicList.size() - 1)//默认循环播放
            {
                if (buttonWitch == 1) {
                    position--;
                    mediaPlayer.reset();
                    objectAnimator.pause();
                    needleImagv.startAnimation(rotateAnimation2);
                    prevAndnextplaying(Common.musicList.get(position).getPath());
                } else if (buttonWitch == 2) {
                    position = 0;// 第一首
                    mediaPlayer.reset();
                    objectAnimator.pause();
                    needleImagv.startAnimation(rotateAnimation2);
                    prevAndnextplaying(Common.musicList.get(position).getPath());
                }
            } else if (position == 0) {
                if (buttonWitch == 1) {
                    position = Common.musicList.size() - 1;
                    mediaPlayer.reset();
                    objectAnimator.pause();
                    needleImagv.startAnimation(rotateAnimation2);
                    prevAndnextplaying(Common.musicList.get(position).getPath());
                } else if (buttonWitch == 2) {
                    position++;
                    mediaPlayer.reset();
                    objectAnimator.pause();
                    needleImagv.startAnimation(rotateAnimation2);
                    prevAndnextplaying(Common.musicList.get(position).getPath());
                }
            }else {
                if(buttonWitch ==1){
                    position--;
                    mediaPlayer.reset();
                    objectAnimator.pause();
                    needleImagv.startAnimation(rotateAnimation2);
                    prevAndnextplaying(Common.musicList.get(position).getPath());

                }else if(buttonWitch ==2){
                    position++;
                    mediaPlayer.reset();
                    objectAnimator.pause();
                    needleImagv.startAnimation(rotateAnimation2);
                    prevAndnextplaying(Common.musicList.get(position).getPath());
                }
            }
        } else if (playMode == 1)//单曲循环
        {
            //position不需要更改
            mediaPlayer.reset();
            objectAnimator.pause();
            needleImagv.startAnimation(rotateAnimation2);
            prevAndnextplaying(Common.musicList.get(position).getPath());
        } else if (playMode == 2)//随机
        {
            position = (int) (Math.random() * Common.musicList.size());//随机播放
            mediaPlayer.reset();
            objectAnimator.pause();
            needleImagv.startAnimation(rotateAnimation2);
            prevAndnextplaying(Common.musicList.get(position).getPath());
        }
    }


    //格式化数字
    private String formatTime(int length) {
        Date date = new Date(length);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");    //规定固定的格式
        String totaltime = simpleDateFormat.format(date);
        return totaltime;
    }


    @Override
    protected void onPause() {
        super.onPause();
        for (Song song : Common.musicList) {
            song.setPlaying(false);
        }
        Common.musicList.get(position).setPlaying(true);

    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        i = 0;
        isStop = false;
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }


    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @OnClick({R.id.music_down_imgv, R.id.music_play_btn_loop_img, R.id.music_prev_imgv, R.id.music_pause_imgv, R.id.music_next_imgv})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.music_down_imgv:
                this.finish();
                break;
            case R.id.music_play_btn_loop_img:
                i++;
                if (i % 3 == 1) {
                    Toast.makeText(MusicActivity.this, "单曲循环", Toast.LENGTH_SHORT).show();
                    playMode = 1;
                    musicPlayBtnLoopImg.setImageResource(R.mipmap.ic_play_btn_one);
                }
                if (i % 3 == 2) {
                    Toast.makeText(MusicActivity.this, "随机播放", Toast.LENGTH_SHORT).show();
                    playMode = 2;
                    musicPlayBtnLoopImg.setImageResource(R.mipmap.ic_play_btn_shuffle);
                }
                if (i % 3 == 0) {
                    Toast.makeText(MusicActivity.this, "顺序播放", Toast.LENGTH_SHORT).show();
                    playMode = 0;
                    musicPlayBtnLoopImg.setImageResource(R.mipmap.ic_play_btn_loop);
                }
                break;
            case R.id.music_prev_imgv:
                buttonWitch = 1;
                setBtnMode();
                break;
            case R.id.music_pause_imgv:
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    objectAnimator.pause();
                    needleImagv.startAnimation(rotateAnimation2);
                    pauseImgv.setImageResource(R.mipmap.ic_play_btn_play);
                } else {
                    mediaPlayer.start();
                    objectAnimator.resume();
                    needleImagv.startAnimation(rotateAnimation);
                    pauseImgv.setImageResource(R.mipmap.ic_play_btn_pause);
                }
                break;
            case R.id.music_next_imgv:
                buttonWitch = 2;
                setBtnMode();

                break;
        }
    }

    //创建一个类MusicThread实现Runnable接口，实现多线程
    class MusicThread implements Runnable {

        @Override
        public void run() {
            while (!isStop && Common.musicList.get(position) != null) {
                try {
                    //让线程睡眠1000毫秒
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //放送给Handler现在的运行到的时间，进行ui更新
                handler.sendEmptyMessage(mediaPlayer.getCurrentPosition());

            }
        }
    }


}

