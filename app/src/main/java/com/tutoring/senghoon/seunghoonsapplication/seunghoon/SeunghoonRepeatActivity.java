package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

import java.util.FormatFlagsConversionMismatchException;

public class SeunghoonRepeatActivity extends AppCompatActivity {
    LinearLayout llBoolean1;
    LinearLayout llBoolean2;
    TextView tvBooleanTitle1;
    Button btnBooleanResult1;
    TextView tvBooleanResult1;

    TextView tvBooleanTitle2;
    Button btnBooleanResult2;
    TextView tvBooleanResult2;

        TextView tvForNumber;
        TextView tvForNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_repeat);

        llBoolean1 = findViewById(R.id.sh_repeat_llBoolean1);
        tvBooleanTitle1 = findViewById(R.id.sh_repeat_tvBooleanTitle1);
        btnBooleanResult1 = findViewById(R.id.sh_repeat_btnBoolean1Result);
        tvBooleanResult1 = findViewById(R.id.sh_repeat_tvBoolean1Result);

        llBoolean2 = findViewById(R.id.sh_repeat_llBoolean2);
        tvBooleanTitle2 = findViewById(R.id.sh_repeat_tvBooleanTitle2);
        btnBooleanResult2 = findViewById(R.id.sh_repeat_btnBoolean2Result);
        tvBooleanResult2 = findViewById(R.id.sh_repeat_tvBoolean2Result);

        tvForNumber = findViewById(R.id.sh_repeat_tvForNumber);
        tvForNumber2 = findViewById(R.id.sh_repeat_tvForNumber2);
        // for 문
        // for (변수초기화;조건식; 변수 변경) {
        // 수행
        //}

        String stringNumber = "";
        for (int i = 1; i < 10; i++) {
          stringNumber = stringNumber + i;
          tvForNumber.setText(stringNumber);

        }
        int sum = 0;
        for (int j = 0;j < 10; j++) {

            sum = sum + j;
            tvForNumber.setText(String.valueOf(sum));

        }
        String stars1 = "";
        for (int x = 0; x < 5; x++) {

             stars1 = stars1 + "짝";

             for (int y = 0; y <= x; y++) {

                stars1 = stars1 + "뿡";

//                stars1 = stars1 + "*";
            }


            stars1 = stars1 + "\n";

        }
        tvForNumber.setText(stars1);









        String number1 = "";

        for (int x = 1; x <= 5; x++) { //세로우

            number1 = number1 + "|";

            for (int y = 1; y <= 3; y++) {  //가로우
                number1 = number1 + y;
            }

            number1 = number1 + x + "\n";
        }
        tvForNumber2.setText(number1);

        String number2 = "";

        for (int x = 5; x >=1; x--){

            for (int y = x; y >= 1; y--) {
                number2 = number2 + "*";
            }

            number2 = number2 + "\n";
        }

        tvForNumber2.setText(number2);
    }
}
