package com.admalamalinchock.thedudleycolony;

import com.admalamalinchock.thedudleycolony.game.Game;
import com.readystatesoftware.systembartint.SystemBarTintManager;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import io.karim.MaterialTabs;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.toolbar)
    Toolbar mToolbar;

    @InjectView(R.id.material_tabs)
    MaterialTabs mMaterialTabs;

    @InjectView(R.id.view_pager)
    ViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        setSupportActionBar(mToolbar);

        // Apply background tinting to the Android system UI when using KitKat translucent modes.
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        int numberOfTabs = 5;


        SamplePagerAdapter adapter = new SamplePagerAdapter(getSupportFragmentManager(), numberOfTabs);
        mViewPager.setAdapter(adapter);
        mViewPager.setOffscreenPageLimit(5);
        mMaterialTabs.setViewPager(mViewPager);


        final int pageMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 4, getResources().getDisplayMetrics());
        mViewPager.setPageMargin(pageMargin);
    }






    public class SamplePagerAdapter extends FragmentPagerAdapter {

        private final String[] TITLES = {"Building", "Upgrade", "Achievements", "Stats", "Prestige", "ITEM SIX", "ITEM SEVEN", "ITEM EIGHT",
                "ITEM NINE", "ITEM TEN", "ITEM ELEVEN"};

        private final ArrayList<String> mTitles;

        public SamplePagerAdapter(FragmentManager fm, int numberOfTabs) {
            super(fm);
            mTitles = new ArrayList<>();
            for (int i = 0; i < numberOfTabs; i++) {
                mTitles.add(TITLES[i]);
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles.get(position);
        }

        @Override
        public int getCount() {
            return mTitles.size();
        }

        @Override
        public Fragment getItem(int position) {

                switch (position){
                case 0:{
                    return BuildingsFragment.newInstance();


                }
                case 1:{
                    break;

                }
                case 2:{
                    break;

                }
                case 3:{
                    break;

                }
                case 4:{
                    break;

                }
            }
            return SampleFragment.newInstance(position);
        }
    }
}
