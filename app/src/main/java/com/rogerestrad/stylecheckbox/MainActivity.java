package com.rogerestrad.stylecheckbox;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    CheckBox chkBold,chkItalic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.txt);
        chkBold = (CheckBox) findViewById(R.id.chkBold);
        chkItalic = (CheckBox) findViewById(R.id.chkItalic);

        chkBold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkBold.isChecked())
                    editText.setTypeface(null, Typeface.BOLD);
                else
                    editText.setTypeface(null, Typeface.NORMAL);
            }
        });
        chkItalic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkItalic.isChecked())
                    editText.setTypeface(null, Typeface.ITALIC);
                else
                    editText.setTypeface(null, Typeface.NORMAL);
            }
        }) ;
    }

}
