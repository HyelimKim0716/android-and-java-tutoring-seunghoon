package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyMethodActivity extends AppCompatActivity {

    EditText etKorean, etMath, etEnglish;
    Button btnAllResult;
    TextView tvTotalResult, tvAverageResult, tvGradeResult, tvCommentResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_method);

        etKorean = findViewById(R.id.hl_method_etKorean);
        etMath = findViewById(R.id.hl_method_etMath);
        etEnglish = findViewById(R.id.hl_method_etEnglish);

        btnAllResult = findViewById(R.id.hl_method_btnAllResult);

        tvTotalResult = findViewById(R.id.hl_method_tvTotalResult);
        tvAverageResult = findViewById(R.id.hl_method_tvAverageResult);
        tvGradeResult = findViewById(R.id.hl_method_tvGradeResult);
        tvCommentResult = findViewById(R.id.hl_method_tvCommentResult);

        btnAllResult.setOnClickListener(btnResultListener);
    }

    View.OnClickListener btnResultListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            tvTotalResult.setText(String.valueOf(sum()));
            tvAverageResult.setText(String.valueOf(average()));



        }
    };

    // 함수
    // 리턴되는변수타입 함수이름(파라미터1, 파라미터2, 파라미터3, ...) {
    //      ...
    // }

    float sum() {

        String stringKorean = etKorean.getText().toString();
        if (stringKorean.equals("")) {
            stringKorean = "0";
            etKorean.setText("0");
        }
        int korean = Integer.parseInt(stringKorean);

        String stringMath = etMath.getText().toString();
        if (stringMath.equals("")) {
            stringMath = "0";
            etMath.setText("0");
        }
        int math = Integer.parseInt(stringMath);

        String stringEnglish = etEnglish.getText().toString();
        if (stringEnglish.equals("")) {
            stringEnglish = "0";
            etEnglish.setText("0");
        }
        int english = Integer.parseInt(stringEnglish);


        float sum = korean + math + english;

        return sum;
    }


    float average() {
        return sum() / 3;
    }



}
