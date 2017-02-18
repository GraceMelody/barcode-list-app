package com.example.grace.barcodelistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewListActivity extends AppCompatActivity {
    EditText saveText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_list);


        saveText = (EditText) findViewById(R.id.textName);
        Button okButton = (Button) findViewById(R.id.ok_button);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //makes new list in database
                Intent refreshedList = new Intent(v.getContext(), ChooseListActivity.class);
                //is this how i pass the variable to the arraylist later on?
                String str = saveText.getText().toString();
                ChooseListActivity.listName.add(str);
                startActivity(refreshedList);
            }
        });


    }

}
