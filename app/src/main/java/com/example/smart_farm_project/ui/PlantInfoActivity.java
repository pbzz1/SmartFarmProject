package com.example.smart_farm_project.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.smart_farm_project.R;

import java.util.ArrayList;

public class PlantInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_info);

        ArrayList<String> testDataSet = new ArrayList<>();
        testDataSet.add("고추:15도에서 25도 사이에서 키우는 것으 추천드립니다!");
        testDataSet.add("상추:15도에서 20도 사이에서 키우는 것으 추천드립니다!");
        testDataSet.add("상추:13도에서 28도 사이에서 키우는 것으 추천드립니다!");
        //========================================================

        RecyclerView recyclerView = findViewById(R.id.plantRecyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context) this);
        recyclerView.setLayoutManager(linearLayoutManager);  // LayoutManager 설정

        CustomAdapter customAdapter = new CustomAdapter(testDataSet);
        recyclerView.setAdapter(customAdapter); // 어댑터 설정

    }
}