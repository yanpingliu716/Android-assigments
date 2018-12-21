package com.example.administrator.gymclub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/11/6.
 */

public class Appstart extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //去掉标题栏
        setContentView(R.layout.appstart);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);//全屏显示
        Toast.makeText(getApplicationContext(),"欢迎来到Jia健俱乐部！",Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Appstart.this,MainActivity.class);
                startActivity(intent);
                Appstart.this.finish();
            }
        },2000);

    }
}
