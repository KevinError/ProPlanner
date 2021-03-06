package com.planner.planner;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DisplayScheduleActivity extends AppCompatActivity {

    private static final String TAG = "DisplayScheduleActivity";

    DatabaseSchedule databaseSchedule;

    private ListView mListView;

    private String key;
    private String schedule;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_schedule);
        mListView = (ListView) findViewById(R.id.schedule1);




        Intent intent = getIntent();
        key = intent.getExtras().getString("num");

        switch (key){
            case ("1"):
                schedule="s1";
                break;
            case ("2"):
                schedule="s2";
                break;
            case ("3"):
                schedule="s3";
                break;
            case ("4"):
                schedule="s4";
                break;
            case ("5"):
                schedule="s5";
                break;
        }

        databaseSchedule = new DatabaseSchedule(schedule,this);


        populateListView();
    }

    private void populateListView() {
        Log.d(TAG, "populateListView: Displaying data in the ListView.");

        //get the data and append to a list
        Cursor data = databaseSchedule.getData();
        ArrayList<String> listData = new ArrayList<>();
        while(data.moveToNext()){
            //get the value from the database in column 1
            //then add it to the ArrayList
            listData.add(data.getString(1));
        }
        //create the list adapter and set the adapter
        ListAdapter adapter = new ArrayAdapter<String>(DisplayScheduleActivity.this, R.layout.custom_textview, listData);
        mListView.setAdapter(adapter);

    }

    /**
     * customizable toast
     * @param message
     */
    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}