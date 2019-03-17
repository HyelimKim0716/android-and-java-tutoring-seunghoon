package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyKakaoCharacterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_kakao_character);

        TextView tvConBreed = findViewById(R.id.hl_kakao_tvConBreed);
        TextView tvConSize = findViewById(R.id.hl_kakao_tvConSize);

        TextView tvMuziBreed = findViewById(R.id.hl_kakao_tvMuziBreed);
        TextView tvMuziSize = findViewById(R.id.hl_kakao_tvMuziSize);

        TextView tvRyanBreed = findViewById(R.id.hl_kakao_tvRyanBreed);
        TextView tvRyanSize = findViewById(R.id.hl_kakao_tvRyanSize);

        TextView tvFrodoBreed = findViewById(R.id.hl_kakao_tvFrodoBreed);
        TextView tvFrodoSize = findViewById(R.id.hl_kakao_tvFrodoSize);


        KakaoFriend con = new KakaoFriend();
        con.name = "Con";
        con.breed = "Dinosaur";
        con.size = "Small";


        KakaoFriend muzi = new KakaoFriend();
        muzi.name = "Muzi";
        muzi.breed = "Rabbit";
        muzi.size = "Medium";

        KakaoFriend ryan = new KakaoFriend();
        ryan.name = "Ryan";
        ryan.breed = "Lion";
        ryan.size = "Medium";

        KakaoFriend frodo = new KakaoFriend();
        frodo.name = "Frodo";
        frodo.breed = "Dog";
        frodo.size = "Medium";



    }
}
