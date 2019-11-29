package com.example.machenike.orangemusic10.Activity;


import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import android.widget.Toast;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.adapter.MusicAdapter;
import com.example.machenike.orangemusic10.entity.Song;
import com.example.machenike.orangemusic10.utils.Common;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.os.Build.VERSION.SDK_INT;


public class LocalMusic extends AppCompatActivity {


    @BindView(R.id.top_rl)
    RelativeLayout topRl;
    @BindView(R.id.imageView2)
    ImageView imageView2;
    @BindView(R.id.title_rl)
    RelativeLayout titleRl;
    @BindView(R.id.music_lv)
    ListView musicLv;
    @BindView(R.id.mid_rl)
    RelativeLayout midRl;
    @BindView(R.id.btn_backk)
    ImageView btnBackk;

    private String TAG = "HelloActivity";                                       //下面两个属性和获取mediadatabase的权限有关系，可查阅代码块下的链接
    private ListView listView;                                                          //创建ListView的对象
    private List<Song> musicList;                                                          //将Music放入List集合中，并实例化List<Music>
    private List<ListView> listViewList;
    private MusicAdapter adapter;
    private String CHANNEL_ID = "CID";
    private String CHANNEL_NAME = "CNA";
    private Context context;


    String[] permissions = new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE};
    private static final int REQUEST_CODE = 100;


    //LoginFrangment中的onCreate()方法

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_layout);
        ButterKnife.bind(this);
        context = this;
        if (SDK_INT >= Build.VERSION_CODES.M) {
            //检查权限是否获取
            int i = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
            if (i != PackageManager.PERMISSION_GRANTED) {
                //动态申请权限

                ActivityCompat.requestPermissions(this, permissions, REQUEST_CODE);
            } else {


                initListView();


            }
        } else {


            initListView();
        }


        musicLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {             //将listView的每一个item实现监听
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for (Song m : Common.musicList
                        ) {
                    m.isPlaying();
                }
                Common.musicList.get(position).isPlaying();
                //更新界面
                adapter.notifyDataSetChanged();
                //intent实现页面的跳转，getActivity()获取当前的activity， MusicActivity.class将要调转的activity
                Intent intent = new Intent(LocalMusic.this, MusicActivity.class);
                //使用putExtra（）传值
                intent.putExtra("position", position);
                startActivity(intent);


//                String PATH=Common.musicList.get(position).getPath();
//
//                Log.e("kk",PATH);
//                ServiceNB.PlaylocalMusic(PATH);

//
                PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
                RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.notification_layout);
                remoteViews.setTextViewText(R.id.nf_title_tv, Common.musicList.get(position).getName());
                remoteViews.setTextViewText(R.id.nf_artist_tv, Common.musicList.get(position).getSinger());

                if (Common.musicList.get(position).getAlbumBip() != null) {
                    remoteViews.setImageViewBitmap(R.id.nf_album_imgv, Common.musicList.get(position).getAlbumBip());
                }


//
//                RemoteViews remoteViews1 = new RemoteViews(getActivity().getPackageName(), R.layout.activity_main);
//                remoteViews1.setTextViewText(R.id.bottom_name_tv, Common.musicList.get(position).getName());
//                remoteViews1.setTextViewText(R.id.bottom_singer_tv, Common.musicList.get(position).getSinger());
//                if (Common.musicList.get(position).getAlbumBip()!= null) {
//                    remoteViews1.setImageViewBitmap(R.id.bottom_img, Common.musicList.get(position).getAlbumBip());
//                }


                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                if (SDK_INT >= Build.VERSION_CODES.O) {
                    // 传入参数：通道ID，通道名字，通道优先级（类似曾经的 builder.setPriority()）
                    NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH);
                    notificationManager.createNotificationChannel(channel);
                }
                NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID);
                //通知
                // Notification.Builder builder = new Notification.Builder(getActivity());
                builder.setContent(remoteViews);
                builder.setSmallIcon(R.mipmap.ic_launcher);
                builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_my));
                builder.setContentTitle("我的通知");
                builder.setContentText("正在播放音乐");
                builder.setContentIntent(pendingIntent);
                builder.setAutoCancel(true);
                notificationManager.notify(1, builder.build());

            }
        });
        adapter = new MusicAdapter(this, musicList);                //创建MusicAdapter的对象，实现自定义适配器的创建
        musicLv.setAdapter(adapter);                                                 //listView绑定适配器

    }


    //nitListView()实现对手机中MediaDataBase的扫描
    public void initListView() {
        Common.musicList.clear();
        //获取ContentResolver的对象，并进行实例化
        ContentResolver resolver = getContentResolver();
        //获取游标
        Cursor cursor = resolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, null, null, null, MediaStore.Audio.Media.DEFAULT_SORT_ORDER); //创建游标MediaStore.Audio.Media.EXTERNAL_CONTENT_URI获取音频的文件，后面的是关于select筛选条件，这里填土null就可以了
        //游标归零
        if (cursor.moveToFirst()) {
            do {
                String name = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.TITLE));            //获取歌名
                String singer = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ARTIST));         //获取歌唱者
                String album = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ALBUM));           //获取专辑名
                int albumID = cursor.getInt(cursor.getColumnIndex(MediaStore.Audio.Media.ALBUM_ID));            //获取专辑图片id
                int length = cursor.getInt(cursor.getColumnIndex(MediaStore.Audio.Media.DURATION));
                String path = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.DATA));
                //创建Music对象，并赋值
                Song song = new Song();
                song.setName(name);
                song.setSinger(singer);
                song.setPath(path);
                song.setLength(length);
                song.setAlbum(album);
                song.setAlbumBip(getAlbumArt(albumID));
                //将music放入musicList集合中
                Common.musicList.add(song);
            } while (cursor.moveToNext());
        } else {
            Toast.makeText(this, "本地没有音乐哦", Toast.LENGTH_SHORT).show();
        }
        cursor.close();                                                                         //关闭游标
    }

    //获取专辑图片的方法
    private Bitmap getAlbumArt(int album_id) {                              //前面我们只是获取了专辑图片id，在这里实现通过id获取掉专辑图片
        String mUriAlbums = "content://media/external/audio/albums";
        String[] projection = new String[]{"album_art"};
        Cursor cur = getContentResolver().query(Uri.parse(mUriAlbums + "/" + Integer.toString(album_id)), projection, null, null, null);
        String album_art = null;
        if (cur.getCount() > 0 && cur.getColumnCount() > 0) {
            cur.moveToNext();
            album_art = cur.getString(0);
        }
        cur.close();
        Bitmap bm = null;
        if (album_art != null) {
            bm = BitmapFactory.decodeFile(album_art);
        } else {
            bm = BitmapFactory.decodeResource(getResources(), R.mipmap.zhuanji1);
        }
        return bm;
    }


    @Override
    public void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }


    @OnClick(R.id.btn_backk)
    public void onViewClicked() {
        this.finish();
    }
}
