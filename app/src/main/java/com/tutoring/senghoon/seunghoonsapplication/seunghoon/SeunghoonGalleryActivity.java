package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonGalleryActivity extends AppCompatActivity {

    private final int GALLERY_REQUEST_CODE = 1;

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
        RecyclerView recyclerView = findViewById(R.id.sh_gallery_recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

        SeunghoonGalleryAdapter adapter = new SeunghoonGalleryAdapter();
        recyclerView.setAdapter(adapter);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void checkPermissions() {

        String[] permissions = new String[]{
                Manifest.permission.READ_EXTERNAL_STORAGE
        };

        ActivityCompat.requestPermissions(this, permissions, GALLERY_REQUEST_CODE);
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
            case GALLERY_REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    initializeView();
                } else {
                    Toast.makeText(SeunghoonGalleryActivity.this, "Permission denied to read your External storage", Toast.LENGTH_SHORT).show();

                }


                break;
        }
    }
}
