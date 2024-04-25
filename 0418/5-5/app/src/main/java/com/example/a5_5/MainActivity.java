package com.example.a5_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{
    private TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtOutput = (TextView) findViewById(R.id.txtOutput);
        txtOutput.setTextSize(25);
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.activity_main);
        layout.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int act = event.getAction();
        Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        switch (act){
            case MotionEvent.ACTION_DOWN:
                txtOutput.setText("ACTION_DOWN");
                txtOutput.setTextColor(Color.RED);
                vb.vibrate((VibrationEffect.createOneShot(100000,200)));
                break;
            case MotionEvent.ACTION_UP:
                txtOutput.setText("ACTION_UP");
                txtOutput.setTextColor(Color.GREEN);
                break;
            case MotionEvent.ACTION_MOVE:
                float x = event.getX();
                float y = event.getY();
                txtOutput.setText("X= " +x + "Y=" +y);
                txtOutput.setTextColor(Color.BLUE);
                break;
        }
        return true;
    }

//    @Override
//    protected boolean onTouch(View view, MotionEvent motionEvent){
//        int act = motionEvent.getAction();
//        switch (act){
//            case MotionEvent.ACTION_DOWN:
//                txtOutput.setText("ACTION_DOWN");
//                txtOutput.setTextColor(Color.RED);
//                break;
//            case MotionEvent.ACTION_UP:
//                txtOutput.setText("ACTION_UP");
//                txtOutput.setTextColor(Color.RED);
//                break;
//        }
//
//        return  true;

}