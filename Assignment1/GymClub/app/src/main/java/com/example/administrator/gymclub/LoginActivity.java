package com.example.administrator.gymclub;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        TextView register = (TextView)findViewById(R.id.register_icon);
        final EditText account = (EditText)findViewById(R.id.login_account);
        final EditText password = (EditText)findViewById(R.id.login_pwd);
        Button sumbit = (Button)findViewById(R.id.login_submit);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("log","ok");
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences pref = getSharedPreferences("data",MODE_PRIVATE);
                String pwd = pref.getString(account.getText().toString(),"");
                if(pwd.equals(password.getText().toString())){
                    Toast.makeText(LoginActivity.this,"登陆成功！",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this,"密码或账户错误",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
