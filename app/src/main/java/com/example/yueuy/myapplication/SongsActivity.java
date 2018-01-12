package com.example.yueuy.myapplication;

import android.support.v4.app.Fragment;

public class SongsActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new SongFragment();
    }
}