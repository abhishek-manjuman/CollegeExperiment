package com.dacode.collegeexperiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegistrationConfermetion extends AppCompatActivity {

    private TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_confermetion);

        name = (TextView)findViewById(R.id.print_user_name);
        String nam = getIntent().getExtras().getString("name");
        name.setText(nam);

    }

    public void goToLoginPage(View view){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
