package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonPlayerInterfaceActivity extends AppCompatActivity {
    TextView tvSoccerPlayerName, tvSoccerPlayerPosition, tvSoccerPlayerTeam, tvSoccerPlayerSkill, tvSoccerPlayerStatus,
            tvVolleyballPlayerName , tvVolleyballPlayerTeam,tvBasketballPlayerName,tvBasketballPlayerTeam, tvVolleyballPlayerStatus, tvBasketballPlayerStatus;
    ImageView ivSoccerPlayer, ivVolleyballPlayer,ivBasketballPlayer;

    SoccerPlayer.SoccerPlayerListner soccerPlayerListner =  new SoccerPlayer.SoccerPlayerListner() {
        @Override
        public void finish(String name) {
            tvSoccerPlayerStatus.setText(name + " is hero!!!!!!!");
        }
    };

    VolleyballPlayer.VolleyballPlayerListener volleyballPlayerListener = new VolleyballPlayer.VolleyballPlayerListener() {
        @Override
        public void end(String name) {
            tvVolleyballPlayerStatus.setText(name + "done");
        }
    };
    BasketballPlayer.BasketballPlayerListener basketballPlayerListener = new BasketballPlayer.BasketballPlayerListener() {
        @Override
        public void status(String name,String status) {
            tvBasketballPlayerStatus.setText(name + "의 " + status + "is okay");
        }
    };

    SoccerPlayer figo = new SoccerPlayer("soccer_figo", "RM", "바르셀로나", "감아차기",R.drawable.soccer_figo,soccerPlayerListner);
    SoccerPlayer pogba = new SoccerPlayer("soccer_daik", "CAM", "멘체스터 유나이티드", "중거리슛",R.drawable.soccer_daik,soccerPlayerListner);
    SoccerPlayer euijo = new SoccerPlayer("soccer_euijo", "ST", "감바 오사카", "슬라이드 감차슛",R.drawable.soccer_euijo,soccerPlayerListner);
    VolleyballPlayer yeongyung = new VolleyballPlayer("yeongyung","엣자스바쉬",R.drawable.volleyball_yeongyung, volleyballPlayerListener);
    VolleyballPlayer sani = new VolleyballPlayer("sani","화성 IBK 기업은행 알토스",R.drawable.volleyball_sani,volleyballPlayerListener);
    BasketballPlayer jordan = new BasketballPlayer("jordan","시카고 불스", R.drawable.basketball_jordan,basketballPlayerListener);
    BasketballPlayer janghoon = new BasketballPlayer("janghoon","부산 KT 소닉붐",R.drawable.basketball_janghoon,basketballPlayerListener);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_player_interface);
        tvSoccerPlayerName = findViewById(R.id.sh_soccer_tvNameValue);
        tvSoccerPlayerPosition = findViewById(R.id.sh_soccer_tvPositionValue);
        tvSoccerPlayerSkill = findViewById(R.id.sh_soccer_tvSkillValue);
        tvSoccerPlayerTeam = findViewById(R.id.sh_soccer_tvTeamValue);
        ivSoccerPlayer = findViewById(R.id.sh_soccer_ivPlayer);
        tvSoccerPlayerStatus = findViewById(R.id.sh_soccer_tvPlayerStatus);

        tvVolleyballPlayerName = findViewById(R.id.sh_volleyball_tvNameValue);
        tvVolleyballPlayerTeam = findViewById(R.id.sh_volleyball_tvTeamValue);
        ivVolleyballPlayer = findViewById(R.id.sh_volleyball_ivPlayerPicture);
        tvVolleyballPlayerStatus = findViewById(R.id.sh_volleyball_tvPlayerStatus);

        tvBasketballPlayerName = findViewById(R.id.sh_basketball_tvPlayerName);
        tvBasketballPlayerTeam = findViewById(R.id.sh_basketball_tvPlayerTeam);
        ivBasketballPlayer = findViewById(R.id.sh_basketball_ivPlayerPicture);
        tvBasketballPlayerStatus = findViewById(R.id.sh_basketball_tvPalyerStatus);


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
                    figo.move();
                    break;

                case R.id.sh_soccer_btnPogba:
                    tvSoccerPlayerName.setText(pogba.name);
                    tvSoccerPlayerPosition.setText(pogba.position);
                    tvSoccerPlayerSkill.setText(pogba.skill);
                    tvSoccerPlayerTeam.setText(pogba.team);
                    ivSoccerPlayer.setImageResource(pogba.imgSrc);
                    pogba.move();
                    break;

                case R.id.sh_soccer_btnEuijo:
                    tvSoccerPlayerName.setText(euijo.name);
                    tvSoccerPlayerTeam.setText(euijo.team);
                    tvSoccerPlayerPosition.setText(euijo.position);
                    tvSoccerPlayerSkill.setText(euijo.skill);
                    ivSoccerPlayer.setImageResource(euijo.imgSrc);
                    euijo.move();
                    break;

                case R.id.sh_volleyball_btnYeongyung:
                    tvVolleyballPlayerName.setText(yeongyung.name);
                    tvVolleyballPlayerTeam.setText(yeongyung.team);
                    ivVolleyballPlayer.setImageResource(yeongyung.imgSrc);
                    yeongyung.move();
                    yeongyung.stop();
                    break;

                case R.id.sh_volleyball_btnSani:
                    tvVolleyballPlayerName.setText(sani.name);
                    tvVolleyballPlayerTeam.setText(sani.team);
                    ivVolleyballPlayer.setImageResource(sani.imgSrc);
                    sani.stop();
                    sani.move();
                    break;

                case R.id.sh_basketball_jordan:
                    tvBasketballPlayerName.setText(jordan.name);
                    tvBasketballPlayerTeam.setText(jordan.team);
                    ivBasketballPlayer.setImageResource(jordan.imgSrc);

                    jordan.move();
                    break;

                case R.id.sh_basketball_janghoon:
                    tvBasketballPlayerName.setText(janghoon.name);
                    tvBasketballPlayerTeam.setText(janghoon.team);
                    ivBasketballPlayer.setImageResource(janghoon.imgSrc);
                    janghoon.stop();

                    break;


            }
        }
    };

}
