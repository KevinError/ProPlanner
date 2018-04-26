package com.planner.planner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SaveToActivity extends AppCompatActivity {

    private String num;
    DatabaseSchedule databaseSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_to);

        Bundle b = this.getIntent().getExtras();
        final String[] array=b.getStringArray("schedule");


        Button saveButton1 = (Button) findViewById(R.id.saveButton1);
        Button saveButton2 = (Button) findViewById(R.id.saveButton2);
        Button saveButton3 = (Button) findViewById(R.id.saveButton3);
        Button saveButton4 = (Button) findViewById(R.id.saveButton4);
        Button saveButton5 = (Button) findViewById(R.id.saveButton5);


        saveButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num="s1";
                databaseSchedule = new DatabaseSchedule(num,SaveToActivity.this);

                for(int i=0;i<array.length;i++){
                    if(array[i]!=null){
                        addData(array[i]);
                    }
                }
                Intent intent = new Intent(SaveToActivity.this,HomeActivity.class);
                SaveToActivity.this.startActivity(intent);
                toastMessage("Saved to List of Schedules");
            }
        });
        saveButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num="s2";
                databaseSchedule = new DatabaseSchedule(num,SaveToActivity.this);

                for(int i=0;i<array.length;i++){
                    if(array[i]!=null){
                        addData(array[i]);
                    }
                }
                Intent intent = new Intent(SaveToActivity.this,HomeActivity.class);
                SaveToActivity.this.startActivity(intent);
                toastMessage("Saved to List of Schedules");
            }
        });
        saveButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num="s3";
                databaseSchedule = new DatabaseSchedule(num,SaveToActivity.this);

                for(int i=0;i<array.length;i++){
                    if(array[i]!=null){
                        addData(array[i]);
                    }
                }
                Intent intent = new Intent(SaveToActivity.this,HomeActivity.class);
                SaveToActivity.this.startActivity(intent);
                toastMessage("Saved to List of Schedules");
            }
        });
        saveButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num="s4";
                databaseSchedule = new DatabaseSchedule(num,SaveToActivity.this);

                for(int i=0;i<array.length;i++){
                    if(array[i]!=null){
                        addData(array[i]);
                    }
                }
                Intent intent = new Intent(SaveToActivity.this,HomeActivity.class);
                SaveToActivity.this.startActivity(intent);
                toastMessage("Saved to List of Schedules");
            }
        });
        saveButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num="s5";
                databaseSchedule = new DatabaseSchedule(num,SaveToActivity.this);

                for(int i=0;i<array.length;i++){
                    if(array[i]!=null){
                        addData(array[i]);
                    }
                }
                Intent intent = new Intent(SaveToActivity.this,HomeActivity.class);
                SaveToActivity.this.startActivity(intent);
                toastMessage("Saved to List of Schedules");

            }
        });



    }

    public void addData(String newEntry) {
        databaseSchedule.addData(newEntry);
    }

    /**
     * customizable toast
     * @param message
     */
    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}
