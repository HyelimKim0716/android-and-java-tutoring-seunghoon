package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyDogClassActivity extends AppCompatActivity {

    TextView tvBreed1, tvSize1, tvAge1, tvColor1;
    TextView tvBreed2, tvSize2, tvAge2, tvColor2;
    TextView tvBreed3, tvSize3, tvAge3, tvColor3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_dog_class);

        tvBreed1 = findViewById(R.id.hl_dogClass_tvBreed1);
        tvSize1 = findViewById(R.id.hl_dogClass_tvSize1);
        tvAge1 = findViewById(R.id.hl_dogClass_tvAge1);
        tvColor1 = findViewById(R.id.hl_dogClass_tvColor1);

        tvBreed2 = findViewById(R.id.hl_dogClass_tvBreed2);
        tvSize2 = findViewById(R.id.hl_dogClass_tvSize2);
        tvAge2 = findViewById(R.id.hl_dogClass_tvAge2);
        tvColor2 = findViewById(R.id.hl_dogClass_tvColor2);

        tvBreed3 = findViewById(R.id.hl_dogClass_tvBreed3);
        tvSize3 = findViewById(R.id.hl_dogClass_tvSize3);
        tvAge3 = findViewById(R.id.hl_dogClass_tvAge3);
        tvColor3 = findViewById(R.id.hl_dogClass_tvColor3);

        Dog seunghoonDog = new Dog("비숑", "Medium", 2, "White");
        Dog teacherDog = new Dog("포메라니안", "Small", 10, "Brown");
        Dog mingyuDog = new Dog("치와와", "Big", 9, "Black");


        tvBreed1.setText(seunghoonDog.breed);
        tvSize1.setText(seunghoonDog.size);
        tvAge1.setText(String.valueOf(seunghoonDog.age));
        tvColor1.setText(seunghoonDog.color);

        tvBreed2.setText(teacherDog.breed);
        tvSize2.setText(teacherDog.size);
        tvAge2.setText(String.valueOf(teacherDog.age));
        tvColor2.setText(teacherDog.color);

        tvBreed3.setText(mingyuDog.breed);
        tvSize3.setText(mingyuDog.size);
        tvAge3.setText(String.valueOf(mingyuDog.age));
        tvColor3.setText(mingyuDog.color);

    }
}
