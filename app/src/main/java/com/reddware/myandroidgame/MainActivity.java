package com.reddware.myandroidgame;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private GameView myGameView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myGameView = new GameView(this);
        setContentView(myGameView);
    }
    @Override
    protected void onPause() {
        super.onPause();
        myGameView.onPause();
    }
    @Override
    protected void onResume() {
        super.onResume();
        myGameView.onResume();
    }
}