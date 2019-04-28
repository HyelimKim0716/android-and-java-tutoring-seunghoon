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

public class SeunghoonRecyclerViewAdapter extends RecyclerView.Adapter<SeunghoonRecyclerViewAdapter.RecyclerViewViewHolder> {

ArrayList<Athlete> athleteArrayList;
    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.seounghoon_recyclerview_item_view, parent, false);
        return new RecyclerViewViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        holder.bind(athleteArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return athleteArrayList.size();
    }

    class RecyclerViewViewHolder extends  RecyclerView.ViewHolder {
        ImageView imgAthlete;
        TextView tvAthleteName;
        TextView tvTeam;
        RecyclerViewViewHolder(View itemView) {
            super(itemView);
            imgAthlete = itemView.findViewById(R.id.sh_recyclerViewItem_imgAthlete);
            tvAthleteName = itemView.findViewById(R.id.sh_recyclerViewItem_tvAthleteName);
            tvTeam = itemView.findViewById(R.id.sh_recyclerViewItem_tvTeam);


        }
        void bind(Athlete athlete) {
         imgAthlete.setImageResource(athlete.imgSrc);
         tvAthleteName.setText(athlete.name);
         tvTeam.setText(athlete.team);
        }
    }
}
