package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tutoring.senghoon.seunghoonsapplication.R;

import java.util.ArrayList;

public class SeunghoonRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.sh_recyclerView_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        SeunghoonRecyclerViewAdapter adapter = new SeunghoonRecyclerViewAdapter();
        recyclerView.setAdapter(adapter);

        Athlete euijo = new Athlete("euijo", "감바 오사카", R.drawable.soccer_euijo);
        Athlete pogba = new Athlete("pogba", "맨체스터 유나이티드", R.drawable.soccer_pogba);
        Athlete figo = new Athlete("figo", "바르셀로나", R.drawable.soccer_figo);
        Athlete yeongyung = new Athlete("yeongyung","엣자스바쉬",R.drawable.volleyball_yeongyung);
        Athlete sani = new Athlete("sani","화성 IBK 기업은행 알토스",R.drawable.volleyball_sani);
        Athlete jorden = new Athlete("jorden","시카고 불스",R.drawable.basketball_jordan);
        Athlete janghoon = new Athlete("janghoon","부산 KT 소닉붐",R.drawable.basketball_janghoon);

        ArrayList<Athlete> athleteList = new ArrayList<>();
        athleteList.add(euijo);
        athleteList.add(pogba);
        athleteList.add(figo);
        athleteList.add(yeongyung);
        athleteList.add(sani);
        athleteList.add(jorden);
        athleteList.add(janghoon);

        for (int i = 0; i < 3; i++) {
            System.out.println("name:" + athleteList.get(i).name
                    + "team:" + athleteList.get(i).team);

        }
        adapter.athleteArrayList = athleteList;
    }
}