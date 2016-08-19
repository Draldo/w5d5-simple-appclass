package com.example.draldo.simpleappclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainTAG_";

    private AppMagic mApp;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mApp = (AppMagic) getApplication();
        mTextView = (TextView) findViewById(R.id.a_main_txt);

        mApp.incrementCounter();
        Log.d(TAG, "onCreate: ");
    }

    public void doMagic(View view) {
        mTextView.setText(String.valueOf(mApp.getCounter()));
    }

    public void doService(View view) {
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    public void doStop(View view) {
        Intent intent = new Intent(this, MyService.class);
        stopService(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mApp.incrementCounter();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        mApp.incrementCounter();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        mApp.incrementCounter();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        mApp.incrementCounter();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mApp.incrementCounter();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mApp.incrementCounter();
        Log.d(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mApp.incrementCounter();
        Log.d(TAG, "onRestoreInstanceState: ");
    }

}
