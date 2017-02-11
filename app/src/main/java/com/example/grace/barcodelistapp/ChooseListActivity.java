 package com.example.grace.barcodelistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

 public class ChooseListActivity extends AppCompatActivity {
     public static ArrayList<String> listName = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_list);


        listName.add("nyobak satu");
        listName.add("yaolo");



        RecyclerView listViewer = (RecyclerView) findViewById(R.id.listViewer);

        listViewer.setAdapter(new RecyclerViewAdapter());


    }
}
