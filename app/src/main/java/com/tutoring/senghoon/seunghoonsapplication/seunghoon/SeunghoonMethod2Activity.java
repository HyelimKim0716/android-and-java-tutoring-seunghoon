package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonMethod2Activity extends AppCompatActivity {

    TextView tvHanResult;
    TextView tvMinResult;
    TextView tvBfResult;
    TextView tvTeacherResult;
    TextView tvMyResult;

    Button btnResult;

    EditText etHanKorean,etHanMath,etHanEnglish;
    EditText etMinKorean,etMinMath,etMinEnglish;
    EditText etBfKorean,etBfMath,etBfEnglish;
    EditText etTeacherKorean,etTeacherMath,etTeacherEnglish;
    EditText etMyKorean,etMyMath,etMyEnglish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_method2);

        tvHanResult = findViewById(R.id.sh_method2_tvHanResult);
        tvMinResult = findViewById(R.id.sh_method2_tvMinResult);
        tvBfResult = findViewById(R.id.sh_method2_tvBfResult);
        tvTeacherResult = findViewById(R.id.sh_method2_tvTeacherResult);
        tvMyResult = findViewById(R.id.sh_method2_tvMyResult);

        btnResult = findViewById(R.id.sh_method2_btnResult);

        etHanKorean = findViewById(R.id.sh_method2_etHanKorean);
        etHanMath = findViewById(R.id.sh_method2_etHanMath);
        etHanEnglish = findViewById(R.id.sh_method2_etHanEnglish);

        etMinKorean = findViewById(R.id.sh_method2_etMinKorean);
        etMinMath = findViewById(R.id.sh_method2_etMinMath);
        etMinEnglish = findViewById(R.id.sh_method2_etMinEnglish);

        etBfKorean = findViewById(R.id.sh_method2_etBfKorean);
        etBfMath = findViewById(R.id.sh_method2_etBfMath);
        etBfEnglish = findViewById(R.id.sh_method2_etBfEnglish);

        etTeacherKorean = findViewById(R.id.sh_method2_etTeacherKorean);
        etTeacherMath = findViewById(R.id.sh_method2_etTeacherMath);
        etTeacherEnglish = findViewById(R.id.sh_method2_etTeacherEnglish);

        etMyKorean = findViewById(R.id.sh_method2_etMyKorean);
        etMyMath = findViewById(R.id.sh_method2_etMyMath);
        etMyEnglish = findViewById(R.id.sh_method2_etMyEnglish);

        btnResult.setOnClickListener(btnOnClickListener);
    }

    View.OnClickListener btnOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            int myKorean = 0;
            String myKoreanString = etMyKorean.getText().toString();
            if (myKoreanString == "") {
                myKorean = 0;
            }else {
                myKorean = Integer.parseInt(myKoreanString);
            }

            int myMath = 0;
            String myMathString = etMyMath.getText().toString();
            if (myMathString == "") {
                myMath = 0;
            }else {
                myMath = Integer.parseInt(myMathString);
            }


            int myEnglish = 0;
            String myEnglishString  = etMyEnglish.getText().toString();
            if (myEnglishString == "") {
                myEnglish = 0;
            }else {
                myEnglish = Integer.parseInt(myEnglishString);
            }

            tvMyResult.setText(averageString(myKorean, myMath, myEnglish));

            int teacherKorean = 0;
            int teacherMath = 0;
            int teacherEnglish = 0;

            if (etTeacherKorean.getText().toString() != "") {
                teacherKorean = Integer.parseInt(etTeacherKorean.getText().toString());
            }

            if (etTeacherMath.getText().toString() != "") {
                teacherMath = Integer.parseInt(etTeacherMath.getText().toString());
            }

            if (etTeacherEnglish.getText().toString() !="") {
                teacherEnglish = Integer.parseInt(etTeacherEnglish.getText().toString());
            }

            tvTeacherResult.setText(averageString(teacherKorean, teacherMath, teacherEnglish));

            int bfKorean = 0;
            int bfMath = 0;
            int bfEnglish = 0;

            if (etBfKorean.getText().toString() != "") {
                bfKorean = Integer.parseInt(etBfKorean.getText().toString());
            }
            if (etBfMath.getText().toString()!= ""){
                bfMath = Integer.parseInt(etBfMath.getText().toString());
            }
            if (etBfEnglish.getText().toString() != "") {
                bfEnglish = Integer.parseInt(etBfEnglish.getText().toString());
            }

            tvBfResult.setText(averageString(bfMath, bfKorean, bfEnglish));

            int minKorean = 0;
            int minMath = 0;
            int minEnglish = 0;

            if (etMinKorean.getText().toString()!="") {
                minKorean = Integer.parseInt(etMinKorean.getText().toString());
            }
            if (etMinMath.getText().toString()!= "") {
                minMath = Integer.parseInt(etMinMath.getText().toString());
            }
            if (etMinEnglish.getText().toString()!="") {
                minEnglish = Integer.parseInt(etMinEnglish.getText().toString());
            }

            tvMinResult.setText(averageString(minKorean, minMath , minEnglish));

            int hanKorean = 0;
            int hanMath = 0;
            int hanEnglish = 0;

            // ==,
            if (etHanKorean.getText().toString() != "") {
                hanKorean = Integer.parseInt(etHanKorean.getText().toString());
            }
            if (etHanMath.getText().toString()!= "") {
                hanMath = Integer.parseInt(etHanMath.getText().toString());
            }
            if (etHanEnglish.getText().toString()!="") {
                hanEnglish = Integer.parseInt(etHanEnglish.getText().toString());
            }

            tvHanResult.setText(averageString(hanKorean,hanMath,hanEnglish));


        }
    };

    float sum(int korean, int math, int english) {
        int sum = korean + math + english;

        return sum;
    }

    float average(int korean, int math, int english) {
       float average = (korean + math + english) / 3.0F;
        return average;
    }

    String sumString(int korean, int math, int english) {
        int sum = korean + math + english;
        String sumString = String.valueOf(sum);
        return sumString;
    }

    String averageString(int korean, int math, int english) {
        int sum =  korean + math + english;
        float average = sum / 3.0F;
        String averageString = String.valueOf(average);
        return  averageString;
    }

}
