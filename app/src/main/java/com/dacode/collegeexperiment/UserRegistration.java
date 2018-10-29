package com.dacode.collegeexperiment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserRegistration extends AppCompatActivity {

    private EditText name,email,phnumber,password;
    private Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        name = (EditText) findViewById(R.id.txt_name);
        email = (EditText) findViewById(R.id.txt_email);
        phnumber = (EditText) findViewById(R.id.txt_phone);
        password = (EditText) findViewById(R.id.txt_pass);
    }
    public void userReg(View view){

        String nam=name.getText().toString();
        String mail=email.getText().toString();
        String phone=phnumber.getText().toString();
        String pass=password.getText().toString();

        if(nam.isEmpty() || mail.isEmpty() || phone.isEmpty() || pass.isEmpty())

            Toast.makeText(UserRegistration.this,"Please fill all filds!", Toast.LENGTH_LONG).show();
        else{

            ContactDBHelper contactDBHelper = new ContactDBHelper(this);
            SQLiteDatabase database = contactDBHelper.getWritableDatabase();//only for learning not to impliment in real world application
            contactDBHelper.addInfoInTable(nam,mail,Long.parseLong(phone),pass,database);
            contactDBHelper.close();

            name.setText("");
            email.setText("");
            phnumber.setText("");
            password.setText("");

            Intent intent = new Intent(this,RegistrationConfermetion.class);
            intent.putExtra("name",nam);
            startActivity(intent);

            Toast.makeText(UserRegistration.this,"Informetion saved successfuly",Toast.LENGTH_LONG).show();
        }
    }

    public void toLogin(View view){

        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);

    }
}
