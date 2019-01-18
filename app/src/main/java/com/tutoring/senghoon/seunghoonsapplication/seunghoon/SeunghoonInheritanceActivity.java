package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonInheritanceActivity extends AppCompatActivity {

    TextView tvSimbaValue,tvMufasaValue,tvScarValue,tvLapikeyValue,tvPoombaValue,tvTimonValue,tvZazuValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_inheritance);
        tvSimbaValue = findViewById(R.id.sh_animal_tvSimbaValue);
        tvMufasaValue = findViewById(R.id.sh_animal_tvMufasaValue);
        tvScarValue = findViewById(R.id.sh_animal_tvScarValue);
        tvLapikeyValue = findViewById(R.id.sh_animal_tvLapikeyValue);
        tvPoombaValue = findViewById(R.id.sh_animal_tvPoombaValue);
        tvTimonValue = findViewById(R.id.sh_animal_tvTimonValue);
        tvZazuValue = findViewById(R.id.sh_animal_tvZazuValue);

        Lion simba = new Lion("Simba","Yellow",4,false,"None");
        simba.walk("걷는다아아아아ㅏㅏ아아아아","깜찍");
        simba.run( "slow");
        simba.eat("고기");
        simba.see("하늘을");
        simba.singASong("하쿠마마타타");

        Lion mufasa = new Lion("mufasa","Brown",46,true,"redBrown");
        mufasa.walk("걷는다","걍");
        mufasa.run("fast");
        mufasa.eat("말고기");
        mufasa.see("천국에서심바를");
        mufasa.singASong("엄지 척");

        Lion scar = new Lion("scar","Darkbrown",37,true,"Black");
        scar.walk("걷는다","느낌적인느낌으로클라스하고스무스하게");
        scar.run( "very fast");
        scar.eat("돼지고기");
        scar.see("하이에나들을");
        scar.singASong("마른논에 물대기");

        Monkey lapikey = new Monkey("라피키","Navy",73);
        lapikey.walk("걷는다","그냥");
        lapikey.run("very slowly");
        lapikey.eat("열매");
        lapikey.see("심바");
        lapikey.singASong("먼지가 되어");

        Pig poomba = new Pig("품바","Brown",20,4);
        poomba.run( "느그적 느그적");
        poomba.walk("걷는다","뚠실뚠실");
        poomba.eat("애벌레");
        poomba.see("티몬을");
        poomba.singASong("하쿠마마타타");

        Weasel timon = new Weasel("티몬","오렌지",20,4);;
        timon.walk("걷는다앙^^","카와이");
        timon.run("깡gun 깡gun");
        timon.eat("지네");
        timon.see("지네를");
        timon.singASong("전혀");

        Bird zazu = new Bird("zazu",2,"Blue",48);
        zazu.eat("열매");
        zazu.walk("걷는다","느리게");
        zazu.see("심바");
        zazu.fly("난다");
        zazu.singASong("바코드");




        tvSimbaValue.setText(simba.getMessage());

        tvMufasaValue.setText(mufasa.getMessage());

        tvScarValue.setText(scar.getMessage());

        tvLapikeyValue.setText(lapikey.getMessage());

        tvPoombaValue.setText(poomba.getMessage());

        tvTimonValue.setText(timon.getMessage());

        tvZazuValue.setText(zazu.getMessage());





    }
}
