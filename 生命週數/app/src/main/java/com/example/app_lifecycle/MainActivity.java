package com.example.app_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static String Tag="lifeCycleTest";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(Tag, "onCreate!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart(){
        Log.v(Tag, "onStart!");
        super.onStart();
    }
    @Override
    protected void onRestart() {
        Log.v(Tag, "onRestart!");
        super.onRestart();
    }
    @Override
    protected void onResume() {
        Log.v(Tag, "onResume!");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.v(Tag, "onPause!");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.v(Tag, "onStop!");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.v(Tag, "onDestroy!");
        super.onDestroy();
    }
}