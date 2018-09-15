package com.example.darshan.activity_lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("activity_lifecycle","onCreate invoked");
        // called only once when app is launched.

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("activity_lifecycle", "onStart invoked");
        // called when activity is visible on the screen followed by onResume

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("activity_lifecycle", "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("activity_lifecycle", "onPause invoked");
        // called when user moves away from the current activity displayed on the screen. Ex : pressing back button
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("activity_lifecycle","onRestart invoked");
        // called when user comes back to the current activity from other activities. Ex : pressing home button and launching the app again. onRestart -> onStart -> on Resume
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("activity_lifecycle", "onDestroy invoked");
        // called when user goes away from the current activity. Ex : pressing back button.
    }
}

// When screen is rotated, the lifecycle activities invoked are :  onPause -> onDestroy -> onCreate -> onStart -> onResume


