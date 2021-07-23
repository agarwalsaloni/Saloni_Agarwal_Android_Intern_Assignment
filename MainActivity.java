package com.risingstar.courses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerMainAdapter recyclerMainAdapter;
    GridLayoutManager layoutManager;
    TextView txtSeeAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Model> dataList = new ArrayList<>();
        dataList.add(new Model(R.drawable.science,"Science","17 Courses"));
        dataList.add(new Model(R.drawable.maths,"Maths","20 Courses"));
        dataList.add(new Model(R.drawable.commerce_2,"Commerce","25 Courses"));
        dataList.add(new Model(R.drawable.arts,"Arts","12 Courses"));
        dataList.add(new Model(R.drawable.design,"Design","10 Courses"));
        dataList.add(new Model(R.drawable.architecture,"Architecture","15 Courses"));
        dataList.add(new Model(R.drawable.humanities,"Humanities","14 Courses"));
        dataList.add(new Model(R.drawable.computer,"Technology","35 Courses"));
        dataList.add(new Model(R.drawable.management,"Management","27 Courses"));
        dataList.add(new Model(R.drawable.literature,"Literature","19 Courses"));

        recyclerView = findViewById(R.id.recyclerView);
        txtSeeAll = findViewById(R.id.txtSeeAll);

        recyclerMainAdapter = new RecyclerMainAdapter(this,dataList);
        layoutManager = new GridLayoutManager(this,2);

        recyclerView.setAdapter(recyclerMainAdapter);
        recyclerView.setLayoutManager(layoutManager);

        txtSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"No more categories",Toast.LENGTH_SHORT).show();
            }
        });
    }
}