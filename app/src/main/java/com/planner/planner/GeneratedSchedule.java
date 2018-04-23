package com.planner.planner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GeneratedSchedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generated_schedule);

        Bundle b = this.getIntent().getExtras();
        String[] array=b.getStringArray("schedule");

        TextView course1 = (TextView) findViewById(R.id.course1);
        TextView course2 = (TextView) findViewById(R.id.course2);
        TextView course3 = (TextView) findViewById(R.id.course3);

        if(array.length==1){
            course1.setText(array[0]);
        }
        else if (array.length==2){
            course1.setText(array[0]);
            course2.setText(array[1]);
        }
        else if(array.length==3){
            course1.setText(array[0]);
            course2.setText(array[1]);
            course3.setText(array[2]);
        }
    }

}
