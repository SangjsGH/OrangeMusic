package com.example.machenike.orangemusic10.Activity;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.Service.PlayService;
import com.example.machenike.orangemusic10.entity.Addmylove;
import com.example.machenike.orangemusic10.entity.Songview;
import com.example.machenike.orangemusic10.utils.Commononline;
import com.example.machenike.orangemusic10.utils.GlideRoundTransform;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;
import jp.wasabeef.glide.transformations.BlurTransformation;
import me.wcy.lrcview.LrcView;

import static com.example.machenike.orangemusic10.Service.PlayService.MUSICID;
import static com.example.machenike.orangemusic10.Service.PlayService.mediaPlayer;


public class MusiconlineActivity extends AppCompatActivity {
    @BindView(R.id.musicbgimgv)
    ImageView musicBgImgv;
    @BindView(R.id.music_title_tv)
    TextView musicTitleTv;
    @BindView(R.id.music_artist_tv)
    TextView musicArtistTv;
    @BindView(R.id.music_disc_imagv)
    ImageView musicDiscImagv;
    @BindView(R.id.song_img)
    CircleImageView songImg;
    @BindView(R.id.music_needle_imag)
    ImageView musicNeedleImag;
    @BindView(R.id.music_current_tv)
    TextView musicCurrentTv;
    @BindView(R.id.music_seekbar)
    SeekBar musicSeekbar;
    @BindView(R.id.music_total_tv)
    TextView musicTotalTv;
    @BindView(R.id.music_play_btn_loop_img)
    ImageView musicPlayBtnLoopImg;
    @BindView(R.id.music_prev_imgv)
    ImageView musicPrevImgv;
    @BindView(R.id.music_pause_imgv)
    ImageView musicPauseImgv;
    @BindView(R.id.music_next_imgv)
    ImageView musicNextImgv;
    @BindView(R.id.music_like_imgv)
    ImageView musicLikeImgv;
    @BindView(R.id.lrc_view)
    LrcView lrcView;
    @BindView(R.id.linear_view)
    LinearLayout linearView;
    @BindView(R.id.music_down_imgv)
    ImageView musicDownImgv;
    @BindView(R.id.yuanpan_view)
    LinearLayout yuanpanView;
    private ObjectAnimator objectAnimator = null;
    private RotateAnimation rotateAnimation = null;
    private RotateAnimation rotateAnimation2 = null;
    private List<Songview.DataBean> list = new ArrayList<>();
    private List<Addmylove.ResultBean> list1= new ArrayList<>();
    private PlayService playService;
    private String SongMid;
    private String API;
    private int length;
    private boolean isDestory;
    private static final int TAG = 6;
    private int flag = 1;
    private String songName;
    private String singer;
    private String songMid;
    private String userName;
    private int i = 0;
    private int playMode = 0;
    private int buttonWitch = 0;
    private int position;
    private boolean stateeee=false;

    @SuppressLint("HandlerLeak")
    Handler mHandler = new Handler() {
        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            musicSeekbar.setProgress(playService.getCurrent());
            musicCurrentTv.setText(formatTime(playService.getCurrent()));
            lrcView.updateTime(playService.getCurrent());

            switch (msg.what) {
                case TAG:
                    //在这里写需要刷新完成的代码
                    musicTotalTv.setText(formatTime(playService.getProgress()));
                    musicSeekbar.setMax(playService.getProgress());
                    playService.getProgress();
                    if(playService.isPlaying()){
                        musicPauseImgv.setImageResource(R.drawable.seach_btn_pause);
                        objectAnimator.resume();
                        stateeee=true;

                    }else {
                        musicPauseImgv.setImageResource(R.mipmap.ic_play_btn_play);
                        objectAnimator.pause();
                        stateeee=false;
                    }
                    removeMessages(TAG);
                    if (!isDestory) {
                        sendEmptyMessageDelayed(TAG, 1000);//这里想几秒刷新一次就写几秒}
                        break;
                    }
            }
        }
    };

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void panduanUI() {
        if (stateeee) {
            objectAnimator.resume();
            musicNeedleImag.startAnimation(rotateAnimation);
            musicPauseImgv.setImageResource(R.mipmap.ic_play_btn_pause);
        } else {
            musicNeedleImag.startAnimation(rotateAnimation2);
            objectAnimator.pause();
            musicPauseImgv.setImageResource(R.mipmap.ic_play_btn_play);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        playService = new PlayService();
        ButterKnife.bind(this);
        SongMid = PlayService.MUSICID;
        API = "https://v1.itooi.cn/tencent/song?id=" + SongMid;

        getData();
        getLrc();
        animate();
       // panduanUI();
        musicSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {               //seekbar设置监听，实现指哪放到哪
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



    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onResume() {
        super.onResume();
       // panduanUI();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @OnClick({R.id.music_play_btn_loop_img, R.id.music_prev_imgv, R.id.music_pause_imgv, R.id.music_next_imgv, R.id.music_like_imgv, R.id.music_down_imgv, R.id.linear_view})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.music_play_btn_loop_img:
                i++;
                if (i % 3 == 1) {
                    Toast.makeText(MusiconlineActivity.this, "单曲循环", Toast.LENGTH_SHORT).show();
                    playMode = 1;
                    musicPlayBtnLoopImg.setImageResource(R.mipmap.ic_play_btn_one);
                }
                if (i % 3 == 2) {
                    Toast.makeText(MusiconlineActivity.this, "随机播放", Toast.LENGTH_SHORT).show();
                    playMode = 2;
                    musicPlayBtnLoopImg.setImageResource(R.mipmap.ic_play_btn_shuffle);
                }
                if (i % 3 == 0) {
                    Toast.makeText(MusiconlineActivity.this, "顺序播放", Toast.LENGTH_SHORT).show();
                    playMode = 0;
                    musicPlayBtnLoopImg.setImageResource(R.mipmap.ic_play_btn_loop);
                }
                break;
            case R.id.music_prev_imgv:
                SharedPreferences sharedPreferences2 = MusiconlineActivity.this.getSharedPreferences("TTE", Context.MODE_PRIVATE);
                userName = sharedPreferences2.getString("userName","");
                if (userName.equals("")){
                    Toast.makeText(MusiconlineActivity.this, "您还未登录，请先登录", Toast.LENGTH_SHORT).show();
                }else {
                    buttonWitch = 1;
                    setBtnMode();
                }
                break;
            case R.id.music_pause_imgv:
                changeUI();
                if (playService.isPlaying()) {
                    playService.stopMusic();

                } else {
                    playService.startMusic();

                }
                break;
            case R.id.music_next_imgv:
                SharedPreferences sharedPreferences1 = MusiconlineActivity.this.getSharedPreferences("TTE", Context.MODE_PRIVATE);
                userName = sharedPreferences1.getString("userName","");
                if (userName.equals("")){
                    Toast.makeText(MusiconlineActivity.this, "您还未登录，请先登录", Toast.LENGTH_SHORT).show();
                }else {
                    buttonWitch = 2;
                    setBtnMode();
                }
                break;
            case R.id.music_like_imgv:
                SharedPreferences sharedPreferences = MusiconlineActivity.this.getSharedPreferences("TTE", Context.MODE_PRIVATE);
                userName = sharedPreferences.getString("userName","");
                if (userName.equals("")){
                    Toast.makeText(MusiconlineActivity.this, "您还未登录，请先登录", Toast.LENGTH_SHORT).show();
                }else {
                    addmylove();
                }
                break;
            case R.id.music_down_imgv:
                this.finish();
                break;
            case R.id.linear_view:
                switch (flag) {
                    case 1:
                        lrcView.setVisibility(View.VISIBLE);
                        yuanpanView.setVisibility(View.GONE);
                        musicNeedleImag.setVisibility(View.GONE);
                        flag = 2;
                        break;
                    case 2:
                        lrcView.setVisibility(View.GONE);
                        yuanpanView.setVisibility(View.VISIBLE);
                        musicNeedleImag.setVisibility(View.VISIBLE);
                        flag = 1;
                        break;
                }
                break;
        }
    }




    public void zixiancheng() {
        //开启一个子线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                //新建一个Message对象，存储需要发送的消息
                Message message = new Message();
                message.what = TAG;
                //然后将消息发送出去
                mHandler.sendMessage(message);
            }
        }).start();
    }

    //销毁
    @Override
    protected void onDestroy() {
        super.onDestroy();
        isDestory = true;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void changeUI() {
        if (playService.isPlaying()) {
            objectAnimator.pause();
            musicNeedleImag.startAnimation(rotateAnimation2);
            musicPauseImgv.setImageResource(R.mipmap.ic_play_btn_play);
        } else {
            objectAnimator.resume();
            musicNeedleImag.startAnimation(rotateAnimation);
            musicPauseImgv.setImageResource(R.mipmap.ic_play_btn_pause);
        }
    }

    //格式化数字
    private String formatTime(int length) {
        Date date = new Date(length);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");    //规定固定的格式
        String totaltime = simpleDateFormat.format(date);
        return totaltime;
    }


    private void animate() {
        zixiancheng();
        //实例化，设置旋转对象
        objectAnimator = ObjectAnimator.ofFloat(musicDiscImagv, "rotation", 0f, 360f);
        objectAnimator = ObjectAnimator.ofFloat(songImg, "rotation", 0f, 360f);
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
        musicNeedleImag.setAnimation(rotateAnimation);
        rotateAnimation.cancel();


        rotateAnimation2 = new RotateAnimation(0f, -25f, Animation.RELATIVE_TO_SELF, 0.3f, Animation.RELATIVE_TO_SELF, 0.1f);
        rotateAnimation2.setDuration(500);
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        rotateAnimation2.setRepeatCount(0);
        rotateAnimation2.setFillAfter(true);
        musicNeedleImag.setAnimation(rotateAnimation2);
        rotateAnimation2.cancel();
    }

    private void getLrc() {
        RequestParams params = new RequestParams("https://v1.itooi.cn/tencent/lrc?id="+MUSICID);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                if (result != null) {
                    lrcView.loadLrc(result);
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
    private void getData() {
        API = "https://v1.itooi.cn/tencent/song?id=" + MUSICID;
        RequestParams params = new RequestParams(API);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<Songview>() {
            @Override
            public void onSuccess(Songview result) {
                if (result != null) {
                    list.addAll(result.getData());
                    musicTitleTv.setText(result.getData().get(0).getName());
                    musicArtistTv.setText(result.getData().get(0).getSinger().get(0).getName());

                    Glide.with(MusiconlineActivity.this).load("https://v1.itooi.cn/tencent/pic?id=" + MUSICID).transform(new CenterCrop(MusiconlineActivity.this), new GlideRoundTransform(MusiconlineActivity.this, 100)).into(songImg);
                    Glide.with(MusiconlineActivity.this).load("https://v1.itooi.cn/tencent/pic?id=" + MUSICID).bitmapTransform(new BlurTransformation(MusiconlineActivity.this, 23, 4)).into(musicBgImgv);
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

    private void addmylove() {
        songName = list.get(0).getName();
        singer = list.get(0).getSinger().get(0).getName();
        songMid = SongMid;
        getData1();

    }

    private void getData1() {

        String API = "http://192.168.43.234:8080//Music/songList_SongList_addSong_json?songName="+songName+"&singer="+singer+"&songMid="+songMid;
        RequestParams params = new RequestParams(API);
//        params.addParameter("songListId","");
        x.http().post(params, new Callback.CommonCallback<Addmylove>() {
            @Override
            public void onSuccess(Addmylove result) {
                if (result != null) {

                    String msg = result.getResult().getMsg();
                    Log.i("===",msg);
                    if (msg.equals("已加入我的歌单")){
                        Toast.makeText(MusiconlineActivity.this, msg, Toast.LENGTH_SHORT).show();
                        musicLikeImgv.setImageResource(R.mipmap.love);
                    }

                }

            }
            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(MusiconlineActivity.this, "错误", Toast.LENGTH_SHORT).show();
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

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void setBtnMode() {
        if (playMode == 0)//全部循环
        {
            if (position == Commononline.musiconlineList.size() - 1)//默认循环播放
            {
                if (buttonWitch == 1) {
                    position--;
                    playService.playMusic(Commononline.musiconlineList.get(position).getSongMid());
                    getData();
                    getLrc();
                } else if (buttonWitch == 2) {
                    position = 0;// 第一首
                    playService.playMusic(Commononline.musiconlineList.get(position).getSongMid());
                    getData();
                    getLrc();
                }
            } else if (position == 0) {
                if (buttonWitch == 1) {
                    position = Commononline.musiconlineList.size() - 1;
                    playService.playMusic(Commononline.musiconlineList.get(position).getSongMid());
                    getData();
                    getLrc();
                } else if (buttonWitch == 2) {
                    position++;
                    playService.playMusic(Commononline.musiconlineList.get(position).getSongMid());
                    getData();
                    getLrc();
                }


            }else {
                if(buttonWitch ==1){
                    position--;
                    playService.playMusic(Commononline.musiconlineList.get(position).getSongMid());
                    getData();
                    getLrc();
                }else if(buttonWitch ==2){
                    position++;
                    playService.playMusic(Commononline.musiconlineList.get(position).getSongMid());
                    getData();
                    getLrc();

                }
            }
        } else if (playMode == 1)//单曲循环
        {
            //position不需要更改
            playService.playMusic(Commononline.musiconlineList.get(position).getSongMid());
            getData();
            getLrc();
        } else if (playMode == 2)//随机
        {
            position = (int) (Math.random() * Commononline.musiconlineList.size());//随机播放
            playService.playMusic(Commononline.musiconlineList.get(position).getSongMid());
            getData();
            getLrc();
        }
    }

}
