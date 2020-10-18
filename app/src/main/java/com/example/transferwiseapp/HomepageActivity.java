package com.example.transferwiseapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.transferwiseapp.Adapter.HomepageAdapter;
import com.example.transferwiseapp.Model.HomepageModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomepageActivity extends AppCompatActivity {

    private LinearLayoutManager layoutManager;
    private HomepageAdapter adapter;
    private List<HomepageModel> list = new ArrayList<>();

    @BindView(R.id.rv_homepage)
    RecyclerView rv_homepage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        ButterKnife.bind(this);
//        initLiveData();
        initRecyclerView();
    }

    public void initRecyclerView(){
        this.rv_homepage = (RecyclerView) findViewById(R.id.rv_homepage);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        this.rv_homepage.setLayoutManager(mLayoutManager);
        adapter = new HomepageAdapter(this, list);
        this.rv_homepage.setAdapter(adapter);
    }

//    public void initLiveData(){
//        HomepageModel list = new HomepageModel("Krisna Perdana", "200.000 IDR", "Completed", "About 13.6 USD");
//        list.add(list);
//        HomepageModel list = new HomepageModel("Krisna Perdana", "200.000 IDR", "Completed", "About 13.6 USD");
//        list.add(list);
//        HomepageModel list = new HomepageModel("Krisna Perdana", "200.000 IDR", "Completed", "About 13.6 USD");
//        list.add(list);
//        HomepageModel list = new HomepageModel("Krisna Perdana", "200.000 IDR", "Completed", "About 13.6 USD");
//        list.add(list);
//        HomepageModel list = new HomepageModel("Krisna Perdana", "200.000 IDR", "Completed", "About 13.6 USD");
//        list.add(list);
//
//    }
}