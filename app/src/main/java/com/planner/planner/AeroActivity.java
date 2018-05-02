package com.planner.planner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;

public class AeroActivity extends AppCompatActivity {
    private ArrayList<Course> selection = new ArrayList<>();
    private ArrayList<Course> allCourses = new ArrayList<>();
    private ArrayList<Course> schedule = new ArrayList<>();

    private Course MATH122, MATH123, PHYS151, PHYS152;
    private Course MAE101A, MAE172, MAE205, CHEM111A, CE205, ENGR101, ENGR102;
    private Course MATH224, ECON300, MAE300, MAE305, MAE330, MAE333, MAE334, MAE350, MAE365, MAE371;
    private Course MAE373,MAE374, MAE381, MAE390, MAE440, MAE452,MAE465, MAE478, MAE479;
    private Course MAE434, MAE451, MAE453, MAE481, MAE483, MATH370A, CourseChoice1, CourseChoice2, CourseChoice3;

    private String[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aero);

        Bundle b = this.getIntent().getExtras();
        array=b.getStringArray("schedule");

        init();

        allCourses.add(MATH122);
        allCourses.add(MATH123);
        allCourses.add(PHYS151);
        allCourses.add(PHYS152);


        allCourses.add(MAE101A);
        allCourses.add(MAE172);
        allCourses.add(MAE205);

        allCourses.add(CHEM111A);
        allCourses.add(CE205);

        allCourses.add(ENGR101);
        allCourses.add(ENGR102);


        allCourses.add(MATH224);
        allCourses.add(ECON300);
        allCourses.add(MAE300);
        allCourses.add(MAE305);

        allCourses.add(MAE330);
        allCourses.add(MAE333);
        allCourses.add(MAE334);
        allCourses.add(MAE350);
        allCourses.add(MAE365);
        allCourses.add(MAE371);


        allCourses.add(MAE373);
        allCourses.add(MAE374);
        allCourses.add(MAE381);
        allCourses.add(MAE390);
        allCourses.add(MAE440);
        allCourses.add(MAE452);
        allCourses.add(MAE465);
        allCourses.add(MAE478);
        allCourses.add(MAE479);

        allCourses.add(MAE434);
        allCourses.add(MAE451);
        allCourses.add(MAE453);
        allCourses.add(MAE481);
        allCourses.add(MAE483);
        allCourses.add(MATH370A);

        allCourses.add(CourseChoice1);
        allCourses.add(CourseChoice2);
        allCourses.add(CourseChoice3);
    }


    public void selectItemAERO(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.AMATH122:
                if(checked) selection.add(MATH122);
                else selection.remove(MATH122);
                break;

            case R.id.AMATH123:
                if(checked) selection.add(MATH123);
                else selection.remove(MATH123);
                break;

            case R.id.APHYS151:
                if(checked) selection.add(PHYS151);
                else selection.remove(PHYS151);
                break;

            case R.id.APHYS152:
                if(checked) selection.add(PHYS152);
                else selection.remove(PHYS152);
                break;

            case R.id.ACE205:
                if(checked) selection.add(CE205);
                else selection.remove(CE205);
                break;

            case R.id.ACHEM111A:
                if(checked) selection.add(CHEM111A);
                else selection.remove(CHEM111A);
                break;

            case R.id.AMAE101B:
                if(checked) selection.add(MAE101A);
                else selection.remove(MAE101A);
                break;

            case R.id.AMAE172:
                if(checked) selection.add(MAE172);
                else selection.remove(MAE172);
                break;
            case R.id.AENGR101:
                if(checked) selection.add(ENGR101);
                else selection.remove(ENGR101);
                break;
            case R.id.AENGR102:
                if(checked) selection.add(ENGR102);
                else selection.remove(ENGR102);
                break;
            case R.id.AECON300:
                if(checked) selection.add(ECON300);
                else selection.remove(ECON300);
                break;
            case R.id.AMATH224:
                if(checked) selection.add(MATH224);
                else selection.remove(MATH224);
                break;
            case R.id.AMAE300:
                if(checked) selection.add(MAE300);
                else selection.remove(MAE300);
                break;
            case R.id.AMAE305:
                if(checked) selection.add(MAE305);
                else selection.remove(MAE305);
                break;
            case R.id.AMAE330:
                if(checked) selection.add(MAE330);
                else selection.remove(MAE330);
                break;
            case R.id.AMAE333:
                if(checked) selection.add(MAE333);
                else selection.remove(MAE333);
                break;
            case R.id.AMAE334:
                if(checked) selection.add(MAE334);
                else selection.remove(MAE334);
                break;
            case R.id.AMAE350:
                if(checked) selection.add(MAE350);
                else selection.remove(MAE350);
                break;
            case R.id.AMAE365:
                if(checked) selection.add(MAE365);
                else selection.remove(MAE365);
                break;
            case R.id.AMAE371:
                if(checked) selection.add(MAE371);
                else selection.remove(MAE371);
                break;
            case R.id.AMAE373:
                if(checked) selection.add(MAE373);
                else selection.remove(MAE373);
                break;
            case R.id.AMAE374:
                if(checked) selection.add(MAE374);
                else selection.remove(MAE374);
                break;
            case R.id.AMAE381:
                if(checked) selection.add(MAE381);
                else selection.remove(MAE381);
                break;
            case R.id.AMAE390:
                if(checked) selection.add(MAE390);
                else selection.remove(MAE390);
                break;
            case R.id.AMAE440:
                if(checked) selection.add(MAE440);
                else selection.remove(MAE440);
                break;
            case R.id.AMAE452:
                if(checked) selection.add(MAE452);
                else selection.remove(MAE452);
                break;
            case R.id.AMAE465:
                if(checked) selection.add(MAE465);
                else selection.remove(MAE465);
                break;
            case R.id.AMAE478:
                if(checked) selection.add(MAE478);
                else selection.remove(MAE478);
                break;

            case R.id.AMAE479:
                if(checked) selection.add(MAE479);
                else selection.remove(MAE479);
                break;

//            case R.id.AMAE434:
//                if(checked) selection.add(MAE434);
//                else selection.remove(MAE434);
//                break;
//            case R.id.AMAE451:
//                if(checked) selection.add(MAE451);
//                else selection.remove(MAE479);
//                break;
//            case R.id.AMAE453:
//                if(checked) selection.add(MAE453);
//                else selection.remove(MAE453);
//                break;
//            case R.id.AMAE481:
//                if(checked) selection.add(MAE481);
//                else selection.remove(MAE481);
//                break;
//            case R.id.AMAE483:
//                if(checked) selection.add(MAE483);
//                else selection.remove(MAE483);
//                break;

            case R.id.AAEROCC1:
                if(checked) selection.add(CourseChoice1);
                else selection.remove(CourseChoice1);
                break;
            case R.id.AAEROCC2:
                if(checked) selection.add(CourseChoice2);
                else selection.remove(CourseChoice2);
                break;
            case R.id.AAEROCC3:
                if(checked) selection.add(CourseChoice3);
                else selection.remove(CourseChoice3);
                break;

        }
    }
    public void init(){
        MATH122 = new Course("Math 122");
        MATH123 = new Course("Math 123");
        MATH123.setPrerequisites(MATH122);

        MATH370A = new Course("MATH 370A");
        MATH370A.setPrerequisites(MATH123);

        PHYS151 = new Course("Phys 151");
        PHYS152 = new Course("Phys 152");
        PHYS152.setPrerequisites(PHYS151);

        CE205 = new Course("CE 200");
        CE205.setPrerequisites(MATH123);
        CE205.setPrerequisites(PHYS151);




        CHEM111A = new Course("CHEM 111A");

        CE205 = new Course("CE 205");
        CE205.setPrerequisites(PHYS151);

        ENGR101 = new Course("ENGR 101");
        ENGR102 = new Course("ENGR 102");
        ENGR102.setPrerequisites(ENGR101);

        ECON300 = new Course("MAE 300");

        MAE300 = new Course("ECON 300");
        MAE300.setPrerequisites(PHYS151);
        MAE300.setPrerequisites(PHYS152);
        MAE300.setPrerequisites(MATH224);

        MAE305 = new Course("MAE 305");
        MAE305.setPrerequisites(MAE205);
        MAE305.setPrerequisites(MATH370A);
        MAE330 = new Course("MAE 330");
        MAE330.setPrerequisites(MATH224);

        MAE333 = new Course("MAE 330");
        MAE333.setPrerequisites(CE205);
        MAE333.setPrerequisites(MATH370A);

        MAE334 = new Course("MAE 334");
        MAE334.setPrerequisites(MAE333);

        MAE350 = new Course("MAE 350");
        MAE350.setPrerequisites(CE205);

        MAE365 = new Course("MAE 365");
        MAE365.setPrerequisites(MAE373);

        MAE371 = new Course("MAE 371");
        MAE371.setPrerequisites(CE205);
        MAE371.setPrerequisites(MAE205);

        MAE373 = new Course("MAE 373");
        MAE373.setPrerequisites(CE205);

        MAE374 = new Course("MAE 374");
        MAE374.setPrerequisites(MAE373);
        MAE374.setPrerequisites(MAE300);

        MAE381 = new Course("MAE 381");
        MAE381.setPrerequisites(PHYS152);
        MAE381.setPrerequisites(MATH370A);
        MAE381.setPrerequisites(MAE371);


        MAE390 = new Course("MAE 390");

        MAE440 = new Course("MAE 440");
        MAE440.setPrerequisites(MAE300);
        MAE440.setPrerequisites(MAE334);

        MAE452 = new Course("MAE 452");
        MAE452.setPrerequisites(MAE330);
        MAE452.setPrerequisites(MAE334);

        MAE465 = new Course("MAE 465");
        MAE465.setPrerequisites(MAE365);

        MAE478 = new Course("MAE 478");
        MAE478.setPrerequisites(MAE334);
        MAE478.setPrerequisites(MAE365);
        MAE478.setPrerequisites(MAE481);

        MAE479 = new Course("MAE 479");
        MAE479.setPrerequisites(MAE478);

//        MAE434 = new Course("MAE 434");
//        MAE434.setPrerequisites(MAE334);
//
//        MAE451 = new Course("MAE 351");
//        MAE451.setPrerequisites(MAE334);
//        MAE451.setPrerequisites(MAE350);
//        MAE453 = new Course("MAE 453");
//        MAE453.setPrerequisites(MAE350);
//
//        MAE481 = new Course("MAE 481");
//        MAE481.setPrerequisites(MAE381);
//
//        MAE481 = new Course("MAE 483");
//        MAE481.setPrerequisites(MAE381);



        CourseChoice1 = new Course("Course Choice 1");
        CourseChoice2 = new Course("Course Choice 2");
        CourseChoice3 = new Course("Course Choice 3");
//        CourseChoice4 = new Course("Course Choice 4");
    }

    public void generateAERO(View view){

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
        Intent generate = new Intent(AeroActivity.this,GeneratedSchedule.class);
        generate.putExtras(b);
        AeroActivity.this.startActivity(generate);

    }
}