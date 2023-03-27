package com.thetechguy.maintry1;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class GuestLogin extends AppCompatActivity  {

    private Toolbar toolbar;
    EditText usernameEntere, PasswordEntere;
    Button enterSocietybtne;
    Button newVisitorBtne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.mtoolbar);
        setSupportActionBar(toolbar);

        usernameEntere= findViewById(R.id.usernameEnter);
        PasswordEntere= findViewById(R.id.PasswordEnter);
        enterSocietybtne= findViewById(R.id.enterSocietybtn);
        newVisitorBtne= findViewById(R.id.newVisitorBtn);

        newVisitorBtne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newVisitorReg();
            }
        });

    }

    private void newVisitorReg(){
        Intent intent=new Intent(GuestLogin.this, NewVisitorRegistration.class);
        startActivity(intent);
    }




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

}