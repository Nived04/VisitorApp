package com.thetechguy.maintry1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class EnteredSociety extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enteredsociety);

        toolbar = findViewById(R.id.mtoolbar);
        setSupportActionBar(toolbar);
    }
}

