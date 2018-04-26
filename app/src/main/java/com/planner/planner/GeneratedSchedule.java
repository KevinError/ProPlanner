
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
    DatabaseSchedule databaseSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generated_schedule);
        databaseSchedule = new DatabaseSchedule(this);

        Bundle b = this.getIntent().getExtras();
        final String[] array=b.getStringArray("schedule");

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

        Button save = (Button) findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = array[0];
                    if (temp.length() != 0) {
                        addData(temp);
                    } else {
                        toastMessage("You must put something in the text field!");
                    }

                GeneratedSchedule.this.startActivity(new Intent(GeneratedSchedule.this,DisplayScheduleActivity.class));

            }
        });
    }
    public void addData(String newEntry) {
        boolean insertData = databaseSchedule.addData(newEntry);

        if (insertData) {
            toastMessage("Data Successfully Inserted");
        } else {
            toastMessage("Please Try Again");
        }
    }

    /**
     * customizable toast
     * @param message
     */
    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }

}


