package com.example.administrator.gymclub;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;
/**
 * Created by Administrator on 2018/10/28.
 */
public class PlayActivity extends AppCompatActivity {
    private List<Video> mData = null;
    private Context mContext;
    private VideoAdapter mAdapter = null;
    private ListView list_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videolist);

        mContext = PlayActivity.this;
        list_video = (ListView) findViewById(R.id.list_videos);
        mData = new LinkedList<Video>();
        mData.add(new Video(R.drawable.coach2, "锻炼背阔肌动作", "增肌","点击量：12"));
        mData.add(new Video(R.drawable.coach9, "上斜仰卧臂屈伸", "增肌","点击量：5"));
        mData.add(new Video(R.drawable.coach6, "瑜伽入门教程", "瑜伽","点击量：3"));
        mData.add(new Video(R.drawable.coach7, "瑜伽坐姿进阶", "瑜伽","点击量：2"));
        mAdapter = new VideoAdapter((LinkedList<Video>) mData, mContext);
        list_video.setAdapter(mAdapter);
    }
}