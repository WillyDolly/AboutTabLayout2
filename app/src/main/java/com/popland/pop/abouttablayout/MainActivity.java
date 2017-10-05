package com.popland.pop.abouttablayout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);

        PagerAdapterFragment adapter = new PagerAdapterFragment(getSupportFragmentManager());
        adapter.AddFragment(new FragmentA(), "one");
        adapter.AddFragment(new FragmentB(),"two");
        adapter.AddFragment(new FragmentC(),"three");
        viewPager.setAdapter(adapter);//create ViewPagers and sliding action
        tabLayout.setupWithViewPager(viewPager);//set tabs Clickable
    }
}
