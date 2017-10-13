package com.example.kavya.myproject2;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.attr.id;
import static com.example.kavya.myproject2.R.id.gridview;

public class ImageViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //get the intent used to start the activity
        Intent intent = getIntent();
        ImageView imageView = new ImageView(getApplicationContext());


        imageView.setImageResource(intent.getIntExtra(MainActivity.EXTRA_RES_ID, id));
        final int position1=intent.getIntExtra("posit",0);
        setContentView(imageView);

        int mpos=imageView.getId();
        Log.i("pos",String.valueOf(mpos));
        Log.i("ids",String.valueOf(id));
        Log.i("position1",String.valueOf(position1));
        GridView gridView=(GridView)findViewById(R.id.gridview);
        //opening the browser by clicking on the image
            imageView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);

                    switch (position1) {
                        case 0:
                            intent.setData(Uri.parse("https://global.astonmartin.com/en-us"));
                            break;

                        case 1:
                            intent.setData(Uri.parse("https://www.audiusa.com/"));
                            break;

                        case 2:
                            intent.setData(Uri.parse("https://www.bmw.co.uk/en/index.html"));
                            break;

                        case 3:
                            intent.setData(Uri.parse("https://www.bugatti.com/home/"));
                            break;

                        case 4:
                            intent.setData(Uri.parse("https://www.ferrari.com/en-US"));
                            break;

                        case 5:
                            intent.setData(Uri.parse("https://www.jaguarusa.com/index.html"));
                            break;

                        case 6:
                            intent.setData(Uri.parse("https://www.lamborghini.com/en-en/"));
                            break;

                        case 7:
                            intent.setData(Uri.parse("https://www.mbusa.com/mercedes/index"));
                            break;

                        case 8:
                            intent.setData(Uri.parse("https://www.porsche.com/"));
                            break;
                    }
                    startActivity(intent);
                }
            });
        }

}
