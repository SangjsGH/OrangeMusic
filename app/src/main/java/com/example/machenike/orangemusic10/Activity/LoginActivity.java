package com.example.machenike.orangemusic10.Activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.machenike.orangemusic10.R;
import com.example.machenike.orangemusic10.entity.User;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.et_user_name)
    EditText etUserName;
    @BindView(R.id.et_psw)
    EditText etPsw;
    @BindView(R.id.tv_find_psw)
    TextView tvFindPsw;
    @BindView(R.id.IV_back)
    ImageView IVBack;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_register)
    TextView tvRegister;
    private String username;
    private String password;
    public SharedPreferences mySharedPreferences;
    public SharedPreferences.Editor editor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        //实例化SharedPreferences对象（第一步）
        mySharedPreferences = LoginActivity.this.getSharedPreferences("TTE", Context.MODE_PRIVATE);
        //实例化SharedPreferences.Editor对象（第二步）
        editor = mySharedPreferences.edit();


    }


    private void getData() {
        username=etUserName.getText().toString();
        password=etPsw.getText().toString();
        String API = "http://192.168.43.234:8080/Music/userLogin_login_Userlogin_json?username="+username+"&password="+password;
        RequestParams params = new RequestParams(API);
//        params.addParameter("songListId","");
        x.http().post(params, new Callback.CommonCallback<User>() {
            @Override
            public void onSuccess(User result) {
                if (result != null) {
                    String msg = result.getResult().getMsg();
                    Log.i("===",msg);
                    Toast.makeText(LoginActivity.this, msg, Toast.LENGTH_SHORT).show();
                    if (msg.equals("登录成功")){
                        editor.putString("userName", username);
                        //提交当前数据
                        editor.commit();
                        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    intent.putExtra("username",username);
                    startActivity(intent);
                    }
                }
            }
            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(LoginActivity.this, "错误", Toast.LENGTH_SHORT).show();
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

    @OnClick({R.id.IV_back, R.id.btn_login, R.id.tv_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.IV_back:
                this.finish();
                break;
            case R.id.btn_login:
                username = etUserName.getText().toString();
                password = etPsw.getText().toString();
                if (username!=null&password!=null){

                    getData();
                }
                break;
            case R.id.tv_register:
                Intent intent = new Intent(this,RegisterActivity.class);
                startActivity(intent);
                break;
        }
    }
}
