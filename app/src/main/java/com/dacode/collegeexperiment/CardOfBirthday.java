package com.dacode.collegeexperiment;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CardOfBirthday extends AppCompatActivity {

    private String name;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_of_birthday);

       // Toast.makeText(CardOfBirthday.this,"Please enter your name", Toast.LENGTH_LONG).show();

        textView = findViewById(R.id.edit_txt_name);

        AlertDialog.Builder mAlertBuilder = new AlertDialog.Builder(CardOfBirthday.this);
        View view = getLayoutInflater().inflate(R.layout.alert_dilog_layout,null);
        final EditText editText = (EditText) view.findViewById(R.id.txt_user_name);
        Button button = (Button) view.findViewById(R.id.btn_go);

        mAlertBuilder.setView(view);
        final AlertDialog dialog = mAlertBuilder.create();
        dialog.show();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editText.getText().toString();
                textView.setText(name);

                if (name.isEmpty())
                    Toast.makeText(CardOfBirthday.this,"Please enter your name", Toast.LENGTH_LONG).show();
                else if (!name.isEmpty()){
                    dialog.dismiss();
                }

            }
        });

        //textView = (TextView)findViewById(R.id.txt_user_name);


    }
}
