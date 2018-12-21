package com.example.administrator.gymclub;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018/11/7.
 */

public class CoachAdapter extends RecyclerView.Adapter<CoachAdapter.ViewHolder>{

    private List<Coach> mCoachList;

    static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView coachImage;
        TextView coachName;
        TextView coachMotto;

        public ViewHolder(View view){

            super(view);
            coachImage = (ImageView)view.findViewById(R.id.coach_image);
            coachName = (TextView)view.findViewById(R.id.coach_name);
            coachMotto = (TextView)view.findViewById(R.id.coach_motto);
        }
    }

    public CoachAdapter(List<Coach> coachList){
        mCoachList = coachList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coach_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return  holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Coach coach = mCoachList.get(position);
        holder.coachImage.setImageResource(coach.getImageId());
        holder.coachName.setText(coach.getName());
        holder.coachMotto.setText(coach.getMotto());
    }

    @Override
    public int getItemCount() {

        return mCoachList.size();
    }
}

