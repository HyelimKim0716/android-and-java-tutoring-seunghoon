package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyDogClassActivity extends AppCompatActivity {

    TextView tvBreed1, tvSize1, tvAge1, tvColor1;
    TextView tvBreed2, tvSize2, tvAge2, tvColor2;

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


        Dog seunghoonDog = new Dog("비숑", "Medium", 2, "White");
        Dog teacherDog = new Dog("포메라니안", "Small", 10, "Brown");


        tvBreed1.setText(seunghoonDog.breed);
        tvSize1.setText(seunghoonDog.size);
        tvAge1.setText(String.valueOf(seunghoonDog.age));
        tvColor1.setText(seunghoonDog.color);

        

    }
}
