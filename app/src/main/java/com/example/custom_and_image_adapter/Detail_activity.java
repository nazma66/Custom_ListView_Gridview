package com.example.custom_and_image_adapter;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detail_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textView_headline = findViewById(R.id.textView_headline);
        TextView textView_repname = findViewById(R.id.textView_repname);
        TextView textView_date = findViewById(R.id.textView_date);
        TextView textView_details = findViewById(R.id.textView_details);

        ImageView imageView2 = findViewById(R.id.imageView2);
        int receivedImageId = getIntent().getExtras().getInt("imageId");
        imageView2.setImageResource(receivedImageId);

        textView_headline.setText(getIntent().getExtras().getString("headline"));
        textView_repname.setText(getIntent().getExtras().getString("repname"));
        textView_date.setText(getIntent().getExtras().getString("date"));
        textView_details.setText(getIntent().getExtras().getString("details"));


    }
}