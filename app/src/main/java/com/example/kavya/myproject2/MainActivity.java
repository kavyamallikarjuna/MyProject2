package com.example.kavya.myproject2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity {

    int position1;  //variable declared to access the poaition of the item
    long id1;
    protected static final String EXTRA_RES_ID = "POS";
    //Names of the cars are stored
    String[] names = {"Aston Martin", "Audi_R8", "BMW", "Bugatti Veyron", "Ferrari", "Jaguar", "Lamborghoini", "Mercedes_SLR", "Porsche"};
    private ArrayList<Integer> mThumbCars = new ArrayList<Integer>(
            Arrays.asList(R.drawable.aston_martin1,
                    R.drawable.audi,
                    R.drawable.bmw1,
                    R.drawable.bugatti_1,
                    R.drawable.ferrari,
                    R.drawable.jaguar1,
                    R.drawable.lamborghini,
                    R.drawable.mercedes_slr1,
                    R.drawable.porsche1));

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageAdapter adapter = new ImageAdapter(MainActivity.this, names, mThumbCars);

        final GridView gridview = (GridView) findViewById(R.id.grid);
        gridview.setAdapter(adapter);

        //Short click on the item in the grid
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //position1 = position;
                Intent intent = new Intent(MainActivity.this, ImageViewActivity.class);
                intent.putExtra(EXTRA_RES_ID, (int) id);
                intent.putExtra("posit", position);
                //intent.putExtra("bool",true);
                startActivity(intent);
                //Log.i("Position1", String.valueOf(position1));
            }
        });

        //Long click on the item in the grid
        gridview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                position1 = position;
                id1=id;
                Log.i("Position1", String.valueOf(position1));
                registerForContextMenu(gridview);
                return false;
            }
        });
        Log.i("Pos1", String.valueOf(position1));

    }
    //Context menu creation
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        //MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.context_menu, menu);

    }
    //Item selectedin the menu
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Log.i("Pos2",String.valueOf(position1));

        switch (item.getItemId()) {
            case R.id.picguide:
                Intent intent2 = new Intent(MainActivity.this, ImageViewActivity2.class);
                intent2.putExtra(EXTRA_RES_ID, position1);
                Log.d("pos",position1+"");
                startActivity(intent2);
                return true;

            case R.id.webpage:
                Intent intent4 = new Intent(MainActivity.this,WebPageActivity.class);
                intent4.putExtra("position1",position1);
                startActivity(intent4);
                return true;

            case R.id.dealer:

                Intent intent1 = new Intent(MainActivity.this, DealerActivity.class);
                intent1.putExtra("position1",position1);
                startActivity(intent1);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
