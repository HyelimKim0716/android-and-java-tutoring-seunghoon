package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonDataTypeAssignmentActivity extends AppCompatActivity {

    private EditText etNum1, etNum2;
    private Button btnSum, btnMultiply, btnDivide;

    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_data_type_assignment);

        etNum1 = findViewById(R.id.sh_dataType_etNum1);
        etNum2 = findViewById(R.id.sh_dataType_etNum2);

        btnSum = findViewById(R.id.sh_dataType_btnSum);
        btnMultiply = findViewById(R.id.sh_dataType_btnMultiply);
        btnDivide = findViewById(R.id.sh_dtaType_btnDivide);

        tvResult = findViewById(R.id.sh_dataType_tvResult);

        btnSum.setOnClickListener(btnClickListener);
        btnMultiply.setOnClickListener(btnClickListener);
        btnDivide.setOnClickListener(btnClickListener);

    }

    private View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int num1 = Integer.parseInt(etNum1.getText().toString());
            int num2 = Integer.parseInt(etNum2.getText().toString());

            switch (view.getId()) {
                case R.id.sh_dataType_btnSum:    // 더하기
                 int sum = num1 + num2;
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

            }
        }
    };
}
