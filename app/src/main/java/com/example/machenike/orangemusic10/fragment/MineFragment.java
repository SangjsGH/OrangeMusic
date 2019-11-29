package com.example.machenike.orangemusic10.fragment;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.machenike.orangemusic10.Activity.LocalMusic;
import com.example.machenike.orangemusic10.Activity.MyloveActivity;
import com.example.machenike.orangemusic10.R;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


public class MineFragment extends Fragment {
    Unbinder unbinder;
    @BindView(R.id.user_img)
    ImageView userImg;
    @BindView(R.id.user_name)
    TextView userName;
    @BindView(R.id.user_vip2)
    ImageView userVip2;
    @BindView(R.id.user_qiandao)
    ImageView userQiandao;
    @BindView(R.id.user_qiandaowenben)
    TextView userQiandaowenben;
    @BindView(R.id.user_guanzhu)
    TextView userGuanzhu;
    @BindView(R.id.user_fensi)
    TextView userFensi;
    @BindView(R.id.user_dongtai)
    TextView userDongtai;
    @BindView(R.id.user_yingyue)
    ImageView userYingyue;
    @BindView(R.id.user_xiaoxiwenben)
    TextView userXiaoxiwenben;
    @BindView(R.id.my_localmusic)
    LinearLayout myLocalmusic;
    @BindView(R.id.user_haoyouwenben)
    TextView userHaoyouwenben;
    @BindView(R.id.my_friend)
    LinearLayout myFriend;
    @BindView(R.id.user_huanfuwenben)
    TextView userHuanfuwenben;
    @BindView(R.id.user_huanfu)
    LinearLayout userHuanfu;
    @BindView(R.id.user_riliwenben)
    TextView userRiliwenben;
    @BindView(R.id.my_calendir)
    LinearLayout myCalendir;
    @BindView(R.id.user_likewenben2)
    TextView userLikewenben2;
    @BindView(R.id.user_jia)
    ImageView userJia;
    @BindView(R.id.user_sl)
    ImageView userSl;
    @BindView(R.id.user_likewenben)
    TextView userLikewenben;
    @BindView(R.id.user_likewenben1)
    TextView userLikewenben1;
    @BindView(R.id.user_like)
    LinearLayout userLike;


    private String userName1;


    private Calendar calendar;

    private boolean isDestory = false;
    private static final int tag = 1;
//    @SuppressLint("HandlerLeak")
//    Handler mHandler = new Handler() {
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            switch (msg.what) {
//                case tag:
//                    //在这里写需要刷新完成的代码
//
//                    removeMessages(tag);
//                    if (!isDestory) {
//                        sendEmptyMessageDelayed(tag, 1000);//这里想几秒刷新一次就写几秒}
//                        break;
//                    }
//            }
//        }
//    };


    public static MineFragment newInstance(String type) {
        Bundle args = new Bundle();
        args.putString("type", type);
        MineFragment fragment = new MineFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_mine, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
        gxUI();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.my_localmusic, R.id.my_friend, R.id.my_calendir, R.id.user_like, R.id.user_qiandao})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.my_localmusic:
                Intent intent = new Intent(getActivity(), LocalMusic.class);
                startActivity(intent);
                break;
            case R.id.my_friend:
                break;
            case R.id.my_calendir:
                calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                        Toast.makeText(getActivity(), "所选择的日期是：" + year + "-" + (month + 1) + "-" + dayOfMonth, Toast.LENGTH_SHORT).show();

                    }
                }, year, month, day);
                datePickerDialog.show();
                break;
            case R.id.user_like:
                SharedPreferences sharedPreferences = getActivity().getSharedPreferences("TTE", Context.MODE_PRIVATE);
                userName1 = sharedPreferences.getString("userName", "");
                if (userName1.equals("")){
                    Toast.makeText(getActivity(), "您还未登录，请先登录！", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent1 = new Intent(getActivity(), MyloveActivity.class);
                    startActivity(intent1);
                }
                break;
            case R.id.user_qiandao:
                SharedPreferences sharedPreferences1 = getActivity().getSharedPreferences("TTE", Context.MODE_PRIVATE);
                userName1 = sharedPreferences1.getString("userName", "");
                if (userName1.equals("")){
                    Toast.makeText(getActivity(), "您还未登录，请先登录！", Toast.LENGTH_SHORT).show();
                }else {
                    userQiandaowenben.setText("已签到");
                }

                break;
        }
    }

    //销毁
    @Override
    public void onDestroy() {
        super.onDestroy();
        isDestory = true;
    }

    public void gxUI() {
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("TTE", Context.MODE_PRIVATE);
        userName1 = sharedPreferences.getString("userName", "");
        if (userName1.equals("")) {
            userImg.setImageResource(R.mipmap.ic_denglu);
            userName.setText("未登录");
        } else {
            userImg.setImageResource(R.mipmap.hmbb);
            userName.setText(userName1);
        }

    }

}
