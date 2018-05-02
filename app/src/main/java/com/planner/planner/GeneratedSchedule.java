
package com.planner.planner;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

//This will generate the classes for user and display it to them

public class GeneratedSchedule extends AppCompatActivity {

    private ArrayList<String> swap;
    private String clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generated_schedule);

        Bundle b = this.getIntent().getExtras();
        final String[] array=b.getStringArray("schedule");

        TextView course1 = (TextView) findViewById(R.id.course1);
        TextView course2 = (TextView) findViewById(R.id.course2);
        TextView course3 = (TextView) findViewById(R.id.course3);
        TextView course4 = (TextView) findViewById(R.id.course4);
        TextView course5 = (TextView) findViewById(R.id.course5);

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
        else if (array.length==4){
            course1.setText(array[0]);
            course2.setText(array[1]);
            course3.setText(array[2]);
            course4.setText(array[3]);
        }
        else if(array.length==5){
            course1.setText(array[0]);
            course2.setText(array[1]);
            course3.setText(array[2]);
            course4.setText(array[3]);
            course5.setText(array[4]);
        }

        if(b.getStringArrayList("swap")!=null)
            swap = b.getStringArrayList("swap");

        course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked=array[0];
                Bundle c = new Bundle();
                c.putStringArray("schedule",array);
                c.putInt("int",0);
                c.putStringArrayList("swap",swap);
                c.putString("clicked",clicked);
                Intent generate = new Intent(GeneratedSchedule.this,SwapActivity.class);
                generate.putExtras(c);
                GeneratedSchedule.this.startActivity(generate);
            }
        });

        course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked=array[1];
                Bundle c = new Bundle();
                c.putStringArray("schedule",array);
                c.putInt("int",1);
                c.putStringArrayList("swap",swap);
                c.putString("clicked",clicked);
                Intent generate = new Intent(GeneratedSchedule.this,SwapActivity.class);
                generate.putExtras(c);
                GeneratedSchedule.this.startActivity(generate);
            }
        });

        course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked=array[2];
                Bundle c = new Bundle();
                c.putStringArray("schedule",array);
                c.putInt("int",2);
                c.putStringArrayList("swap",swap);
                c.putString("clicked",clicked);
                Intent generate = new Intent(GeneratedSchedule.this,SwapActivity.class);
                generate.putExtras(c);
                GeneratedSchedule.this.startActivity(generate);
            }
        });

        course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked=array[3];
                Bundle c = new Bundle();
                c.putStringArray("schedule",array);
                c.putInt("int",3);
                c.putStringArrayList("swap",swap);
                c.putString("clicked",clicked);
                Intent generate = new Intent(GeneratedSchedule.this,SwapActivity.class);
                generate.putExtras(c);
                GeneratedSchedule.this.startActivity(generate);
            }
        });

        course5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked=array[4];
                Bundle c = new Bundle();
                c.putStringArray("schedule",array);
                c.putInt("int",4);
                c.putStringArrayList("swap",swap);
                c.putString("clicked",clicked);
                Intent generate = new Intent(GeneratedSchedule.this,SwapActivity.class);
                generate.putExtras(c);
                GeneratedSchedule.this.startActivity(generate);
            }
        });



        //save button to save schedule
        Button save = (Button) findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle b = new Bundle();
                b.putStringArray("schedule", array);
                Intent generate = new Intent(GeneratedSchedule.this,SaveToActivity.class);
                generate.putExtras(b);
                GeneratedSchedule.this.startActivity(generate);


            }
        });
    }
    public void onBackPressed(){
    }

}


