package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    ListView listView;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = (ListView) findViewById(R.id.lsView1);

        spinner = (Spinner) findViewById(R.id.Spin);

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Ramesh");
        names.add("Chirag");
        names.add("Chintan");
        names.add("Prem");

        ArrayAdapter<String> spinerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, names );

        spinner.setAdapter(spinerAdapter);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names );

        listView.setAdapter(adapter);

    }
}
