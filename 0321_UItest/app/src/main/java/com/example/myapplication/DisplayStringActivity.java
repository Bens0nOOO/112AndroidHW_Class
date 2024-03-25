package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayStringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_display_string);

        TextView txtShow = (TextView)  findViewById(R.id.textView);
        Intent intent = getIntent();
        txtShow.setText(intent.getStringExtra("userName")+ "您好!");

    }
}