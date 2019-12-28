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
        // Pause the rendering thread
        // Deallocate memory here if needed
        myGameView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Resume the paused rendering thread
        // If anything was deallocated, reallocate them
        myGameView.onResume();
    }
}