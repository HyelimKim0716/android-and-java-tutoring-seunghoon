package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyDataTypeActivity extends AppCompatActivity {


    private EditText etNum1, etNum2;
    private Button btnSum, btnMultiply, btnDivide;
    private TextView tvResult;

    EditText etFloatNum1;
    EditText etFloatNum2;

    Button btnFloatSum;
    Button btnFloatMultiply;
    Button btnFloatDivide;

    TextView tvFloatResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_data_type);

        etNum1 = findViewById(R.id.hl_dataType_etInputNumber1);
        etNum2 = findViewById(R.id.hl_dataType_etInputNumber2);

        btnSum = findViewById(R.id.hl_dataType_btnSum);
        btnMultiply= findViewById(R.id.hl_dataType_btnMultiply);
        btnDivide = findViewById(R.id.hl_dataType_btnDivide);

        tvResult = findViewById(R.id.hl_dataType_tvSumTotal);

        btnSum.setOnClickListener(btnClickListener);
        btnMultiply.setOnClickListener(btnClickListener);
        btnDivide.setOnClickListener(btnClickListener);

        etFloatNum1 = findViewById(R.id.hl_dataType_etFloatNum1);
        etFloatNum2 = findViewById(R.id.hl_dataType_etFloatNum2);

        btnFloatSum = findViewById(R.id.hl_dataType_btnFloatSum);
        btnFloatMultiply = findViewById(R.id.hl_dataType_btnFloatMultiply);
        btnFloatDivide = findViewById(R.id.hl_dataType_btnFloatDivide);

        tvFloatResult = findViewById(R.id.hl_dataType_tvFloatResult);

        btnFloatSum.setOnClickListener(btnClickListener);
        btnFloatMultiply.setOnClickListener(btnClickListener);
        btnFloatDivide.setOnClickListener(btnClickListener);

    }

    private View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int num1 = Integer.parseInt(etNum1.getText().toString());
            int num2 = Integer.parseInt(etNum2.getText().toString());

            switch (v.getId()) {
                case R.id.hl_dataType_btnSum:   // 더하기
                    int sum = num1 + num2;


                    tvResult.setText(String.valueOf(sum));

                    break;

                case R.id.hl_dataType_btnMultiply:
                    int multiply = num1 * num2;
                    tvResult.setText(String.valueOf(multiply));

                    break;
                case R.id.hl_dataType_btnDivide:
                    int divide = num1 / num2;

                    tvResult.setText(String.valueOf(divide));
                    break;

                case R.id.hl_dataType_btnFloatSum:

                    float floatNum1 = Float.parseFloat(etFloatNum1.getText().toString());
                    float floatNum2 = Float.parseFloat(etFloatNum2.getText().toString());

                    float floatSum = floatNum1 + floatNum2;

                    tvFloatResult.setText(String.valueOf(floatSum));


                    break;

            }
        }
    };
}
