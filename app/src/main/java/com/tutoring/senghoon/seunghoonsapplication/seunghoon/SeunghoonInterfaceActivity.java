package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonInterfaceActivity extends AppCompatActivity {
    Button btnTv;
    ImageView ivTv;
    TextView tvTv;

    Button btnRadio;
    ImageView ivRadio;
    TextView tvRadio;

    Television television =  new Television();
    Radio radio = new Radio();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_interface);

        btnTv = findViewById(R.id.sh_interface_btnTv);
        ivTv = findViewById(R.id.sh_interface_imgTv);
        tvTv = findViewById(R.id.sh_interface_tvTv);

        btnRadio = findViewById(R.id.sh_interface_btnRadio);
        ivRadio = findViewById(R.id.sh_interface_imgRadio);
        tvRadio = findViewById(R.id.sh_interface_tvRadio);

        btnTv.setOnClickListener(onClickListener);
        btnRadio.setOnClickListener(onClickListener);

        Radio radio = new Radio();
        Television television = new Television();

        television.on();
        television.off();
        radio.on();
        radio.off();


    }
    boolean isTvOn = false;
    boolean isRadioOn = false;

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.sh_interface_btnTv:



                    if (isTvOn == false) {
                        btnTv.setText("off");
                        television.on();
                        ivTv.setImageResource(R.drawable.img_tv_on);
                        tvTv.setText("on");
                        isTvOn =  true;
                    } else if (isTvOn == true) {
                        btnTv.setText("on");
                        television.off();
                        ivTv.setImageResource(R.drawable.img_tv_off);
                        tvTv.setText("off");
                        isTvOn = false;
                    }

                    break;












                case R.id.sh_interface_btnRadio:
                    if (isRadioOn == false) {
                        btnRadio.setText("off");
                        radio.on();
                        ivRadio.setImageResource(R.drawable.img_radio_on);
                        tvRadio.setText("on");
                        isRadioOn = true;
                    } else if (isRadioOn == true) {
                        btnRadio.setText("on");
                        radio.off();
                        ivRadio.setImageResource(R.drawable.img_radio_off);
                        tvRadio.setText("off");
                        isRadioOn = false;
                    }


                    break;
            }
        }
    };
}
