package com.example.kavya.myproject2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kavya on 01-10-2017.
 */

public class ImageAdapter extends BaseAdapter{
    Context mContext;
    final String[] names;
    private List<Integer> mThumbCars;
    private static final int PADDING = 8;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 300;

    //Saves the image id and names and context
    public ImageAdapter(Context c,String[] names,List<Integer> cars ) {

        mContext = c;
        this.mThumbCars = cars;
        this.names = names;
    }
    //returns the number of items in the adapter
    @Override
    public int getCount(){
        return names.length;
    }
    //returns data item at position
    @Override
    public Object getItem(int position){
        return mThumbCars.get(position);
    }

    @Override
    public long getItemId(int position){
        return mThumbCars.get(position);
    }
    //returns the image view and text view
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.grid_display, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
            textView.setText(names[position]);
            imageView.setImageResource(mThumbCars.get(position));


        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}
