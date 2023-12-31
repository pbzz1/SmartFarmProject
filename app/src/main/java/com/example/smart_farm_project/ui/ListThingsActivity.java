package com.example.smart_farm_project.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.smart_farm_project.R;
import com.example.smart_farm_project.ui.apicall.GetThings;


public class ListThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_things);

        Intent intent = getIntent();
        String url = intent.getStringExtra("listThingsURL");


        new GetThings(ListThingsActivity.this, url).execute();


    }
}

