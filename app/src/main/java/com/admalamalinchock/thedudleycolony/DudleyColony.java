package com.admalamalinchock.thedudleycolony;

import android.app.Application;

import com.admalamalinchock.thedudleycolony.game.Game;

/**
 * Created by Raorbit on 6/2/2015.
 */
public class DudleyColony extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Game.setup();
    }
}
