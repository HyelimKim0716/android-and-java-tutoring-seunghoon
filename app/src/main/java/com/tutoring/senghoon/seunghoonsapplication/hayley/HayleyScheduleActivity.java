package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyScheduleActivity extends AppCompatActivity {


    Button btnMonday,btnTuesday, btnWednesday, btnThursday,
            btnFriday, btnSaturday, btnSunday;

    TextView tvMorning1, tvMorning2,
            tvAfternoon1, tvAfternoon2, tvAfternoon3,
            tvEvening1, tvEvening2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_schedule);

        btnMonday = findViewById(R.id.hl_schedule_btnMonday);
        btnTuesday = findViewById(R.id.hl_schedule_btnTuesday);
        btnWednesday = findViewById(R.id.hl_schedule_btnWednesday);
        btnThursday = findViewById(R.id.hl_schedule_btnThursday);
        btnFriday = findViewById(R.id.hl_schedule_btnFriday);
        btnSaturday = findViewById(R.id.hl_schedule_btnSaturday);
        btnSunday = findViewById(R.id.hl_schedule_btnSunday);

        tvMorning1 = findViewById(R.id.hl_schedule_tvMorning1);
        tvMorning2 = findViewById(R.id.hl_schedule_tvMorning2);
        tvAfternoon1 = findViewById(R.id.hl_schedule_tvAfternoon1);
        tvAfternoon2 = findViewById(R.id.hl_schedule_tvAfternoon2);
        tvAfternoon3 = findViewById(R.id.hl_schedule_tvAfternoon3);
        tvEvening1 = findViewById(R.id.hl_schedule_tvEvening1);
        tvEvening2 = findViewById(R.id.hl_schedule_tvEvening2);

        btnMonday.setOnClickListener(btnOnClickListener);
        btnTuesday.setOnClickListener(btnOnClickListener);
        btnWednesday.setOnClickListener(btnOnClickListener);
        btnThursday.setOnClickListener(btnOnClickListener);
        btnFriday.setOnClickListener(btnOnClickListener);
        btnSaturday.setOnClickListener(btnOnClickListener);
        btnSunday.setOnClickListener(btnOnClickListener);
    }

    private View.OnClickListener btnOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.hl_schedule_btnMonday:
                    tvMorning1.setText("일어나서 밥먹고 등등");
                    tvMorning2.setText("오전 수업 그리고 축구");
                    lunchTime();
                    goHome();
                    tvAfternoon3.setText("미술학원!");
                    tvEvening1.setText("영어과외");
                    tvEvening2.setText("만화그리기 또는 바로 침대");
                break;

                case R.id.hl_schedule_btnTuesday:
                    tvMorning1.setText("일어나서 밥먹고 귀찮아서 가그린");
                    tvMorning2.setText("오전 수업 원바만하기");
                    lunchTime();
                    goHome();
                    tvAfternoon3.setText("독서과외");
                    tvEvening1.setText("코딩 수업 얄루!!!!!");
                    tvEvening2.setText("만화그리기 또는 바로 침대");
                    break;

                case R.id.hl_schedule_btnWednesday:
                    tvMorning1.setText("일어나서 밥먹고 치카치카송송");
                    tvMorning2.setText("오전 수업 축구");
                    lunchTime();
                    tvAfternoon2.setText("체육수업 그리고 하교");
                    tvAfternoon3.setText("놀고 미술학원");
                    tvEvening1.setText("싱크빅과외(수학위주)");
                    tvEvening2.setText("바로 자거나 1% 확률로 천문학 공부");
                    break;

                case R.id.hl_schedule_btnThursday:
                    tvMorning1.setText("일어나서 밥먹고 치카치카송송");
                    tvMorning2.setText("오전 수업 축구");
                    lunchTime();
                    goHome();
                    tvAfternoon3.setText("6시 영어 과외 시작");
                    tvEvening1.setText("8시 영어 끝 천문학 공부2%");
                    tvEvening2.setText("바로 자기");
                    break;

                case R.id.hl_schedule_btnFriday:
                    tvMorning1.setText("일어나서 밥먹고 치키치키차카차카초코초코초");
                    tvMorning2.setText("오전 수업");
                    lunchTime();
                    tvAfternoon2.setText("하교하자마자 싱크빅");
                    tvAfternoon3.setText("쉬거나 배그하거나 천문학공부하거나 만화그리기");
                    tvEvening1.setText("코딩수업");
                    tvEvening2.setText("만화그리기 또는 천문학 공부");
                    break;

                case R.id.hl_schedule_btnSaturday:
                    tvMorning1.setText(sleeping());
                    tvMorning2.setText(sleeping());
                    tvAfternoon1.setText("간식");
                    tvAfternoon2.setText("조금 점심");
                    tvAfternoon3.setText("아빠랑 수영장가고 수학하고 영어는 거의 안함. 목욕하고 밥먹고");
                    tvEvening1.setText("자유시간");
                    tvEvening2.setText("드디어 핸드폰! 그리고 자기");
                    break;

                case R.id.hl_schedule_btnSunday:
                    tvMorning1.setText(sleeping());
                    tvMorning2.setText("놀기");
                    tvAfternoon1.setText(freeTime());
                    tvAfternoon2.setText(freeTime());
                    tvAfternoon3.setText(freeTime());
                    tvEvening1.setText("숙제");
                    tvEvening2.setText("자기");
                    break;
            }
        }
    };

    void lunchTime() {
        tvAfternoon1.setText("밥 먹고 축구");
    }

    String freeTime() {
        return "자유시간";
    }

    String sleeping() {
        return "자고있음";
    }

    void goHome() {
        tvAfternoon2.setText("하교!");
    }

}
