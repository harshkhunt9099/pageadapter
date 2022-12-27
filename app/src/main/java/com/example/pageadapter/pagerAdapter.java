package com.example.pageadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class pagerAdapter extends PagerAdapter {

    int[] img = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four};

    MainActivity g;
    pagerAdapter(MainActivity g)
    {
        this.g=g;
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(g).inflate(R.layout.item,container,false);

        ImageView im =view.findViewById(R.id.im1);

        im.setImageResource(img[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
    //    @Override
//    public int getCount() {
//        return img.length;
//    }
//
//    @Override
//    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//        return view==object;
//    }
//
//    @Override
//    public void setPrimaryItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        container.removeView((View) object);
//
//    }
//
//    @NonNull
//    @Override
//    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//
//        View view = LayoutInflater.from(g).inflate(R.layout.item,container,false);
//
//        ImageView im =view.findViewById(R.id.im1);
//
//        im.setImageResource(img[position]);
//
//        container.addView(view);
//
//        return view;
//
//    }
}
