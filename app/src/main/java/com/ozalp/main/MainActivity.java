package com.ozalp.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ozalp.main.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> arrayList;
    ActivityMainBinding binding;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        recyclerView = binding.recyclerView;

        arrayList = new ArrayList<>();
        arrayList.add("Samet");
        arrayList.add("ali");
        arrayList.add("veli");
        arrayList.add("49");
        arrayList.add("50");
        arrayList.add("numarası ");
        arrayList.add("belli");

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        ListAdapter listAdapter = new ListAdapter(arrayList);
        binding.recyclerView.setAdapter(listAdapter);


    }
}