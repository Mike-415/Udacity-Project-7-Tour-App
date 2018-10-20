package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguideapp.tourSites.AnnualEventsFragment;
import com.example.android.tourguideapp.tourSites.FamilySitesFragment;
import com.example.android.tourguideapp.tourSites.HistoricalSitesFragment;
import com.example.android.tourguideapp.tourSites.RestaurantsFragment;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private List<String> mTabTitles = new ArrayList<>();
//    private String mTabTitles[] = {
//            mContext.getString(R.string.tab1HistoricalSites) ,
//            mContext.getString(R.string.tab2LocalEvents) ,
//            mContext.getString(R.string.tab3Restaurants) ,
//            mContext.getString(R.string.tab4FamilyFriendly)
//    };

    public ViewPagerAdapter(FragmentManager fm , Context context){
        super(fm);
        mContext = context;
        mTabTitles.add( mContext.getString(R.string.tab1HistoricalSites) );
        mTabTitles.add( mContext.getString(R.string.tab2Restaurants) );
        mTabTitles.add( mContext.getString(R.string.tab3LocalEvents) );
        mTabTitles.add( mContext.getString(R.string.tab4FamilyEvents) );
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new HistoricalSitesFragment();
            case 1: return new RestaurantsFragment();
            case 2: return new AnnualEventsFragment();
            default: return new FamilySitesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles.get(position);
    }

    @Override
    public int getCount() {
        return mTabTitles.size();
    }


}
