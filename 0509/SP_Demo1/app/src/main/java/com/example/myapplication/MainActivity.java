package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnConfirm = (Button) findViewById(R.id.button);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] steaks = getResources().getStringArray(R.array.steaks);
                Spinner spinner = (Spinner) findViewById(R.id.spinner);
                int index = spinner.getSelectedItemPosition();
                TextView lbloutput = (TextView) findViewById(R.id.lblOutput);
                lbloutput.setText("牛排要" + steaks[index]);

            }
        });
    }
}