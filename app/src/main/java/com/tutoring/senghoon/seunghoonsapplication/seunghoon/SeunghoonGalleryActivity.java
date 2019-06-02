package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.Toast;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonGalleryActivity extends AppCompatActivity {

    private final int PERMISSION_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seunghoon_gallery);

        if (!checkIfAlreadyHavePermission())
            checkPermissions();
        else
            initializeView();
    }


    private void initializeView() {
        // recycle리사이클러뷰아이디를 코드로 가져온다.
        RecyclerView recyclerView = findViewById(R.id.sh_gallery_recyclerView);
        // 레이아웃매니저를 만들고 recyclerView에 레이아웃매니저을 셋한다.
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        // 리사이클러뷰어뎁터를 만들고 셋한다.
        SeunghoonGalleryAdapter seunghoonGalleryAdapter = new SeunghoonGalleryAdapter();
        GalleryItem item1 = new GalleryItem();
        item1.imgResource = R.drawable.dog1;
        item1.tvResourceName = "개";
        seunghoonGalleryAdapter.galleryItemList.add(item1);

        GalleryItem item2 = new GalleryItem();
        item2.imgResource = R.drawable.dog2;
        item2.tvResourceName = "개2";
        seunghoonGalleryAdapter.galleryItemList.add(item2);

        GalleryItem item3 = new GalleryItem();
        item3.imgResource = R.drawable.dog3;
        item3.tvResourceName = "개3";
        seunghoonGalleryAdapter.galleryItemList.add(item3);

        GalleryItem item4 = new GalleryItem();
        item4.imgResource = R.drawable.basketball_janghoon;
        item4.tvResourceName = "서장훈";
        seunghoonGalleryAdapter.galleryItemList.add(item4);

        GalleryItem item5 = new GalleryItem();
        item5.imgResource = R.drawable.basketball_jordan;
        item5.tvResourceName = "조던";
        seunghoonGalleryAdapter.galleryItemList.add(item5);
        //어뎁터에 있는 컨텍스트에 이 엑티비티에 있는 컨텍스트를 셋한다.
        seunghoonGalleryAdapter.context = getApplicationContext();
        recyclerView.setAdapter(seunghoonGalleryAdapter);


    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void checkPermissions() {

        String[] permissions = new String[]{
                Manifest.permission.READ_EXTERNAL_STORAGE
        };

        ActivityCompat.requestPermissions(this, permissions, PERMISSION_REQUEST_CODE);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private boolean checkIfAlreadyHavePermission() {
        int result = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    initializeView();
                } else {
                    Toast.makeText(SeunghoonGalleryActivity.this, "Permission denied to read your External storage", Toast.LENGTH_SHORT).show();

                }


                break;
        }
    }
}
