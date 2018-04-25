package com.planner.planner;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;

public class    GEActivity extends AppCompatActivity {

    private ArrayList<Course> selection = new ArrayList<>();
    private ArrayList<Course> allCourses = new ArrayList<>();
    private ArrayList<Course> schedule = new ArrayList<>();
    private Course A1, A2, A3, B1A, B1B,B2, C1,C2,C3,D1A,D1B,D2,E,F1,F2,F3,GlobalIssue,HumanDiversity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ge);
        init();


    }

    public void selectItemGE(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.a1:
                if(checked) selection.add(A1);
                else selection.remove(A1);
                break;

            case R.id.a2:
                if(checked) selection.add(A2);
                else selection.remove(A2);
                break;

            case R.id.a3:
                if(checked) selection.add(A3);
                else selection.remove(A3);
                break;

            case R.id.B1a:
                if(checked) selection.add(B1A);
                else selection.remove(B1A);
                break;

            case R.id.B1b:
                if(checked) selection.add(B1B);
                else selection.remove(B1B);
                break;

            case R.id.B2:
                if(checked) selection.add(B2);
                else selection.remove(B2);
                break;

            case R.id.C1:
                if(checked) selection.add(C1);
                else selection.remove(C1);
                break;

            case R.id.C2:
                if(checked) selection.add(C2);
                else selection.remove(C2);
                break;
            case R.id.C3:
                if(checked) selection.add(C3);
                else selection.remove(C3);
                break;
            case R.id.D1a:
                if(checked) selection.add(D1A);
                else selection.remove(D1A);
                break;
            case R.id.D1b:
                if(checked) selection.add(D1B);
                else selection.remove(D1B);
                break;
            case R.id.D2:
                if(checked) selection.add(D2);
                else selection.remove(D2);
                break;
            case R.id.E:
                if(checked) selection.add(E);
                else selection.remove(E);
                break;
            case R.id.F1:
                if(checked) selection.add(F1);
                else selection.remove(F1);
                break;
            case R.id.F2:
                if(checked) selection.add(F2);
                else selection.remove(F2);
                break;
            case R.id.F3:
                if(checked) selection.add(F3);
                else selection.remove(F3);
                break;
            case R.id.GlobalIssue:
                if(checked) selection.add(GlobalIssue);
                else selection.remove(GlobalIssue);
                break;
            case R.id.HumanDiversity:
                if(checked) selection.add(HumanDiversity);
                else selection.remove(HumanDiversity);
                break;

        }
    }

    public void init(){
        A1 = new Course("A1");
        A2 = new Course("A2");
        A3 = new Course("A3");
        B1A = new Course("B1a");
        B1B = new Course("B1b");
        B2 = new Course("B2");
        C1 = new Course("C1");
        C2 = new Course("C2");
        C3 = new Course("C3");
        D1A = new Course("D1a");
        D1B = new Course("D1b");
        D2 = new Course("D2");
        E = new Course("E");
        F1= new Course("F1");
        F2 = new Course("F2");
        F3 = new Course("F3");
        GlobalIssue = new Course("Global Issue");
        HumanDiversity = new Course("Human Diversity");
    }

    public void generateGE(View view) {

        //delete all classes that have taken in allCourses
        for (Course temp : selection) {
            allCourses.remove(temp);
        }

        String[] scheduleArray = new String[2];
        scheduleArray[0] = selection.get(0).getName();
        scheduleArray[1] = selection.get(1).getName();
        Bundle b = new Bundle();
        b.putStringArray("schedule", scheduleArray);
        Intent generate = new Intent(GEActivity.this, GeneratedSchedule.class);
        generate.putExtras(b);
        GEActivity.this.startActivity(generate);
    }

}
