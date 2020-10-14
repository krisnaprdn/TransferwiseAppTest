package com.example.transferwiseapp.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomepageAdapter extends RecyclerView.Adapter<HomepageAdapter.HomepageViewHolder> {


    @NonNull
    @Override
    public HomepageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HomepageViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HomepageViewHolder extends RecyclerView.ViewHolder{

        public HomepageViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
