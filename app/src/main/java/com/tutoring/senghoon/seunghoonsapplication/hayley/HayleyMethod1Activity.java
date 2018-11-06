package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyMethod1Activity extends AppCompatActivity {

    EditText etKorean, etMath, etEnglish;
    Button btnAllResult;
    TextView tvTotalResult, tvAverageResult;
    TextView tvMethodTestResult;


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

        tvMethodTestResult = findViewById(R.id.hl_method_tvMethodTestResult);

        btnAllResult.setOnClickListener(btnResultListener);

        setTvMethodTestResult();        // 이건 테스트이다

        setTextViewSum(10, 99, 180, 500, 30);

        setTextViewMultiply(2, 3, 4);


    }

    View.OnClickListener btnResultListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // 1. 국어 점수 문자 가지고 옴
            // 2. 수학 점수 문자 가지고 옴
            // 3. 영어 점수 문자 가지고 옴

            // 4. 국어 점수 문자를 숫자로 바꿈
            // 5. 수학 점수 문자를 숫자로 바꿈
            // 6. 영어 점수 문자를 숫자로 바꿈

            // 7. getSum 함수를 이용해 값을 모두 더함
            int a = getSum(1, 2, 3);     // 6


            // 8. 결과에 sum 써준다}
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

    // 리턴변수타입 함수명(파라미터1, 파라미터2, ... ) {
    // ...
    // }
    void setTvMethodTestResult() {
        tvMethodTestResult.setText("이건 테스트이다");
    }

    void setTvMethodTestResultSquid() {
        tvMethodTestResult.setText("나는 오징어를 먹는다");
    }

    void setTvMethodTestResultThirsty() {
        tvMethodTestResult.setText("목이 말라요");
    }

    // 파라미터 : 변수 선언 (변수타입 변수명)
    void setTextViewSum(int a, int b, int c, int d, int e) {
        int sum = a + b + c + d + e;

        tvMethodTestResult.setText(String.valueOf(sum));
    }

    void setTextViewMultiply(int a, int b, int c) {
        int sum = a * b * c;

        tvMethodTestResult.setText(String.valueOf(sum));
    }

    // 함수 : 기능 정의
    // 리턴타입 함수명(변수1, 변수2, 변수3, ...) {
    //      ...
    // }
    int getSum(int korean, int math, int english) {
        return korean + math + english;
    }

}
