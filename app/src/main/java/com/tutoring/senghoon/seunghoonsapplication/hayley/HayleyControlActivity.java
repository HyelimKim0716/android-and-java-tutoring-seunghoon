package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyControlActivity extends AppCompatActivity {

    // 변수타입 변수명;
    EditText etMath;
    EditText etKorean;
    EditText etEnglish;
    EditText etSociety;
    EditText etScience;

    Button btnMath;
    Button btnKorean;
    Button btnEnglish;
    Button btnSociety;
    Button btnScience;

    TextView tvMathGrade;
    TextView tvKoreanGrade;
    TextView tvEnglishGrade;
    TextView tvSocietyGrade;
    TextView tvScienceGrade;

    TextView tvMathComment;
    TextView tvKoreanComment;
    TextView tvEnglishComment;
    TextView tvSocietyComment;
    TextView tvScienceComment;

    EditText etNumber;
    Button btnTestNumber;
    TextView tvTestNumberResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_control);

        etMath = findViewById(R.id.hl_control_etMath);       // EditText
        etKorean = findViewById(R.id.hl_control_etKorean);
        etEnglish = findViewById(R.id.hl_control_etEnglish);
        etSociety = findViewById(R.id.hl_control_etSociety);
        etScience = findViewById(R.id.hl_control_etScience);

        btnMath = findViewById(R.id.hl_control_btnMath);
        btnKorean = findViewById(R.id.hl_control_btnKorean);
        btnEnglish = findViewById(R.id.hl_control_btnEnglish);
        btnSociety = findViewById(R.id.hl_control_btnSociety);
        btnScience = findViewById(R.id.hl_control_btnScience);

        tvMathGrade = findViewById(R.id.hl_control_tvMathGrade);
        tvKoreanGrade = findViewById(R.id.hl_control_tvKoreanGrade);
        tvEnglishGrade = findViewById(R.id.hl_control_tvEnglishGrade);
        tvSocietyGrade = findViewById(R.id.hl_control_tvSocietyGrade);
        tvScienceGrade = findViewById(R.id.hl_control_tvScienceGrade);

        tvMathComment = findViewById(R.id.hl_control_tvMathComment);
        tvKoreanComment = findViewById(R.id.hl_control_tvKoreanComment);
        tvEnglishComment = findViewById(R.id.hl_control_tvEnglishComment);
        tvSocietyComment = findViewById(R.id.hl_control_tvSocietyComment);
        tvScienceComment = findViewById(R.id.hl_control_tvScienceComment);


        btnMath.setOnClickListener(btnClickListener);
        btnKorean.setOnClickListener(btnClickListener);
        btnEnglish.setOnClickListener(btnClickListener);
        btnSociety.setOnClickListener(btnClickListener);
        btnScience.setOnClickListener(btnClickListener);

        etNumber = findViewById(R.id.hl_control_etNumber);
        btnTestNumber = findViewById(R.id.hl_control_btnNumber);
        tvTestNumberResult = findViewById(R.id.hl_control_tvNumberResult);

        tvTestNumberResult.setText("결과");

        int number = 58;

        number = 80;

        number = 100;


        if (number > 90) {
            tvTestNumberResult.setText("90 점 이상");
        } else if (number >= 50 && number < 60) {
            tvTestNumberResult.setText("50 점 이상 60 점 미만");
        } else if (number == 70) {
            tvTestNumberResult.setText("70 점");
        } else if (number == 80) {
            tvTestNumberResult.setText("80 점");
        } else {
            tvTestNumberResult.setText("그 외");
        }

        String food = "초밥";

        food = "우유";
        food = "카라멜";

        food = "사탕" + "초콜릿";      // 사탕초콜릿

        String sport = "축구";        // string 은 sport 와 다름

        sport = "야구" + "농구";

        String test = "피아노";

        test = "바이올린";

        test = "기타" + "베이스";    // 기타베이스

        test += food + sport;    // food = 사탕초콜릿, sport = 야구농구, test = 기타베이스


        food += "초코우유";
        food += "딸기우유";
        food = food + "바나나우유";

        // test = 기타베이스 -> test = 사탕초콜릿야구농구


        if (food == "초밥") {
            tvTestNumberResult.setText("초밥은 맛있다.");
        } else if (food == "초콜릿") {
            tvTestNumberResult.setText("초콜릿은 달다");
        } else {
            tvTestNumberResult.setText(test);
        }


    }


    private View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.hl_control_btnMath:

                    int math = Integer.parseInt(etMath.getText().toString());

                    // if 문
                    // if (조건) {  <- true, false
                    //  조건이 만족할 경우 할 일
                    // }

                    // 연산
                    // a < b, >, <=, >=, ==

                    // A && B : and : A 와 B 모두 true (참)
                    // A || B : or : A 가 true(참) 이거나 B 가 true(참) -> A 또는 B 둘 중 하나가 false(거짓)일 경우 무조건 false

                    String mathGrade = "?";

                    if (math >= 90) {

                        mathGrade = "A";

                        tvMathGrade.setText("A");

                    } else if (math >= 80 && math < 90) {   // 80 <= math < 90

                        mathGrade = "B";

                        tvMathGrade.setText("B");


                    } else if (math >= 70 && math < 80) {   // 70 <= math < 80

                        mathGrade = "C";
                        tvMathGrade.setText("B");

                    } else if (math >= 60 && math < 70) {   // 60 <= math < 70

                        mathGrade = "D";
                        tvMathGrade.setText("D");

                    } else {            // math < 60

                        mathGrade = "F";
                        tvMathGrade.setText("F");

                    }

                    tvMathGrade.setText(mathGrade);

                    // switch 문
                    // switch (변수) {
                    //      case 조건1 :      // 조건1은 변수의 타입과 동일
                    //
                    //          조건1 일 경우에 할 일
                    //
                    //          break;
                    //
                    //      case 조건2:
                    //          조건2 일 경우에 할 일
                    //          break;
                    //
                    //      case 조건3:
                    //          조건3 일 경우에 할 일
                    //          break;
                    //
                    //      etc ... 그 외 case
                    //
                    //      default:        // 기본 값
                    //
                    // }

                    switch (mathGrade) {         // 변수 타입 : String
                        case "A":
                            tvMathComment.setText("참 잘했어요!");
                            break;

                        case "B":
                            tvMathComment.setText("잘했어요");
                            break;

                        case "C":
                            tvMathComment.setText("노력하세요");
                            break;

                        case "D":
                            tvMathComment.setText("공부 좀..");
                            break;

                        case "F":
                            tvMathComment.setText("...?");
                            break;

                    }


                    break;

                case R.id.hl_control_btnKorean:
                    int korean = Integer.parseInt(etKorean.getText().toString());     // 문자열 -> 숫자


                    if (korean >= 90) {


                        tvKoreanGrade.setText("A");

                    } else if (korean >= 80 && korean < 90) {

                        tvKoreanGrade.setText("B");

                    } else if (korean >= 70 && korean < 80) {

                        tvKoreanGrade.setText("C");

                    } else if (korean >= 60 && korean < 70) {

                        tvKoreanGrade.setText("D");

                    } else if (korean >= 50 && korean < 60) {

                        tvKoreanGrade.setText("E");

                    } else {        // korean < 50

                        tvKoreanGrade.setText("F");

                    }


                    // 변수타입 변수명
                    String koreanGrade = "?";

                    if (korean >= 90) {
                        koreanGrade = "A";
                    } else if (korean >= 80 && korean < 90) {
                        koreanGrade = "B";
                    } else if (korean >= 70 && korean < 80) {
                        koreanGrade = "C";
                    } else if (korean >= 60 && korean < 70) {
                        koreanGrade = "D";
                    } else if (korean >= 50 && korean < 60) {
                        koreanGrade = "E";
                    } else if (korean < 50) {
                        koreanGrade = "F";
                    }

                    switch (koreanGrade) {
                        case "A":
                            // 할 일
                            tvKoreanComment.setText("참 잘했어요!");
                            break;

                        case "B":
                            tvKoreanComment.setText("잘했어요!");
                            break;

                        case "C":
                            tvKoreanComment.setText("노력하세요!");
                            break;

                        case "D":
                            tvKoreanComment.setText("오우 D");
                            break;

                        case "E":
                            tvKoreanComment.setText("공부해!");
                            break;

                        case "F":
                            tvKoreanComment.setText("..?");
                            break;

                    }


                case R.id.hl_control_btnEnglish:

                    // 1. 영어성적(문자)을 숫자로 바꾼다
                    int english = Integer.parseInt(etEnglish.getText().toString());

                    if (english >= 90) {
                        tvEnglishGrade.setText("A");
                    } else if (english >= 80 && english < 90) {
                        tvEnglishGrade.setText("B");
                    } else if (english >= 70 && english < 80) {
                        tvEnglishGrade.setText("C");
                    } else if (english >= 60 && english < 70) {
                        tvEnglishGrade.setText("D");
                    } else if (english >= 50 && english < 60) {
                        tvEnglishGrade.setText("E");
                    } else {    // english < 50
                        tvEnglishGrade.setText("F");
                    }

                    String englishGrade = "?";

                    if (english >= 90) {
                        englishGrade = "A";
                    } else if (english >= 80 && english < 90) {
                        englishGrade = "B";
                    } else if (english >= 70 && english < 80) {
                        englishGrade = "C";
                    } else if (english >= 60 && english < 70) {
                        englishGrade = "D";
                    } else if (english >= 50 && english < 60) {
                        englishGrade = "E";
                    } else {
                        englishGrade = "F";
                    }


                    switch (englishGrade) {
                        case "A":
                            tvEnglishComment.setText("칭찬하지");
                            break;

                        case "B":
                            tvEnglishComment.setText("오올");
                            break;

                        case "C":
                            tvEnglishComment.setText("호우");
                            break;

                        case "D":
                            tvEnglishComment.setText("노우");
                            break;

                        case "E":
                            tvEnglishComment.setText("ㄴ놉!");
                            break;

                        case "F":
                            tvEnglishComment.setText("........");
                            break;
                    }

                    break;


                case R.id.hl_control_btnScience:
                    int science = Integer.parseInt(etScience.getText().toString());
                    String scienceGrade = "?";


                    if (science >= 90) {
                        tvScienceGrade.setText("A");
                        scienceGrade = "A";

                    } else if (science >= 80 && science < 90) {
                        tvScienceGrade.setText("B");
                    } else if (science >= 70 && science < 80) {
                        tvScienceGrade.setText("C");
                    } else if (science >= 60 && science < 70) {
                        tvScienceGrade.setText("D");
                    } else if (science >= 50 && science < 60) {
                        tvScienceGrade.setText("E");
                    } else {
                        tvScienceGrade.setText("F");
                    }


                    switch (scienceGrade) {
                        case "A":
                            tvScienceComment.setText("Excellent");
                            break;

                        case "B":
                            tvScienceComment.setText("Nice");
                            break;

                        case "C":
                            tvScienceComment.setText("Good");
                            break;

                        case "D":
                            tvScienceComment.setText("So so");
                            break;

                        case "E":
                            tvScienceComment.setText("Cheer up!");
                            break;

                        case "F":
                            tvScienceComment.setText("No 답");
                            break;
                    }


                    break;

                case R.id.hl_control_btnSociety:

                    int society = Integer.parseInt(etSociety.getText().toString());

                    society = 57;

                    society = 105;

                    society = 65;

                    society = Integer.parseInt(etSociety.getText().toString());

                    // if 시작

                    if (society >= 90) {

                        tvSocietyGrade.setText("A");
                        tvSocietyComment.setText("참 잘했어요");

                    }else if (society >= 70 && society < 80) {

                        tvSocietyGrade.setText(String.valueOf(society));
                        tvSocietyComment.setText("설민석급");

                    } else if (society > 50 && society < 70) {

                        tvSocietyGrade.setText("50에서 70사이"); // 50에서 70사이
                        tvSocietyComment.setText("잘했어요");

                    } else if (society == 50) {

                        tvSocietyGrade.setText("딱 50");
                        tvSocietyComment.setText("공부하세요.");

                    } else if (society == 80) {

                        tvSocietyGrade.setText("딱 80점");
                        tvSocietyComment.setText("쏘쏘");

                    } else if (society == 85) {

                        tvSocietyGrade.setText("딱 85점");
                        tvSocietyComment.setText("잘했음");

                    } else {
                        tvSocietyGrade.setText(String.valueOf(society));
                        tvSocietyComment.setText("So so..?");
                    }

                    // if 끝





                    break;


            }
        }
    };
}
