package com.example.administrator.gymclub;

import android.content.Intent;
import android.support.v4.app.Fragment;

import  android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView sportView;
    TextView findView;
    TextView communityView;
    TextView mineView;
    TextView courseListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //去掉标题栏
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        sportView = (TextView) findViewById(R.id.sport_tag);
        findView = (TextView) findViewById(R.id.find_tag);
        communityView = (TextView) findViewById(R.id.community_tag);
        mineView = (TextView) findViewById(R.id.mine_tag);
        sportView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new SportFragment());
            }
        });
        findView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new FindFragment());
            }
        });
        communityView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new CommunityFragment());
            }
        });
        mineView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new MineFragment());
            }
        });
        replaceFragment(new SportFragment());

    }

    private void replaceFragment(Fragment fragment){
        FragmentManager  fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.context_fragment,fragment);
        transaction.commit();
    }
}
