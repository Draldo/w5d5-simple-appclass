package com.example.draldo.simpleappclass;

import android.app.Application;
import android.util.Log;

/**
 * Created by Draldo on 19/08/2016.
 */
public class AppMagic extends Application{

    private static final String TAG = "AppMagicTAG_";

    private int mCounter = 0;

    public int getCounter() {
        return mCounter;
    }

    public void incrementCounter(){
        mCounter++;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: Hello GT");
    }
}
