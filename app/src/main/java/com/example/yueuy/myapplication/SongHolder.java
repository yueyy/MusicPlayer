package com.example.yueuy.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by yueuy on 17-12-9.
 */

public class SongHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView mNameTextView;
    private Song mSong;

    public SongHolder (View itemView){
        super(itemView);
        itemView.setOnClickListener(this);
        mNameTextView = (TextView) itemView;
    }
    @Override
    public void onClick(View v){
        Toast.makeText(v.getContext(),"you want to listen to "+mSong.getName(),Toast.LENGTH_SHORT).show();
    }
}