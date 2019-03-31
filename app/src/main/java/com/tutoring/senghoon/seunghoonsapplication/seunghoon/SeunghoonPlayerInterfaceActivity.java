package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonPlayerInterfaceActivity extends AppCompatActivity {
    TextView tvSoccerPlayerName, tvSoccerPlayerPosition, tvSoccerPlayerTeam, tvSoccerPlayerSkill,
            tvVolleyballPlayerName , tvVolleyballPlayerTeam,tvBasketballPlayerName,tvBasketballPlayerTeam;
    ImageView ivSoccerPlayer, ivVolleyballPlayer,ivBasketballPlayer;



    SoccerPlayer figo = new SoccerPlayer("soccer_figo", "RM", "바르셀로나", "감아차기",R.drawable.soccer_figo);
    SoccerPlayer pogba = new SoccerPlayer("soccer_pogba", "CAM", "멘체스터 유나이티드", "중거리슛",R.drawable.soccer_pogba);
    SoccerPlayer euijo = new SoccerPlayer("soccer_euijo", "ST", "감바 오사카", "슬라이드 감차슛",R.drawable.soccer_euijo);
    VolleyballPlayer yeongyung = new VolleyballPlayer("yeongyung","엣자스바쉬",R.drawable.volleyball_yeongyung);
    VolleyballPlayer sani = new VolleyballPlayer("sani","화성 IBK 기업은행 알토스",R.drawable.volleyball_sani);
    BasketballPlayer jordan = new BasketballPlayer("jordan","시카고 불스", R.drawable.basketball_michael_jordan);
    BasketballPlayer janghoon = new BasketballPlayer("janghoon","부산 KT 소닉붐",R.drawable.basketball_janghoon);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_player_interface);
        tvSoccerPlayerName = findViewById(R.id.sh_soccer_tvNameValue);
        tvSoccerPlayerPosition = findViewById(R.id.sh_soccer_tvPositionValue);
        tvSoccerPlayerSkill = findViewById(R.id.sh_soccer_tvSkillValue);
        tvSoccerPlayerTeam = findViewById(R.id.sh_soccer_tvTeamValue);
        ivSoccerPlayer = findViewById(R.id.sh_soccer_ivPlayer);

        tvVolleyballPlayerName = findViewById(R.id.sh_volleyball_tvNameValue);
        tvVolleyballPlayerTeam = findViewById(R.id.sh_volleyball_tvTeamValue);
        ivVolleyballPlayer = findViewById(R.id.sh_volleyball_ivPlayerPicture);

        tvBasketballPlayerName = findViewById(R.id.sh_basketball_tvPlayerName);
        tvBasketballPlayerTeam = findViewById(R.id.sh_basketball_tvPlayerTeam);
        ivBasketballPlayer = findViewById(R.id.sh_basketball_ivPlayerPicture);


        Button btnFigo = findViewById(R.id.sh_soccer_btnFigo);
        Button btnPogba = findViewById(R.id.sh_soccer_btnPogba);
        Button btnEuijo = findViewById(R.id.sh_soccer_btnEuijo);
        Button btnYeongyung = findViewById(R.id.sh_volleyball_btnYeongyung);
        Button btnSani = findViewById(R.id.sh_volleyball_btnSani);
        Button btnJordan = findViewById(R.id.sh_basketball_jordan);
        Button btnJanghoon = findViewById(R.id.sh_basketball_janghoon);


        btnFigo.setOnClickListener(btnClickListener);
        btnPogba.setOnClickListener(btnClickListener);
        btnEuijo.setOnClickListener(btnClickListener);
        btnYeongyung.setOnClickListener(btnClickListener);
        btnSani.setOnClickListener(btnClickListener);
        btnJordan.setOnClickListener(btnClickListener);
        btnJanghoon.setOnClickListener(btnClickListener);

    }

    View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case R.id.sh_soccer_btnFigo:
                    tvSoccerPlayerName.setText(figo.name);
                    tvSoccerPlayerPosition.setText(figo.position);
                    tvSoccerPlayerTeam.setText(figo.team);
                    tvSoccerPlayerSkill.setText(figo.skill);
                    ivSoccerPlayer.setImageResource(figo.imgSrc);
                    break;

                case R.id.sh_soccer_btnPogba:
                    tvSoccerPlayerName.setText(pogba.name);
                    tvSoccerPlayerPosition.setText(pogba.position);
                    tvSoccerPlayerSkill.setText(pogba.skill);
                    tvSoccerPlayerTeam.setText(pogba.team);
                    ivSoccerPlayer.setImageResource(pogba.imgSrc);
                    break;

                case R.id.sh_soccer_btnEuijo:
                    tvSoccerPlayerName.setText(euijo.name);
                    tvSoccerPlayerTeam.setText(euijo.team);
                    tvSoccerPlayerPosition.setText(euijo.position);
                    tvSoccerPlayerSkill.setText(euijo.skill);
                    ivSoccerPlayer.setImageResource(euijo.imgSrc);
                    break;

                case R.id.sh_volleyball_btnYeongyung:
                    tvVolleyballPlayerName.setText(yeongyung.name);
                    tvVolleyballPlayerTeam.setText(yeongyung.team);
                    ivVolleyballPlayer.setImageResource(yeongyung.imgSrc);
                    break;

                case R.id.sh_volleyball_btnSani:
                    tvVolleyballPlayerName.setText(sani.name);
                    tvVolleyballPlayerTeam.setText(sani.team);
                    ivVolleyballPlayer.setImageResource(sani.imgSrc);
                    break;

                case R.id.sh_basketball_jordan:
                    tvBasketballPlayerName.setText(jordan.name);
                    tvBasketballPlayerTeam.setText(jordan.team);
                    ivBasketballPlayer.setImageResource(jordan.imgSrc);
                    break;

                case R.id.sh_basketball_janghoon:
                    tvBasketballPlayerName.setText(janghoon.name);
                    tvBasketballPlayerTeam.setText(janghoon.team);
                    ivBasketballPlayer.setImageResource(janghoon.imgSrc);

                    break;


            }
        }
    };

}
