package com.tutoring.senghoon.seunghoonsapplication.seunghoon;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutoring.senghoon.seunghoonsapplication.R;

import java.util.ArrayList;

class SeunghoonGalleryAdapter extends RecyclerView.Adapter<SeunghoonGalleryAdapter.SeunghoonGalleryViewHolder> {
    Context context;
    ArrayList<GalleryItem> galleryItemList = new ArrayList<GalleryItem>();
    @NonNull
    @Override
    public SeunghoonGalleryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.seunghoon_gallery_item_view, viewGroup, false);
        //뷰홀더를 만든다.
        SeunghoonGalleryViewHolder seunghoonGalleryViewHolder = new SeunghoonGalleryViewHolder(view);
        return seunghoonGalleryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SeunghoonGalleryViewHolder seunghoonGalleryViewHolder, int i) {
        //SeunghoonGalleryViewHolder에서 이미지 뷰하고 텍스트뷰에 값을 넣어준다.
        //이미지뷰와 텍스트뷰에 값을 셋한다.
        GalleryItem item = galleryItemList.get(i);
        seunghoonGalleryViewHolder.bind(item.imgResource,item.tvResourceName);
    }

    @Override
    public int getItemCount() {
        return galleryItemList.size();
    }

    //계속 바뀌게 해야함(텍스트와 이미지)
    //이미지와 텍스트가 들어가는 클래스
    //클래스로 구현된 객체를 담은 어레일 리스트를 만들고
    //그리고 바인드 함수에서 어레일 리스트에 있는 객체에서 이미지와 텍스트를 적는다!


    class SeunghoonGalleryViewHolder extends RecyclerView.ViewHolder {

        SeunghoonGalleryViewHolder (View view) {
            super(view);
           imgFile = view.findViewById(R.id.sh_galleryItemView_imgFile);
           tvFile = view.findViewById(R.id.sh_galleryItemView_tvFileName);
            // 변수선언부분과 변수셋하는 부분을 분리한다.
        }

        void bind(int imgResource,String tvResourceName) {
            // 조던. 서장훈, pogba, figo, euijo, ... dog...

            imgFile.setImageResource(imgResource);
            tvFile.setText(tvResourceName);
        }
        ImageView imgFile;
        TextView tvFile;
    }
}