
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

public class GeneratedSchedule extends AppCompatActivity {

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

}


