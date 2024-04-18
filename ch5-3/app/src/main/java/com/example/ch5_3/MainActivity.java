package com.example.ch5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    private  float original_size = 20;
    //private  TextView txvOutput = (TextView) findViewById(R.id.txvOutput);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txvOutput = (TextView) findViewById(R.id.txvOutput);
        txvOutput.setTextSize(original_size);
        Button btnEnlarge = (Button) findViewById(R.id.btn_Enlarge);
        btnEnlarge.setOnClickListener(this);
        btnEnlarge.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView txvOutput = (TextView) findViewById(R.id.txvOutput);
        float size = txvOutput.getTextSize();
        Log.v("SIZE" , "size = " + size);
        txvOutput.setTextSize(px2sp(this, size) + 5);
    }

    @Override
    public boolean onLongClick(View v) {
        TextView txvOutput = (TextView) findViewById(R.id.txvOutput);
        txvOutput.setTextSize(original_size);
        return false;
    }

    public static  int px2sp(Context context, float pxValue){
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }
}