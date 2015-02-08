package com.vogella.android.lifecycle.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.willy.myapplication.R;

public class MainActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // configure the spinner in code
//        Spinner spinner = (Spinner) findViewById(R.id.spinner);
//        String[] values = getResources().getStringArray(R.array.operating_systems);
//        ArrayAdapter<String> adapter =
//                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
//        spinner.setAdapter(adapter);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
