package com.example.machenike.orangemusic10.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.entity.User;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {
    @BindView(R.id.IV_back)
    ImageView IVBack;
    @BindView(R.id.et_user_name)
    EditText etUserName;
    @BindView(R.id.et_psw)
    EditText etPsw;
    @BindView(R.id.et_psw_again)
    EditText etPswAgain;
    @BindView(R.id.btn_register)
    Button btnregister;
    @BindView(R.id.activity_register)
    LinearLayout activityRegister;
    private String username;
    private String password;
    private String repassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_register);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.IV_back, R.id.btn_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.IV_back:
                this.finish();
                break;
            case R.id.btn_register:
                username=etUserName.getText().toString();
                password=etPsw.getText().toString();
                repassword =etPswAgain.getText().toString();

                if (!password.equals(repassword)){
                    Toast.makeText(RegisterActivity.this, "您两次输入的密码不一致！", Toast.LENGTH_SHORT).show();
                }else {
                    getData();
                }

                break;
        }
    }

    private void getData() {
        String API = "http://192.168.43.234:8080//Music/user_User_addUser_json?username="+username+"&password="+password;
        RequestParams params = new RequestParams(API);
//        params.addParameter("songListId","");
        x.http().post(params, new Callback.CommonCallback<User>() {
            @Override
            public void onSuccess(User result) {
                if (result != null) {
                    String msg = result.getResult().getMsg();
                    Log.i("===",msg);
                        if (msg.equals("注册成功")){
                            Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(RegisterActivity.this, msg, Toast.LENGTH_SHORT).show();
                        }
                    }

            }
            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(RegisterActivity.this, "错误", Toast.LENGTH_SHORT).show();
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
}
