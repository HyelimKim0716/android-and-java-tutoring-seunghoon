package com.tutoring.senghoon.seunghoonsapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tutoring.senghoon.seunghoonsapplication.hayley.HayleyMainActivity;
import com.tutoring.senghoon.seunghoonsapplication.seunghoon.SeunghoonMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_btnHayley).setOnClickListener(mBtnClickListener);
        findViewById(R.id.main_btnSeunghoon).setOnClickListener(mBtnClickListener);
    }

    private View.OnClickListener mBtnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = null;

            switch (view.getId()) {
                case R.id.main_btnHayley:
                    intent = new Intent(MainActivity.this, HayleyMainActivity.class);
                    break;

                case R.id.main_btnSeunghoon:
                    intent = new Intent(MainActivity.this, SeunghoonMainActivity.class);
                    break;
            }

            if (intent != null)
                startActivity(intent);

        }
    };
}
