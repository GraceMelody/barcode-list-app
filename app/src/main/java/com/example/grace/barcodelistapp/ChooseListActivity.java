 package com.example.grace.barcodelistapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

 public class ChooseListActivity extends AppCompatActivity {
     public static ArrayList<String> listName = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_list);

        //why can't i put this outside the oncreate? oh well
        //have to figure out some way so the arrays wont be repeated somehow after adding new list
        listName.add("nyobak satu");
        listName.add("yaolo");

//        ListView listView = (ListView) findViewById(R.id.listViewer);
//        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_layout,listName);
//        listView.setAdapter(adapter);

        RecyclerView listViewer = (RecyclerView) findViewById(R.id.listViewer);
        listViewer.setLayoutManager(new LinearLayoutManager(this));
        listViewer.setAdapter(new RecyclerViewAdapter(listName));

        FloatingActionButton newListButton = (FloatingActionButton) findViewById(R.id.newListButton);
        newListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreenIntent = new Intent(v.getContext(), NewListActivity.class);
                startActivity(nextScreenIntent);
            }
        });

    }
}
