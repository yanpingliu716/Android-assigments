package com.example.administrator.gymclub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/**
 * Created by Administrator on 2018/10/29.
 */
public class EmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        Button button = (Button) findViewById(R.id.btn_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText username=(EditText)findViewById(R.id.et_userName);
                EditText other=(EditText)findViewById(R.id.et_other);
                EditText topic=(EditText)findViewById(R.id.et_topic);
                EditText content=(EditText)findViewById(R.id.etc_content);

                Intent email = new Intent(android.content.Intent.ACTION_SEND);
                email.setType("plain/text");
                String[] emailReciver = new String[]{username.getText().toString()};

                String  emailTitle = topic.getText().toString();
                String emailContent = content.getText().toString();
                email.putExtra(android.content.Intent.EXTRA_EMAIL, emailReciver);
                email.putExtra(android.content.Intent.EXTRA_SUBJECT, emailTitle);
                email.putExtra(android.content.Intent.EXTRA_TEXT, emailContent);
                startActivity(Intent.createChooser(email, "请选择发送邮件的方式"));

            }
        });
    }
}
