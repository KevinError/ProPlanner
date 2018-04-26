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

public class MajorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);

        Spinner s = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MajorActivity.this, R.layout.spinner_style, getResources().getStringArray(R.array.majors));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(myAdapter);
        s.setSelection(0, false);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Aerospace
                if(i == 0){
                    startActivity(new Intent(MajorActivity.this, CSActivity.class));
                }
                //Biomedical
                else if(i==1){
                    startActivity(new Intent(MajorActivity.this, BMEActivity.class));
                }
                //Chemical
                else if(i==2){
                    startActivity(new Intent(MajorActivity.this, ChemActivity.class));
                }
                //Civil
                else if(i==3){
                    startActivity(new Intent(MajorActivity.this, CSActivity.class));
                }
                //Computer Engineering
                else if(i==4){
                    startActivity(new Intent(MajorActivity.this, CompEngrActivity.class));
                }
                //Computer Science
                else if(i==5){
                    startActivity(new Intent(MajorActivity.this, CSActivity.class));
                }
                //Eletrical
                else if(i==6){
                    startActivity(new Intent(MajorActivity.this, CSActivity.class));
                }
                //Mechnical
                else if(i==7){
                    startActivity(new Intent(MajorActivity.this, CSActivity.class));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}
