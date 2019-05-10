package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutoring.senghoon.seunghoonsapplication.R;

public class SeunghoonGalleryAdapter extends RecyclerView.Adapter<SeunghoonGalleryAdapter.GalleryViewHolder> {

    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.seunghoon_gallery_item_view,parent,false);
        return new GalleryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class GalleryViewHolder extends RecyclerView.ViewHolder {

        GalleryViewHolder(View itemView) {
            super(itemView);
        }
    }

}
