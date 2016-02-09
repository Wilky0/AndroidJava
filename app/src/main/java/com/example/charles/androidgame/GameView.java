package com.example.charles.androidgame;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by Charles on 26/01/2016.
 */
public class GameView extends GLSurfaceView {
    private GameRenderer renderer;
    public static Context context;

    public GameView(Context context) {
        super(context);

        renderer = new GameRenderer();
        this.setRenderer(renderer);
        GameView.context = context;

    }

}
