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

public class ChemActivity extends AppCompatActivity {

    private ArrayList<Course> selection = new ArrayList<>();
    private ArrayList<Course> allCourses = new ArrayList<>();
    private ArrayList<Course> schedule = new ArrayList<>();

    private Course MATH122, MATH123, PHYS151, PHYS152;
    private Course CHE200, CHE210, CHE220, CHEM111A, CHEM111B, CE205, ENGR101, ENGR102, CHE100;
    private Course MATH224, CHEM220A, CHEM220B, CHEM223A;
    private Course CHE310,CHE320,CHE330, CHE420, CHE430, CHE440, CHE450, CHE460, CHE470, CHEM375, MATH370A;
    private Course CourseChoice1, CourseChoice2, CourseChoice3;

    private String[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem);

        Bundle b = this.getIntent().getExtras();
        array=b.getStringArray("schedule");

        init();

        allCourses.add(MATH122);
        allCourses.add(MATH123);
        allCourses.add(PHYS151);
        allCourses.add(PHYS152);

        allCourses.add(CHE200);
        allCourses.add(CHE210);
        allCourses.add(CHE220);

        allCourses.add(CHEM111A);
        allCourses.add(CHEM111B);
        allCourses.add(CE205);

        allCourses.add(ENGR101);
        allCourses.add(ENGR102);
        allCourses.add(CHE100);

        allCourses.add(MATH224);
        allCourses.add(CHEM220A);
        allCourses.add(CHEM220B);
        allCourses.add(CHEM223A);

        allCourses.add(CHE310);
        allCourses.add(CHE320);
        allCourses.add(CHE330);
        allCourses.add(CHE420);
        allCourses.add(CHE430);
        allCourses.add(CHE440);
        allCourses.add(CHE450);
        allCourses.add(CHE460);
        allCourses.add(CHE470);
        allCourses.add(CHEM375);
        allCourses.add(MATH370A);

        allCourses.add(CourseChoice1);
        allCourses.add(CourseChoice2);
        allCourses.add(CourseChoice3);
    }


    public void selectItemCHEM(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.chemmath122:
                if(checked) selection.add(MATH122);
                else selection.remove(MATH122);
                break;

            case R.id.chemmath123:
                if(checked) selection.add(MATH123);
                else selection.remove(MATH123);
                break;

            case R.id.chemphys151:
                if(checked) selection.add(PHYS151);
                else selection.remove(PHYS151);
                break;

            case R.id.chemphys152:
                if(checked) selection.add(PHYS152);
                else selection.remove(PHYS152);
                break;

            case R.id.che200:
                if(checked) selection.add(CHE200);
                else selection.remove(CHE200);
                break;

            case R.id.chem111a:
                if(checked) selection.add(CHEM111A);
                else selection.remove(CHEM111A);
                break;

            case R.id.chem111b:
                if(checked) selection.add(CHEM111B);
                else selection.remove(CHEM111B);
                break;

            case R.id.ce205:
                if(checked) selection.add(CE205);
                else selection.remove(CE205);
                break;
            case R.id.chemengr101:
                if(checked) selection.add(ENGR101);
                else selection.remove(ENGR101);
                break;
            case R.id.chemengr102:
                if(checked) selection.add(ENGR102);
                else selection.remove(ENGR102);
                break;
            case R.id.che100:
                if(checked) selection.add(CHE100);
                else selection.remove(CHE100);
                break;
            case R.id.chemmath224:
                if(checked) selection.add(MATH224);
                else selection.remove(MATH224);
                break;
            case R.id.chem220a:
                if(checked) selection.add(CHEM220A);
                else selection.remove(CHEM220A);
                break;
            case R.id.chem220b:
                if(checked) selection.add(CHEM220B);
                else selection.remove(CHEM220B);
                break;
            case R.id.chem223a:
                if(checked) selection.add(CHEM223A);
                else selection.remove(CHEM223A);
                break;
            case R.id.che310:
                if(checked) selection.add(CHE310);
                else selection.remove(CHE310);
                break;
            case R.id.che320:
                if(checked) selection.add(CHE320);
                else selection.remove(CHE320);
                break;
            case R.id.che330:
                if(checked) selection.add(CHE330);
                else selection.remove(CHE330);
                break;
            case R.id.che420:
                if(checked) selection.add(CHE420);
                else selection.remove(CHE420);
                break;
            case R.id.che430:
                if(checked) selection.add(CHE430);
                else selection.remove(CHE430);
                break;
            case R.id.che440:
                if(checked) selection.add(CHE440);
                else selection.remove(CHE440);
                break;
            case R.id.che450:
                if(checked) selection.add(CHE450);
                else selection.remove(CHE450);
                break;
            case R.id.che460:
                if(checked) selection.add(CHE460);
                else selection.remove(CHE460);
                break;
            case R.id.che470:
                if(checked) selection.add(CHE470);
                else selection.remove(CHE470);
                break;
            case R.id.chem375:
                if(checked) selection.add(CHEM375);
                else selection.remove(CHEM375);
                break;
            case R.id.math370a:
                if(checked) selection.add(MATH370A);
                else selection.remove(MATH370A);
                break;
            case R.id.cc1:
                if(checked) selection.add(CourseChoice1);
                else selection.remove(CourseChoice1);
                break;
            case R.id.cc2:
                if(checked) selection.add(CourseChoice2);
                else selection.remove(CourseChoice2);
                break;
            case R.id.cc3:
                if(checked) selection.add(CourseChoice3);
                else selection.remove(CourseChoice3);
                break;


        }
    }
    public void init(){
        MATH122 = new Course("Math 122");
        MATH123 = new Course("Math 123");
        MATH123.setPrerequisites(MATH122);

        PHYS151 = new Course("Phys 151");
        PHYS152 = new Course("Phys 152");
        PHYS152.setPrerequisites(PHYS151);

        CHE200 = new Course("CHE 200");
        CHE200.setPrerequisites(CHEM111A);
        CHE200.setPrerequisites(MATH122);
        CHE200.setPrerequisites(PHYS151);

        CHE210 = new Course("CHE 210");
        CHE210.setPrerequisites(MATH123);

        CHE220 = new Course("CHE 220");
        CHEM111A = new Course("CHEM 111A");
        CHEM111B = new Course("CHEM 111B");
        CHEM111B.setPrerequisites(CHEM111A);
        CE205 = new Course("CE 205");
        CE205.setPrerequisites(PHYS151);

        ENGR101 = new Course("ENGR 101");
        ENGR102 = new Course("ENGR 102");
        ENGR102.setPrerequisites(ENGR101);

        CHE100 = new Course("CHE 100");
        MATH224 = new Course("MATH 224");
        MATH224.setPrerequisites(MATH123);

        CHEM220A = new Course("CHEM 220A");
        CHEM220A.setPrerequisites(CHEM111B);

        CHEM220B = new Course("CHEM 220B");
        CHEM220B.setPrerequisites(CHEM220A);
        CHEM223A = new Course("CHEM 223A");

        CHE310 = new Course("CHE 310");
        CHE310.setPrerequisites(CHE210);
        CHE310.setPrerequisites(CHE220);

        CHE320 = new Course("CHE 320");
        CHE320.setPrerequisites(CHE200);
        CHE320.setPrerequisites(CE205);

        CHE330 = new Course("CHE 330");
        CHE420 = new Course("CHE 420");
        CHE420.setPrerequisites(CHE310);
        CHE420.setPrerequisites(CHE320);

        CHE430 = new Course("CHE 430");
        CHE430.setPrerequisites(CHE310);

        CHE440 = new Course("CHE 440");
        CHE440.setPrerequisites(CHE320);
        CHE440.setPrerequisites(CHE330);

        CHE450 = new Course("CHE 450");
        CHE450.setPrerequisites(CHE420);

        CHE460 = new Course("CHE 460");
        CHE460.setPrerequisites(CHE420);
        CHE460.setPrerequisites(CHE430);
        CHE460.setPrerequisites(MATH370A);

        CHE470 = new Course("CHE 470");
        CHE470.setPrerequisites(CHE330);
        CHE470.setPrerequisites(CHE420);
        CHE470.setPrerequisites(CHE430);

        CHEM375 = new Course("CHEM 375");
        CHEM375.setPrerequisites(MATH123);
        CHEM375.setPrerequisites(PHYS151);
        CHEM375.setPrerequisites(PHYS152);
        CHEM375.setPrerequisites(CHE220);
        CHEM375.setPrerequisites(CHEM111A);
        CHEM375.setPrerequisites(CHEM111B);
        CHEM375.setPrerequisites(CHEM220A);

        MATH370A = new Course("MATH 370A");
        MATH370A.setPrerequisites(MATH123);

        CourseChoice1 = new Course("Course Choice 1");
        CourseChoice2 = new Course("Course Choice 2");
        CourseChoice3 = new Course("Course Choice 3");
    }

    public void generateCHEM(View view){

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
        Intent generate = new Intent(ChemActivity.this,GeneratedSchedule.class);
        generate.putExtras(b);
        ChemActivity.this.startActivity(generate);

    }
}
