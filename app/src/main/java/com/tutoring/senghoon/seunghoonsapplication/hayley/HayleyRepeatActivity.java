package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyRepeatActivity extends AppCompatActivity {

    LinearLayout llBoolean1;
    TextView tvBooleanTitle1;
    Button btnBooleanResult1;
    TextView tvBooleanResult1;

    LinearLayout llBoolean2;
    TextView tvBooleanTitle2;
    Button btnBooleanResult2;
    TextView tvBooleanResult2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_repeat);

        llBoolean1 = findViewById(R.id.hl_repeat_llBoolean1);
        tvBooleanTitle1 = findViewById(R.id.hl_repeat_tvBooleanTitle1);
        btnBooleanResult1 = findViewById(R.id.hl_repeat_btnBoolean1Result);
        tvBooleanResult1 = findViewById(R.id.hl_repeat_tvBoolean1Result);

        llBoolean2 = findViewById(R.id.hl_repeat_llBoolean2);
        tvBooleanTitle2 = findViewById(R.id.hl_repeat_tvBooleanTitle2);
        btnBooleanResult2 = findViewById(R.id.hl_repeat_btnBoolean2Result);
        tvBooleanResult2 = findViewById(R.id.hl_repeat_tvBoolean2Result);



    }
}