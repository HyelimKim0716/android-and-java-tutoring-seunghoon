package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

import org.w3c.dom.Text;

public class SeunghoonKakaoCharacterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_kakao_character);

        TextView tvConBreedValue = findViewById(R.id.sh_kakao_tvConBreedValue);
        TextView tvConSizeValue = findViewById(R.id.sh_kakao_tvConSizeValue);
        TextView tvConNameValue = findViewById(R.id.sh_kakao_tvConNameValue);
        TextView tvMuziBreedValue = findViewById(R.id.sh_kakao_tvMuziBreedValue);
        TextView tvMuziSizeValue =  findViewById(R.id.sh_kakao_tvMuziSizeValue);
        TextView tvMuziNameValue = findViewById(R.id.sh_kakao_tvMuziNameValue);
        TextView tvRaynBreedValue = findViewById(R.id.sh_kakao_tvRaynBreedValue);
        TextView tvRaynSizeValue = findViewById(R.id.sh_kakao_tvRaynSizeValue);
        TextView tvRaynNameValue = findViewById(R.id.sh_kakao_tvRaynNameValue);
        TextView tvFrodoBreedValue = findViewById(R.id.sh_kakao_tvFrodoBreedValue);
        TextView tvFrodoSizeValue = findViewById(R.id.sh_kakao_tvFrodoSizeValue);
        TextView tvFrodoNameValue = findViewById(R.id.sh_kakao_tvFrodoNameValue);

        KakaoFriend con = new KakaoFriend();
        con.breed = "Dinosaur";
        con.size = "small";
        con.name = "Con";

        KakaoFriend muzi = new KakaoFriend();
        muzi.breed = "rabbit";
        muzi.size = "medium";
        muzi.name = "Muzi";

        KakaoFriend ryan = new KakaoFriend();
        ryan.breed = "rion";
        ryan.size = "medium";
        ryan.name = "Ryan";

        KakaoFriend frodo = new KakaoFriend();
        frodo.breed = "dog";
        frodo.size = "smallMedium";
        frodo.name = "Frodo";

        tvConBreedValue.setText(con.breed);
        tvConSizeValue.setText(con.size);
        tvConNameValue.setText(con.name);

        tvMuziBreedValue.setText(muzi.breed);
        tvMuziSizeValue.setText(muzi.size);
        tvMuziNameValue.setText(muzi.name);

        tvRaynBreedValue.setText(ryan.breed);
        tvRaynSizeValue.setText(ryan.size);
        tvRaynNameValue.setText(ryan.name);

        tvFrodoBreedValue.setText(frodo.breed);
        tvFrodoSizeValue.setText(frodo.size);
        tvFrodoNameValue.setText(frodo.name);

    }
}
