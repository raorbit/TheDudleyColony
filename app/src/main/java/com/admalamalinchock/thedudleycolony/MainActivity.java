package com.admalamalinchock.thedudleycolony;
import com.admalamalinchock.thedudleycolony.game.Game;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import android.os.Bundle;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import de.greenrobot.event.EventBus;
import io.karim.MaterialTabs;
public class MainActivity extends AppCompatActivity  {
    @InjectView(R.id.toolbar)
    Toolbar mToolbar;
    @InjectView(R.id.material_tabs)
    MaterialTabs mMaterialTabs;
    @InjectView(R.id.view_pager)
    ViewPager mViewPager;
    private SamplePagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        mToolbar.setTitle("$" + Game.getBalance());
        setSupportActionBar(mToolbar);
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        int numberOfTabs = 5;
        adapter = new SamplePagerAdapter(getSupportFragmentManager(), numberOfTabs);
        mViewPager.setAdapter(adapter);
        mViewPager.setOffscreenPageLimit(5);
        mMaterialTabs.setViewPager(mViewPager); final int pageMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 4, getResources().getDisplayMetrics());
        mViewPager.setPageMargin(pageMargin);
    }
    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }
    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }
    public void onEvent(BalanceEvent event){
        final String f=event.message;
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mToolbar.setTitle(f);
            }
        });
    }
    public class SamplePagerAdapter extends FragmentPagerAdapter {
        private final String[] TITLES = {"Building", "Upgrade", "Achievements", "Stats", "Prestige", "ITEM SIX", "ITEM SEVEN", "ITEM EIGHT",
                "ITEM NINE", "ITEM TEN", "ITEM ELEVEN"};
        private final ArrayList<String> mTitles;
        public BuildingsFragment bf;
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
                    bf=BuildingsFragment.newInstance();
                    return bf;
                }
                case 1:{
                    return UpgradesFragment.newInstance();
                }
                case 2:{
                    break;
                }
                case 3:{
                    return StatsFragment.newInstance();
                }
                case 4:{
                    return PrestigeFragment.newInstance();
                }
            }
            return SampleFragment.newInstance(position);
        }
        }


            }

