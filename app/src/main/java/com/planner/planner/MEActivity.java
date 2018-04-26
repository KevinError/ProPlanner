package com.example.david.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MEActivity extends AppCompatActivity {

    private ArrayList<Course> selection = new ArrayList<>();
    private ArrayList<Course> allCourses = new ArrayList<>();
    private ArrayList<Course> schedule = new ArrayList<>();
    private Course CHEM111A,Math122,Math123,Math224,Math370A,PHYS151,PHYS152,ENGR101,ENGR102,MAE101B,MAE172,MAE205,MAE272;
    private Course CE205, CE335,CE336,CE406,MAE300,MAE305,MAE322,MAE330,MAE336,MAE337;
    private Course MAE361,MAE371,MAE373,MAE375,MAE376,MAE409A,MAE431,MAE459,MAE471,MAE472,MAE476,MAE490;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_me);

            init();

            allCourses.add(CHEM111A);
            allCourses.add(Math122);
            allCourses.add(Math123);
            allCourses.add(Math224);
            allCourses.add(Math370A);

            allCourses.add(PHYS151);
            allCourses.add(PHYS152);

            allCourses.add(ENGR101);
            allCourses.add(ENGR102);

            allCourses.add(MAE101B);
            allCourses.add(MAE172);
            allCourses.add(MAE205);
            allCourses.add(CE205);

            allCourses.add(MAE272);
            allCourses.add(CE335);
            allCourses.add(CE336);
            allCourses.add(CE406);
            allCourses.add(MAE337);


            allCourses.add(MAE300);
            allCourses.add(MAE305);
            allCourses.add(MAE322);
            allCourses.add(MAE330);
            allCourses.add(MAE336);
            allCourses.add(MAE337);
            allCourses.add(MAE361);
            allCourses.add(MAE371);

            allCourses.add(MAE373);
            allCourses.add(MAE375);
            allCourses.add(MAE376);
            allCourses.add(MAE409A);
            allCourses.add(MAE431);
            allCourses.add(MAE459);
            allCourses.add(MAE471);
            allCourses.add(MAE472);
            allCourses.add(MAE476);
            allCourses.add(MAE490);



        }


    public void selectItemMECH(View view) {


        {
            boolean checked = ((CheckBox) view).isChecked();
            switch (view.getId()) {
                case R.id.CHEM111A:
                    if (checked) selection.add(CHEM111A);
                    else selection.remove(CHEM111A);
                    break;

                case R.id.CE205:
                    if (checked) selection.add(CE205);
                    else selection.remove(CE205);
                    break;

                case R.id.MATH122:
                    if (checked) selection.add(Math122);
                    else selection.remove(Math122);
                    break;

                case R.id.MATH123:
                    if (checked) selection.add(Math123);
                    else selection.remove(Math123);
                    break;

                case R.id.MATH224:
                    if (checked) selection.add(Math224);
                    else selection.remove(Math224);
                    break;

                case R.id.ENGR101:
                    if (checked) selection.add(ENGR101);
                    else selection.remove(ENGR101);
                    break;

                case R.id.ENGR102:
                    if (checked) selection.add(ENGR102);
                    else selection.remove(ENGR102);
                    break;

                case R.id.MAE101B:
                    if (checked) selection.add(MAE101B);
                    else selection.remove(MAE101B);
                    break;
                case R.id.MAE172:
                    if (checked) selection.add(MAE172);
                    else selection.remove(MAE172);
                    break;
                case R.id.MAE205:
                    if (checked) selection.add(MAE205);
                    else selection.remove(MAE205);
                    break;
                case R.id.MAE272:
                    if (checked) selection.add(MAE272);
                    else selection.remove(MAE272);
                    break;
                case R.id.PHYS151:
                    if (checked) selection.add(PHYS151);
                    else selection.remove(PHYS151);
                    break;
                case R.id.PHYS152:
                    if (checked) selection.add(PHYS152);
                    else selection.remove(PHYS152);
                    break;
                case R.id.CE335:
                    if (checked) selection.add(CE335);
                    else selection.remove(CE335);
                    break;
                case R.id.CE336:
                    if (checked) selection.add(CE336);
                    else selection.remove(CE336);
                    break;
                case R.id.CE406:
                    if (checked) selection.add(CE406);
                    else selection.remove(CE406);
                    break;
                case R.id.MATH370A:
                    if (checked) selection.add(Math370A);
                    else selection.remove(Math370A);
                    break;
                case R.id.MAE300:
                    if (checked) selection.add(MAE300);
                    else selection.remove(MAE300);
                    break;
                case R.id.MAE305:
                    if (checked) selection.add(MAE305);
                    else selection.remove(MAE305);
                    break;
                case R.id.MAE322:
                    if (checked) selection.add(MAE322);
                    else selection.remove(MAE322);
                    break;
                case R.id.MAE330:
                    if (checked) selection.add(MAE330);
                    else selection.remove(MAE330);
                    break;
                case R.id.MAe336:
                    if (checked) selection.add(MAE336);
                    else selection.remove(MAE336);
                    break;
                case R.id.MAE337:
                    if (checked) selection.add(MAE337);
                    else selection.remove(MAE337);
                    break;
                case R.id.MAE361:
                    if (checked) selection.add(MAE361);
                    else selection.remove(MAE361);
                    break;
                case R.id.MAE371:
                    if (checked) selection.add(MAE371);
                    else selection.remove(MAE371);
                    break;
                case R.id.MAE375:
                    if (checked) selection.add(MAE375);
                    else selection.remove(MAE375);
                    break;
                case R.id.MAE376:
                    if (checked) selection.add(MAE376);
                    else selection.remove(MAE376);
                    break;
                case R.id.MAE409A:
                    if (checked) selection.add(MAE409A);
                    else selection.remove(MAE409A);
                    break;
                case R.id.MAE431:
                    if (checked) selection.add(MAE431);
                    else selection.remove(MAE431);
                    break;
                case R.id.MAE459:
                    if (checked) selection.add(MAE459);
                    else selection.remove(MAE459);
                    break;
                case R.id.MAE471:
                    if (checked) selection.add(MAE471);
                    else selection.remove(MAE471);
                    break;
                case R.id.MAE472:
                    if (checked) selection.add(MAE472);
                    else selection.remove(MAE472);
                    break;
                case R.id.MAE476:
                    if (checked) selection.add(MAE476);
                    else selection.remove(MAE476);
                    break;
                case R.id.MAE490:
                    if (checked) selection.add(MAE490);
                    else selection.remove(MAE490);
                    break;

            }
        }
    }
    public void init(){

        ENGR101 = new Course("ENGR 101");
        ENGR102 = new Course("ENGR 102");
        ENGR102.setPrerequisites(ENGR101);
        Math122 = new Course("Math 122");
        Math123 = new Course("Math 123");
        Math123.setPrerequisites(Math122);



        Math224 = new Course("Math 224");
        Math224.setPrerequisites(Math123);

        Math370A = new Course("Math 370A");
        Math370A.setPrerequisites(Math123);
        PHYS151 = new Course("PHYS 151");
        PHYS151.setPrerequisites(Math122);


        PHYS152 = new Course("PHYS 152");
        PHYS152.setPrerequisites(PHYS151);
        PHYS152.setPrerequisites(Math123);

        CHEM111A  = new Course("CHEM 111A");


        MAE101B = new Course("MAE 101B");
        MAE101B.setPrerequisites(Math122);

        MAE172 = new Course("MAE 172");

        MAE205 = new Course("MAE 205");
        MAE205.setPrerequisites(Math122);

        MAE272 = new Course("MAE 272");
        MAE272.setPrerequisites(MAE172);

        MAE300 = new Course("MAE 300");
        MAE300.setPrerequisites(Math224);
        MAE300.setPrerequisites(PHYS151);
        MAE300.setPrerequisites(PHYS152);

        MAE305 = new Course("MAE 305");
        MAE305.setPrerequisites(MAE205);
        MAE305.setPrerequisites(Math370A);


        MAE322 = new Course("MAE 322");
        MAE322.setPrerequisites(MAE172);
        MAE322.setPrerequisites(Math224);
        MAE322.setPrerequisites(CHEM111A);

        MAE330 = new Course("MAE 330");
        MAE330.setPrerequisites(Math224);
        MAE330.setPrerequisites(PHYS151);
        MAE330.setPrerequisites(CHEM111A);

        MAE336 = new Course("MAE 336");
        MAE330.setPrerequisites(MAE330);

        CE335 = new Course("CE 335");
        CE335.setPrerequisites(Math224);
        CE335.setPrerequisites(CE205);

        CE336 = new Course("CE 336");
        CE336.setPrerequisites(CE335);


        MAE337 = new Course("MAE 337");
        MAE337.setPrerequisites(MAE336);


        MAE361 = new Course("MAE 361");
        MAE361.setPrerequisites(MAE300);
        MAE361.setPrerequisites(MAE322);
        MAE361.setPrerequisites(MAE373);

        MAE371 = new Course("MAE 371");
        MAE371.setPrerequisites(CE205);
        MAE371.setPrerequisites(MAE205);


        MAE373 = new Course("MAE 373");
        MAE373.setPrerequisites(CE205);

        MAE375 = new Course("MAE 375");
        MAE375.setPrerequisites(MAE272);
        MAE375.setPrerequisites(MAE371);

        MAE376 = new Course("MAE 376");
        MAE376.setPrerequisites(MAE371);
        MAE376.setPrerequisites(Math370A);

        MAE409A = new Course("MAE 409A");

        MAE431 = new Course("MAE 431");
        MAE431.setPrerequisites(MAE305);
        MAE431.setPrerequisites(MAE330);
        MAE431.setPrerequisites(CE335);

        MAE459 = new Course("MAE 459");


        MAE471 = new Course("MAE 471");
        MAE471.setPrerequisites(MAE373);
        MAE471.setPrerequisites(MAE375);

        MAE472 = new Course("MAE 472");
        MAE472.setPrerequisites(MAE330);
        MAE472.setPrerequisites(MAE471);


        MAE472 = new Course("MAE 476");
        MAE472.setPrerequisites(MAE376);

        MAE490 = new Course("MAE 490");



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
        Intent generate = new Intent(MEActivity.this,GeneratedSchedule.class);
        generate.putExtras(b);
        MEActivity.this.startActivity(generate);

    }


}




