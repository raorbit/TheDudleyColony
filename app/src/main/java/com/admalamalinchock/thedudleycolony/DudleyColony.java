package com.admalamalinchock.thedudleycolony;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.admalamalinchock.thedudleycolony.game.Game;

/**
 * Created by Raorbit on 6/2/2015.
 */
//Handles initialization of Application
public class DudleyColony extends Application {
    //called when App is launched
    @Override
    public void onCreate() {
        super.onCreate();
        Game.setup();
    }
}
