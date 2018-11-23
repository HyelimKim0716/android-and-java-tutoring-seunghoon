package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonMethod3Activity extends AppCompatActivity {

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


        }
    };



}
