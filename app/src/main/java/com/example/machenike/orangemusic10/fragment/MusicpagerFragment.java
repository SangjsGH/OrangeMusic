package com.example.machenike.orangemusic10.fragment;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.Activity.RankingListActivity;
import com.example.machenike.orangemusic10.Activity.SingerActivity;
import com.example.machenike.orangemusic10.Activity.SonglistsquareActivity;
import com.example.machenike.orangemusic10.adapter.SonglistAdapter;
import com.example.machenike.orangemusic10.adapter.ViewPagerAdapter;
import com.example.machenike.orangemusic10.entity.Songlist;
import com.example.machenike.orangemusic10.utils.GlideRoundTransform;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.machenike.orangemusic10.App.MyApp.getappcontext;

public class MusicpagerFragment extends Fragment {


    public static int item_grid_num = 6;//每一页中GridView中item的数量
    public static int number_columns = 3;//gridview一行展示的数目
    @BindView(R.id.view_pager1)
    ViewPager viewPager1;
    @BindView(R.id.base_img)
    ImageView baseImg;
    @BindView(R.id.fm_img)
    ImageView fmImg;
    @BindView(R.id.new_img)
    ImageView newImg;
    @BindView(R.id.rank_img)
    ImageView rankImg;
    @BindView(R.id.songlist_viewpager)
    ViewPager songlistViewpager;
    private String type;
    private ViewPagerAdapter mAdapter;
    public static final String API = "https://v1.itooi.cn/tencent/songList/hot?cat=全部&pageSize=100&page=0";
    private Context context = getappcontext();
    private List<Songlist.DataBean.ListBean> listBeans = new ArrayList<>();
    private SonglistAdapter adapter;


    public static MusicpagerFragment newInstance(String type) {
        Bundle args = new Bundle();
        args.putString("type", type);
        MusicpagerFragment fragment = new MusicpagerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private String[] imgs = {"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/1355152.jpg",
            "http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/1358233.jpg",
            "http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/1356478.jpeg",
            "http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/1355960.jpg",
            "http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/1359213.jpg"};

    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 10) {
                int curPos = viewPager1.getCurrentItem();//获取viewpager当前页码 0 1 2
                int nexPos = (curPos + 1) % imgs.length; //计算下一页页码  1 2 0 1 2 0
                viewPager1.setCurrentItem(nexPos, true); //smoothScroll 是否平滑滚动 默认为true;
                handler.sendEmptyMessageDelayed(10, 3000);
            }
        }
    };

    @Override
    public void onPause() {
        super.onPause();
        handler.removeMessages(10);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_musicbar, null);
        ButterKnife.bind(this, view);
        getData();
        initViews();
        Bundle bundle = getArguments();
        if (bundle != null) {
            type = bundle.getString("type");
        }
        adapter = new SonglistAdapter(getContext());


        /*adapter = new NewsAdapter(getContext());
        listView.setAdapter(adapter);*/
        songlistViewpager.setOffscreenPageLimit(4);
        viewPager1.setOffscreenPageLimit(4);//设置预加载页面个数
        viewPager1.setAdapter(new MyAdapter());
        handler.sendEmptyMessageDelayed(10, 3000);//发送延时3秒的空消息


        return view;
    }

    private void initViews() {
        //初始化ViewPager
        listBeans = new ArrayList<>();
    }


    private void getData() {
        RequestParams params = new RequestParams(API);
        x.http().get(params, new Callback.CommonCallback<Songlist>() {
            @Override
            public void onSuccess(Songlist songlist) {
                if (songlist != null) {
                    Songlist.DataBean data = songlist.getData();
                    if (data != null) {
                        listBeans = data.getList();
                        /*adapter.setDatas(listBeans);*/
                        mAdapter = new ViewPagerAdapter(listBeans, getContext());
                        songlistViewpager.setAdapter(mAdapter);
                    }
                }
            }


            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    @OnClick({R.id.base_img, R.id.fm_img, R.id.new_img, R.id.rank_img})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.base_img:
                Intent intent2 = new Intent(getActivity(), SonglistsquareActivity.class);
                startActivity(intent2);
                break;
            case R.id.fm_img:
                Toast.makeText(context, "程序员小哥哥正在制作中，下个版本敬请期待!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.new_img:
                Intent intent1 = new Intent(getActivity(), SingerActivity.class);
                startActivity(intent1);
                break;
            case R.id.rank_img:
                Intent intent = new Intent(getActivity(), RankingListActivity.class);
                startActivity(intent);
                break;
        }
    }


    class MyAdapter extends PagerAdapter {
        //返回viewpager可以滑动的可视页面个数
        @Override
        public int getCount() {
            return imgs.length;
        }

        /**
         * 构造viewpager的每个页面视图并添加到容器中
         *
         * @param container 容器对象，这里指viewpager
         * @param position  当前页面下标
         * @return
         */
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = LayoutInflater.from(context).inflate(R.layout.imgs, null);
            ImageView imageView = view.findViewById(R.id.image_page);
            Glide.with(context).load(imgs[position]).transform(new CenterCrop(getActivity()), new GlideRoundTransform(getActivity(), 10))
                    .into(imageView);
            container.addView(view);
            return view;
        }

        /**
         * 判断当前视图是否为instantiateItem返回的对象
         *
         * @param view   当前所视视图
         * @param object 返回的视图对象
         * @return
         */
        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        /**
         * 移除不可视视图
         *
         * @param container
         * @param position
         * @param object
         */
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            //super.destroyItem(container, position, object); 这句话必须注释或删除，否则程序异常
            container.removeView((View) object);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
