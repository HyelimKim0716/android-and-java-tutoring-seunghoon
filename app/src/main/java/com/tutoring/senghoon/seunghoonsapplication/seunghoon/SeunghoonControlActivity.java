package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonControlActivity extends AppCompatActivity {
    // 변수타입 변수명;
    EditText etMath;
    EditText etKorean;
    EditText etEnglish;
    EditText etScience;
    EditText etSociety;
    Button btnMath;
    Button btnScience;
    Button btnSociety;
    TextView tvMathGrade;
    TextView tvKoreanGrade;
    TextView tvEnglishGrade;
    TextView tvScienceGrade;
    TextView tvSocietyGrade;
    TextView tvMathComment;
    TextView tvKoreanComment;
    TextView tvEnglishComment;
    TextView tvScienceComment;
    TextView tvSocietyComment;
    Button btnKorean;
    Button btnEnglish;

    EditText etNumber;
    Button btnTestNumber;
    TextView tvTestNumberResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_control);

        etMath = findViewById(R.id.sh_control_etMath);// EditText

        etKorean = findViewById(R.id.sh_control_etKorean);
        etEnglish = findViewById(R.id.sh_control_etEnglish);
        etScience = findViewById(R.id.sh_control_etScience);
        etSociety = findViewById(R.id.sh_control_etSociety);
        btnMath = findViewById(R.id.sh_control_btnMath);
        btnKorean = findViewById(R.id.sh_control_btnKorean);
        btnEnglish = findViewById(R.id.sh_control_btnEnglish);
        btnScience = findViewById(R.id.sh_control_btnScience);
        btnSociety = findViewById(R.id.sh_control_btnSociety);
        tvMathGrade = findViewById(R.id.sh_control_tvMathGrade);
        tvKoreanGrade = findViewById(R.id.sh_control_tvKoreanGrade);
        tvEnglishGrade = findViewById(R.id.sh_control_tvEnglishGrade);
        tvScienceGrade = findViewById(R.id.sh_control_tvScienceGrade);
        tvSocietyGrade = findViewById(R.id.sh_control_tvSocietyGrade);

        tvMathComment = findViewById(R.id.sh_control_tvMathComment);
        tvKoreanComment = findViewById(R.id.sh_control_tvKoreanComment);
        tvEnglishComment = findViewById(R.id.sh_control_tvEnglishComment);
        tvScienceComment = findViewById(R.id.sh_control_tvScienceComment);
        tvSocietyComment = findViewById(R.id.sh_control_tvSocietyComment);

        findViewById(R.id.sh_control_btnMath).setOnClickListener(btnClickListener);
        findViewById(R.id.sh_control_btnKorean).setOnClickListener(btnClickListener);
        findViewById(R.id.sh_control_btnEnglish).setOnClickListener(btnClickListener);
        findViewById(R.id.sh_control_btnScience).setOnClickListener(btnClickListener);
        findViewById(R.id.sh_control_btnSociety).setOnClickListener(btnClickListener);

        etNumber = findViewById(R.id.sh_control_etNumber);
        btnTestNumber = findViewById(R.id.sh_control_btnNumber);
        tvTestNumberResult = findViewById(R.id.sh_control_tvNumberResult);

        tvTestNumberResult.setText("결과");

        int number = 100;
        number = 80;

        number = 100;

        if (number > 90) {
            tvTestNumberResult.setText("90점 이상!");
        } else if (number >= 50 && number < 60) {
            tvTestNumberResult.setText("50점 이상 60점 미만");
        } else if (number == 70) {
            tvTestNumberResult.setText("딱 70점");
        } else if (number == 80) {
            tvTestNumberResult.setText("딱 80점");
        } else {
            tvTestNumberResult.setText("그 외");
        }

        String food = "초밥";


        food = "우유";
        food = "카라멜";

        food = "사탕" +  "초콜릿";
        food += "초코우유";
        food += "딸기우유";
        food = food + "바나나우유";
        String sport = "축구"; // string은 sport랑 다르다!!!!!!!!

        sport = "야구" + "농구";
        String test = "피아노";

        test = "바이올린";
        test = "기타" + "베이스";

        test += food + sport;

        if (food == "초밥") {
            tvTestNumberResult.setText("초밥은 오이시!");
        } else if (food == "초코렛") {
            tvTestNumberResult.setText("초코렛은 넘나 달아");
        } else {
            tvTestNumberResult.setText(test);
        }




    }

    private View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case R.id.sh_control_btnMath:
                    int math = Integer.parseInt(etMath.getText().toString());
                    // if 문
                    // if (조건) {  <- true, false
                    //  조건이 만족할 경우에 할 일
                    // }

                    //연산
                    // a<b,>,<=,>=,==

                    // a&&b : and : a 와 b 모두 true (참)
                    // A || B : or : A가 true(참) 이거나 B 가 true (참) 일 경우는 A 또는 B 둘 중 하나가 false(거짓)일  경우 무조건 false
                    String mathGrade = "?";

                    if (math >= 90) {
                        mathGrade = "A";


                        // tvMathGrade.setText("A");
                    } else if (math >= 80 && math < 90) {  // 80 <= math < 90
                        mathGrade = "B";
                        // tvMathGrade.setText("B");
                    } else if (math >= 70 && math < 80) { // 70<= math <80
                        mathGrade = "C";
                        //tvMathGrade.setText("C");
                    } else if (math >= 60 && math < 70) { // 60 <= math < 70
                        mathGrade = "D";

                        // tvMathGrade.setText("D");
                    } else {    //math <60
                        mathGrade = "F";

                        //tvMathGrade.setText("F");
                    }
                    tvMathGrade.setText(mathGrade);
                    // switch 문
                    //switch (변수) {
                    //   case 조건1:    //조건1은 변수의 타입과 동일
                    //      조건1  일 경우에 수행을 할 일들
                    //      break;
                    //    case 조건2:
                    //      조건2 일 경우에 수행을 할 일들
                    //       break;
                    //      case 조건3:
                    //
                    // 조건3 일 경우에 수행을 할 일들
                    //    break;
                    //      etc ... 그 외 case
                    //     default:    //기본 값
                    //
                    //}

                    switch (mathGrade) {     // 변수 타입 String
                        case "A":
                            tvMathComment.setText("매우 그레잇이다냥!");

                            break;
                        case "B":
                            tvMathComment.setText("아깝다냥 100점 노력하자냥!");
                            break;
                        case "C":
                            tvMathComment.setText("지금 당장 공부하라냥!");
                            break;
                        case "D":
                            tvMathComment.setText("슬퍼하지말라냥! 공부하라냥!");
                            break;
                        case "F":
                            tvMathComment.setText("충격이다냥! 사망!");
                            break;
                    }
                    break;

                case R.id.sh_control_btnKorean:
                    int korean = Integer.parseInt(etKorean.getText().toString());// 문자열 -> 숫자

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
                    } else {         //korean <50
                        tvKoreanGrade.setText("F");
                    }


                    //변수타입 변수명
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
                            // 할일
                            tvKoreanComment.setText("우왕!");
                            break;

                        case "B":
                            tvKoreanComment.setText("100점노력하자꿍");
                            break;

                        case "C":
                            tvKoreanComment.setText("모하냥 노력해");
                            break;

                        case "D":
                            tvKoreanComment.setText("으! 아닛!!!!");
                            break;

                        case "E":
                            tvKoreanComment.setText("어.. 이게아니자너!");
                            break;
                        case "f":
                            tvKoreanComment.setText("으악! 심각해!");
                            break;
                    }

                    break;

                case R.id.sh_control_btnEnglish:

                    //1.영어성적(문자)을 숫자로 바꾼다.
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
                    } else {      // english< 50
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
                            tvEnglishComment.setText("Good당");
                            break;

                        case "B":
                            tvEnglishComment.setText("공부 조끔만 더!");
                            break;
                        case "C":
                            tvEnglishComment.setText("soso");
                            break;
                        case "D":
                            tvEnglishComment.setText("크흠");
                            break;
                        case "E":
                            tvEnglishComment.setText("angry");
                            break;
                        case "F":
                            tvEnglishComment.setText("영알못");
                            break;


                    }
                    break;

                case R.id.sh_control_btnScience:
                    int science = Integer.parseInt(etScience.getText().toString());
                    String scienceGrade = "?";

                    if (science >= 90) {
                        tvScienceGrade.setText("A");
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
                            tvScienceComment.setText("수고했당");
                            break;

                        case "B":
                            tvScienceComment.setText("괜찮당 담엔 100점가즈아!");
                            break;

                        case "C":
                            tvScienceComment.setText("보통..");
                            break;

                        case "D":
                            tvScienceComment.setText("과학시험 힘내자!");
                            break;
                        case "E":
                            tvScienceComment.setText("긴말 필요없고 공부닷!");
                            break;
                        case "F":
                            tvScienceComment.setText("꿈이냐생시냐");
                            break;
                    }

                    break;

                case R.id.sh_control_btnSociety:
                    //if시작
                    int society = Integer.parseInt(etSociety.getText().toString());
                    society = 57;
                    society = 105;
                    society = 65;

                    society = Integer.parseInt(etSociety.getText().toString());
                    if (society >= 90) {
                        tvSocietyGrade.setText("A");
                        tvSocietyComment.setText("참 잘했어용");
                    } else if (society >= 70 && society < 80) {
                        tvSocietyComment.setText("설민석급");
                        tvSocietyGrade.setText(String.valueOf(society));

                    } else if (society > 50 && society < 70) {
                        tvSocietyGrade.setText("50에서 70사이");
                        tvSocietyComment.setText("할말을 잃었네");
                    } else if (society == 50) {
                        tvSocietyGrade.setText("50점");
                        tvSocietyComment.setText("역알못");
                    }else if (society == 80) {
                        tvSocietyGrade.setText("80점");
                        tvSocietyComment.setText("조금조금 잘했다");
                    } else if (society ==85) {
                        tvSocietyGrade.setText("딱! 85점");
                        tvSocietyComment.setText("잘했당");
                    }else {
                        tvSocietyGrade.setText(String.valueOf(society));
                        tvSocietyComment.setText(". . .");
                    }

                    // if end



                    break;
            }
        }
    };
}
