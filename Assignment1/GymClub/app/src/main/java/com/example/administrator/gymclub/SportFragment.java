package com.example.administrator.gymclub;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/11/6.
 */

public class SportFragment extends Fragment {

    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.sport,container,false);
        TextView lookCourse = (TextView) view.findViewById(R.id.look_course);
        lookCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CourseList.class);
                startActivity(intent);

            }
        });
        TextView lookCoach = (TextView) view.findViewById(R.id.look_coach);
        lookCoach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CoachList.class);
                startActivity(intent);

            }
        });
        return view;
    }



}
