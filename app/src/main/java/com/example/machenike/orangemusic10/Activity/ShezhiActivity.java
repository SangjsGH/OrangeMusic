package com.example.machenike.orangemusic10.Activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.machenike.orangemusic10.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ShezhiActivity extends AppCompatActivity {


    public SharedPreferences mySharedPreferences;
    public SharedPreferences.Editor editor;
    @BindView(R.id.btn_backk)
    ImageView btnBackk;
    @BindView(R.id.top_rl)
    RelativeLayout topRl;
    @BindView(R.id.linl_exit)
    LinearLayout linlExit;
    private String userName;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cehua_shezhi);
        ButterKnife.bind(this);
        mySharedPreferences = ShezhiActivity.this.getSharedPreferences("TTE", Context.MODE_PRIVATE);
        //实例化SharedPreferences.Editor对象（第二步）
        editor = mySharedPreferences.edit();
    }


    @OnClick({R.id.btn_backk, R.id.linl_exit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_backk:
                this.finish();
                break;
            case R.id.linl_exit:
                SharedPreferences sharedPreferences = ShezhiActivity.this.getSharedPreferences("TTE", Context.MODE_PRIVATE);
                userName = sharedPreferences.getString("userName","");
                if (userName.equals("")){
                    Toast.makeText(this, "你还未登陆", Toast.LENGTH_SHORT).show();
                }else {
                    editor.putString("userName", "");
                    //提交当前数据
                    editor.commit();
                    Intent intent = new Intent(this,MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(this, "退出成功！", Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }
}
