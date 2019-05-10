package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonGalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_gallery);

        RecyclerView recyclerView = findViewById(R.id.sh_gallery_recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

        SeunghoonGalleryAdapter adapter = new SeunghoonGalleryAdapter();
        recyclerView.setAdapter(adapter);
    }
}
