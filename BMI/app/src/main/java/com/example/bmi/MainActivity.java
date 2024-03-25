package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = (TextView) findViewById(R.id.txtShow);
        Button btnCount = (Button) findViewById(R.id.btn_Count);
        Button btnClear = (Button) findViewById(R.id.btn_Clear);
        btnCount.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText edtH = (EditText) findViewById(R.id.edtH);
        EditText edtW = (EditText) findViewById(R.id.edtW);

        if(v.getId() == R.id.btn_Count){
            double h = Double.parseDouble(edtH.getText().toString());
            double w = Double.parseDouble(edtW.getText().toString());
            double bmi = w / Math.pow(h/100.0 , 2);
            if (bmi >= 24)
                txtView.setTextColor(Color.RED);
            else if (bmi < 18.5)
                txtView.setTextColor(Color.BLUE);
            else
                txtView.setTextColor(Color.GREEN);

            txtView.setText(String.format("%.2f",bmi));
        }
        else {
            edtH.setText("0");
            edtW.setText("0");
            txtView.setText("");
        }
    }
}