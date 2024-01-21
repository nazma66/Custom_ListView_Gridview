package com.example.custom_and_image_adapter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Image_Adapter02 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_adapter02);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");

        Image_Adapter01 ImageAdapter01 = new Image_Adapter01(this);
        ImageView imageView = (ImageView)findViewById(R.id.imageView2);
        imageView.setImageResource(ImageAdapter01.imageArray[position]);
    }
}
