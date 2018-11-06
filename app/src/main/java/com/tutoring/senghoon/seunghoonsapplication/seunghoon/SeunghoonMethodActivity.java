package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonMethodActivity extends AppCompatActivity {

    EditText etKorean, etMath, etEnglish;
    Button btnAllResult;
    TextView tvTotalResult, tvAverageResult;
    TextView tvMethodTestResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_method);

        etKorean = findViewById(R.id.sh_method_etKorean);
        etMath = findViewById(R.id.sh_method_etMath);
        etEnglish = findViewById(R.id.sh_method_etEnglish);

        btnAllResult = findViewById(R.id.sh_method_btnAllResult);

        tvTotalResult = findViewById(R.id.sh_method_tvTotalResult);
        tvAverageResult = findViewById(R.id.sh_method_tvAverageResult);
        tvMethodTestResult = findViewById(R.id.sh_method_tvMethodTestResult);
        btnAllResult.setOnClickListener(btnAllResultClickListener);
        setTvMethodTestResult();
        setTvMethodTestResultThirsty();
        setTvMethodTestResultSpuid();
        setTextViewSum(10,90,180,500,89);
        setTextViewMultiply(2,3,4);
        int sum = getSum(2,3,4);
    }

    View.OnClickListener btnAllResultClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String koreanString = etKorean.getText().toString();
            String mathString = etMath.getText().toString();
            String englishString = etEnglish.getText().toString();

            int korean = Integer.parseInt(koreanString);
            int math = Integer.parseInt(mathString);
            int english = Integer.parseInt(englishString);

            int sum = getSum(korean,math,english);
            tvTotalResult.setText(String.valueOf(sum));
        }
    };

    //함수
    //라턴되는 변수타입 함수이름(파라미터,파라미터2,파라미터, ....) {
    // ...
    //}

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

    void setTvMethodTestResult() {
       tvMethodTestResult.setText("이건 테스트이다.");

    }
    void setTvMethodTestResultSpuid() {
        tvMethodTestResult.setText("나는 오징오징을 먹는다");
    }
    void setTvMethodTestResultThirsty() {
        tvMethodTestResult.setText("목이 말라요.. 으윽!");
    }
    void setTextViewSum(int a, int b, int c, int d, int e) {
        int sum = a + b + c + d + e;
        tvMethodTestResult.setText(String.valueOf(sum));

    }
    void  setTextViewMultiply(int a, int b, int c) {
        int Mulitiply = a * b * c;
        tvMethodTestResult.setText(String.valueOf(Mulitiply));
    }
    int getSum(int korean, int math, int english) {
        return korean + math + english;
    }

}