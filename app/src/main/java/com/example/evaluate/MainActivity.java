package com.example.evaluate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView itemListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemListView = findViewById(R.id.itemListView);

        List<Item> items = generateSamplePosts();
        ItemAdapter adapter = new ItemAdapter(this, items);
        itemListView.setAdapter(adapter);


    }
    private List<Item> generateSamplePosts() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("what do you think about course ?",2," add comment " , "which language do you use?"));
        items.add(new Item("what do you think about course time ?",4," add comment ","what is your favorite language ?"));


        return items;
    }
}