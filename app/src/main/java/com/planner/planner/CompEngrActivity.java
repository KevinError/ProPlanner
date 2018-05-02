package com.planner.planner;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;


import java.util.ArrayList;


//Activity for Computer Engineer major
//chooses classes for the user

public class CompEngrActivity extends AppCompatActivity {

    private ArrayList<Course> selection = new ArrayList<>();
    private ArrayList<Course> allCourses = new ArrayList<>();
    private ArrayList<Course> schedule = new ArrayList<>();
    private Course MATH122,MATH123,PHYS151,PHYS152,BIO200,ENGR101,ENGR102,EE381,CECS100,CECS105,
            CECS174,CECS201,CECS211,CECS228,CECS229,CECS262,CECS271,CECS275,CECS301,CECS311,
            CECS326,CECS346,CECS347,CECS360,CECS440,CECS447,CECS460,CECS463,CECS490A,CECS490B,
            MajorElective1,MajorElective2;

    private String[] array;
    private ArrayList<String> swap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_engr);

        Bundle b = this.getIntent().getExtras();
        array=b.getStringArray("schedule");
        swap = b.getStringArrayList("swap");

        init();

        allCourses.add(MATH122);
        allCourses.add(MATH123);

        allCourses.add(PHYS151);
        allCourses.add(PHYS152);

        allCourses.add(ENGR101);
        allCourses.add(ENGR102);

        allCourses.add(BIO200);

        allCourses.add(EE381);

        allCourses.add(CECS100);
        allCourses.add(CECS105);
        allCourses.add(CECS174);


        allCourses.add(CECS201);
        allCourses.add(CECS211);

        allCourses.add(CECS228);
        allCourses.add(CECS229);

        allCourses.add(CECS262);
        allCourses.add(CECS271);
        allCourses.add(CECS275);

        allCourses.add(CECS301);
        allCourses.add(CECS311);
        allCourses.add(CECS326);

        allCourses.add(CECS346);
        allCourses.add(CECS347);
        allCourses.add(CECS360);

        allCourses.add(CECS440);
        allCourses.add(CECS447);

        allCourses.add(CECS460);
        allCourses.add(CECS463);

        allCourses.add(CECS490A);
        allCourses.add(CECS490B);

        allCourses.add(MajorElective1);
        allCourses.add(MajorElective2);
    }

    public void selectItemCompEngr(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.CECS100:
                if(checked) selection.add(CECS100);
                else selection.remove(CECS100);
                break;

            case R.id.CECS105:
                if(checked) selection.add(CECS105);
                else selection.remove(CECS105);
                break;

            case R.id.CECS174:
                if(checked) selection.add(CECS174);
                else selection.remove(CECS174);
                break;

            case R.id.CECS201:
                if(checked) selection.add(CECS201);
                else selection.remove(CECS201);
                break;

            case R.id.CECS211:
                if(checked) selection.add(CECS211);
                else selection.remove(CECS211);
                break;

            case R.id.CECS228:
                if(checked) selection.add(CECS228);
                else selection.remove(CECS228);
                break;

            case R.id.CECS229:
                if(checked) selection.add(CECS229);
                else selection.remove(CECS229);
                break;

            case R.id.CECS262:
                if(checked) selection.add(CECS262);
                else selection.remove(CECS262);
                break;
            case R.id.CECS271:
                if(checked) selection.add(CECS271);
                else selection.remove(CECS271);
                break;
            case R.id.ENGR101:
                if(checked) selection.add(ENGR101);
                else selection.remove(ENGR101);
                break;
            case R.id.ENGR102:
                if(checked) selection.add(ENGR102);
                else selection.remove(ENGR102);
                break;
            case R.id.MATH122:
                if(checked) selection.add(MATH122);
                else selection.remove(MATH122);
                break;
            case R.id.MATH123:
                if(checked) selection.add(MATH123);
                else selection.remove(MATH123);
                break;
            case R.id.PHYS151:
                if(checked) selection.add(PHYS151);
                else selection.remove(PHYS151);
                break;
            case R.id.PHYS152:
                if(checked) selection.add(PHYS152);
                else selection.remove(PHYS152);
                break;
            case R.id.BIO200:
                if(checked) selection.add(BIO200);
                else selection.remove(BIO200);
                break;
            case R.id.CECS275:
                if(checked) selection.add(CECS275);
                else selection.remove(CECS275);
                break;
            case R.id.CECS301:
                if(checked) selection.add(CECS301);
                else selection.remove(CECS301);
                break;
            case R.id.CECS311:
                if(checked) selection.add(CECS311);
                else selection.remove(CECS311);
                break;
            case R.id.CECS326:
                if(checked) selection.add(CECS326);
                else selection.remove(CECS326);
                break;
            case R.id.CECS346:
                if(checked) selection.add(CECS346);
                else selection.remove(CECS346);
                break;
            case R.id.CECS347:
                if(checked) selection.add(CECS347);
                else selection.remove(CECS347);
                break;
            case R.id.CECS360:
                if(checked) selection.add(CECS360);
                else selection.remove(CECS360);
                break;
            case R.id.EE381:
                if(checked) selection.add(EE381);
                else selection.remove(EE381);
                break;
            case R.id.CECS440:
                if(checked) selection.add(CECS440);
                else selection.remove(CECS440);
                break;
            case R.id.CECS447:
                if(checked) selection.add(CECS447);
                else selection.remove(CECS447);
                break;
            case R.id.CECS460:
                if(checked) selection.add(CECS460);
                else selection.remove(CECS460);
                break;
            case R.id.CECS463:
                if(checked) selection.add(CECS463);
                else selection.remove(CECS463);
                break;
            case R.id.CECS490A:
                if(checked) selection.add(CECS490A);
                else selection.remove(CECS490A);
                break;
            case R.id.CECS490B:
                if(checked) selection.add(CECS490B);
                else selection.remove(CECS490B);
                break;
            case R.id.MAJORELECTIVE1:
                if(checked) selection.add(MajorElective1);
                else selection.remove(MajorElective1);
                break;
            case R.id.MAJORELECTIVE2:
                if(checked) selection.add(MajorElective2);
                else selection.remove(MajorElective2);
                break;

        }
    }


    public void init(){
        ENGR101 = new Course("ENGR 101");
//        ENGR101.setNextCourses(ENGR102);

        ENGR102 = new Course("ENGR 102");
        ENGR102.setPrerequisites(ENGR101);

        MATH122 = new Course("Math 122");
//        Math122.setNextCourses(Math123);
//        Math122.setNextCourses(PHYS151);

        MATH123 = new Course("Math 123");
        MATH123.setPrerequisites(MATH122);
//        Math123.setNextCourses(PHYS152);

        PHYS151 = new Course("PHYS 151");
        PHYS151.setPrerequisites(MATH122);
//        PHYS151.setNextCourses(PHYS152);

        PHYS152 = new Course("PHYS 152");
        PHYS152.setPrerequisites(PHYS151);
        PHYS152.setPrerequisites(MATH123);

        BIO200  = new Course("BIO 200");

        CECS100 = new Course("CECS 100");
//        CECS100.setNextCourses(CECS174);

        CECS105 = new Course("CECS 105");

        CECS174 = new Course("CECS 174");
        CECS174.setPrerequisites(CECS100);

        CECS228 = new Course("CECS 228");
        CECS228.setPrerequisites(CECS174);

        CECS229 = new Course("CECS 229");
        CECS229.setPrerequisites(CECS228);
        CECS229.setPrerequisites(MATH123);

        CECS275 = new Course("CECS 275");
        CECS275.setPrerequisites(CECS174);

        CECS301 = new Course("CECS 301");
        CECS301.setPrerequisites(CECS174);

        CECS201 = new Course("CECS 201");

        CECS211 = new Course("CECS 211");
        CECS211.setPrerequisites(MATH122);

        CECS311 = new Course("CECS 311");
        CECS311.setPrerequisites(CECS211);
        CECS311.setPrerequisites(CECS201);

        CECS271 = new Course("CECS 271");
        CECS271.setPrerequisites(CECS229);

        EE381 = new Course("EE 381");
        EE381.setPrerequisites(CECS229);

        CECS262 = new Course("CECS 262");
        CECS262.setPrerequisites(CECS174);
        CECS262.setPrerequisites(CECS201);

        CECS301 = new Course("CECS 301");
        CECS301.setPrerequisites(CECS174);
        CECS301.setPrerequisites(CECS201);

        CECS346 = new Course("CECS 346");
        CECS346.setPrerequisites(CECS262);
        CECS346.setPrerequisites(CECS211);

        CECS360 = new Course("CECS 360");
        CECS360.setPrerequisites(CECS301);
        CECS360.setPrerequisites(CECS311);

        CECS347 = new Course("CECS 347");
        CECS347.setPrerequisites(CECS346);
        CECS347.setPrerequisites(CECS311);

        CECS326 = new Course("CECS 326");
        CECS326.setPrerequisites(CECS275);
        CECS326.setPrerequisites(CECS346);

        CECS440 = new Course("CECS 440");
        CECS440.setPrerequisites(CECS346);

        CECS463 = new Course("CECS 463");
        CECS463.setPrerequisites(CECS360);

        CECS447 = new Course("CECS 447");
        CECS447.setPrerequisites(CECS347);

        CECS460 = new Course("CECS 460");
        CECS460.setPrerequisites(CECS360);

        CECS490A = new Course("CECS 490A");
        CECS490A.setPrerequisites(CECS347);

        CECS490B = new Course("CECS 490B");
        CECS490B.setPrerequisites(CECS490A);

        MajorElective1 = new Course("MAJOR ELECTIVE1");
        MajorElective2 = new Course("MAJOR ELECTIVE2");

    }

    public void generateCompEngr(View view){

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

        for(int i=0;i<schedule.size();i++){
            allCourses.remove(schedule.get(i));
        }

        //add courses to scheduleArray"classes taken"
        for(int i =0; i<array.length;i++){
            if(array[i]!=null){
                scheduleArray[totalCourses]=array[i];
                totalCourses++;
            }
        }

        for(int i=0; i<allCourses.size();i++){
            swap.add(allCourses.get(i).getName());
        }

        Bundle b = new Bundle();
        b.putStringArray("schedule", scheduleArray);
        b.putStringArrayList("swap",swap);
        Intent generate = new Intent(CompEngrActivity.this,GeneratedSchedule.class);
        generate.putExtras(b);
        CompEngrActivity.this.startActivity(generate);
    }
}
