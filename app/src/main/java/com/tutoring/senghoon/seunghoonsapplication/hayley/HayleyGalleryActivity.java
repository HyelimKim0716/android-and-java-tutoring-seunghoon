package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.tutoring.senghoon.seunghoonsapplication.R;

import java.io.File;
import java.util.ArrayList;

public class HayleyGalleryActivity extends AppCompatActivity {

    private final int PERMISSION_REQUEST_CODE = 1;
    private final int GALLERY_REQUEST_CODE = 2;

    HayleyGalleryAdapter adapter = new HayleyGalleryAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayley_gallery);

        if (!checkIfAlreadyHavePermission())
            checkPermissions();
        else
            initializeView();
    }

    private void initializeView() {
        RecyclerView recyclerView = findViewById(R.id.hl_gallery_recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));

        recyclerView.setAdapter(adapter);

//        getImagesFromGallery();

//        getStoredImages();




        HayleyGalleryItem item1 = new HayleyGalleryItem();
        item1.imageResourceId = R.drawable.basketball_janghoon;
        item1.fileName = "서장훈";
        adapter.galleryItemList.add(item1);

        HayleyGalleryItem item2 = new HayleyGalleryItem();
        item2.imageResourceId = R.drawable.soccer_pogba;
        item2.fileName = "Pogba";
        adapter.galleryItemList.add(item2);

        HayleyGalleryItem item3 = new HayleyGalleryItem();
        item1.imageResourceId = R.drawable.dog1;
        item1.fileName = "Dog1";
        adapter.galleryItemList.add(item3);

        HayleyGalleryItem item4 = new HayleyGalleryItem();
        item2.imageResourceId = R.drawable.dog2;
        item2.fileName = "Dog2";
        adapter.galleryItemList.add(item4);
    }

    private void getStoredImages() {
        try {
            File imgPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM + "/Camera");

            for (int i = 0; i < 10; i++) {
                if (imgPath.listFiles().length <= i) return;
                File file = imgPath.listFiles()[i];
                BitmapFactory.Options options = new BitmapFactory.Options();
                Bitmap originalBitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), options);

                HayleyGalleryItem item = new HayleyGalleryItem();
                item.imgBitmap = Bitmap.createScaledBitmap(originalBitmap, 100, 100, true);
                item.fileName = file.getName();
                adapter.galleryItemList.add(item);
            }

            adapter.notifyDataSetChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void getImagesFromGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        String[] mimeTypes = {"image/jpeg", "image/png"};
        intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
        startActivityForResult(intent, GALLERY_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case GALLERY_REQUEST_CODE:
                if (resultCode == Activity.RESULT_OK) {
                    if (data != null && data.getData() != null) {
                        Uri selectedImageUri = data.getData();
                        HayleyGalleryItem item = new HayleyGalleryItem();
//                        item.imageUri = selectedImageUri;
//                        item.imageName = "hello";
//                        adapter.galleryItems.add(item);
//                        adapter.notifyDataSetChanged();
                    }
                    break;
                }
        }
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
                    Toast.makeText(HayleyGalleryActivity.this, "Permission denied to read your External storage", Toast.LENGTH_SHORT).show();

                }


                break;
        }
    }
}
