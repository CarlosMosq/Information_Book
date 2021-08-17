package com.company.informationbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private final ArrayList<String> categoryList = new ArrayList<>();
    private final ArrayList<Integer> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.categories);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

        categoryList.add("The Countries");
        categoryList.add("The Leaders");
        categoryList.add("The Museums");
        categoryList.add("Seven Wonders");

        imageList.add(R.drawable.countries);
        imageList.add(R.drawable.the_leaders);
        imageList.add(R.drawable.museums);
        imageList.add(R.drawable.the_seven_wonders);

        adapter = new RecyclerAdapter(categoryList, imageList, MainActivity.this);
        recyclerView.setAdapter(adapter);

    }
}