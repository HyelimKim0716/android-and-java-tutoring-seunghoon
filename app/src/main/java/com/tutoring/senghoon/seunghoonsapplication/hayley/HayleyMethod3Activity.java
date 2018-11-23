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
