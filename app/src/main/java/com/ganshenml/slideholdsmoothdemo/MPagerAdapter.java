package com.ganshenml.slideholdsmoothdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Administrator on 2017/10/25.
 */

public class MPagerAdapter extends FragmentStatePagerAdapter {
    private String[] tabTitle = new String[]{"tab01", "tab02"};
    private FirstFragment firstFragment;
    private SecondFragment secondFragment;

    public MPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            if (firstFragment == null) {
                firstFragment = new FirstFragment();
            }
            return firstFragment;
        } else if (position == 1) {
            if (secondFragment == null) {
                secondFragment = new SecondFragment();
            }
            return secondFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabTitle.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }

}
