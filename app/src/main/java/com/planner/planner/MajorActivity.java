package com.planner.planner;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MajorActivity extends AppCompatActivity {

    private String[] array;
    private ArrayList<String> swap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);

        Spinner s = (Spinner) findViewById(R.id.spinner);

        Bundle b = this.getIntent().getExtras();
        array =b.getStringArray("schedule");

        Bundle c = this.getIntent().getExtras();
        swap = c.getStringArrayList("swap");


        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MajorActivity.this, R.layout.spinner_style, getResources().getStringArray(R.array.majors));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(myAdapter);
        s.setSelection(0, false);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Aerospace
                if(i==0){

                }
                else if(i == 1){
                    Bundle b = new Bundle();
                    b.putStringArray("schedule", array);
                    Intent generate = new Intent(MajorActivity.this,AeroActivity.class);
                    generate.putExtras(b);
                    MajorActivity.this.startActivity(generate);
                }
                //Biomedical
                else if(i==2){
                    Bundle b = new Bundle();
                    b.putStringArray("schedule", array);
                    Intent generate = new Intent(MajorActivity.this,BMEActivity.class);
                    generate.putExtras(b);
                    MajorActivity.this.startActivity(generate);
                }
                //Chemical
                else if(i==3){
                    Bundle b = new Bundle();
                    b.putStringArray("schedule", array);
                    Intent generate = new Intent(MajorActivity.this,ChemActivity.class);
                    generate.putExtras(b);
                    MajorActivity.this.startActivity(generate);
                }
                //Civil
                else if(i==4){
                    Bundle b = new Bundle();
                    b.putStringArray("schedule", array);
                    Intent generate = new Intent(MajorActivity.this,CivilActivity.class);
                    generate.putExtras(b);
                    MajorActivity.this.startActivity(generate);
                }
                //Computer Engineering
                else if(i==5){
                    Bundle b = new Bundle();
                    b.putStringArray("schedule", array);
                    Intent generate = new Intent(MajorActivity.this,CompEngrActivity.class);
                    generate.putExtras(b);
                    startActivity(generate);
                }
                //Computer Science
                else if(i==6){
                    Bundle b = new Bundle();
                    b.putStringArray("schedule", array);
                    Bundle c = new Bundle();
                    c.putStringArrayList("swap",swap);
                    Intent generate = new Intent(MajorActivity.this,CSActivity.class);
                    generate.putExtras(b);
                    generate.putExtras(c);
                    MajorActivity.this.startActivity(generate);
                }
                //Electrical
                else if(i==7){
                    Bundle b = new Bundle();
                    b.putStringArray("schedule", array);
                    Intent generate = new Intent(MajorActivity.this,EEActivity.class);
                    generate.putExtras(b);
                    MajorActivity.this.startActivity(generate);
                }
                //Mechanical
                else if(i==8){
                    Bundle b = new Bundle();
                    b.putStringArray("schedule", array);
                    Intent generate = new Intent(MajorActivity.this,MechActivity.class);
                    generate.putExtras(b);
                    startActivity(generate);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}
