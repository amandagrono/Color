package com.example.color;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Gray", "Purple", "Lime", "White", "Magenta", "Cyan"};
        final int[] colorInts = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.LTGRAY, Color.parseColor("#800080"), Color.parseColor("#00FF00"), Color.WHITE, Color.parseColor("#FF00FF"), Color.parseColor("#00FFFF")};

        ColorAdapter colorAdapter = new ColorAdapter(this, colors, colorInts);

        spinner.setAdapter(colorAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                View rootView = view.getRootView();
                rootView.setBackgroundColor(colorInts[i]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}