package com.example.yueuy.myapplication;

import java.util.UUID;

/**
 * Created by yueuy on 17-12-9.
 */

public class Song {
    private UUID mId;
    private String mName;
    private String mSinger;
    private Float mTime;
    private Boolean isFavorite;

    public Song(){
        mId = UUID.randomUUID();
    }

    public UUID getId(){
        return mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getSinger() {
        return mSinger;
    }

    public void setSinger(String singer) {
        mSinger = singer;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }
}
