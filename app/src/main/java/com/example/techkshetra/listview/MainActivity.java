package com.example.techkshetra.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] bands = {"Queen", "The who",
                 "System of a down",
                "AC/DC",
                "Beatles",
                "Rolling Stones",
                "kansas",
                "Bon Jovi",
                "Ramones",
                "pearle Jam",
                "nirvana",
                "Led Zeppation",
                "pink Floyed",
                "Deep purple",
                "Dream theater"};
        ListView  listview  = (ListView) findViewById(R.id.ls1);
        ArrayAdapter adapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1, bands);
        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String band  = (String) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this,"you clicked on "+band+"!",Toast.LENGTH_SHORT).show();

            }
        });

        }

    }

