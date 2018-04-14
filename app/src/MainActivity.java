package com.example.godblessk.listmajors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<String>();
    TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button doneBtn = (Button) findViewById(R.id.doneBtn);
        doneBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
            }
        };
    }

    public void selectItem(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.class1:
                if(checked)
                {selection.add("CECS 100");}
                else
                {selection.remove("CECS 100");}
                break;
            case R.id.class2:
                if(checked)
                {selection.add("CECS 174");}
                else
                {selection.remove("CECS 174");}
                break;
            case R.id.class3:
                if(checked)
                {selection.add("CECS 274");}
                else
                {selection.remove("CECS 274");}
                break;
            case R.id.class4:
                if(checked)
                {selection.add("CECS 277");}
                else
                {selection.remove("CECS 277");}
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
