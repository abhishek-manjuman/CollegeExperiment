package com.dacode.collegeexperiment;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText txt_userid,txt_password;
    private Button btnlogin;
    ContactDBHelper contactDBHelper;
    SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_userid = (EditText)findViewById(R.id.txt_login_email);
        txt_password = (EditText)findViewById(R.id.txt_login_pass);
        btnlogin = (Button)findViewById(R.id.btn_login_login);

         contactDBHelper= new ContactDBHelper(this);
         database= contactDBHelper.getReadableDatabase();

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userid=txt_userid.getText().toString();
                String password = txt_password.getText().toString();

                if (!userid.isEmpty() && !password.isEmpty()){

                    Cursor cursor = database.rawQuery("select email,password from uaer_registration where " +ContactContract.DataEntery.EMAIL+ "=? AND "+ContactContract.DataEntery.PASSWORD+"=?", new String[]{userid,password});

                    if (cursor != null){
                        if(cursor.getCount()>0) {
                            Toast.makeText(LoginActivity.this, "Login Successfull", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(LoginActivity.this,UserDasboard.class);
                            startActivity(intent);
                        }
                        else {
                        Toast.makeText(LoginActivity.this,"Please enter correct userid and password", Toast.LENGTH_LONG).show();
                      }
                    }
                }else {
                    Toast.makeText(LoginActivity.this,"Enter userid or password!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
