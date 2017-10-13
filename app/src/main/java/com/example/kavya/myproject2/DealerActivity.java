package com.example.kavya.myproject2;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DealerActivity extends ListActivity {

    String[] aston={"Napleton's Aston martin of Chicago,Michigan avenue, Chicago, 60611","Aston Services, Washington street, Chicago, 60606","Aston Martin Centre, State street, Chicago, 60601"};
    String[] audi={"Fletcher Jones Audi, Michigan avenue, Chicago, 60611","Audi Service and Repair, Randolph street, Chicago, 60614","Smith's Audi center, Millenium street, Chicago, 60657"};
    String[] bmw={"Perillo BMW, Michigan avenue, Chicago, 60611","BMW of Barrington, Randolph street, Chicago, 60614","Patrick BMW, Clark street, 60601"};
    String[] bugatti={"Bugatti Services,Michigan avenue,Chicago, 60611","Bugatti repir center, Washington street, Chicago, 60606","Bugatti center of excellence,Millenium street, Chicago, 60657"};
    String[] ferrari={"Ferrari center, Michigan avenue, Chicago, 60611","Ferrari repairs, Randolph street,  Chicago, 60614","Ferrari works,State streetm, Chicago, 60601"};
    String[] jaguar={"Jones Jaguar, LaSalle, Chicago,60610","Jaguar Services, Randolph street, Chicago, 60614","Fletcher Jaguar, Millenium street, Chicago, 60657"};
    String[] lamborghini={"Lamborghini services, Lasalle, Chicago, 60610","Lamborghini house, State street, Chicago, 60601","Lamborghini center, Millenium street, Chicago, 60657"};
    String[] mercedes={"Hoffman Estate, Columbus drive","Mercedes center, Randolph street, Chicago, 60614","Smiths' Millenium street,Chicago, 60657"};
    String[] porsche={"Porsche house,Washington street","Porche Collections, Randolph street, Chicago, 60614","John's Millenium street,Chicago, 60657"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        int pos=intent.getIntExtra("position1",0);
        switch (pos){
            case 0:
                setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_dealer,aston));
                ListView lv = getListView();
                lv.setTextFilterEnabled(true);
                break;
            case 1:
                setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_dealer,audi));
                ListView lv1 = getListView();
                lv1.setTextFilterEnabled(true);
                break;
            case 2:
                setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_dealer,bugatti));
                ListView lv2 = getListView();
                lv2.setTextFilterEnabled(true);
                break;
            case 3:
                setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_dealer,bmw));
                ListView lv3 = getListView();
                lv3.setTextFilterEnabled(true);
                break;
            case 4:
                setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_dealer,ferrari));
                ListView lv4 = getListView();
                lv4.setTextFilterEnabled(true);
                break;
            case 5:
                setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_dealer,jaguar));
                ListView lv5 = getListView();
                lv5.setTextFilterEnabled(true);
                break;
            case 6:
                setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_dealer,lamborghini));
                ListView lv6 = getListView();
                lv6.setTextFilterEnabled(true);
                break;
            case 7:
                setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_dealer,mercedes));
                ListView lv7 = getListView();
                lv7.setTextFilterEnabled(true);
                break;
            case 8:
                setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_dealer,porsche));
                ListView lv8 = getListView();
                lv8.setTextFilterEnabled(true);
                break;
        }
    }
}
