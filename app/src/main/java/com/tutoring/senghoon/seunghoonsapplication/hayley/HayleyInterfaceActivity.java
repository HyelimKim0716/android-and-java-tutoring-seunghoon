package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyInterfaceActivity extends AppCompatActivity {

    // 변수 선언
    // 변수타입 변수명;
    Button btnTv;
    ImageView ivTv;
    TextView tvTv;

    Button btnRadio;
    ImageView ivRadio;
    TextView tvRadio;

    Television television = new Television();
    Radio radio = new Radio();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_interface);

        btnTv = findViewById(R.id.hl_interface_btnTv);
        ivTv = findViewById(R.id.hl_interface_imgTv);
        tvTv = findViewById(R.id.hl_interface_tvTv);

        btnRadio = findViewById(R.id.hl_interface_btnRadio);
        ivRadio = findViewById(R.id.hl_interface_imgRadio);
        tvRadio = findViewById(R.id.hl_interface_tvRadio);

        btnTv.setOnClickListener(onClickListener);
        btnRadio.setOnClickListener(onClickListener);

        // 변수 : 변수타입 변수명
        Television television = new Television();
        Radio radio = new Radio();

        television.on();
        television.off();

        radio.on();
        radio.off();

    }

    boolean isTvOn = false;
    boolean isRadioOn = false;

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.hl_interface_btnTv:
                    // 티비가 켜져있지 않을 때
                    // isTvOn = false
                    // ! : not
                    if (isTvOn == false) {
                        television.on();

                        btnTv.setText("Off");
                        ivTv.setImageResource(R.drawable.img_tv_on);
                        tvTv.setText("On");

                        isTvOn = true;
                    } else if (isTvOn == true) {
                        television.off();

                        btnTv.setText("On");
                        ivTv.setImageResource(R.drawable.img_tv_off);
                        tvTv.setText("Off");
                        isTvOn = false;
                    }
                    break;

                case R.id.hl_interface_btnRadio:
                    if (!isRadioOn) {
                        radio.on();

                        btnRadio.setText("Off");
                        ivRadio.setImageResource(R.drawable.img_radio_on);
                        tvRadio.setText("On");
                        isRadioOn = true;
                    } else {
                        radio.off();

                        btnRadio.setText("On");
                        ivRadio.setImageResource(R.drawable.img_radio_on);
                        tvRadio.setText("Off");

                        isRadioOn = false;
                    }

                    break;
            }
        }
    };
}
