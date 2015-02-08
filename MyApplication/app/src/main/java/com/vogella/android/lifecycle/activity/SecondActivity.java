package com.vogella.android.lifecycle.activity;

/**
 * Created by WILLY on 2/5/2015.
 */
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import com.example.willy.myapplication.R;

public class SecondActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}