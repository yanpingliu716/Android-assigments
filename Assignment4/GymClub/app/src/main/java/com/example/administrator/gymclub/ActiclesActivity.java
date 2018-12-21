package com.example.administrator.gymclub;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class ActiclesActivity extends AppCompatActivity {
    private List<Video> mData = null;
    private Context mContext;
    private VideoAdapter mAdapter = null;
    private ListView list_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acticles);

        mContext = ActiclesActivity.this;
        list_video = (ListView) findViewById(R.id.article);
        mData = new LinkedList<Video>();

        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "gymclub").allowMainThreadQueries().build();
        ArticleDao articleDao=db.articleDao();
        List<Article> articles=articleDao.getArticles();

        mData.add(new Video(R.mipmap.danche, "动感单车", "动感单车，英文名字（SPINNING），是由美国私人教练兼极限运动员JOHNNYG于二十世纪八十年代首创，是一种结合了音乐、视觉效果等独特的充满活力的室内自行车训练课程。" +
                "❤可靠、牢固的部件：使用坚固、高质量的配件及材料，正确的动感单车可经受住高强度使用。易锈部分为不锈钢结构，飞轮使用铬合金涂层处理，主体支架采用静电喷涂技术可最大限度的防锈；\n" +
                "❤简易维护：必确动感单车不仅外观美观，而且维护便捷；\n" +
                "❤使用简便：简易的插销式调节系统提供稳定性和安全性；防滑多功能把手无需拆卸即可使用调节钮及调节安全系\n" +
                "统安全的进行调节；两个处于不同部位的水壶架使用方便；\n" +
                "❤根据人类环境工程学设计的坐垫提供最大的舒适感：男女皆宜的坐垫适合初学者和有经验的使用者，专业化设计纠正坐姿，提供最大舒适感\n" +
                "❤双向踏脚：双向选择的踏脚及简易调节的踏脚绑带满足不同程度的使用者的需要，单车专用鞋和运动鞋均适用；\n" +
                "❤提供平滑、准确的阻力：汽车工业中最新的技术和材料被应用于阻力控制、飞轮和Poly V皮带，提供用户一种平滑、流畅的舒适感和持续“真实”的单车体验。\n" +
                "适合对象\n\n"+
                "起源于美国的动感单车沾染着浓浓的美国味道，活力四射、热情奔放，因此颇受25～35岁的人群的青睐。不过在国外这项运动可没有年龄限制，因为它设计上的科学性保证了参与者的安全，而且运动的强度完全是可控的，适应于所有有运动能力的人。不过建议膝盖有损伤的人不参加此项运动，因为整个骑行过程中，膝关节的摩擦很大，再加上高强度的压力，很容易形成潜在的伤害，在日后的运动过程中就会慢慢体现出来。心脏病和高血压患者也最好不要参与，以免在高强度训练中发生危险。",""));

        mAdapter = new VideoAdapter((LinkedList<Video>) mData, mContext);
        list_video.setAdapter(mAdapter);
    }
}
