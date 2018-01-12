package com.example.yueuy.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


import java.util.List;

/**
 * Created by yueuy on 17-12-9.
 */

public class SongAdapter extends RecyclerView.Adapter<SongHolder> {
    private List<Song> mSongs;
    private Context mContext;

    public SongAdapter(List<Song> songs, Context context){
        this.mContext = context;
        mSongs = songs;
    }

    @Override
    public SongHolder onCreateViewHolder(ViewGroup parent,int viewType){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(android.R.layout.simple_list_item_1,parent,false);
        return new SongHolder(view);
    }

    @Override
    public void onBindViewHolder(SongHolder viewHolder,int position){
        Song song = mSongs.get(position);
        viewHolder.mNameTextView.setText(song.getName());
    }

    @Override
    public int getItemCount(){
        return mSongs.size();
    }
}


