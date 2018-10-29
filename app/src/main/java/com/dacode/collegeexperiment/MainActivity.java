package com.dacode.collegeexperiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_exp1,btn_exp2,btn_exp3,_btn_exp4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClickExp1(View v){

        Intent intent = new Intent(this,WelcomeActivity.class);
        startActivity(intent);


    }
    public void onBtnClickExp2(View v){

        Intent intent = new Intent(this,CardOfBirthday.class);
        startActivity(intent);


    }
    public void onBtnClickExp3(View v){

        Intent intent = new Intent(this,ArithmeticCalculator.class);
        startActivity(intent);


    }
    public void onBtnClickExp4(View v){

        Intent intent = new Intent(this,UserRegistration.class);
        startActivity(intent);


    }

}
