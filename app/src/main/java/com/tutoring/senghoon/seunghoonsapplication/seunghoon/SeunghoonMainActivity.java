package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tutoring.senghoon.seunghoonsapplication.R;
import com.tutoring.senghoon.seunghoonsapplication.hayley.HayleyDataTypeActivity;
import com.tutoring.senghoon.seunghoonsapplication.hayley.HayleyLinearLayoutActivity;
import com.tutoring.senghoon.seunghoonsapplication.hayley.HayleyMainActivity;

public class SeunghoonMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_main);

        findViewById(R.id.seunghoonMain_btnLinearLayout).setOnClickListener(mBtnClickListener);
        findViewById(R.id.seunghoonMain_btnDataType).setOnClickListener(mBtnClickListener);
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
            }

            if (intent != null)
                startActivity(intent);

        }
    };
}
