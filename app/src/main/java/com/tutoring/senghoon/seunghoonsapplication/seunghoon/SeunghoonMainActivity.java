package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_main);

        findViewById(R.id.seunghoonMain_btnLinearLayout).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnDataType).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnDataTypeAssignment).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnControl).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnRepeat).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnMethod1).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnMethod2).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnMethod3).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnSchedule).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnCarClass).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnDogClass).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnInheritance).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnInterface).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnInterface2).setOnClickListener(mBtnClickListener);
    }

    private View.OnClickListener mBtnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = null;

            switch (view.getId()) {
                case R.id.seunghoonMain_btnLinearLayout:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonLinearLayoutActivity.class);
                    break;

                case R.id.seunghoonMain_btnDataType:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonDataTypeActivity.class);
                    break;

                case R.id.seunghoonMain_btnDataTypeAssignment:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonDataTypeAssignmentActivity.class);
                    break;

                case R.id.seunghoonMain_btnControl:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonControlActivity.class);
                    break;

                case R.id.seunghoonMain_btnRepeat:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonRepeatActivity.class);
                    break;

                case R.id.seunghoonMain_btnMethod1:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonMethod1Activity.class);
                    break;

                case R.id.seunghoonMain_btnMethod2:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonMethod2Activity.class);
                    break;

                case R.id.seunghoonMain_btnMethod3:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonMethod3Activity.class);
                    break;

                case R.id.seunghoonMain_btnSchedule:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonScheduleActivity.class);
                    break;

                case R.id.seunghoonMain_btnCarClass:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonCarClassActivity.class);
                    break;

                case R.id.seunghoonMain_btnDogClass:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonDogClassActivity.class);
                    break;

                case R.id.seunghoonMain_btnInheritance:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonInheritanceActivity.class);
                    break;

                case R.id.seunghoonMain_btnInterface:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonInterfaceActivity.class);
                    break;

                case R.id.seunghoonMain_btnInterface2:
                    intent = new Intent(SeunghoonMainActivity.this, SeunghoonInterface2Activity.class);
                    break;
            }

            if (intent != null)
                startActivity(intent);

        }
    };
}
