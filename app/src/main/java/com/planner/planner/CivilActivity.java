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

//Activity for Civil major
//chooses classes for the user

public class CivilActivity extends AppCompatActivity {

    private ArrayList<Course> selection = new ArrayList<>();
    private ArrayList<Course> allCourses = new ArrayList<>();
    private ArrayList<Course> schedule = new ArrayList<>();
    private Course MATH122,MATH123,MATH224,MATH370A,PHYS151,PHYS152,ENGR101,ENGR102,BIO200,CHEM111A;
    private Course MAE172,MAE330,MAE371,MAE373,CE101,CE130,CE130L,CE200,CE200L,CE205,CE206,CE206L;
    private Course CE307,CE325,CE326,CE335,CE336,CE345,CE345L,CE359,CE364,CE364L;
    private Course CE406,CE426,CE437,CE445,CE459,CE481,CE490,MAJORELECTIVE1,MAJORELECTIVE2;

    private String[] array;
    private ArrayList<String> swap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);
        init();

        Bundle b = this.getIntent().getExtras();
        array=b.getStringArray("schedule");
        swap = b.getStringArrayList("swap");

        allCourses.add(MATH122);
        allCourses.add(MATH123);
        allCourses.add(MATH224);
        allCourses.add(MATH370A);

        allCourses.add(PHYS151);
        allCourses.add(PHYS152);

        allCourses.add(ENGR101);
        allCourses.add(ENGR102);

        allCourses.add(BIO200);
        allCourses.add(CHEM111A);

        allCourses.add(MAE172);
        allCourses.add(MAE330);
        allCourses.add(MAE371);
        allCourses.add(MAE373);

        allCourses.add(CE101);
        allCourses.add(CE130);
        allCourses.add(CE130L);

        allCourses.add(CE200);
        allCourses.add(CE200L);

        allCourses.add(CE205);
        allCourses.add(CE206);
        allCourses.add(CE206L);

        allCourses.add(CE307);
        allCourses.add(CE325);
        allCourses.add(CE326);
        allCourses.add(CE335);
        allCourses.add(CE336);

        allCourses.add(CE345);
        allCourses.add(CE345L);

        allCourses.add(CE359);

        allCourses.add(CE364);
        allCourses.add(CE364L);

        allCourses.add(CE406);
        allCourses.add(CE426);
        allCourses.add(CE437);
        allCourses.add(CE445);

        allCourses.add(CE459);
        allCourses.add(CE481);
        allCourses.add(CE490);

        allCourses.add(MAJORELECTIVE1);
        allCourses.add(MAJORELECTIVE2);
    }

    public void selectItemCivil(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.CMATH122:
                if(checked) selection.add(MATH122);
                else selection.remove(MATH122);
                break;

            case R.id.CMATH123:
                if(checked) selection.add(MATH123);
                else selection.remove(MATH123);
                break;

            case R.id.CMATH224:
                if(checked) selection.add(MATH224);
                else selection.remove(MATH224);
                break;

            case R.id.CMATH370A:
                if(checked) selection.add(MATH370A);
                else selection.remove(MATH370A);
                break;

            case R.id.CPHYS151:
                if(checked) selection.add(PHYS151);
                else selection.remove(PHYS151);
                break;

            case R.id.CPHYS152:
                if(checked) selection.add(PHYS152);
                else selection.remove(PHYS152);
                break;

            case R.id.CBIO200:
                if(checked) selection.add(BIO200);
                else selection.remove(BIO200);
                break;

            case R.id.CCHEM111A:
                if(checked) selection.add(CHEM111A);
                else selection.remove(CHEM111A);
                break;

            case R.id.CENGR101:
                if(checked) selection.add(ENGR101);
                else selection.remove(ENGR101);
                break;

            case R.id.CENGR102:
                if(checked) selection.add(ENGR102);
                else selection.remove(ENGR102);
                break;

            case R.id.CMAE172:
                if(checked) selection.add(MAE172);
                else selection.remove(MAE172);
                break;

            case R.id.CMAE330:
                if(checked) selection.add(MAE330);
                else selection.remove(MAE330);
                break;

            case R.id.CMAE371:
                if(checked) selection.add(MAE371);
                else selection.remove(MAE371);
                break;

            case R.id.CMAE373:
                if(checked) selection.add(MAE373);
                else selection.remove(MAE373);
                break;

            case R.id.CCE101:
                if(checked) selection.add(CE101);
                else selection.remove(CE101);
                break;

            case R.id.CCE130:
                if(checked) selection.add(CE130);
                else selection.remove(CE130);
                break;

            case R.id.CCE130L:
                if(checked) selection.add(CE130L);
                else selection.remove(CE130L);
                break;

            case R.id.CCE200:
                if(checked) selection.add(CE200);
                else selection.remove(CE200);
                break;

            case R.id.CCE200L:
                if(checked) selection.add(CE200L);
                else selection.remove(CE200L);
                break;

            case R.id.CCE205:
                if(checked) selection.add(CE205);
                else selection.remove(CE205);
                break;

            case R.id.CCE206:
                if(checked) selection.add(CE206);
                else selection.remove(CE206);
                break;

            case R.id.CCE206L:
                if(checked) selection.add(CE206L);
                else selection.remove(CE206L);
                break;

            case R.id.CCE307:
                if(checked) selection.add(CE307);
                else selection.remove(CE307);
                break;

            case R.id.CCE325:
                if(checked) selection.add(CE325);
                else selection.remove(CE325);
                break;

            case R.id.CCE326:
                if(checked) selection.add(CE326);
                else selection.remove(CE326);
                break;

            case R.id.CCE335:
                if(checked) selection.add(CE335);
                else selection.remove(CE335);
                break;

            case R.id.CCE336:
                if(checked) selection.add(CE336);
                else selection.remove(CE336);
                break;

            case R.id.CCE345:
                if(checked) selection.add(CE345);
                else selection.remove(CE345);
                break;

            case R.id.CCE345L:
                if(checked) selection.add(CE345L);
                else selection.remove(CE345L);
                break;

            case R.id.CCE359:
                if(checked) selection.add(CE359);
                else selection.remove(CE359);
                break;

            case R.id.CCE364:
                if(checked) selection.add(CE364);
                else selection.remove(CE364);
                break;

            case R.id.CCE364L:
                if(checked) selection.add(CE364L);
                else selection.remove(CE364L);
                break;

            case R.id.CCE406:
                if(checked) selection.add(CE406);
                else selection.remove(CE406);
                break;

            case R.id.CCE426:
                if(checked) selection.add(CE426);
                else selection.remove(CE426);
                break;

            case R.id.CCE437:
                if(checked) selection.add(CE437);
                else selection.remove(CE437);
                break;

            case R.id.CCE445:
                if(checked) selection.add(CE445);
                else selection.remove(CE445);
                break;

            case R.id.CCE459:
                if(checked) selection.add(CE459);
                else selection.remove(CE459);
                break;

            case R.id.CCE481:
                if(checked) selection.add(CE481);
                else selection.remove(CE481);
                break;

            case R.id.CCE490:
                if(checked) selection.add(CE490);
                else selection.remove(CE490);
                break;

            case R.id.CMAJOR1:
                if(checked) selection.add(MAJORELECTIVE1);
                else selection.remove(MAJORELECTIVE1);
                break;

            case R.id.CMAJOR2:
                if(checked) selection.add(MAJORELECTIVE2);
                else selection.remove(MAJORELECTIVE2);
                break;
        }
    }


    public void init(){
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

        ENGR101 = new Course("ENGR 101");

        ENGR102 = new Course("ENGR 102");
        ENGR102.setPrerequisites(ENGR101);

        BIO200 = new Course("BIO 200");
        CHEM111A = new Course("CHEM 111A");

        MAE172 = new Course("MAE 172");

        MAE330 = new Course("MAE 330");
        MAE330.setPrerequisites(MATH224);
        MAE330.setPrerequisites(PHYS151);
        MAE330.setPrerequisites(CHEM111A);

        MAE371 = new Course("MAE371");
        MAE371.setPrerequisites(CE205);
        MAE371.setPrerequisites(CE206);

        MAE373 = new Course("MAE 373");
        MAE373.setPrerequisites(CE205);

        CE101 = new Course("CE 101");

        CE130 = new Course("CE 130");
        CE130L = new Course("CE 130L");

        CE200 = new Course("CE 200");
        CE200.setPrerequisites(CHEM111A);
        CE200.setPrerequisites(PHYS151);

        CE200L = new Course("CE 200L");
        CE200L.setPrerequisites(CHEM111A);
        CE200L.setPrerequisites(PHYS151);

        CE205 = new Course("CE 205");
        CE205.setPrerequisites(PHYS151);
        CE205.setPrerequisites(MATH123);

        CE206 = new Course("CE 206");
        CE206.setPrerequisites(MATH122);
        CE206.setPrerequisites(PHYS151);

        CE206L = new Course("CE 206L");
        CE206L.setPrerequisites(MATH122);
        CE206L.setPrerequisites(PHYS151);

        CE307 = new Course("CE 307");
        CE307.setPrerequisites(CE206);

        CE325 = new Course("CE 325");

        CE326 = new Course("CE 326");
        CE326.setPrerequisites(CE130);
        CE326.setPrerequisites(CE130L);
        CE326.setPrerequisites(CE205);

        CE335 = new Course("CE 335");
        CE335.setPrerequisites(MATH224);
        CE335.setPrerequisites(CE205);

        CE336 = new Course("CE 336");
        CE336.setPrerequisites(CE335);

        CE345 = new Course("CE 345");
        CE345L = new Course("CE 345L");

        CE359 = new Course("CE 359");
        CE359.setPrerequisites(MAE373);

        CE364 = new Course("CE 364");
        CE364.setPrerequisites(CE335);

        CE364L = new Course("CE 364L");
        CE364.setPrerequisites(CE335);

        CE406 = new Course("CE 406");

        CE426 = new Course("CE 426");
        CE426.setPrerequisites(CE345);

        CE437 = new Course("CE 437");
        CE437.setPrerequisites(CE335);
        CE437.setPrerequisites(MATH370A);

        CE445 = new Course("CE 445");
        CE445.setPrerequisites(CE345);

        CE459 = new Course("CE 459");
        CE459.setPrerequisites(CE200);
        CE459.setPrerequisites(CE359);
        CE481 = new Course("CE 481");

        CE490 = new Course("CE 490");
        CE490.setPrerequisites(CE459);
        CE490.setPrerequisites(CE307);
        CE490.setPrerequisites(CE325);
        CE490.setPrerequisites(CE335);
        CE490.setPrerequisites(CE345);
        CE490.setPrerequisites(CE345L);
        CE490.setPrerequisites(CE359);
        CE490.setPrerequisites(CE364);
        CE490.setPrerequisites(CE364L);

        MAJORELECTIVE1 = new Course("MAJOR ELECTIVE1");
        MAJORELECTIVE2 = new Course("MAJOR ELECTIVE2");
    }

    public void generateCivil(View view){

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
        Intent generate = new Intent(CivilActivity.this,GeneratedSchedule.class);
        generate.putExtras(b);
        CivilActivity.this.startActivity(generate);
    }

}