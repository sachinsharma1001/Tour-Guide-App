package com.example.sachi.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PlaceFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "History", "Markets", "Temples","Hotels" };

    public PlaceFragmentPagerAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoricalFragment();
        } else if (position == 1){
            return new MarketsFragment();
        } else if (position == 2){
            return new OthersFragment();
        } else {
            return new RestrurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
