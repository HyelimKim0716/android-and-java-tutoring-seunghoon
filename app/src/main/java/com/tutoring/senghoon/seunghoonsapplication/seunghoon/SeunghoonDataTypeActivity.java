package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonDataTypeActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_seunghoon_data_type);

        etNum1 = findViewById(R.id.sh_dataType_etNum1);
        etNum2 = findViewById(R.id.sh_dataType_etNum2);

        btnSum = findViewById(R.id.sh_dataType_btnSum);
        btnMultiply = findViewById(R.id.sh_dataType_btnMultiply);
        btnDivide = findViewById(R.id.sh_dtaType_btnDivide);

        tvResult = findViewById(R.id.sh_dataType_tvResult);

        btnSum.setOnClickListener(btnClickListener);
        btnMultiply.setOnClickListener(btnClickListener);
        btnDivide.setOnClickListener(btnClickListener);

        etFloatNum1 = findViewById(R.id.sh_dataType_etFloatNum1);
        etFloatNum2 = findViewById(R.id.sh_dataType_etFloatNum2);

        btnFloatSum = findViewById(R.id.sh_dataType_btnFloatsum);
        btnFloatMultiply = findViewById(R.id.sh_dataType_btnFloatMultiply);
        btnFloatDivide = findViewById(R.id.sh_dataType_btnFloatDivide);

        tvFloatResult = findViewById(R.id.sh_dataType_tvFloatResult);

        btnFloatSum.setOnClickListener(btnClickListener);
        btnFloatMultiply.setOnClickListener(btnClickListener);
        btnFloatDivide.setOnClickListener(btnClickListener);
    }

    private View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int num1 = Integer.parseInt(etNum1.getText().toString());
            int num2 = Integer.parseInt(etNum2.getText().toString());


            switch (view.getId()) {
                case R.id.sh_dataType_btnSum:    // 더하기
                    int sum = num1 +num2;

                    tvResult.setText(String.valueOf(sum));

                    break;

                case R.id.sh_dataType_btnMultiply:   // 곱하기
                    int multiply = num1 * num2;
                    tvResult.setText(String.valueOf(multiply));
                    break;

                case R.id.sh_dtaType_btnDivide:     // 나누기
                   int divide = num1 / num2;
                    tvResult.setText(String.valueOf(divide));
                    break;

                case R.id.sh_dataType_btnFloatsum:

                    float floatNum1 = Float.parseFloat( etFloatNum1.getText().toString());
                    float floatNum2 = Float.parseFloat(etFloatNum2.getText().toString());

                    float floatSum = floatNum1 + floatNum2;

                    tvFloatResult.setText(String.valueOf(floatSum));
                    break;

                case R.id.sh_dataType_btnFloatMultiply:
                    float floatMultiplyNum1 = Float.parseFloat( etFloatNum1.getText().toString());
                    float floatMultiplyNum2 = Float.parseFloat(etFloatNum2.getText().toString());

                    float floatMultiply = floatMultiplyNum1 * floatMultiplyNum2;

                    tvFloatResult.setText(String.valueOf(floatMultiply));
                    break;

                case R.id.sh_dataType_btnFloatDivide:
                    float floatDivideNum1 = Float.parseFloat(etFloatNum1.getText().toString());
                    float floatDivideNum2 = Float.parseFloat(etFloatNum2.getText().toString());

                    float floatDivide = floatDivideNum1 / floatDivideNum2;

                    tvFloatResult.setText(String.valueOf(floatDivide));

                    break;

            }
        }
    };
}
