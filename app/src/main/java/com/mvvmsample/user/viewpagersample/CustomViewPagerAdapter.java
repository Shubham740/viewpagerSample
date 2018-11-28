package com.mvvmsample.user.viewpagersample;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 19/7/17.
 * author Shubham Gupta
 */

public class CustomViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragments;
    private Context mContext;//TODO:not required
    private int position;

    public CustomViewPagerAdapter(Context context, FragmentManager supportFragmentManager) {
        //content not required either pass fragmentManager or context
        super(supportFragmentManager);
        mFragments = new ArrayList<>();
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    public void addFragments(Fragment fragment) {
        mFragments.add(fragment);
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return mFragments.size();
    }


    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }




}
