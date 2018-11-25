package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyMethod3Activity extends AppCompatActivity {


    EditText etSeunghoonKorean, etSeunghoonMath, etSeunghoonEnglish;
    EditText etHyelimKorean, etHyelimMath, etHyelimEnglish;
    EditText etFriend1Korean, etFriend1Math, etFriend1English;
    EditText etFriend2Korean, etFriend2Math, etFriend2English;
    EditText etFriend3Korean, etFriend3Math, etFriend3English;

    Button btnAllResult;

    TextView tvSeunghoonResult, tvHyelimResult, tvFriend1Result, tvFriend2Result, tvFriend3Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_method2);

        etSeunghoonKorean = findViewById(R.id.hl_method2_etSeunghoonKorean);
        etSeunghoonMath = findViewById(R.id.hl_method2_etSeunghoonMath);
        etSeunghoonEnglish = findViewById(R.id.hl_method2_etSeunghoonEnglish);

        etHyelimKorean = findViewById(R.id.hl_method2_etHyelimKorean);
        etHyelimMath = findViewById(R.id.hl_method2_etHyelimMath);
        etHyelimEnglish = findViewById(R.id.hl_method2_etHyelimEnglish);

        etFriend1Korean = findViewById(R.id.hl_method2_etFriend1Korean);
        etFriend1Math = findViewById(R.id.hl_method2_etFriend1Math);
        etFriend1English = findViewById(R.id.hl_method2_etFriend1English);

        etFriend2Korean = findViewById(R.id.hl_method2_etFriend2Korean);
        etFriend2Math = findViewById(R.id.hl_method2_etFriend2Math);
        etFriend2English = findViewById(R.id.hl_method2_etFriend2English);

        etFriend3Korean = findViewById(R.id.hl_method2_etFriend3Korean);
        etFriend3Math = findViewById(R.id.hl_method2_etFriend3Math);
        etFriend3English = findViewById(R.id.hl_method2_etFriend3English);

        btnAllResult = findViewById(R.id.hl_method2_btnAllResult);

        tvSeunghoonResult = findViewById(R.id.hl_method2_tvSeunghoonTotalResult);
        tvHyelimResult = findViewById(R.id.hl_method2_tvHyerlimTotalResult);
        tvFriend1Result = findViewById(R.id.hl_method2_tvFriend1Result);
        tvFriend2Result = findViewById(R.id.hl_method2_tvFriend2Result);
        tvFriend3Result = findViewById(R.id.hl_method2_tvFriend3Result);

        btnAllResult.setOnClickListener(btnClickListener);



        // 배열 : 여러 개의 방을 모음
        // 데이터타입[] 배열이름 = new 데이터타입[20];
        int[] hyelimGrade = new int[5];
        hyelimGrade[0] = 100;
        hyelimGrade[1] = 99;
        hyelimGrade[2] = 98;
        hyelimGrade[3] = 97;
        hyelimGrade[4] = 96;

        int sum = hyelimGrade[0] + hyelimGrade[1]
                + hyelimGrade[2] + hyelimGrade[3]
                + hyelimGrade[4];

        int hyelimSum = 0;

        for (int i = 0; i < 5; i++) {
            hyelimSum = hyelimSum + hyelimGrade[i];
            // i = 0 : hyelimSum = 0 + 100 = 100
            // i = 1 : hyelimSum = 100 + 99 = 199
            // i = 2 : hyelimSum = 199 + 98 = 297
            // i = 3 : hyelimSum = 297 + 97 = 394
            // i = 4 : hyelimSum = 394 + 96 = 490
        }

        hyelimSum = 490;

        int[] seunghoon = new int[6535792];
        seunghoon[0] = 100;
        seunghoon[1] = 99;
        seunghoon[2] = 98;
        seunghoon[3] = 97;
        seunghoon[4] = 96;
        //,,, seunghoon[1000];
        // ,,,
        //.. .
        ///.....



        int seunghoonSum = 0;

        for (int i = 0; i < seunghoon.length; i++) {
            seunghoonSum = seunghoonSum + seunghoon[i];
        }

        int seunghoonAvg = seunghoonSum / seunghoon.length;


        int[] teacherGrade = new int[785479];
        teacherGrade[0] = 10;
        teacherGrade[1] = 20;
        teacherGrade[2] = 30;
        teacherGrade[3] = 40;
        teacherGrade[4] = 50;

        int teacherAverage = 0;
        int teacherSum = 0;

        for (int i = 0; i < teacherGrade.length; i++) {
            teacherSum = teacherSum + teacherGrade[i];
        }

        teacherAverage = (teacherGrade[0] + teacherGrade[1] + teacherGrade[2] + teacherGrade[3] + teacherGrade[4]) / 5;
        teacherAverage = teacherSum / teacherGrade.length;


        int[] kangminGrade = new int[9686];
        kangminGrade[0] = 50;
        kangminGrade[1] = 40;
        kangminGrade[2] = 30;
        kangminGrade[3] = 20;
        kangminGrade[4] = 10;

        int kangminSum = 0;
        // 9686 kangminGrade.length
        for (int i = 0; i < kangminGrade.length; i++) {
            kangminSum += kangminGrade[i];
        }
        int kanminAverage = kangminSum / kangminGrade.length;

    }

    private View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {




        }
    };

    float sum(int korean, int math, int english) {
        int sum = korean + math + english;
        return sum;
    }

    float average(int korean, int math, int english) {
        float average = (korean + math + english) / 3.0f;
        return average;
    }

    String sumString(int korean, int math, int english) {
        int sum = korean + math + english;
        String sumString = String.valueOf(sum);
        return sumString;
    }

    String averageString(int korean, int math, int english) {
        int sum = korean + math + english;
        float average = sum / 3.0F;
        String averageString = String.valueOf(average);
        return averageString;
    }
}
