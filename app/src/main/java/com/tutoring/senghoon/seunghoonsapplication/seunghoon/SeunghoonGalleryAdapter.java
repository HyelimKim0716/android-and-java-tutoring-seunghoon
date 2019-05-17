package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

import java.util.ArrayList;

public class SeunghoonGalleryAdapter extends RecyclerView.Adapter<SeunghoonGalleryAdapter.GalleryViewHolder> {

    ArrayList<SeunghoonGalleryItem> galleryItemList = new ArrayList<>();

    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.seunghoon_gallery_item_view,parent,false);
        return new GalleryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder holder, int position) {
        SeunghoonGalleryItem item = galleryItemList.get(position);
        holder.bind(item);
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
            imageView = itemView.findViewById(R.id.sh_galleryItemView_imgFile);
           tvFileName = itemView.findViewById(R.id.sh_galleryItemView_tvFileName);
        }
        void bind(SeunghoonGalleryItem item) {
            imageView.setImageResource(item.imageResourceId);
            tvFileName.setText(item.fileName);
        }


    }

}
