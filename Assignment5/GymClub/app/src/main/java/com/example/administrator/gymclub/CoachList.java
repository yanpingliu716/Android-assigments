package com.example.administrator.gymclub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/11/7.
 */

public class CoachList extends AppCompatActivity {

    private List<Coach> coachList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.coach);
        ImageView back = (ImageView)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getApplicationContext()).finish();
            }
        });
        initCoach();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.coach_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        CoachAdapter adapter = new CoachAdapter(coachList);
        recyclerView.setAdapter(adapter);
    }

    private void initCoach(){
        Coach c1 = new Coach("Jack","年龄：28 \n"+"从业：4年\n"+"再完美的衣装也比不上健康的身体，优美的身材！",R.drawable.coach1);
        coachList.add(c1);
        Coach c2 = new Coach("Mark","年龄：29 \n"+"从业：2年\n"+"生命在于运动",R.drawable.coach2);
        coachList.add(c2);
        Coach c3 = new Coach("李教练","年龄：27 \n"+"从业：5年\n"+"从锻炼角度看，躺着不如坐着，坐着不如站着，站着不如走着。",R.drawable.coach3);
        coachList.add(c3);
        Coach c4 = new Coach("刘教练","年龄：38 \n"+"从业：5年\n"+"活动有方，五脏自和。",R.drawable.coach4);
        coachList.add(c4);
        Coach c5 = new Coach("孙教练","年龄：23 \n"+"从业：4年\n"+"身体健康者常年轻。",R.drawable.coach5);
        coachList.add(c5);
        Coach c6 = new Coach("谢教练","年龄：29 \n"+"从业：6年\n"+"身体教育和知识教育之间必须保持平衡。体育应造就体格健壮的勇士，并且使健全的精神寓于健全的体格。",R.drawable.coach6);
        coachList.add(c6);
        Coach c7 = new Coach("袁教练","年龄：28 \n"+"从业：4年\n"+"运动是一切生命的源泉",R.drawable.coach7);
        coachList.add(c7);
        Coach c8 = new Coach("王教练","年龄：38 \n"+"从业：3年\n"+"运动是生命的滋润剂，健身是青春的美容师，健身是对生命的投资，运动是对健康的保险，生命在运动中延续，健康在锻炼中加固！",R.drawable.coach8);
        coachList.add(c8);
        Coach c9 = new Coach("谢教练","年龄：26 \n"+"从业：2年\n"+"运动太多和太少，同样的损伤体力；饮食过多与过少，同样的损伤健康；唯有适度可以产生、增进、保持体力和健康。",R.drawable.coach9);
        coachList.add(c9);
        Coach c10 = new Coach("孙教练","年龄：28 \n"+"从业：4年\n"+"以自然之道，养自然之身！",R.drawable.coach10);
        coachList.add(c10);


    }
}
