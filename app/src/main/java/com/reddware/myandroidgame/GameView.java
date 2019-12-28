package com.reddware.myandroidgame;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class GameView extends GLSurfaceView {
    private final GameRenderer gameRenderer;

    public GameView(Context context) {
        super(context);

        setEGLContextClientVersion(2);

        gameRenderer = new GameRenderer(context);

        setRenderer(gameRenderer);

    }
}
