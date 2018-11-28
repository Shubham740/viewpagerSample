package com.mvvmsample.user.viewpagersample;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        CustomViewPagerAdapter customViewPagerAdapter =new CustomViewPagerAdapter(this,getSupportFragmentManager());

        customViewPagerAdapter.addFragments(new Tab1());
        customViewPagerAdapter.addFragments(new Tab2());
        customViewPagerAdapter.addFragments(new Tab3());
        // increase this limit if you have more tabs!
        viewPager.setOffscreenPageLimit(1);
        viewPager.setAdapter(customViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }


}


