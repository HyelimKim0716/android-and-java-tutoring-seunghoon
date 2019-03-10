package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonDog2ClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_dog_class);

        TextView tvBreed1 = findViewById(R.id.sh_dogClass_tvBreed1);
        TextView tvSize1 = findViewById(R.id.sh_dogClass_tvSize1);
        TextView tvAge1 = findViewById(R.id.sh_dogClass_tvAge1);
        TextView tvColor1 = findViewById(R.id.sh_dogClass_tvColor1);

        TextView tvBreed2 =findViewById(R.id.sh_dogClass_tvBreed2);
        TextView tvSize2 = findViewById(R.id.sh_dogClass_tvSize2);
        TextView tvAge2 = findViewById(R.id.sh_dogClass_tvAge2);
        TextView tvColor2 = findViewById(R.id.sh_dogClass_tvColor2);

        TextView tvBreed3 = findViewById(R.id.sh_dogClass_tvBreed3);
        TextView tvSize3 = findViewById(R.id.sh_dogClass_tvSize3);
        TextView tvAge3 = findViewById(R.id.sh_dogClass_tvAge3);
        TextView tvColor3 = findViewById(R.id.sh_dogClass_tvColor3);

        tvBreed1.setText("뷔셔엉");
        tvSize1.setText("Medium");
        tvAge1.setText(String.valueOf(2));
        tvColor1.setText("White");

        tvBreed2.setText("포메라니안");
        tvSize2.setText("Small");
        tvAge2.setText(String.valueOf(10));
        tvColor2.setText("Brown");

        tvBreed3.setText("치와와");
        tvSize3.setText("Big");
        tvAge3.setText(String.valueOf(9));
        tvColor3.setText("Black");

        Dog2 bichon = new Dog2();
        bichon.breed = "뷔셔엉";
        bichon.age = 2;
        bichon.size = "Medium";
        bichon.color = "White";

        Dog2 pomeranian = new Dog2();
        pomeranian.breed = "포메라니안";
        pomeranian.age = 10;
        pomeranian.size = "Small";
        pomeranian.color = "Brown";

        Dog2 chihuahua = new Dog2();
        chihuahua.breed = "치와와";
        chihuahua.size = "Big";
        chihuahua.age = 9;
        chihuahua.color = "Black";

        tvBreed1.setText(bichon.breed);
        tvAge1.setText(String.valueOf(bichon.age));
        tvSize1.setText(bichon.size);
        tvColor1.setText(bichon.color);

        tvBreed2.setText(pomeranian.breed);
        tvAge2.setText(String.valueOf(pomeranian.age));
        tvSize2.setText(pomeranian.size);
        tvColor2.setText(pomeranian.color);

        tvBreed3.setText(chihuahua.breed);
        tvAge3.setText(String.valueOf(chihuahua.age));
        tvSize3.setText(chihuahua.size);
        tvColor3.setText(chihuahua.color);






    }
}
