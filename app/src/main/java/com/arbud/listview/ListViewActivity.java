package com.arbud.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;
    ArrayAdapter<String> arrayAdapter_parent;
    ArrayList<String> arrayList_parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = findViewById(R.id.list_view);

        //toolbar name
        getSupportActionBar().setTitle("ListView Sederhana");

        // array negara
        arrayList_parent = new ArrayList<>();
        arrayList_parent.add("Indonesia");
        arrayList_parent.add("Malaysia");
        arrayList_parent.add("Singapura");
        arrayList_parent.add("Italia");
        arrayList_parent.add("Inggris");
        arrayList_parent.add("Belanda");
        arrayList_parent.add("Argentina");
        arrayList_parent.add("Chile");
        arrayList_parent.add("Mesir");
        arrayList_parent.add("Uganda");

        arrayAdapter_parent = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList_parent);
        listView.setAdapter(arrayAdapter_parent);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String negara = arrayList_parent.get(position).toString();
                Toast.makeText(parent.getContext(),"Memilih : "+ negara,Toast.LENGTH_SHORT).show();
            }
        });

    }
}