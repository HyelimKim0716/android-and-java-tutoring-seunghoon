package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyMethod2Activity extends AppCompatActivity {


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
    }

    private View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

//            etSeunghoonKorean.getText().toString() == "" -> korean = 0

            int seunghoonKorean = 0;
            String seunghoonKoreanString = etSeunghoonKorean.getText().toString();

            if (seunghoonKoreanString != "") {      // != 같지 않니?
                seunghoonKorean = Integer.parseInt(seunghoonKoreanString);
            }

            int seunghoonMath = 0;
            String seunghoonMathString = etSeunghoonMath.getText().toString();
            if (seunghoonMathString != "") {
                seunghoonMath = Integer.parseInt(seunghoonMathString);
            }

            int seunghoonEnglish = 0;
            String seunghoonEnglishString = etSeunghoonEnglish.getText().toString();

            if (seunghoonEnglishString != "") {
                seunghoonEnglish = Integer.parseInt(seunghoonEnglishString);
            }

            tvSeunghoonResult.setText(averageString(seunghoonKorean, seunghoonMath, seunghoonEnglish));


            int teacherKorean = 0;
            int teacherMath = 0;
            int teacherEnglish = 0;

            if (etHyelimKorean.getText().toString() != "") {
                teacherKorean = Integer.parseInt(etHyelimKorean.getText().toString());
            }

            if (etHyelimMath.getText().toString() != "") {
                teacherMath = Integer.parseInt(etHyelimMath.getText().toString());
            }

            if (etHyelimEnglish.getText().toString() != "") {
                teacherEnglish = Integer.parseInt(etHyelimEnglish.getText().toString());
            }

            tvHyelimResult.setText(averageString(teacherKorean, teacherMath, teacherEnglish));

            int friend1Korean = 0;
            int friend1Math = 0;
            int friend1English = 0;

            if (etFriend1Korean.getText().toString() != "") {
                friend1Korean = Integer.parseInt(etFriend1Korean.getText().toString());
            }

            if (etFriend1Math.getText().toString() != "") {
                friend1Math = Integer.parseInt(etFriend1Math.getText().toString());
            }

            if (etFriend1English.getText().toString() != "") {
                friend1English = Integer.parseInt(etFriend1English.getText().toString());
            }

            tvFriend1Result.setText(averageString(friend1Korean, friend1Math, friend1English));

            int friend2Korean = 0;
            int friend2Math = 0;
            int friend2English = 0;

            if (etFriend2Korean.getText().toString() != "") {
                friend2Korean = Integer.parseInt(etFriend2Korean.getText().toString());
            }

            if (etFriend1Math.getText().toString() != "") {
                friend2Math = Integer.parseInt(etFriend1Math.getText().toString());
            }

            if (etFriend2English.getText().toString() != "") {
                friend2English = Integer.parseInt(etFriend2English.getText().toString());
            }


            tvFriend2Result.setText(averageString(friend2Korean, friend2Math, friend2English));

            int hansungKorean = Integer.parseInt(etFriend3Korean.getText().toString());
            int hansungMath = Integer.parseInt(etFriend3Math.getText().toString());
            int hansungEnglish = Integer.parseInt(etFriend3English.getText().toString());

            if (etFriend3Korean.getText().toString() != "") {
                hansungKorean = Integer.parseInt(etFriend3Korean.getText().toString());
            }

            if (etFriend3Math.getText().toString() != "") {
                hansungMath = Integer.parseInt(etFriend3Math.getText().toString());
            }

            if (etFriend3English.getText().toString() != "") {
                hansungEnglish = Integer.parseInt(etFriend3English.getText().toString());
            }

            tvFriend3Result.setText(averageString(hansungKorean, hansungMath, hansungEnglish));


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
