package com.example.draldo.simpleappclass;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static final String TAG = "MyServiceTAG_";
    private AppMagic appMagic;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        appMagic = (AppMagic) getApplication();

        Log.d(TAG, "onCreate: ");
        appMagic.incrementCounter();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: ");
        appMagic.incrementCounter();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: " + String.valueOf(appMagic.getCounter()));
        super.onDestroy();
    }
}
