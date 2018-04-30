package com.example.godblessk.eemajor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ScheduleActivity extends AppCompatActivity {
    String[] allClassesEE = {"MATH 122", "MATH 123", "MATH 224", "MATH 370A", "PHYS 151", "PHYS 152", "PHYS 254",
            "EE 186", "EE 200", "EE 201", "EE 202", "CECS 100", "EE 211/2llL","ENGR 101", "ENGR 102",
            "EE 211L", "EE 220", "EE 301", "EE 310", "EE 330", "EE 346", "EE 350", "EE 360", "EE 370/370L",
            "EE 380", "EE 382", "EE 386", "EE 400D", "EE 430/430L"};

    String[] allClassesCE = {"MATH 122", "MATH 123", "MATH 224", "MAE 172", "PHYS 151", "CHEM 111A", "CE 101", "CE 130/130L", "CE 200/200L",
            "CE 205", "CE 206/206L", "ENGR 101", "ENGR 102", "BIOL 200/201", "EE 210/210L or PHYS 152", "CE 307",
            "CE 325", "CE 335", "CE 345", "CE 346", "CE 359", "CE 364", "CE 406", "CE 426", "CE 437", "CE 459", "CE 481",
            "CE 490", "GEOL 370", "MATH 370A", "MAE 330", "MAE 371", "MAE 373", "Elective (Ex. CE 427/427L, CE 458)", "Elective 2",
            "Lab (Ex. CE 326, CE 336)", "Lab 2"};

    ArrayList<String> selection;
    ArrayList<String> schedule;

    protected void onCreate (Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.activity_schedule);
        selection = (ArrayList<String>) getIntent().getSerializableExtra("selection");
        schedule = new ArrayList<>();
        removeTakenClassesEE();
        validClassesEE();
        makeSchedule();

        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, schedule);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String classSchedule = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(ScheduleActivity.this, classSchedule, Toast.LENGTH_SHORT).show();
                    }
                }
        );

    }

    public void removeTakenClassesEE()
    {
        for (String classEE : allClassesEE) {
            if (selection.contains(classEE)) {
                selection.remove(classEE);
            } else {
                selection.add(classEE);
            }
        }
    }

    public void validClassesEE()
    {
        if (selection.contains("MATH 224"))
        {
            selection.remove("MATH 370A");
            selection.remove("EE 360");
        }

        if (selection.contains("MATH 123"))
        {
            selection.remove("MATH 224");
            selection.remove("EE 211/2llL");
        }

        if (selection.contains("MATH 122"))
        {
            selection.remove("MATH 123");
        }

        if (selection.contains("PHYS 152"))
        {
            selection.remove("PHYS 254");
        }

        if (selection.contains("PHYS 151"))
        {
            selection.remove("PHYS 152");
        }

        if (selection.contains("ENGR 101"))
        {
            selection.remove("ENGR 102");
        }

        if (selection.contains("EE 201"))
        {
            selection.remove("EE 301");
            selection.remove("EE 346");
        }

        if (selection.contains("EE 211/2llL"))
        {
            selection.remove("EE 330");
            selection.remove("EE 310");
        }

        if (selection.contains("EE 310"))
        {
            selection.remove("EE 370");
            selection.remove("EE 382");
            selection.remove("EE 386");
            selection.remove("EE 360");
        }

        if (selection.contains("EE 330"))
        {
            selection.remove("EE 430");
        }

        if(selection.contains("EE 382") || selection.contains("EE 386"))
        {
            selection.remove("EE 400D");
        }
    }

    public void makeSchedule()
    {
        for (int i = 0; i < selection.size(); i++)
        {
            if (schedule.size() > 4)
            {
                break;
            }
            else
            {
                schedule.add(selection.get(i));
            }
        }
    }

    public void removeTakenClassesCE()
    {
        for (String classEE : allClassesCE) {
            if (selection.contains(classEE)) {
                selection.remove(classEE);
            } else {
                selection.add(classEE);
            }
        }
    }

    public void validClassesCE()
    {
        if (selection.contains("MATH 224"))
        {
            selection.remove("MATH 370A");
            selection.remove("EE 360");
            selection.remove("CE 335");
            selection.remove("MAE 330");
        }

        if (selection.contains("MATH 123"))
        {
            selection.remove("MATH 224");
            selection.remove("EE 211/2llL");
        }

        if (selection.contains("MATH 122"))
        {
            selection.remove("MATH 123");
            selection.remove("CE 206/206L");
        }


        if (selection.contains("PHYS 152"))
        {
            selection.remove("PHYS 254");
        }

        if (selection.contains("PHYS 151"))
        {
            selection.remove("PHYS 152");
            selection.remove("CE 205");
            selection.remove("CE 206/206L");
            selection.remove("MAE 330");
        }

        if (selection.contains("ENGR 101"))
        {
            selection.remove("ENGR 102");
        }

        if (selection.contains("CE 200"))
        {
            selection.remove("CE 459");
        }

        if (selection.contains("CE 205"))
        {
            selection.remove("CE 335");
            selection.remove("MAE 371");
            selection.remove("MAE 373");
        }

        if (selection.contains("CE 206/206L"))
        {
            selection.remove("CE 307");
            selection.remove("GEOL 370");
            selection.remove("MAE 371");
        }

        if (selection.contains("MATH 224"))
        {
            selection.remove("CE 335");
        }

        if (selection.contains("MAE 373"))
        {
            selection.remove("CE 359");
        }

        if (selection.contains("BIOL 200/201"))
        {
            selection.remove("CE 364");
        }

        if (selection.contains("CE 335"))
        {
            selection.remove("CE 437");
        }

        if (selection.contains("CE 345"))
        {
            selection.remove("CE 426");
        }

        if (selection.contains("CE 359"))
        {
            selection.remove("CE 437");
        }
        if (selection.contains("MATH 370A"))
        {
            selection.remove("CE 437");
        }

        if (selection.contains("CE 459"))
        {
            selection.remove("CE 490");
        }
    }
}
