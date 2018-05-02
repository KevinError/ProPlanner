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


//Activity for BioMedical major
//chooses classes for the user

public class BMEActivity extends AppCompatActivity {

    private ArrayList<Course> selection = new ArrayList<>();
    private ArrayList<Course> allCourses = new ArrayList<>();
    private ArrayList<Course> schedule = new ArrayList<>();
    private Course MATH122,MATH123,MATH224,MATH249,PHYS151,CHEM111A,CHEM111B,BIO200,BIO207,ENGR101,ENGR102,EE380,
            BME100,BME201,BME210,BME211,BME300,BME304,BME311,BME320,BME350,BME360,BME370,BME490A,BME490B,
            RSCH361,MajorElective;

    private String[] array;
    private ArrayList<String> swap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bme);

        Bundle b = this.getIntent().getExtras();
        array=b.getStringArray("schedule");
        swap = b.getStringArrayList("swap");
        init();

        allCourses.add(MATH122);
        allCourses.add(MATH123);

        allCourses.add(MATH224);
        allCourses.add(MATH249);

        allCourses.add(PHYS151);

        allCourses.add(CHEM111A);
        allCourses.add(CHEM111B);

        allCourses.add(ENGR101);
        allCourses.add(ENGR102);

        allCourses.add(BIO200);
        allCourses.add(BIO207);

        allCourses.add(EE380);

        allCourses.add(BME100);
        allCourses.add(BME201);
        allCourses.add(BME210);


        allCourses.add(BME211);
        allCourses.add(BME300);

        allCourses.add(BME304);
        allCourses.add(BME311);

        allCourses.add(BME320);
        allCourses.add(BME350);
        allCourses.add(BME360);

        allCourses.add(BME370);
        allCourses.add(BME490A);
        allCourses.add(BME490B);

        allCourses.add(RSCH361);

        allCourses.add(MajorElective);
    }

    public void selectItemBME(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.BIOENGR101:
                if(checked) selection.add(ENGR101);
                else selection.remove(ENGR101);
                break;
            case R.id.BIOENGR102:
                if(checked) selection.add(ENGR102);
                else selection.remove(ENGR102);
                break;
            case R.id.BIOMATH122:
                if(checked) selection.add(MATH122);
                else selection.remove(MATH122);
                break;
            case R.id.BIOMATH123:
                if(checked) selection.add(MATH123);
                else selection.remove(MATH123);
                break;
            case R.id.BIOMATH224:
                if(checked) selection.add(MATH224);
                else selection.remove(MATH224);
                break;
            case R.id.BIOMATH249:
                if(checked) selection.add(MATH249);
                else selection.remove(MATH249);
                break;
            case R.id.BIOPHYS151:
                if(checked) selection.add(PHYS151);
                else selection.remove(PHYS151);
                break;
            case R.id.BIOCHEM111A:
                if(checked) selection.add(CHEM111A);
                else selection.remove(CHEM111A);
                break;
            case R.id.BIOCHEM111B:
                if(checked) selection.add(CHEM111B);
                else selection.remove(CHEM111B);
                break;
            case R.id.BIOBIO200:
                if(checked) selection.add(BIO200);
                else selection.remove(BIO200);
                break;
            case R.id.BIOBIO207:
                if(checked) selection.add(BIO207);
                else selection.remove(BIO207);
                break;
            case R.id.EE380:
                if(checked) selection.add(EE380);
                else selection.remove(EE380);
                break;
            case R.id.BME100:
                if(checked) selection.add(BME100);
                else selection.remove(BME100);
                break;

            case R.id.BME201:
                if(checked) selection.add(BME201);
                else selection.remove(BME201);
                break;

            case R.id.BME210:
                if(checked) selection.add(BME210);
                else selection.remove(BME210);
                break;

            case R.id.BME211:
                if(checked) selection.add(BME211);
                else selection.remove(BME211);
                break;

            case R.id.BME300:
                if(checked) selection.add(BME300);
                else selection.remove(BME300);
                break;

            case R.id.BME304:
                if(checked) selection.add(BME304);
                else selection.remove(BME304);
                break;

            case R.id.BME311:
                if(checked) selection.add(BME311);
                else selection.remove(BME311);
                break;

            case R.id.BME320:
                if(checked) selection.add(BME320);
                else selection.remove(BME320);
                break;
            case R.id.BME350:
                if(checked) selection.add(BME350);
                else selection.remove(BME350);
                break;

            case R.id.BME360:
                if(checked) selection.add(BME360);
                else selection.remove(BME360);
                break;
            case R.id.BME370:
                if(checked) selection.add(BME370);
                else selection.remove(BME370);
                break;
            case R.id.BME490A:
                if(checked) selection.add(BME490A);
                else selection.remove(BME490A);
                break;
            case R.id.BME490B:
                if(checked) selection.add(BME490B);
                else selection.remove(BME490B);
                break;
            case R.id.RSCH361:
                if(checked) selection.add(RSCH361);
                else selection.remove(RSCH361);
                break;
            case R.id.bioMajorElective:
                if(checked) selection.add(MajorElective);
                else selection.remove(MajorElective);
                break;
        }
    }


    public void init(){
        ENGR101 = new Course("ENGR 101");
//        ENGR101.setNextCourses(ENGR102);

        ENGR102 = new Course("ENGR 102");
        ENGR102.setPrerequisites(ENGR101);

        MATH122 = new Course("MATH 122");
//        Math122.setNextCourses(Math123);
//        Math122.setNextCourses(PHYS151);

        MATH123 = new Course("MATH 123");
        MATH123.setPrerequisites(MATH122);
//        Math123.setNextCourses(PHYS152);

        MATH224 = new Course("MATH 224");
        MATH224.setPrerequisites(MATH123);

        MATH249 = new Course("MATH 249");
        MATH249.setPrerequisites(MATH123);

        EE380 = new Course("EE 380");
        EE380.setPrerequisites(MATH123);

        PHYS151 = new Course("PHYS 151");
        PHYS151.setPrerequisites(MATH122);
//        PHYS151.setNextCourses(PHYS152);

        BIO200 = new Course("BIO 200");
        BIO207 = new Course("BIO 207");

        CHEM111A = new Course("CHEM 111A");

        CHEM111B = new Course("CHEM 111B");
        CHEM111B.setPrerequisites(CHEM111A);

        BME100 = new Course("BME 100");

        BME201 = new Course("BME 201");
        BME201.setPrerequisites(MATH122);

        BME210 = new Course("BME 210");
        BME210.setPrerequisites(CHEM111B);
        BME210.setPrerequisites(MATH249);
        BME210.setPrerequisites(BME201);

        BME211 = new Course("BME 211");
        BME211.setPrerequisites(PHYS151);
        BME211.setPrerequisites(MATH224);

        BME300 = new Course("BME 300");
        BME300.setPrerequisites(BME210);
        BME300.setPrerequisites(BIO200);

        BME304 = new Course("BME 304");
        BME304.setPrerequisites(BME210);
        BME304.setPrerequisites(EE380);

        BME311 = new Course("BME 311");
        BME311.setPrerequisites(BME211);
        BME311.setPrerequisites(MATH249);

        BME320 = new Course("BME 320");
        BME320.setPrerequisites(BME210);

        BME350 = new Course("BME 350");
        BME350.setPrerequisites(BIO200);
        BME350.setPrerequisites(BME304);
        BME350.setPrerequisites(BME320);

        BME360 = new Course("BME 360");
        BME360.setPrerequisites(BME320);

        BME370 = new Course("BME 370");
        BME370.setPrerequisites(MATH249);
        BME370.setPrerequisites(PHYS151);
        BME370.setPrerequisites(BIO200);
        BME370.setPrerequisites(BIO207);

        BME490A = new Course("BME 490A");
        BME490A.setPrerequisites(BME370);

        BME490B = new Course("BME 490B");
        BME490B.setPrerequisites(BME490A);

        RSCH361 = new Course("RSCH 361");

        MajorElective = new Course("Major Elective");
    }

    public void generateBME(View view){

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
        Intent generate = new Intent(BMEActivity.this,GeneratedSchedule.class);
        generate.putExtras(b);
        BMEActivity.this.startActivity(generate);
    }
}
