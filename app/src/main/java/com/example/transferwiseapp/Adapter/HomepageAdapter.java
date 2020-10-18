    package com.example.transferwiseapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.transferwiseapp.Model.HomepageModel;
import com.example.transferwiseapp.R;

import java.util.ArrayList;
import java.util.List;

public class HomepageAdapter extends RecyclerView.Adapter<HomepageAdapter.HomepageViewHolder> {

    private Context context;
    private ArrayList<HomepageModel> dataList;

    public HomepageAdapter(Context context, ArrayList<HomepageModel> dataList){
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public HomepageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       LayoutInflater layoutInflater = LayoutInflater.from(context);
       View view = layoutInflater.inflate(R.layout.layout_recyclerview_homepage, parent, false);
       return new HomepageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomepageViewHolder holder, int position) {
        final HomepageViewHolder viewHolder = holder;
        final HomepageModel model = dataList.get(position);

        viewHolder.txt_recipientname.setText(model.getTxt_recipientname());
        viewHolder.txt_amounttransfer.setText(model.getTxt_amounttransfer());
        viewHolder.txt_status.setText(model.getTxt_status());
        viewHolder.txt_convertsamount.setText(model.getTxt_convertsamount());
    }

    @Override
    public int getItemCount() {
        if (dataList != null) {
            return dataList.size();
        } else {
            return 0;
        }
    }

    public class HomepageViewHolder extends RecyclerView.ViewHolder{

        public TextView txt_recipientname, txt_amounttransfer, txt_status, txt_convertsamount;

        public HomepageViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_recipientname = itemView.findViewById(R.id.txt_recipientname);
            txt_amounttransfer = itemView.findViewById(R.id.txt_amounttransfer);
            txt_status = itemView.findViewById(R.id.txt_status);
            txt_convertsamount = itemView.findViewById(R.id.txt_convertsamount);
        }
    }
}
