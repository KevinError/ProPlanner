package com.planner.planner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class EEActivity extends AppCompatActivity {

    private ArrayList<Course> selection = new ArrayList<>();
    private ArrayList<Course> allCourses = new ArrayList<>();
    private ArrayList<Course> schedule = new ArrayList<>();
    private Course CECS100,MATH122,MATH123,MATH224,MATH370A,PHYS151,PHYS152,PHYS254,ENGR101,ENGR102;
    private Course EE186,EE200,EE201,EE202,EE211,EE211L,EE301,EE310,EE330,EE346;
    private Course EE350,EE360,EE370,EE370L,EE380,EE382,EE386,EE400D,EE430,EE430L;

    private String[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee);
        init();

        Bundle b = this.getIntent().getExtras();
        array=b.getStringArray("schedule");

        allCourses.add(MATH122);
        allCourses.add(MATH123);
        allCourses.add(MATH224);
        allCourses.add(MATH370A);

        allCourses.add(PHYS151);
        allCourses.add(PHYS152);
        allCourses.add(PHYS254);

        allCourses.add(ENGR101);
        allCourses.add(ENGR102);

        allCourses.add(CECS100);

        allCourses.add(EE186);
        allCourses.add(EE200);
        allCourses.add(EE201);
        allCourses.add(EE202);

        allCourses.add(EE211);
        allCourses.add(EE211L);

        allCourses.add(EE301);
        allCourses.add(EE310);
        allCourses.add(EE330);

        allCourses.add(EE346);
        allCourses.add(EE350);
        allCourses.add(EE360);

        allCourses.add(EE370);
        allCourses.add(EE370L);

        allCourses.add(EE380);
        allCourses.add(EE382);
        allCourses.add(EE386);

        allCourses.add(EE400D);

        allCourses.add(EE430);
        allCourses.add(EE430L);
    }

    public void selectItemEE(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.ECECS100:
                if(checked) selection.add(CECS100);
                else selection.remove(CECS100);
                break;

            case R.id.EMATH122:
                if(checked) selection.add(MATH122);
                else selection.remove(MATH122);
                break;

            case R.id.EMATH123:
                if(checked) selection.add(MATH123);
                else selection.remove(MATH123);
                break;

            case R.id.EMATH224:
                if(checked) selection.add(MATH224);
                else selection.remove(MATH224);
                break;

            case R.id.EMATH370A:
                if(checked) selection.add(MATH370A);
                else selection.remove(MATH370A);
                break;

            case R.id.EPHYS151:
                if(checked) selection.add(PHYS151);
                else selection.remove(PHYS151);
                break;

            case R.id.EPHYS152:
                if(checked) selection.add(PHYS152);
                else selection.remove(PHYS152);
                break;

            case R.id.EPHYS254:
                if(checked) selection.add(PHYS254);
                else selection.remove(PHYS254);
                break;

            case R.id.EENGR101:
                if(checked) selection.add(ENGR101);
                else selection.remove(ENGR101);
                break;

            case R.id.EENGR102:
                if(checked) selection.add(ENGR102);
                else selection.remove(ENGR102);
                break;
            case R.id.EEE186:
                if(checked) selection.add(EE186);
                else selection.remove(EE186);
                break;
            case R.id.EEE200:
                if(checked) selection.add(EE200);
                else selection.remove(EE200);
                break;
            case R.id.EEE201:
                if(checked) selection.add(EE201);
                else selection.remove(EE201);
                break;
            case R.id.EEE202:
                if(checked) selection.add(EE202);
                else selection.remove(EE202);
                break;
            case R.id.EEE211:
                if(checked) selection.add(EE211);
                else selection.remove(EE211);
                break;
            case R.id.EEE211L:
                if(checked) selection.add(EE211L);
                else selection.remove(EE211L);
                break;
            case R.id.EEE301:
                if(checked) selection.add(EE301);
                else selection.remove(EE301);
                break;
            case R.id.EEE310:
                if(checked) selection.add(EE310);
                else selection.remove(EE310);
                break;
            case R.id.EEE330:
                if(checked) selection.add(EE330);
                else selection.remove(EE330);
                break;
            case R.id.EEE346:
                if(checked) selection.add(EE346);
                else selection.remove(EE346);
                break;
            case R.id.EEE350:
                if(checked) selection.add(EE350);
                else selection.remove(EE350);
                break;
            case R.id.EEE360:
                if(checked) selection.add(EE360);
                else selection.remove(EE360);
                break;
            case R.id.EEE370:
                if(checked) selection.add(EE370);
                else selection.remove(EE370);
                break;
            case R.id.EEE370L:
                if(checked) selection.add(EE370L);
                else selection.remove(EE370L);
                break;
            case R.id.EEE380:
                if(checked) selection.add(EE380);
                else selection.remove(EE380);
                break;
            case R.id.EEE382:
                if(checked) selection.add(EE382);
                else selection.remove(EE382);
                break;
            case R.id.EEE386:
                if(checked) selection.add(EE386);
                else selection.remove(EE386);
                break;
            case R.id.EEE400D:
                if(checked) selection.add(EE400D);
                else selection.remove(EE400D);
                break;
            case R.id.EEE430:
                if(checked) selection.add(EE430);
                else selection.remove(EE430);
                break;
            case R.id.EEE430L:
                if(checked) selection.add(EE430L);
                else selection.remove(EE430L);
                break;
        }
    }


    public void init(){
        CECS100 = new Course("CECS 100");

        MATH122 = new Course("MATH 122");

        MATH123 = new Course("MATH 123");
        MATH123.setPrerequisites(MATH122);

        MATH224 = new Course("MATH 224");
        MATH224.setPrerequisites(MATH123);

        MATH370A = new Course("MATH 370A");
        MATH370A.setPrerequisites(MATH123);

        PHYS151 = new Course("PHYS 151");
        PHYS151.setPrerequisites(MATH122);

        PHYS152 = new Course("PHYS 152");
        PHYS152.setPrerequisites(PHYS151);

        PHYS254 = new Course("PHYS 254");
        PHYS254.setPrerequisites(PHYS152);

        ENGR101 = new Course("ENGR 101");

        ENGR102 = new Course("ENGR 102");
        ENGR102.setPrerequisites(ENGR101);

        EE186 = new Course("EE 186");
        EE200 = new Course("EE 200");
        EE201 = new Course("EE 201");

        EE202 = new Course("EE 202");
        EE202.setPrerequisites(MATH123);

        EE211 = new Course("EE 211");
        EE211.setPrerequisites(PHYS152);
        EE211.setPrerequisites(MATH123);

        EE211L = new Course("EE 211L");
        EE211L.setPrerequisites(PHYS152);
        EE211L.setPrerequisites(MATH123);

        EE301 = new Course("EE 301");
        EE301.setPrerequisites(EE201);

        EE310 = new Course("EE 310");
        EE310.setPrerequisites(EE211);
        EE310.setPrerequisites(MATH370A);

        EE330 = new Course("EE 330");
        EE330.setPrerequisites(EE211);
        EE330.setPrerequisites(EE211L);

        EE346 = new Course("EE 346");
        EE346.setPrerequisites(EE201);
        EE346.setPrerequisites(EE202);

        EE350 = new Course("EE 350");
        EE350.setPrerequisites(EE202);
        EE350.setPrerequisites(EE211);
        EE350.setPrerequisites(EE211L);

        EE360 = new Course("EE 360");
        EE360.setPrerequisites(MATH224);
        EE360.setPrerequisites(EE310);

        EE370 = new Course("EE 370");
        EE370.setPrerequisites(EE310);

        EE370L = new Course("EE 370L");
        EE370L.setPrerequisites(EE310);

        EE380 = new Course("EE 380");
        EE380.setPrerequisites(MATH123);
        EE380.setPrerequisites(EE202);

        EE382 = new Course("EE 382");
        EE382.setPrerequisites(EE310);

        EE386 = new Course("EE 386");
        EE386.setPrerequisites(EE310);

        EE400D = new Course("EE 400D");
        EE400D.setPrerequisites(EE301);
        EE400D.setPrerequisites(EE330);
        EE400D.setPrerequisites(EE370);
        EE400D.setPrerequisites(EE382);
        EE400D.setPrerequisites(EE386);

        EE430 = new Course("EE 430");
        EE430.setPrerequisites(EE330);

        EE430L = new Course("EE 430L");
        EE430L.setPrerequisites(EE330);

    }

    public void generateEE(View view){

        //delete all classes that have taken in allCourses
        for ( Course temp: selection){
            allCourses.remove(temp);
        }

        //choose 3 major courses
        int amount_of_classes = 0;
        for (Course temp: allCourses){
            if(temp.metPrerequisites(selection)){
                schedule.add(temp);
                amount_of_classes++;
            }
            if(amount_of_classes>2) break;
        }

        //convert arraylist to array
        String[] scheduleArray = new String[schedule.size()+2];
        int totalCourses = 0;
        for(Course temp: schedule){
            scheduleArray[totalCourses]=temp.getName();
            totalCourses++;
        }

        for(int i =0; i<array.length;i++){
            if(array[i]!=null){
                scheduleArray[totalCourses]=array[i];
                totalCourses++;
            }
        }

        Bundle b = new Bundle();
        b.putStringArray("schedule", scheduleArray);
        Intent generate = new Intent(EEActivity.this,GeneratedSchedule.class);
        generate.putExtras(b);
        EEActivity.this.startActivity(generate);

    }

}