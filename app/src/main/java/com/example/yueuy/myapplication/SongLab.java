package com.example.yueuy.myapplication;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by yueuy on 17-12-9.
 */

public class SongLab  {
    private static SongLab sSongLab;
    private List<Song> mSongs;

    public static SongLab get(Context context){
        if (sSongLab == null){
            sSongLab = new SongLab(context);
        }
        return sSongLab;
    }

    private SongLab(Context context){
        mSongs = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Song song = new Song();
            song.setName("Song "+ i);
            song.setSinger( "me" );
            song.setFavorite(i % 2==0);
            mSongs.add(song);
        }
    }
    public List<Song> getSongs(){
        return mSongs;
    }
    public Song getSong(UUID id){
        for (Song song: mSongs){
            if (song.getId().equals(id)){
                return song;
            }
        }
        return null;
    }
}
