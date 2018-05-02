package com.planner.planner;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class SwapActivity extends AppCompatActivity {

    private String TAG = "SWAP";

    private ArrayList<String> swap = new ArrayList<>();
    private int num;
    private String clicked;
    private String[] schedule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap);

        Bundle c = this.getIntent().getExtras();
        swap = c.getStringArrayList("swap");
        num=c.getInt("int");
        clicked = c.getString("clicked");
        schedule = c.getStringArray("schedule");


        final RadioGroup rgp = (RadioGroup) findViewById(R.id.radio_group);
        int buttons = swap.size();
        String temp;
        for (int i = 0; i < buttons ; i++) {
            temp =swap.get(i);
            RadioButton rbn = new RadioButton(this);
            rbn.setId(i+100);
            rbn.setText(temp);
            rgp.addView(rbn);
        }

        rgp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rgp.getCheckedRadioButtonId()!=-1)
                {
                    int id= rgp.getCheckedRadioButtonId();
                    View radioButton = rgp.findViewById(id);
                    int radioId = rgp.indexOfChild(radioButton);
                    RadioButton btn = (RadioButton) rgp.getChildAt(radioId);
                    String selection = (String) btn.getText();
                    //change the courses that have not taken
                    swap.remove(selection);
                    swap.add(clicked);

                    //set 5 classes to the swapped one
                    schedule[num] = selection;

                    //send it back
                    Bundle b = new Bundle();
                    b.putStringArray("schedule", schedule);
                    b.putStringArrayList("swap",swap);
                    Intent generate = new Intent(SwapActivity.this,GeneratedSchedule.class);
                    generate.putExtras(b);
                    SwapActivity.this.startActivity(generate);

                }
            }
        });



    }

}
