package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyInheritanceActivity extends AppCompatActivity {

    TextView tvSimbaValue, tvMufasaValue, tvScarValue,
            tvLapikeyValue, tvPoombaValue, tvTimonValue,
            tvZazuValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_inheritance);

        tvSimbaValue = findViewById(R.id.hl_animal_tvSimbaValue);
        tvMufasaValue = findViewById(R.id.hl_animal_tvMufasaValue);
        tvScarValue = findViewById(R.id.hl_animal_tvScarValue);
        tvLapikeyValue = findViewById(R.id.hl_animal_tvLapikeyValue);
        tvPoombaValue = findViewById(R.id.hl_animal_tvPoombaValue);
        tvTimonValue = findViewById(R.id.hl_animal_tvTimonValue);
        tvZazuValue = findViewById(R.id.hl_animal_tvZazuValue);

        Lion simba = new Lion("Simba", "Yellow", 4, false, "None");
        Lion mufasa = new Lion("Mufasa", "Brwon", 46, true, "Red Brown");
        Lion scar = new Lion("Scar", "Dark Brown", 37, true, "Black");
        Monkey lapikey = new Monkey("Lapikey", "Navy", 80);
        Pig poomba = new Pig("Poomba", 4, "Brown", 20 );
        Weasel timon = new Weasel("Timon", 4, "Orange", 20);
        Bird zazu = new Bird("Zazu", 48, "Blue", 48);


        tvSimbaValue.setText(simba.getMessage()
                + simba.isAdult + ", "
                + simba.maneColor);

        tvMufasaValue.setText(mufasa.getMessage()
                + mufasa.isAdult + ", "
                + mufasa.maneColor);

        tvScarValue.setText(scar.getMessage()
                + scar.isAdult + ", "
                + scar.maneColor);

        tvLapikeyValue.setText(lapikey.getMessage());

        tvPoombaValue.setText(poomba.getMessage());


        tvTimonValue.setText(timon.getMessage());

        tvZazuValue.setText(zazu.getMessage());

        simba.run("Slowly");
        simba.walk("천천히", "걷는다");
        simba.eat("Meat");
        simba.see("하늘");
        simba.singASong("하쿠마마타");

        mufasa.run("Fast");
        mufasa.walk("아주 천천히", "산책한다");
        mufasa.eat("Horse");
        mufasa.see("심바");
        mufasa.singASong("엄지 척");

        scar.run("Very fast");
        scar.walk("빠르게", "걸을랑말랑");
        scar.eat("Pork");
        scar.see("하이에나들");
        scar.singASong("마른논에 물대기");

        lapikey.run("Very slowly");
        lapikey.walk("빨리", "걸었다");
        lapikey.eat("Apple");
        lapikey.see("Mufasa");
        lapikey.singASong("탓");

        poomba.run("느그적 느그적");
        poomba.walk("느리게", "걷는다");
        poomba.eat("Worm");
        poomba.see("Timon");
        poomba.singASong("하쿠마마타타");

        timon.run("깡총 깡총");
        timon.walk("느으리게에", "걸었어욥");
        timon.eat("지네");
        timon.see("지네");
        timon.singASong("전율");

        zazu.walk("느리게", "걷는담");
        zazu.eat("열매");
        zazu.see("심바");
        zazu.fly("훨훨");
        zazu.singASong("Solo");
    }
}
