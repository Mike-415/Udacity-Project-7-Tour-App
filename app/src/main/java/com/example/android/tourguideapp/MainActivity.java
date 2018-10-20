package com.example.android.tourguideapp;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @BindView(R.id.view_pager) ViewPager   mViewPager;
    @BindView(R.id.sliding_tabs) TabLayout mTabLayout;
    
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
        initViewPagerAndTabLayout();
    }

    /**
     *  Initializes the ViewPager and TabLayout
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void initViewPagerAndTabLayout(){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), this);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setElevation(8);
    }

}
