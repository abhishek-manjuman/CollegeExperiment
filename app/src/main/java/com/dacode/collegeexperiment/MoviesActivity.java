package com.dacode.collegeexperiment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MoviesActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        radioGroup = findViewById(R.id.radio_group);
        button = findViewById(R.id.btn_movie_next);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                Toast.makeText(MoviesActivity.this,radioButton.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
