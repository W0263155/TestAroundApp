package com.example.fuckinaroundapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer song = MediaPlayer.create(MainActivity.this,R.raw.bit_song);
        song.start();
        song.setLooping(true);
    }
}
