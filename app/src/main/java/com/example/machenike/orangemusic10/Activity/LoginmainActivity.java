package com.example.machenike.orangemusic10.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.machenike.orangemusic10.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginmainActivity extends AppCompatActivity {
    @BindView(R.id.iv_head)
    ImageView ivHead;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_qq)
    Button btnQq;
    @BindView(R.id.btn_wx)
    Button btnWx;
    @BindView(R.id.btn_wb)
    Button btnWb;
    @BindView(R.id.btn_tel)
    Button btnTel;
    @BindView(R.id.btn_tiyan)
    Button btnTiyan;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_mian);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_login, R.id.btn_qq, R.id.btn_wx, R.id.btn_wb, R.id.btn_tel,R.id.btn_tiyan})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_qq:
                break;
            case R.id.btn_wx:
                break;
            case R.id.btn_wb:
                break;
            case R.id.btn_tel:
                break;
            case R.id.btn_tiyan:
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
