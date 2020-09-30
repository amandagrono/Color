package com.example.color;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ColorAdapter extends BaseAdapter {

    Context context;
    String[] colorArray;
    int[] colorInt;

    public ColorAdapter(Context context, String[] colorArray, int[] colorInt){
        this.context = context;
        this.colorArray = colorArray;
        this.colorInt = colorInt;
    }
    @Override
    public int getCount(){
        return colorArray.length;
    }
    @Override
    public String getItem(int i){
        return colorArray[i];
    }
    @Override
    public long getItemId(int i){
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        TextView textView = new TextView(context);
        textView.setText(getItem(position));
        textView.setBackgroundColor(colorInt[position]);
        textView.setTextSize(24);
        textView.setTextColor(Color.BLACK);
        return textView;
    }




}
