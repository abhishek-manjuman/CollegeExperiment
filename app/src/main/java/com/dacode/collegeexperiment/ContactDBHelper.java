package com.dacode.collegeexperiment;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class ContactDBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "college_info_db";
    public static final int DATABASE_VERSION = 1;

    public static final String CREATE_TABLE = "create table "+ContactContract.DataEntery.TABLE_NAME+
             "("+ContactContract.DataEntery.USER_NAME+" text,"+ContactContract.DataEntery.EMAIL+" text,"+
            ContactContract.DataEntery.PHONE+" number,"+ContactContract.DataEntery.PASSWORD+" text);";

    public static final String DROP_TABLE = "drop table if exists "+ContactContract.DataEntery.TABLE_NAME;


    public ContactDBHelper(Context context){

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("database operation","database created");

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE);
        Log.d("Database operation", "Table Created");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(DROP_TABLE);
        onCreate(db);

    }

    public void addInfoInTable(String name, String email, long phNum, String pass, SQLiteDatabase database){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ContactContract.DataEntery.USER_NAME, name);
        contentValues.put(ContactContract.DataEntery.EMAIL, email);
        contentValues.put(ContactContract.DataEntery.PHONE, phNum);
        contentValues.put(ContactContract.DataEntery.PASSWORD, pass);

        database.insert(ContactContract.DataEntery.TABLE_NAME,null, contentValues);
        Log.d("Database operation","One row inserted...");
    }
}
