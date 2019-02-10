package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_main);

        findViewById(R.id.hayleyMain_btnLinearLayout).setOnClickListener(mBtnClickListener);
        findViewById(R.id.hayleyMain_btnDataType).setOnClickListener(mBtnClickListener);
        findViewById(R.id.hayleyMain_btnControl).setOnClickListener(mBtnClickListener);
        findViewById(R.id.hayleyMain_btnRepeat).setOnClickListener(mBtnClickListener);
        findViewById(R.id.hayleyMain_btnMethod1).setOnClickListener(mBtnClickListener);
        findViewById(R.id.hayleyMain_btnMethod2).setOnClickListener(mBtnClickListener);
        findViewById(R.id.hayleyMain_btnMethod3).setOnClickListener(mBtnClickListener);
        findViewById(R.id.hayleyMain_btnSchedule).setOnClickListener(mBtnClickListener);
        findViewById(R.id.hayleyMain_btnCarClass).setOnClickListener(mBtnClickListener);
        findViewById(R.id.hayleyMain_btnDogClass).setOnClickListener(mBtnClickListener);
        findViewById(R.id.hayleyMain_btnInheritance).setOnClickListener(mBtnClickListener);
        findViewById(R.id.hayleyMain_btnInterface).setOnClickListener(mBtnClickListener);
        findViewById(R.id.hayleyMain_btnInterface2).setOnClickListener(mBtnClickListener);
    }

    private View.OnClickListener mBtnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = null;

            switch (view.getId()) {
                case R.id.hayleyMain_btnLinearLayout:
                    intent = new Intent(HayleyMainActivity.this, HayleyLinearLayoutActivity.class);
                    break;

                case R.id.hayleyMain_btnDataType:
                    intent = new Intent(HayleyMainActivity.this, HayleyDataTypeActivity.class);
                    break;

                case R.id.hayleyMain_btnControl:
                    intent = new Intent(HayleyMainActivity.this, HayleyControlActivity.class);
                    break;

                case R.id.hayleyMain_btnRepeat:
                    intent = new Intent(HayleyMainActivity.this, HayleyRepeatActivity.class);
                    break;

                case R.id.hayleyMain_btnMethod1:
                    intent = new Intent(HayleyMainActivity.this, HayleyMethod1Activity.class);
                    break;

                case R.id.hayleyMain_btnMethod2:
                    intent = new Intent(HayleyMainActivity.this, HayleyMethod2Activity.class);
                    break;

                case R.id.hayleyMain_btnMethod3:
                    intent = new Intent(HayleyMainActivity.this, HayleyMethod3Activity.class);
                    break;

                case R.id.hayleyMain_btnSchedule:
                    intent = new Intent(HayleyMainActivity.this, HayleyScheduleActivity.class);
                    break;

                case R.id.hayleyMain_btnCarClass:
                    intent = new Intent(HayleyMainActivity.this, HayleyCarClassActivity.class);
                    break;

                case R.id.hayleyMain_btnDogClass:
                    intent = new Intent(HayleyMainActivity.this, HayleyDogClassActivity.class);
                    break;

                case R.id.hayleyMain_btnInheritance:
                    intent = new Intent(HayleyMainActivity.this, HayleyInheritanceActivity.class);
                    break;

                case R.id.hayleyMain_btnInterface:
                    intent = new Intent(HayleyMainActivity.this, HayleyInterfaceActivity.class);
                    break;

                case R.id.hayleyMain_btnInterface2:
                    intent = new Intent(HayleyMainActivity.this, HayleyInterface2Activity.class);
                    break;


            }

            if (intent != null)
                startActivity(intent);

        }
    };
}
