package com.thetechguy.maintry1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class NewVisitorRegistration extends AppCompatActivity {

    private Toolbar toolbar;
    EditText nameReg, bldgReg, vnoReg, phoneReg;
    Button NewVisRegBtn;
    Boolean result;
    String name, phone, vno, bldg;
    FirebaseAuth authentication;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_visitor_registration);
        setupUIViews();

        toolbar=findViewById(R.id.mtoolbar);
        setSupportActionBar(toolbar);

        NewVisRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(itworks()){

                }
            }
        });

    }

    private void setupUIViews(){
        nameReg=findViewById(R.id.et_regName);
        phoneReg=findViewById(R.id.et_regPhone);
        bldgReg=findViewById(R.id.et_regBldg);
        vnoReg=findViewById(R.id.et_regVno);
        NewVisRegBtn=findViewById(R.id.RegNewVisBtn);
    }
    private Boolean itworks(){
        result= false;

        name=nameReg.getText().toString();
        phone=phoneReg.getText().toString();
        bldg=bldgReg.getText().toString();
        vno=vnoReg.getText().toString();

        if(name.isEmpty() && phone.isEmpty() && bldg.isEmpty() && vno.isEmpty()){
            Toast.makeText(NewVisitorRegistration.this, "Please enter all the details", Toast.LENGTH_SHORT).show();
        }else{
            result=true;
        }
        return result;
    }
}
