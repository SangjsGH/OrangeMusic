package com.example.machenike.orangemusic10.Service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;


import java.io.IOException;

public class PlayService extends Service {
    public  static MediaPlayer mediaPlayer = new MediaPlayer();
    public boolean state = true;
    public static String MUSICID ;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    //判断是否处于播放状态
    public boolean isPlaying(){
        if (mediaPlayer.isPlaying()){
            state=true;
        }else {
            state=false;
        }
        return state;
    }

    public int getProgress(){
        if (mediaPlayer!=null){
            int length = mediaPlayer.getDuration();
            return length;
        }
       return 0;
    }

    public int getCurrent(){
        if (mediaPlayer!=null){
            int nowlength = mediaPlayer.getCurrentPosition();
            return nowlength;
        }
        return 0;
    }
    public void startMusic(){
        if(!state&&mediaPlayer!=null){
            mediaPlayer.start();
            state=true;
        }
    }

    public void stopMusic(){
        if(state&&mediaPlayer!=null){
            mediaPlayer.pause();
            state=false;
        }
    }

    public void playMusic(String mid){
        MUSICID = mid;
        if (mediaPlayer == null) {
            mediaPlayer = new MediaPlayer();
        }
        try {
            // 切歌之前先重置，释放掉之前的资源
            mediaPlayer.reset();
            // 设置播放源
            mediaPlayer.setDataSource("https://v1.itooi.cn/tencent/url?id="+mid+"&quality=192");
            // 开始播放前的准备工作，加载多媒体资源，获取相关信息
            mediaPlayer.prepareAsync();

            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                    state=true;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
