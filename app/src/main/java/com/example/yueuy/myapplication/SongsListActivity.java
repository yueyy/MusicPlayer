package com.example.yueuy.myapplication;

import android.support.v4.app.Fragment;

/**
 * Created by yueuy on 17-12-9.
 */

public class SongsListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new SongsListFragment();
    }
}
