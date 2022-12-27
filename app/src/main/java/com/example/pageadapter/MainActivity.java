package com.example.pageadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    ViewPager gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.g1);


        pagerAdapter g = new pagerAdapter(this);

        gridView.setAdapter(g);
    }
}