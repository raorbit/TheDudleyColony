package com.admalamalinchock.thedudleycolony;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class AchievementsFragment extends Fragment  {
    public AchievementsAdapter aa;
    //Called by the ViewPager that manages Fragments in tabs
    public static AchievementsFragment newInstance() {
        AchievementsFragment fragment = new AchievementsFragment();
        return fragment;
    }
    public AchievementsFragment() {
        // Required empty public constructor
    }
    //called on the creation of the View object
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_achievements, container, false);
        //Creates a new RecyclerView from the XML file  in /res/layout/fragment_achievements.xml
        RecyclerView recList = (RecyclerView) v.findViewById(R.id.achievementList);
        //tells RecyclerView the list is dynamic
        recList.setHasFixedSize(false);
        //Sets a linearlayout for the list
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //tells manager the layout is vertical and sets the manager to the RecyclerView
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);
        //creates and sets adapter for recycler list
        aa = new AchievementsAdapter();
        recList.setAdapter(aa);
        return v;
    }
}
