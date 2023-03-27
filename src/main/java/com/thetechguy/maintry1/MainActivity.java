package com.thetechguy.maintry1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    Button guest_m,maid_g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =findViewById(R.id.mtoolbar);
        setSupportActionBar(toolbar);
        guest_m=findViewById(R.id.guest_m);
        maid_g=findViewById(R.id.maid_g);

        guest_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hrefToLogin();
            }
        });
        maid_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hrefToMaidLogin();
            }
        });

    }
    public void hrefToLogin(){
        startActivity(new Intent(MainActivity.this, GuestLogin.class));
    }
    public void hrefToMaidLogin(){
        startActivity(new Intent(MainActivity.this, MaidLogin.class));
    }
}
