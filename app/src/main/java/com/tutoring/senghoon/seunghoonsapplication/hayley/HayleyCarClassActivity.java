package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyCarClassActivity extends AppCompatActivity {

    TextView tvShCarColor, tvShCarWheel, tvShCarWindow, tvShCarBreak, tvShCarSpeed;
    Button btnShCarBreak, btnShCarSpeedDown, btnShCarSpeedUp;

    TextView tvTCarColor, tvTCarWheel, tvTCarWindow, tvTCarBreak, tvTCarSpeed;
    Button btnTCarBreak, btnTCarSpeedDown, btnTCarSpeedUp;

    Car seunghoonCar = null;
    Car teacherCar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_car_class);

        tvShCarColor = findViewById(R.id.hl_carClass_tvSeunghoonColor);
        tvShCarWheel = findViewById(R.id.hl_carClass_tvSeunghoonWheel);
        tvShCarWindow = findViewById(R.id.hl_carClass_tvSeunghoonWindow);
        tvShCarBreak = findViewById(R.id.hl_carClass_tvSeunghoonBreak);
        tvShCarSpeed = findViewById(R.id.hl_carClass_tvSeunghoonSpeed);
        btnShCarBreak = findViewById(R.id.hl_carClass_btnSeunghoonBreak);
        btnShCarSpeedDown = findViewById(R.id.hl_carClass_btnSeunghoonSpeedDown);
        btnShCarSpeedUp = findViewById(R.id.hl_carClass_btnSeunghoonSpeedUp);

        btnShCarBreak.setOnClickListener(onBtnSeunghoonCarBreakListener);
        btnShCarSpeedDown.setOnClickListener(onBtnSeunghoonCarSpeedDownListener);
        btnShCarSpeedUp.setOnClickListener(onBtnSeunghoonCarSpeedUpListener);

        // 데이터타입 변수명
        seunghoonCar = new Car();
        seunghoonCar.color = "Red";
        seunghoonCar.speed = 50;
        seunghoonCar.wheel = 2;
        seunghoonCar.window = 4;
        seunghoonCar.isBreak = true;

        tvShCarColor.setText(seunghoonCar.color);
        tvShCarWheel.setText(String.valueOf(seunghoonCar.wheel));
        tvShCarWindow.setText(String.valueOf(seunghoonCar.window));
        tvShCarSpeed.setText(String.valueOf(seunghoonCar.speed));
        tvShCarBreak.setText(String.valueOf(seunghoonCar.isBreak));

        tvTCarColor = findViewById(R.id.hl_carClass_tvTeacherColor);
        tvTCarWheel = findViewById(R.id.hl_carClass_tvTeacherWheel);
        tvTCarWindow = findViewById(R.id.hl_carClass_tvTeacherWindow);
        tvTCarBreak = findViewById(R.id.hl_carClass_tvTeacherBreak);
        tvTCarSpeed = findViewById(R.id.hl_carClass_tvTeacherSpeed);
        btnTCarBreak = findViewById(R.id.hl_carClass_btnTeacherBreak);
        btnTCarSpeedDown = findViewById(R.id.hl_carClass_btnTeacherSpeedDown);
        btnTCarSpeedUp = findViewById(R.id.hl_carClass_btnTeacherSpeedUp);

        btnTCarBreak.setOnClickListener(onBtnTeacherCarBreakListener);
        btnTCarSpeedDown.setOnClickListener(onBtnTeacherCarSpeedDownListener);
        btnTCarSpeedUp.setOnClickListener(onBtnTeacherCarSpeedUpListener);


        teacherCar = new Car();
        teacherCar.color = "Blue";
        teacherCar.wheel = 6;
        teacherCar.window = 2;
        teacherCar.speed = 80;
        teacherCar.isBreak = false;

        tvTCarColor.setText(teacherCar.color);
        tvTCarWheel.setText(String.valueOf(teacherCar.wheel));
        tvTCarWindow.setText(String.valueOf(teacherCar.window));
        tvTCarBreak.setText("No Break");
        tvTCarSpeed.setText(String.valueOf(teacherCar.speed));

    }

    View.OnClickListener onBtnSeunghoonCarBreakListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // break -> seunghoon speed = 0
            // break 풀었을 때 -> seunghoon speed = 50

            if (!seunghoonCar.isBreak) {
                seunghoonCar.isBreak = true;
                seunghoonCar.speed = 0;
                btnShCarBreak.setText("SpeedUp");
            } else if (seunghoonCar.isBreak) {
                seunghoonCar.isBreak = false;
                seunghoonCar.speed = 50;
                btnShCarBreak.setText("Break");
            }

            tvShCarBreak.setText(String.valueOf(seunghoonCar.isBreak));
            tvShCarSpeed.setText(String.valueOf(seunghoonCar.speed));


        }
    };

    View.OnClickListener onBtnSeunghoonCarSpeedDownListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            seunghoonCar.speedDown();

            tvShCarSpeed.setText(String.valueOf(seunghoonCar.speed));

        }
    };

    View.OnClickListener onBtnSeunghoonCarSpeedUpListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            seunghoonCar.speedUp();

            tvShCarSpeed.setText(String.valueOf(seunghoonCar.speed));
        }
    };

    View.OnClickListener onBtnTeacherCarBreakListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // speed = 0,
            if (teacherCar.isBreak) {
                teacherCar.speed = 80;
                teacherCar.isBreak = false;
            } else if (!teacherCar.isBreak) {     // ! = not
                teacherCar.speed = 0;
                teacherCar.isBreak = true;
            }
        }
    };

    View.OnClickListener onBtnTeacherCarSpeedDownListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            teacherCar.speedDown();

            tvTCarSpeed.setText(String.valueOf(teacherCar.speed));
        }
    };

    View.OnClickListener onBtnTeacherCarSpeedUpListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            teacherCar.speedUp();

            tvTCarSpeed.setText(String.valueOf(teacherCar.speed));
        }
    };

}
