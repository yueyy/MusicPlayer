package com.example.yueuy.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by yueuy on 17-12-9.
 */

public class SongsListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private SongAdapter mSongAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_songs_list,container,false);
        mRecyclerView = view.findViewById(R.id.recycle_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        SongLab songLab = SongLab.get(getActivity());
        List<Song> songs = songLab.getSongs();
        mSongAdapter = new SongAdapter(songs,container.getContext());
        mRecyclerView.setAdapter(mSongAdapter);
        return view;
    }
}
