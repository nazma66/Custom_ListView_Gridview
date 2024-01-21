package com.example.custom_and_image_adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

//setTitle("GridViewActivity");

        GridView gridView =(GridView)findViewById(R.id.gridView);
        gridView.setAdapter(new Image_Adapter01(this) );
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity3.this,Image_Adapter02.class);
                i.putExtra("id", position);
                startActivity(i);
            }
        });

    }
}