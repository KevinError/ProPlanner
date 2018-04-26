package com.planner.planner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class ListScheduleActivity extends AppCompatActivity {

    private String num="1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_schedule);


        Button s1BT = (Button) findViewById(R.id.s1BT);
        Button s2BT = (Button) findViewById(R.id.s2BT);
        Button s3BT = (Button) findViewById(R.id.s3BT);
        Button s4BT = (Button) findViewById(R.id.s4BT);
        Button s5BT = (Button) findViewById(R.id.s5BT);

        s1BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num="1";
                Intent generate = new Intent(ListScheduleActivity.this,DisplayScheduleActivity.class);
                generate.putExtra("num",num);
                ListScheduleActivity.this.startActivity(generate);
            }
        });
        s2BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num="2";
                Intent generate = new Intent(ListScheduleActivity.this,DisplayScheduleActivity.class);
                generate.putExtra("num",num);
                ListScheduleActivity.this.startActivity(generate);
            }
        });
        s3BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num="3";
                Intent generate = new Intent(ListScheduleActivity.this,DisplayScheduleActivity.class);
                generate.putExtra("num",num);
                ListScheduleActivity.this.startActivity(generate);
            }
        });
        s4BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num="4";
                Intent generate = new Intent(ListScheduleActivity.this,DisplayScheduleActivity.class);
                generate.putExtra("num",num);
                ListScheduleActivity.this.startActivity(generate);
            }
        });
        s5BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num="5";
                Intent generate = new Intent(ListScheduleActivity.this,DisplayScheduleActivity.class);
                generate.putExtra("num",num);
                ListScheduleActivity.this.startActivity(generate);
            }
        });


    }
}
