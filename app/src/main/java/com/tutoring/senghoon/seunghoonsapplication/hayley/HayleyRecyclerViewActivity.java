package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tutoring.senghoon.seunghoonsapplication.R;

import java.util.ArrayList;

public class HayleyRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.hl_recyclerView_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        HayleyRecyclerViewAdapter adapter = new HayleyRecyclerViewAdapter();
        recyclerView.setAdapter(adapter);

        // 객체 만들기 : 객체타입 객체명 = new 클래스이름();
        Athlete euijo = new Athlete("황의조", "감바 오사카", R.drawable.soccer_euijo);
        Athlete pogba = new Athlete("Pogba", "맨체스터 유나이티드", R.drawable.soccer_daik);
        Athlete figo = new Athlete("Figo", "바르셀로나", R.drawable.soccer_daik);
        Athlete yeongyung = new Athlete("Yeongyung", "엣자스바쉬", R.drawable.volleyball_yeongyung);
        Athlete sani = new Athlete("Sani", "화성 IBK 기업은행 알토스", R.drawable.volleyball_sani);
        Athlete jordan = new Athlete("Jordan", "시카고불스", R.drawable.basketball_jordan);
        Athlete janghoon = new Athlete("Sanghoon", "부산 KT 소닉붐", R.drawable.basketball_janghoon);

        ArrayList<Athlete> athleteList = new ArrayList<>();
        athleteList.add(euijo);
        athleteList.add(pogba);
        athleteList.add(figo);
        athleteList.add(yeongyung);
        athleteList.add(sani);
        athleteList.add(jordan);
        athleteList.add(janghoon);

        adapter.athleteArrayList = athleteList;

    }
}