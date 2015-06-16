package com.admalamalinchock.thedudleycolony;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class BuildingsFragment extends Fragment  {
    BuildingAdapter ba;
    //Required method to create an instance of this Fragment for the ViewPager that manges the Tab view system
    public static BuildingsFragment newInstance() {
        BuildingsFragment fragment = new BuildingsFragment();
        return fragment;
    }
    public BuildingsFragment() {
        // Required empty public constructor
    }
    //called on creation of the View object
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_buildings, container, false);
        //Creates a new RecyclerView from the XML file  in /res/layout/fragment_buildings.xml
        RecyclerView recList = (RecyclerView) v.findViewById(R.id.buildingList);
        //Sets a linearlayout for the list
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //tells manager the layout is vertical and sets the manager to the RecyclerView
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);
        //creates and sets adapter for recycler list
        ba = new BuildingAdapter();
        recList.setAdapter(ba);
        //tells RecyclerView the list is static
        recList.hasFixedSize();
        return v;
    }
}