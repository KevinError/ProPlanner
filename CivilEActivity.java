package com.example.godblessk.eemajor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CivilEActivity extends AppCompatActivity {

    ArrayList<String> selection = new ArrayList<String>();
    TextView final_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_e);
        final_text = (TextView) findViewById(R.id.final_result);
    }

    public void selectItem(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.class1:
                if(checked)
                {selection.add("MATH 122");}
                else
                {selection.remove("MATH 122");}
                break;
            case R.id.class2:
                if(checked)
                {selection.add("MATH 123");}
                else
                {selection.remove("MATH 123");}
                break;
            case R.id.class3:
                if(checked)
                {selection.add("MATH 224");}
                else
                {selection.remove("MATH 224");}
                break;
            case R.id.class4:
                if(checked)
                {selection.add("MATH 370A");}
                else
                {selection.remove("MATH 370A");}
                break;
            case R.id.class5:
                if(checked)
                {selection.add("PHYS 151");}
                else
                {selection.remove("PHYS 151");}
                break;
            case R.id.class6:
                if(checked)
                {selection.add("PHYS 152");}
                else
                {selection.remove("PHYS 152");}
                break;
            case R.id.class7:
                if(checked)
                {selection.add("PHYS 254");}
                else
                {selection.remove("PHYS 254");}
                break;
            case R.id.class8:
                if(checked)
                {selection.add("EE 186");}
                else
                {selection.remove("EE 186");}
                break;
            case R.id.class9:
                if(checked)
                {selection.add("EE 200");}
                else
                {selection.remove("EE 200");}
                break;
            case R.id.class10:
                if(checked)
                {selection.add("EE 201");}
                else
                {selection.remove("EE 201");}
                break;
            case R.id.class11:
                if(checked)
                {selection.add("EE 202");}
                else
                {selection.remove("EE 202");}
                break;
            case R.id.class12:
                if(checked)
                {selection.add("CECS 100");}
                else
                {selection.remove("CECS 100");}
                break;
            case R.id.class13:
                if(checked)
                {selection.add("EE 211/2llL");}
                else
                {selection.remove("EE 211/2llL");}
                break;
            case R.id.class14:
                if(checked)
                {selection.add("ENGR 101");}
                else
                {selection.remove("ENGR 101");}
                break;
            case R.id.class15:
                if(checked)
                {selection.add("ENGR 102");}
                else
                {selection.remove("ENGR 102");}
                break;
            case R.id.class16:
                if(checked)
                {selection.add("EE 211L");}
                else
                {selection.remove("EE 211L");}
                break;
            case R.id.class17:
                if(checked)
                {selection.add("EE 220");}
                else
                {selection.remove("EE 220");}
                break;
            case R.id.class18:
                if(checked)
                {selection.add("EE 301");}
                else
                {selection.remove("EE 301");}
                break;
            case R.id.class19:
                if(checked)
                {selection.add("EE 330");}
                else
                {selection.remove("EE 330");}
                break;
            case R.id.class20:
                if(checked)
                {selection.add("EE 346");}
                else
                {selection.remove("EE 346");}
                break;
        }
    }

    public void finalSelection(View view)
    {
        String final_class_selection = "";

        for(String Selections : selection)
        {
            final_class_selection = final_class_selection + Selections + "\n";
        }
        final_text.setText(final_class_selection);
        final_text.setEnabled(true);

    }

}
