package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyPlayerInterfaceActivity extends AppCompatActivity {
    TextView tvSoccerPlayerName, tvSoccerPlayerPosition, tvSoccerPlayerTeam, tvSoccerPlayerSkill, tvSoccerPlayerStatus,
    tvVolleyballPlayerName, tvVolleyballPlayerTeam, tvVolleyballPlayerStatus,
    tvBasketballPlayerName, tvBasketballPlayerTeam, tvBasketballPlayerStatus;
    ImageView ivSoccerPlayer, ivVolleyballPlayer, ivBasketballPlayer;

    SoccerPlayer.SoccerPlayerListener soccerPlayerListener = new SoccerPlayer.SoccerPlayerListener() {
        @Override
        public void finish(String name) {
            tvSoccerPlayerStatus.setText(name + " is finished");
        }
    };

    VolleyballPlayer.VolleyballPlayerListener volleyballPlayerListener = new VolleyballPlayer.VolleyballPlayerListener() {
        @Override
        public void end(String name) {
            tvVolleyballPlayerStatus.setText(name + " is volleyball player");
        }
    };


    SoccerPlayer figo, pogba, euijo ;
    VolleyballPlayer yeongyung = new VolleyballPlayer("김연경", "엣자스바쉬", R.drawable.volleyball_yeongyung, volleyballPlayerListener);
    VolleyballPlayer sani = new VolleyballPlayer("김사니", "화성 IBK 기업은행 알토스", R.drawable.volleyball_sani, volleyballPlayerListener);
    BasketballPlayer jordan = new BasketballPlayer("Jordan", "시카고불스", R.drawable.basketball_jordan);
    BasketballPlayer janghoon = new BasketballPlayer("서장훈", "부산 KT 소닉붐", R.drawable.basketball_janghoon);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_player_interface);

        tvSoccerPlayerName = findViewById(R.id.hl_soccer_tvPlayerName);
        tvSoccerPlayerPosition = findViewById(R.id.hl_soccer_tvPlayerPosition);
        tvSoccerPlayerTeam = findViewById(R.id.hl_soccer_tvPlayerTeam);
        tvSoccerPlayerSkill = findViewById(R.id.hl_soccer_tvPlayerSkill);
        tvSoccerPlayerStatus = findViewById(R.id.hl_soccer_tvPlayerStatus);

        tvVolleyballPlayerName = findViewById(R.id.hl_volleyball_tvPlayerName);
        tvVolleyballPlayerTeam = findViewById(R.id.hl_volleyball_tvPlayerTeam);
        tvVolleyballPlayerStatus = findViewById(R.id.hl_volleyball_tvPlayerStatus);

        tvBasketballPlayerName = findViewById(R.id.hl_basketball_tvPlayerName);
        tvBasketballPlayerTeam = findViewById(R.id.hl_basketball_tvPlayerTeam);
        tvBasketballPlayerStatus = findViewById(R.id.hl_basketball_tvPlayerStatus);

        ivSoccerPlayer = findViewById(R.id.hl_soccer_ivPlayerPicture);
        ivVolleyballPlayer = findViewById(R.id.hl_volleyball_ivPlayerPicture);
        ivBasketballPlayer = findViewById(R.id.hl_basketball_ivPlayerPicture);

        Button btnFigo = findViewById(R.id.hl_soccer_btnFigo);
        Button btnPogba = findViewById(R.id.hl_soccer_btnPogba);
        Button btnEuijo = findViewById(R.id.hl_soccer_btnEuijo);
        Button btnYeongyung = findViewById(R.id.hl_volleyball_btnYeongyung);
        Button btnSani = findViewById(R.id.hl_volleyball_btnSani);
        Button btnJordan = findViewById(R.id.hl_basketball_btnJordan);
        Button btnJanghoon = findViewById(R.id.hl_basketball_btnJanghoon);

        btnFigo.setOnClickListener(btnClickListener);
        btnPogba.setOnClickListener(btnClickListener);
        btnEuijo.setOnClickListener(btnClickListener);
        btnYeongyung.setOnClickListener(btnClickListener);
        btnSani.setOnClickListener(btnClickListener);
        btnJordan.setOnClickListener(btnClickListener);
        btnJanghoon.setOnClickListener(btnClickListener);


        figo = new SoccerPlayer("Louis Figo",
                "Right Midfielder",
                "바르셀로나",
                "감아차기",
                R.drawable.soccer_figo, soccerPlayerListener);

        pogba = new SoccerPlayer("Paul Pogba",
                "Midfielder",
                "맨체스터 유나이티드",
                "강한 중거리 슛",
                R.drawable.soccer_pogba, soccerPlayerListener);

        euijo = new SoccerPlayer("황의조",
                "ST",
                "감바 오사카",
                "슬라이드 감차슛",
                R.drawable.soccer_euijo, soccerPlayerListener);

    }

    private View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.hl_soccer_btnFigo:
                    tvSoccerPlayerName.setText(figo.name);
                    tvSoccerPlayerPosition.setText(figo.position);
                    tvSoccerPlayerTeam.setText(figo.team);
                    tvSoccerPlayerSkill.setText(figo.skill);
                    ivSoccerPlayer.setImageResource(figo.imgSrc);
                    figo.move();
                    figo.stop();

                    break;

                case R.id.hl_soccer_btnPogba:
                    tvSoccerPlayerName.setText(pogba.name);
                    tvSoccerPlayerPosition.setText(pogba.position);
                    tvSoccerPlayerTeam.setText(pogba.team);
                    tvSoccerPlayerSkill.setText(pogba.skill);
                    ivSoccerPlayer.setImageResource(pogba.imgSrc);

                    pogba.move();
                    break;

                case R.id.hl_soccer_btnEuijo:
                    tvSoccerPlayerName.setText(euijo.name);
                    tvSoccerPlayerPosition.setText(euijo.position);
                    tvSoccerPlayerTeam.setText(euijo.team);
                    tvSoccerPlayerSkill.setText(euijo.skill);
                    ivSoccerPlayer.setImageResource(euijo.imgSrc);
                    break;

                case R.id.hl_volleyball_btnYeongyung:
                    tvVolleyballPlayerName.setText(yeongyung.name);
                    tvVolleyballPlayerTeam.setText(yeongyung.team);
                    ivVolleyballPlayer.setImageResource(yeongyung.imgSrc);
                    break;

                case R.id.hl_volleyball_btnSani:
                    tvVolleyballPlayerName.setText(sani.name);
                    tvVolleyballPlayerTeam.setText(sani.team);
                    ivVolleyballPlayer.setImageResource(sani.imgSrc);
                    break;

                case R.id.hl_basketball_btnJordan:
                    tvBasketballPlayerName.setText(jordan.name);
                    tvBasketballPlayerTeam.setText(jordan.team);
                    ivBasketballPlayer.setImageResource(jordan.imgSrc);
                    break;

                case R.id.hl_basketball_btnJanghoon:
                    tvBasketballPlayerName.setText(janghoon.name);
                    tvBasketballPlayerTeam.setText(janghoon.team);
                    ivBasketballPlayer.setImageResource(janghoon.imgSrc);
                    break;
            }
        }
    };
}
