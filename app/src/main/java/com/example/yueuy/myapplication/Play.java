package com.example.yueuy.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by yueuy on 17-11-14.
 */

public class Play extends MainActivity {

    private boolean isFavorite = true;
    private boolean isStart = true;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);
        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Play.this, MainActivity.class);
                startActivity(intent);
            }
        });

        final ImageButton mImageButtonFavorite = (ImageButton) findViewById(R.id.favorite);
        mImageButtonFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFavorite){
                    mImageButtonFavorite.setImageResource(R.drawable.ic_favorite_black_24dp);
                    isFavorite = false;
                }else{
                    mImageButtonFavorite.setImageResource(R.drawable.ic_favorite_border_black_24dp);
                }
            }
        });

        final ImageButton mImageButtonStart = (ImageButton) findViewById(R.id.start);
        mImageButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isStart){
                    mImageButtonStart.setImageResource(R.drawable.ic_pause_circle_outline_black_24dp);
                    isStart = false;
                }else{
                    mImageButtonStart.setImageResource(R.drawable.ic_play_circle_outline_black_24dp);
                }
            }
        });

    }
}
