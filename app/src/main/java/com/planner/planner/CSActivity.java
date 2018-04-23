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

public class CSActivity extends AppCompatActivity {

    private ArrayList<Course> selection = new ArrayList<>();
    private ArrayList<Course> allCourses = new ArrayList<>();
    private ArrayList<Course> schedule = new ArrayList<>();
    private Course CECS100,CECS105,CECS174,CECS228,CECS225,CECS229,CECS274,CECS277,CECS282,ENGR101,ENGR102,Math122,Math123;
    private Course PHYS151,PHYS152,BIO200,CECS323,CECS326,CECS327,CECS328,CECS341,CECS343,CECS378;
    private Course EE381,ENGR350,CECS424,CoreElective,AppliedElective,SeniorProjectA,SeniorProjectB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs);
        init();

        allCourses.add(Math122);
        allCourses.add(Math123);

        allCourses.add(PHYS151);
        allCourses.add(PHYS152);

        allCourses.add(CECS100);
        allCourses.add(CECS105);
        allCourses.add(CECS174);

        allCourses.add(ENGR101);
        allCourses.add(ENGR102);

        allCourses.add(BIO200);

        allCourses.add(CECS228);
        allCourses.add(CECS225);
        allCourses.add(CECS229);
        allCourses.add(CECS274);
        allCourses.add(CECS277);
        allCourses.add(CECS282);


        allCourses.add(CECS323);
        allCourses.add(CECS326);
        allCourses.add(CECS327);
        allCourses.add(CECS328);
        allCourses.add(CECS341);
        allCourses.add(CECS343);
        allCourses.add(CECS378);

        allCourses.add(EE381);
        allCourses.add(ENGR350);

        allCourses.add(CECS424);
        allCourses.add(CoreElective);
        allCourses.add(AppliedElective);

        allCourses.add(SeniorProjectA);
        allCourses.add(SeniorProjectB);


    }

    public void selectItemCS(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.cecs100:
                if(checked) selection.add(CECS100);
                else selection.remove(CECS100);
                break;

            case R.id.cecs105:
                if(checked) selection.add(CECS105);
                else selection.remove(CECS105);
                break;

            case R.id.cecs174:
                if(checked) selection.add(CECS174);
                else selection.remove(CECS174);
                break;

            case R.id.cecs225:
                if(checked) selection.add(CECS225);
                else selection.remove(CECS225);
                break;

            case R.id.cecs228:
                if(checked) selection.add(CECS228);
                else selection.remove(CECS228);
                break;

            case R.id.cecs229:
                if(checked) selection.add(CECS229);
                else selection.remove(CECS229);
                break;

            case R.id.cecs274:
                if(checked) selection.add(CECS274);
                else selection.remove(CECS274);
                break;

            case R.id.cecs277:
                if(checked) selection.add(CECS277);
                else selection.remove(CECS277);
                break;
            case R.id.cecs282:
                if(checked) selection.add(CECS282);
                else selection.remove(CECS282);
                break;
            case R.id.engr101:
                if(checked) selection.add(ENGR101);
                else selection.remove(ENGR101);
                break;
            case R.id.engr102:
                if(checked) selection.add(ENGR102);
                else selection.remove(ENGR102);
                break;
            case R.id.math122:
                if(checked) selection.add(Math122);
                else selection.remove(Math122);
                break;
            case R.id.math123:
                if(checked) selection.add(Math123);
                else selection.remove(Math123);
                break;
            case R.id.physics151:
                if(checked) selection.add(PHYS151);
                else selection.remove(PHYS151);
                break;
            case R.id.physics152:
                if(checked) selection.add(PHYS152);
                else selection.remove(PHYS152);
                break;
            case R.id.bio200:
                if(checked) selection.add(BIO200);
                else selection.remove(BIO200);
                break;
            case R.id.cecs323:
                if(checked) selection.add(CECS323);
                else selection.remove(CECS323);
                break;
            case R.id.cecs326:
                if(checked) selection.add(CECS326);
                else selection.remove(CECS326);
                break;
            case R.id.cecs327:
                if(checked) selection.add(CECS327);
                else selection.remove(CECS327);
                break;
            case R.id.cecs328:
                if(checked) selection.add(CECS328);
                else selection.remove(CECS328);
                break;
            case R.id.cecs341:
                if(checked) selection.add(CECS341);
                else selection.remove(CECS341);
                break;
            case R.id.cecs343:
                if(checked) selection.add(CECS343);
                else selection.remove(CECS343);
                break;
            case R.id.cecs378:
                if(checked) selection.add(CECS378);
                else selection.remove(CECS378);
                break;
            case R.id.ee381:
                if(checked) selection.add(EE381);
                else selection.remove(EE381);
                break;
            case R.id.engr350:
                if(checked) selection.add(ENGR350);
                else selection.remove(ENGR350);
                break;
            case R.id.cecs424:
                if(checked) selection.add(CECS424);
                else selection.remove(CECS424);
                break;
            case R.id.coreElective:
                if(checked) selection.add(CoreElective);
                else selection.remove(CoreElective);
                break;
            case R.id.appliedElective:
                if(checked) selection.add(AppliedElective);
                else selection.remove(AppliedElective);
                break;
            case R.id.spa:
                if(checked) selection.add(SeniorProjectA);
                else selection.remove(SeniorProjectA);
                break;
            case R.id.spb:
                if(checked) selection.add(SeniorProjectB);
                else selection.remove(SeniorProjectB);
                break;

        }
    }


    public void init(){
        CECS100 = new Course("CECS 100");
//        CECS100.setNextCourses(CECS174);

        CECS105 = new Course("CECS 105");

        CECS174 = new Course("CECS 174");
        CECS174.setPrerequisites(CECS100);
//        CECS174.setNextCourses(CECS228);
//        CECS174.setNextCourses(CECS225);
//        CECS174.setNextCourses(CECS274);

        CECS225 = new Course("CECS 225");
        CECS225.setPrerequisites(CECS174);
//        CECS225.setNextCourses(CECS341);

        CECS228 = new Course("CECS 228");
        CECS228.setPrerequisites(CECS174);
//        CECS228.setNextCourses(CECS229);
//        CECS228.setNextCourses(CECS323);
//        CECS228.setNextCourses(CECS328);

        CECS229 = new Course("CECS 229");
        CECS229.setPrerequisites(CECS228);
        CECS229.setPrerequisites(Math123);
//        CECS229.setNextCourses(CECS378);
//        CECS229.setNextCourses(EE381);

        CECS274 = new Course("CECS 274");
        CECS274.setPrerequisites(CECS174);
//        CECS274.setNextCourses(CECS277);
//        CECS274.setNextCourses(CECS282);
//        CECS274.setNextCourses(CECS328);
//        CECS274.setNextCourses(CECS378);

        CECS277 = new Course("CECS 277");
        CECS277.setPrerequisites(CECS274);
//        CECS277.setNextCourses(CECS323);
//        CECS277.setNextCourses(CECS343);

        CECS282 = new Course("CECS 282");
        CECS282.setPrerequisites(CECS274);
//        CECS282.setNextCourses(CECS323);
//        CECS282.setNextCourses(CECS343);

        ENGR101 = new Course("ENGR 101");
//        ENGR101.setNextCourses(ENGR102);

        ENGR102 = new Course("ENGR 102");
        ENGR102.setPrerequisites(ENGR101);

        Math122 = new Course("Math 122");
//        Math122.setNextCourses(Math123);
//        Math122.setNextCourses(PHYS151);

        Math123 = new Course("Math 123");
        Math123.setPrerequisites(Math122);
//        Math123.setNextCourses(PHYS152);

        PHYS151 = new Course("PHYS 151");
        PHYS151.setPrerequisites(Math122);
//        PHYS151.setNextCourses(PHYS152);

        PHYS152 = new Course("PHYS 152");
        PHYS152.setPrerequisites(PHYS151);
        PHYS152.setPrerequisites(Math123);

        BIO200  = new Course("BIO 200");

        CECS323 = new Course("CECS 323");
        CECS323.setPrerequisites(CECS228);
        CECS323.setPrerequisites(CECS277);
        CECS323.setPrerequisites(CECS282);
//        CECS323.setNextCourses(CoreElective);
//        CECS323.setNextCourses(AppliedElective);
//        CECS323.setNextCourses(SeniorProjectA);

        CECS326 = new Course("CECS 326");
        CECS326.setPrerequisites(CECS282);
        CECS326.setPrerequisites(CECS341);
//        CECS326.setNextCourses(CECS327);
//        CECS326.setNextCourses(CECS424);

        CECS327 = new Course("CECS 327");
        CECS327.setPrerequisites(CECS326);

        CECS328 = new Course("CECS 328");
        CECS328.setPrerequisites(CECS228);
        CECS328.setPrerequisites(CECS274);
//        CECS328.setNextCourses(CECS424);
//        CECS328.setNextCourses(CoreElective);
//        CECS328.setNextCourses(AppliedElective);

        CECS341 = new Course("CECS 341");
        CECS341.setPrerequisites(CECS225);

        CECS343 = new Course("CECS 343");
        CECS343.setPrerequisites(CECS277);
        CECS343.setPrerequisites(CECS282);
//        CECS343.setNextCourses(CoreElective);
//        CECS343.setNextCourses(AppliedElective);
//        CECS343.setNextCourses(SeniorProjectA);

        CECS378 = new Course("CECS 378");
        CECS378.setPrerequisites(CECS229);
        CECS378.setPrerequisites(CECS274);

        EE381 = new Course("EE 381");
        EE381.setPrerequisites(CECS229);

        ENGR350 = new Course("ENGR 350");
//        ENGR350.setNextCourses(SeniorProjectA);

        CECS424 = new Course("CECS 424");
        CECS424.setPrerequisites(CECS326);
        CECS424.setPrerequisites(CECS328);

        CoreElective = new Course("Core Elective");
        CoreElective.setPrerequisites(CECS323);
        CoreElective.setPrerequisites(CECS343);
        CoreElective.setPrerequisites(CECS328);

        AppliedElective = new Course("Applied Elective");
        AppliedElective.setPrerequisites(CECS323);
        AppliedElective.setPrerequisites(CECS343);
        AppliedElective.setPrerequisites(CECS328);

        SeniorProjectA = new Course("Senior Project A");
        SeniorProjectA.setPrerequisites(CECS323);
        SeniorProjectA.setPrerequisites(ENGR350);
        SeniorProjectA.setPrerequisites(CECS343);
//        SeniorProjectA.setNextCourses(SeniorProjectB);

        SeniorProjectB = new Course("Senior Project B");
        SeniorProjectB.setPrerequisites(SeniorProjectA);


    }

    public void generateCS(View view){

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
        String[] scheduleArray = new String[schedule.size()];
        int totalCourses = 0;
        for(Course temp: schedule){
            scheduleArray[totalCourses]=temp.getName();
            totalCourses++;
        }

        Bundle b = new Bundle();
        b.putStringArray("schedule", scheduleArray);
        Intent generate = new Intent(CSActivity.this,GeneratedSchedule.class);
        generate.putExtras(b);
        CSActivity.this.startActivity(generate);

    }


}
