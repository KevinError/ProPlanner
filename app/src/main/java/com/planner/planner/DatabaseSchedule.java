package com.planner.planner;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

//Database for the schedule function

public class DatabaseSchedule extends SQLiteOpenHelper {

    private static final String TAG = "DatabaseSchedule";

    private String tName;
    private static final String COL1 = "ID";
    private static final String COL2 = "name";


    public DatabaseSchedule(String name ,Context context) {
        super(context, name, null, 1);
        tName=name;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + tName + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL2 +" TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP IF TABLE EXISTS " + tName);
        onCreate(db);
    }

    public boolean addData(String item) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, item);

        Log.d(TAG, "addData: Adding " + item + " to " + tName);

        long result = db.insert(tName, null, contentValues);

        //if date as inserted incorrectly it will return -1
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Returns all the data from database
     * @return
     */
    public Cursor getData(){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM " + tName;
        Cursor data = db.rawQuery(query, null);
        return data;
    }




    public void dropTable(String t){
        Log.d(TAG,"before");
        SQLiteDatabase db = this.getWritableDatabase();
        Log.d(TAG,"before2");
        db.execSQL("DROP TABLE "+t);
        Log.d(TAG,"after");
        onCreate(db);
        Log.d(TAG,"after2");
    }

}