package com.tutoring.senghoon.seunghoonsapplication.hayley;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

        import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyInheritanceActivity extends AppCompatActivity {

    TextView tvSimbaValue, tvMufasaValue, tvScarValue,
            tvLapikeyValue, tvPoombaValue, tvTimonValue;

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

        Lion simba = new Lion();
        simba.legCount = 4;
        simba.hairColor = "Yellow";
        simba.age = 4;
        simba.isAdult = false;
        simba.maneColor = "None";

        Lion mufasa = new Lion();
        mufasa.legCount = 4;
        mufasa.hairColor = "Brown";
        mufasa.age = 46;
        mufasa.isAdult = true;
        mufasa.maneColor = "Red Brown";

        Lion scar = new Lion();
        scar.legCount = 4;
        scar.hairColor = "Dark Brown";
        scar.age = 37;
        scar.isAdult = true;
        scar.maneColor = "Black";

        Monkey lapikey = new Monkey();
        lapikey.legCount = 2;
        lapikey.hairColor = "Navy";
        lapikey.age = 80;

        Pig poomba = new Pig();
        poomba.legCount = 4;
        poomba.hairColor = "Brown";
        poomba.age = 20;

        Weasel timon = new Weasel();
        timon.legCount = 4;
        timon.hairColor = "Orange";
        timon.age = 20;

        tvSimbaValue.setText(simba.legCount + ", "
                + simba.hairColor + ", "
                + simba.age + ", "
                + simba.isAdult + ", "
                + simba.maneColor);

        tvMufasaValue.setText(mufasa.legCount + ", "
                + mufasa.hairColor + ", "
                + mufasa.age + ", "
                + mufasa.isAdult + ", "
                + mufasa.maneColor);

        tvScarValue.setText(scar.legCount + ", "
                + scar.hairColor + ", "
                + scar.age + ", "
                + scar.isAdult + ", "
                + scar.maneColor);

        tvLapikeyValue.setText(lapikey.legCount + ", "
                + lapikey.hairColor + ", "
                + lapikey.age);

        tvPoombaValue.setText(poomba.legCount + " , "
                + poomba.hairColor + ", "
                + poomba.age);


        tvTimonValue.setText(timon.legCount + ", "
                + timon.hairColor + ", "
                + timon.age);

        simba.run("Slowly");
        simba.eat("Simba", "Meat");

        mufasa.run("Fast");
        mufasa.eat("Mufasa", "Horse");

        scar.run("Very fast");
        scar.eat("Scar", "Pork");

        lapikey.run("Very slowly");
        lapikey.eat("Lapikey", "Apple");

        poomba.run("느그적 느그적");
        poomba.eat("Poomba", "Worm");

        timon.run("깡총 깡총");
        timon.eat("Timon", "지네");



    }
}
