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
            }

            if (intent != null)
                startActivity(intent);

        }
    };
}
