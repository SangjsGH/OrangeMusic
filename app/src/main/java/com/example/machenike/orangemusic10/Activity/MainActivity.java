package com.example.machenike.orangemusic10.Activity;


import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.Service.PlayService;
import com.example.machenike.orangemusic10.entity.Songview;
import com.example.machenike.orangemusic10.fragment.FoundFragment;
import com.example.machenike.orangemusic10.fragment.MineFragment;
import com.example.machenike.orangemusic10.fragment.MusicpagerFragment;
import com.example.machenike.orangemusic10.utils.GlideRoundTransform;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

import static com.example.machenike.orangemusic10.Service.PlayService.MUSICID;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @BindView(R.id.ic_more)
    ImageView icMore;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.ic_search)
    ImageView icSearch;
    @BindView(R.id.view_pager)
    ViewPager viewPager;
    @BindView(R.id.draw)
    DrawerLayout draw;
    @BindView(R.id.bottom_img)
    ImageView bottomImg;
    @BindView(R.id.bottom_name_tv)
    TextView bottomNameTv;
    @BindView(R.id.bottom_singer_tv)
    TextView bottomSingerTv;
    @BindView(R.id.bottom_pause_imgv)
    ImageView bottomPauseImgv;
    @BindView(R.id.bottom_music)
    RelativeLayout bottomMusic;
    @BindView(R.id.cehua_touxiang)
    CircleImageView cehuaTouxiang;
    @BindView(R.id.cehua_name)
    TextView cehuaName;
    @BindView(R.id.cehua_btn_login)
    Button cehuaBtnLogin;
    @BindView(R.id.cehua_dsgb)
    LinearLayout cehuaDsgb;
    @BindView(R.id.cehua_yjms)
    LinearLayout cehuaYjms;
    @BindView(R.id.cehua_gywm)
    LinearLayout cehuaGywm;
    @BindView(R.id.cehua_exit)
    LinearLayout cehuaExit;
    private List<Songview.DataBean> list = new ArrayList<>();
    public SharedPreferences mySharedPreferences;
    public SharedPreferences.Editor editor;
    private ObjectAnimator objectAnimator = null;
    private String API;
    private String userName;
    private PlayService playService = new PlayService();
    public static final String[] titles = {"我的", "音乐馆", "发现"};
    public static final String[] types = {"mine", "top", "find"};
    private int buttonWitch = 0;
    private MusiconlineActivity musiconlineActivity = new MusiconlineActivity();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        drawerLayout = (DrawerLayout) findViewById(R.id.draw);
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager); //tablayout绑定viewpager
        viewPager.setCurrentItem(1);
        viewPager.setOffscreenPageLimit(4);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("username");
        if (userName!=null){
            cehuaName.setText(userName);
            cehuaBtnLogin.setVisibility(View.GONE);
            cehuaExit.setVisibility(View.VISIBLE);
            cehuaTouxiang.setImageResource(R.mipmap.hmbb);
        }
        //实例化SharedPreferences对象（第一步）
        mySharedPreferences = MainActivity.this.getSharedPreferences("TTE", Context.MODE_PRIVATE);
        //实例化SharedPreferences.Editor对象（第二步）
        editor = mySharedPreferences.edit();
        animate();

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onResume() {
        super.onResume();
        getData();
        SharedPreferences sharedPreferences = MainActivity.this.getSharedPreferences("TTE", Context.MODE_PRIVATE);
        userName = sharedPreferences.getString("userName","");
        if (userName.equals("")){
            cehuaName.setText("未登录");
            cehuaBtnLogin.setVisibility(View.VISIBLE);
            cehuaTouxiang.setImageResource(R.mipmap.ic_denglu);
        }else {
            cehuaName.setText(userName);
            cehuaBtnLogin.setVisibility(View.GONE);
            cehuaTouxiang.setImageResource(R.mipmap.hmbb);
        }
        if (playService.isPlaying()) {
            playService.startMusic();
            bottomPauseImgv.setImageResource(R.mipmap.ic_play_bar_btn_pause);
            objectAnimator.resume();
        } else {
            playService.stopMusic();
            bottomPauseImgv.setImageResource(R.mipmap.ic_play_bar_btn_play);
            objectAnimator.pause();
        }

    }

    private void BottomMusic() {
        //PlayService.playMusic()
        //PlayService.MUSICID
//        bottomNameTv.setText(list.get(0).getName());
//        bottomSingerTv.setText(list.get(0).getSinger().get(0).getName());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK || keyCode == KeyEvent.KEYCODE_HOME) {
            final View view = LayoutInflater.from(this).inflate(R.layout.dialog1_layout, null);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("退出提示");
            builder.setView(view);
            builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.show();
        }
        return super.onKeyDown(keyCode, event);
    }

    private void getData() {
        API = "https://v1.itooi.cn/tencent/song?id=" + MUSICID;
        Log.i("====MUSICID1====", MUSICID + "aaa");
        RequestParams params = new RequestParams(API);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<Songview>() {
            @Override
            public void onSuccess(Songview result) {
                if (result != null) {
                    list = result.getData();
                    String name = list.get(0).getName();
                    String singer = list.get(0).getSinger().get(0).getName();

                    bottomNameTv.setText(name);
                    bottomSingerTv.setText(singer);

                    Glide.with(MainActivity.this).load("https://v1.itooi.cn/tencent/pic?id=" + MUSICID).transform(new CenterCrop(MainActivity.this), new GlideRoundTransform(MainActivity.this, 100)).into(bottomImg);


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
    private void animate(){
        objectAnimator = ObjectAnimator.ofFloat(bottomImg, "rotation", 0f, 360f);
        //设置转一圈要多长时间
        objectAnimator.setDuration(20000);
        //设置旋转速率
        objectAnimator.setInterpolator(new LinearInterpolator());
        //设置循环次数 -1为一直循环
        objectAnimator.setRepeatCount(-1);
        //设置转一圈后怎么转
        objectAnimator.setRepeatMode(ValueAnimator.RESTART);
        objectAnimator.start();
    }


    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            MusicpagerFragment fragment = MusicpagerFragment.newInstance(types[position]);
            MineFragment fragment1 = MineFragment.newInstance(types[position]);
            FoundFragment fragment2 = FoundFragment.newInstance(types[position]);

            if (position == 0) {
                return fragment1;
            }
            if (position == 1) {
                return fragment;
            }
            if (position == 2) {
                return fragment2;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @OnClick({R.id.ic_more, R.id.ic_search, R.id.bottom_pause_imgv,  R.id.bottom_music,R.id.cehua_touxiang, R.id.cehua_btn_login, R.id.cehua_dsgb, R.id.cehua_yjms, R.id.cehua_gywm, R.id.cehua_exit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ic_more:

                drawerLayout.openDrawer(Gravity.LEFT);
                break;
            case R.id.ic_search:
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
                break;
            case R.id.bottom_pause_imgv:
                if (playService.isPlaying()) {

                    playService.stopMusic();
                    bottomPauseImgv.setImageResource(R.mipmap.ic_play_bar_btn_play);
                    objectAnimator.pause();

                } else {

                    playService.startMusic();
                    bottomPauseImgv.setImageResource(R.mipmap.ic_play_bar_btn_pause);
                    objectAnimator.resume();
                }
                break;

            case R.id.bottom_music:
                Intent intent1 = new Intent(this, MusiconlineActivity.class);
                startActivity(intent1);
                break;
            case R.id.cehua_touxiang:
                break;
            case R.id.cehua_btn_login:
                Intent intent2 = new Intent(this, LoginmainActivity.class);
                startActivity(intent2);
                break;
            case R.id.cehua_dsgb:
                break;
            case R.id.cehua_yjms:
                break;
            case R.id.cehua_gywm:
                break;
            case R.id.cehua_exit:
                Intent intent3 = new Intent(this,ShezhiActivity.class);
                startActivity(intent3);
//                editor.putString("userName","");
//                //提交当前数据
//                editor.commit();
//                cehuaName.setText("未登录");
//                cehuaBtnLogin.setVisibility(View.VISIBLE);
//                cehuaTouxiang.setImageResource(R.mipmap.ic_denglu);
//                Toast.makeText(this, "退出成功！", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
