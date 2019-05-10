package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class HayleyGalleryAdapter extends RecyclerView.Adapter<HayleyGalleryAdapter.GalleryViewHolder> {

    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hayley_gallery_item_view, parent, false);
        return new GalleryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder galleryViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 100;
    }

    class GalleryViewHolder extends RecyclerView.ViewHolder {

        GalleryViewHolder(View itemView) {
            super(itemView);
        }

    }
}
