package com.example.tugas3_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.nico,"Nico Satria", "1818001", "2018"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.rido,"Ridho ", "1818002", "2018"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.ichwan,"ichwan", "1818003", "2018"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.anwar,"Anwar", "1818004", "2018"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.galih,"Galih", "1818005", "2018"));
    }
}