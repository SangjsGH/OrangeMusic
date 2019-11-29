package com.example.machenike.orangemusic10.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.adapter.SonglistsquareAdapter;
import com.example.machenike.orangemusic10.entity.Songlistsquare;
import com.example.machenike.orangemusic10.utils.MyGridView;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SonglistsquareActivity extends AppCompatActivity {
    @BindView(R.id.ic_back)
    ImageView icBack;
    @BindView(R.id.toobar)
    LinearLayout toobar;
    @BindView(R.id.grid_view)
    MyGridView gridView;
    @BindView(R.id.grid_view1)
    MyGridView gridView1;
    @BindView(R.id.grid_view2)
    MyGridView gridView2;
    @BindView(R.id.grid_view3)
    MyGridView gridView3;
    private String API = "https://v1.itooi.cn/tencent/songList/hot?categoryId=165&sortId=5&pageSize=9&page=1";
    private String API1 = "https://v1.itooi.cn/tencent/songList/hot?categoryId=39&sortId=3&pageSize=9&page=1";
    private String API2 = "https://v1.itooi.cn/tencent/songList/hot?categoryId=11&sortId=3&pageSize=9&page=1";
    private String API3 = "https://v1.itooi.cn/tencent/songList/hot?categoryId=153&sortId=3&pageSize=9&page=1";
    private List<Songlistsquare.DataBean.ListBean> list = new ArrayList<>();
    private List<Songlistsquare.DataBean.ListBean> list1 = new ArrayList<>();
    private List<Songlistsquare.DataBean.ListBean> list2 = new ArrayList<>();
    private List<Songlistsquare.DataBean.ListBean> list3 = new ArrayList<>();
    private SonglistsquareAdapter adapter;
    private SonglistsquareAdapter adapter1;
    private SonglistsquareAdapter adapter2;
    private SonglistsquareAdapter adapter3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songlistsquare);
        ButterKnife.bind(this);
        adapter = new SonglistsquareAdapter(this);
        gridView.setAdapter(adapter);
        adapter1 = new SonglistsquareAdapter(this);
        gridView.setAdapter(adapter1);
        adapter2 = new SonglistsquareAdapter(this);
        gridView.setAdapter(adapter2);
        adapter3 = new SonglistsquareAdapter(this);
        gridView.setAdapter(adapter3);
        getData();
        getData1();
        getData2();
        getData3();

    }

    private void getData() {
        RequestParams params = new RequestParams(API);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<Songlistsquare>() {
            @Override
            public void onSuccess(Songlistsquare result) {
                if (result != null) {
                    //    Toast.makeText(SonglistsquareActivity.this,String.valueOf(result), Toast.LENGTH_SHORT).show();
                    list.addAll(result.getData().getList());
                    adapter.setDatas(list);
                    gridView.setAdapter(adapter);
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
        RequestParams params = new RequestParams(API1);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<Songlistsquare>() {
            @Override
            public void onSuccess(Songlistsquare result) {
                if (result != null) {
                    //    Toast.makeText(SonglistsquareActivity.this,String.valueOf(result), Toast.LENGTH_SHORT).show();
                    list1.addAll(result.getData().getList());
                    adapter1.setDatas(list1);
                    gridView1.setAdapter(adapter1);
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
    private void getData2() {
        RequestParams params = new RequestParams(API2);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<Songlistsquare>() {
            @Override
            public void onSuccess(Songlistsquare result) {
                if (result != null) {
                    //    Toast.makeText(SonglistsquareActivity.this,String.valueOf(result), Toast.LENGTH_SHORT).show();
                    list2.addAll(result.getData().getList());
                    adapter2.setDatas(list2);
                    gridView2.setAdapter(adapter2);
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
    private void getData3() {
        RequestParams params = new RequestParams(API3);
//        params.addParameter("songListId","");
        x.http().get(params, new Callback.CommonCallback<Songlistsquare>() {
            @Override
            public void onSuccess(Songlistsquare result) {
                if (result != null) {
                    //    Toast.makeText(SonglistsquareActivity.this,String.valueOf(result), Toast.LENGTH_SHORT).show();
                    list3.addAll(result.getData().getList());
                    adapter3.setDatas(list3);
                    gridView3.setAdapter(adapter3);
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
        finish();
    }
}
