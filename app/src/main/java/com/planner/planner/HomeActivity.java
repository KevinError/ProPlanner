package com.planner.planner;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

//Home activity with 3 options

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button gs = (Button) findViewById(R.id.gs);
        Button ls = (Button) findViewById(R.id.ls);
        Button reminders = (Button) findViewById(R.id.reminders);

        gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.this.startActivity(new Intent(HomeActivity.this,GEActivity.class));
            }
        });

        ls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.this.startActivity(new Intent(HomeActivity.this,ListScheduleActivity.class));
            }
        });
        reminders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.this.startActivity(new Intent(HomeActivity.this,ReminderActivity.class));
            }
        });
    }

    public void onBackPressed(){

    }
}
