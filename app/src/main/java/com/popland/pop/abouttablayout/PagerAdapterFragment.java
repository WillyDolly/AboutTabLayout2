package com.popland.pop.abouttablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by hai on 22/07/2016.
 */
public class PagerAdapterFragment extends FragmentPagerAdapter {
    ArrayList<Fragment> arrlFragment = new ArrayList<Fragment>();
    ArrayList<String> arrlTitle = new ArrayList<String>();

    public PagerAdapterFragment(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return arrlFragment.size();
    }

    public void AddFragment(Fragment fragment,String title){
        arrlFragment.add(fragment);
        arrlTitle.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return arrlFragment.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {//set Titles for tabs
        return arrlTitle.get(position);
    }
}
