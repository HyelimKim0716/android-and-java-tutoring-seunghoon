package com.tutoring.senghoon.seunghoonsapplication.hayley;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

import java.util.ArrayList;

public class HayleyGalleryAdapter extends RecyclerView.Adapter<HayleyGalleryAdapter.GalleryViewHolder> {

    ArrayList<HayleyGalleryItem> galleryItemList = new ArrayList<>();

    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hayley_gallery_item_view, parent, false);
        return new GalleryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder galleryViewHolder, int position) {
        HayleyGalleryItem item = galleryItemList.get(position);
        galleryViewHolder.bind(item);

    }

    @Override
    public int getItemCount() {
        return galleryItemList.size();
    }

    class GalleryViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvFileName;

        GalleryViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.hl_galleryItemView_imgFile);
            tvFileName = itemView.findViewById(R.id.hl_galleryItemView_tvFileName);

        }

        void bind(HayleyGalleryItem item) {
            imageView.setImageResource(item.imageResourceId);
            tvFileName.setText(item.fileName);
        }


    }
}
