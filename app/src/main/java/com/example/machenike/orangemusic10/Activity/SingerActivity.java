package com.example.machenike.orangemusic10.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.machenike.orangemusic10.Interface.OnRecyclerItemClickListener;
import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.adapter.SingerAdapter;
import com.example.machenike.orangemusic10.adapter.SingerRecyclerViewAdapter;
import com.example.machenike.orangemusic10.entity.Singer;
import com.example.machenike.orangemusic10.entity.SingerClass;
import com.example.machenike.orangemusic10.utils.NestedListView;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SingerActivity extends AppCompatActivity {
    private String API = "https://v1.itooi.cn/tencent/artist/category";
    private SingerRecyclerViewAdapter singerAdpter1;
    private SingerRecyclerViewAdapter singerAdpter2;
    private SingerRecyclerViewAdapter singerAdpter3;
    private SingerAdapter singerAdapter;
    private List<Singer.DataBean> list = new ArrayList<>();

    @BindView(R.id.ic_back)
    ImageView icBack;
    @BindView(R.id.toobar)
    LinearLayout toobar;
    @BindView(R.id.Class1)
    RecyclerView Class1;
    @BindView(R.id.Class2)
    RecyclerView Class2;
    @BindView(R.id.Class3)
    RecyclerView Class3;
    @BindView(R.id.Claasall)
    TextView Claasall;
    @BindView(R.id.lssc)
    NestedListView lssc;
    private static final int TAG = 1;
    private boolean isDestory = false;
    private String area;
    private String sex;
    private String genre;
    private int areaId = -100, sexId = -100, genreId = -100;
    @SuppressLint("HandlerLeak")
    Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case TAG:
                    //在这里写需要刷新完成的代码
                    setui();
                    removeMessages(TAG);
                    if (!isDestory) {
                        sendEmptyMessageDelayed(TAG, 1000);//这里想几秒刷新一次就写几秒}
                        break;
                    }
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singer_activity);
        ButterKnife.bind(this);
        area = "全部";
        sex = "全部";
        genre = "全部";

        getData1();
        //设置布局管理器
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(SingerActivity.this);
        linearLayoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        Class1.setLayoutManager(linearLayoutManager1);
        //设置布局管理器
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(SingerActivity.this);
        linearLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        Class2.setLayoutManager(linearLayoutManager2);
        //设置布局管理器
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(SingerActivity.this);
        linearLayoutManager3.setOrientation(LinearLayoutManager.HORIZONTAL);
        Class3.setLayoutManager(linearLayoutManager3);

        AnimationSet set = new AnimationSet(false);
        Animation animation = new AlphaAnimation(0, 1);   //AlphaAnimation 控制渐变透明的动画效果
        animation.setDuration(250);     //动画时间毫秒数
        set.addAnimation(animation);    //加入动画集合

        LayoutAnimationController controller = new LayoutAnimationController(set, 1);

        ListView listview = (ListView) this.findViewById(R.id.lssc);
        listview.setLayoutAnimation(controller);   //ListView 设置动画效果
        getData();


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

    private void getData() {
        RequestParams params = new RequestParams(API);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<SingerClass>() {
            @Override
            public void onSuccess(SingerClass result) {
                if (result != null) {
                    SingerClass.DataBean dataBean = result.getData();
                    singerAdpter1 = new SingerRecyclerViewAdapter(SingerActivity.this, dataBean, 1);
                    Class1.setAdapter(singerAdpter1);
                    singerAdpter1.setRecyclerItemClickListener(new OnRecyclerItemClickListener() {
                        @Override
                        public void onItemClick(int Position, SingerClass.DataBean singerClass, int flag) {
                            if (flag == 1) {
                                area = singerClass.getArea().get(Position).getName();
                                areaId = singerClass.getArea().get(Position).getId();
                                singerAdpter1.setThisPosition(Position);
                                singerAdpter1.notifyDataSetChanged();
                                zixiancheng();
                                getData1();
                            }
                        }
                    });
                    singerAdpter2 = new SingerRecyclerViewAdapter(SingerActivity.this, dataBean, 2);
                    Class2.setAdapter(singerAdpter2);
                    singerAdpter2.setRecyclerItemClickListener(new OnRecyclerItemClickListener() {
                        @Override
                        public void onItemClick(int Position, SingerClass.DataBean singerClass, int flag) {
                            if (flag == 2) {
                                genre = singerClass.getGenre().get(Position).getName();
                                genreId = singerClass.getGenre().get(Position).getId();

                                singerAdpter2.setThisPosition(Position);
                                singerAdpter2.notifyDataSetChanged();
                                zixiancheng();
                                getData1();
                            }
                        }
                    });
                    singerAdpter3 = new SingerRecyclerViewAdapter(SingerActivity.this, dataBean, 3);
                    Class3.setAdapter(singerAdpter3);
                    singerAdpter3.setRecyclerItemClickListener(new OnRecyclerItemClickListener() {
                        @Override
                        public void onItemClick(int Position, SingerClass.DataBean singerClass, int flag) {
                            if (flag == 3) {
                                sex = singerClass.getSex().get(Position).getName();
                                sexId = singerClass.getSex().get(Position).getId();
                                singerAdpter3.setThisPosition(Position);
                                singerAdpter3.notifyDataSetChanged();
                                zixiancheng();
                                getData1();
                            }
                        }
                    });
                    zixiancheng();
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

    private void getData1() {
        String Url = "https://v1.itooi.cn/tencent/artist/list?sexId=" + sexId + "&areaId=" + areaId + "&genre=" + genreId + "&index=-100&page=0&pageSize=30";
        RequestParams params = new RequestParams(Url);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<Singer>() {
            @Override
            public void onSuccess(Singer result) {
                if (result != null) {
                    list.clear();
                    list.addAll(result.getData());
                    singerAdapter = new SingerAdapter(SingerActivity.this, list);
                    lssc.setAdapter(singerAdapter);
                    lssc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            singerView(list.get(position).getSinger_mid(),list.get(position).getSinger_pic());
                        }
                    });
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(SingerActivity.this, "错误", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
    public void singerView(String singerMid,String singerPic) {
        Intent intent=new Intent(SingerActivity.this,SingerviewActivity.class);
        intent.putExtra("singerMid", singerMid );
        intent.putExtra("singerPic",singerPic);
        startActivity(intent);
    }
    //销毁
    @Override
    protected void onDestroy() {
        super.onDestroy();
        isDestory = true;
    }

    public void setui() {
        if (area.equals("全部") && genre.equals("全部") && sex.equals("全部")) {
            Claasall.setText("热");
        } else if (genre.equals("全部") && sex.equals("全部")) {
            Claasall.setText("热-" + area);
        } else if (area.equals("全部") && genre.equals("全部")) {
            Claasall.setText("热-" + sex);
        } else if (area.equals("全部") && sex.equals("全部")) {
            Claasall.setText("热-" + genre);
        } else if (area.equals("全部")) {
            Claasall.setText("热-" + genre + "-" + sex);
        } else if (sex.equals("全部")) {
            Claasall.setText("热-" + area + "-" + genre);
        } else if (genre.equals("全部")) {
            Claasall.setText("热-" + area + "-" + sex);
        } else {
            Claasall.setText("热-" + area + "-" + genre + "-" + sex);
        }
    }


    @OnClick(R.id.ic_back)
    public void onViewClicked() {
        finish();
    }
}
