package com.example.evaluate;


import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class ListDrop extends AppCompatActivity {


    Spinner spinner;
    String [] languages = { "python ", " c# "," java","php"} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner1);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.drop_down_menu,languages);
        spinner.setAdapter(arrayAdapter);

    }

    }
