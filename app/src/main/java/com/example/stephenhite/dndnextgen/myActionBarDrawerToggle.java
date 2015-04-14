package com.example.stephenhite.dndnextgen;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;

/**
 * Created by Stephen Hite on 4/3/2015.
 */
public class myActionBarDrawerToggle extends ActionBarDrawerToggle {
    Activity mActivity;

    public myActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, int openDrawer, int closeDrawer) {
        super(activity, drawerLayout, openDrawer, closeDrawer);
        mActivity = activity;
    }

    @Override
    public void onDrawerOpened(View drawerView)
    {
            super.onDrawerOpened(drawerView);
            mActivity.setTitle(R.string.drawer_open);
//            mActivity.invalidateOptionsMenu();
    }

    @Override
    public void onDrawerClosed(View drawerView)
    {
            super.onDrawerClosed(drawerView);
//            mActivity.setTitle(R.string.menu_init);
//            mActivity.invalidateOptionsMenu();


    }

    @Override
    public void onDrawerSlide(View drawerView, float slideOffset)
    {
        super.onDrawerSlide(drawerView,slideOffset);
//        mActivity.invalidateOptionsMenu();
    }
}
