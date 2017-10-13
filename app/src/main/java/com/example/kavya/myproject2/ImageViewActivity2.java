package com.example.kavya.myproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import static android.R.attr.id;

public class ImageViewActivity2 extends AppCompatActivity {

    private int cars[] = {R.drawable.aston_martin1,
            R.drawable.audi,
            R.drawable.bmw1,
            R.drawable.bugatti_1,
            R.drawable.ferrari,
            R.drawable.jaguar1,
            R.drawable.lamborghini,
            R.drawable.mercedes_slr1,
            R.drawable.porsche1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //get the intent used to start the activity
        Intent intent = getIntent();
        ImageView imageView = new ImageView(getApplicationContext());

        int position = intent.getIntExtra("POS",0);
        imageView.setImageResource(cars[position]);
        setContentView(imageView);

    }
}