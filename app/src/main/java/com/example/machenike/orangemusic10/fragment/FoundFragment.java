package com.example.machenike.orangemusic10.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.widget.ListView;
import android.widget.Toast;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.adapter.MvAdapter;
import com.example.machenike.orangemusic10.entity.MV;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static com.example.machenike.orangemusic10.App.MyApp.getappcontext;

public class FoundFragment extends Fragment {
    private MvAdapter adapter;
    private Context context;
    private List<MV.DataBean.ListBean> listBeans=new ArrayList<>();
    private final String API = "https://v1.itooi.cn/tencent/mv/hot?&pageSize=100&page=0";

    @BindView(R.id.list_mv)
    ListView listMv;
    Unbinder unbinder;

    public static FoundFragment newInstance(String type) {
        Bundle args = new Bundle();
        args.putString("type", type);
        FoundFragment fragment = new FoundFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_found, null);
        unbinder = ButterKnife.bind(this, view);
        adapter = new MvAdapter(getContext());
        getData();

        AnimationSet set = new AnimationSet(false);
        Animation animation = new AlphaAnimation(0,1);   //AlphaAnimation 控制渐变透明的动画效果
        animation.setDuration(500);     //动画时间毫秒数
        set.addAnimation(animation);    //加入动画集合

        LayoutAnimationController controller = new LayoutAnimationController(set, 1);

        listMv.setLayoutAnimation(controller);   //ListView 设置动画效果


        return view;
    }

    private void getData() {
        RequestParams params = new RequestParams(API);
        x.http().get(params, new Callback.CommonCallback<MV>() {
            @Override
            public void onSuccess(MV mv) {
                listBeans.addAll(mv.getData().getList());
                adapter.setDatas(listBeans);
                listMv.setAdapter(adapter);
            }


            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(getappcontext(), ex.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
