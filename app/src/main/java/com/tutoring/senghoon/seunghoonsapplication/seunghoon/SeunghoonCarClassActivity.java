package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonCarClassActivity extends AppCompatActivity {
    TextView tvShCarColor,tvShCarWheel,tvShCarWindow,tvShCarBreak,tvShCarSpeed;
    Button btnShCarBreak, btnShCarSpeedDown,btnShCarSpeedUp;
    Car seunghoonCar = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_car_class);

        tvShCarColor = findViewById(R.id.sh_carClass_tvSeunghoonColor);
        tvShCarSpeed = findViewById(R.id.sh_carClass_tvSeunghoonSpeed);
        tvShCarBreak = findViewById(R.id.sh_carClass_tvSeunghoonBreak);
        tvShCarWheel = findViewById(R.id.sh_carClass_tvSeunghoonWheel);
        tvShCarWindow = findViewById(R.id.sh_carClass_tvSeunghoonWindow);

        btnShCarBreak = findViewById(R.id.sh_carClass_btnSeunghoonBreak);
        btnShCarSpeedUp = findViewById(R.id.sh_carClass_btnSeunghoonSpeedUp);
        btnShCarSpeedDown = findViewById(R.id.sh_carClass_btnSeunghoonSpeedDown);

        btnShCarBreak.setOnClickListener(onBtnShCarBreakClickListener);
        btnShCarSpeedUp.setOnClickListener(onBtnShCarSpeedUpClickListener);
        btnShCarSpeedDown.setOnClickListener(onBtnShCarSpeedDownClickListener);

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

    }

    View.OnClickListener onBtnShCarBreakClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        if (!seunghoonCar.isBreak)   {
            seunghoonCar.isBreak = true;
            seunghoonCar.speed = 0;
            btnShCarBreak.setText("SpeedUp");
        }else if (seunghoonCar.isBreak) {
            seunghoonCar.isBreak = false;
            seunghoonCar.speed = 50;
            btnShCarBreak.setText("Break");
        }
        tvShCarBreak.setText(String.valueOf(seunghoonCar.isBreak));
        tvShCarSpeed.setText(String.valueOf(seunghoonCar.speed));
        }
    };

    View.OnClickListener onBtnShCarSpeedDownClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            seunghoonCar.speedDown();
        tvShCarSpeed.setText(String.valueOf(seunghoonCar.speed));

        }
    };


    View.OnClickListener onBtnShCarSpeedUpClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            seunghoonCar.speedUp();
            tvShCarSpeed.setText(String.valueOf(seunghoonCar.speed));
        }
    };
}
