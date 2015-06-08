package com.admalamalinchock.thedudleycolony;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.admalamalinchock.thedudleycolony.game.Buildings.*;
import com.admalamalinchock.thedudleycolony.game.*;
import java.util.ArrayList;
import java.util.List;

import de.greenrobot.event.EventBus;
public class BuildingsFragment extends Fragment  {
    BuildingAdapter ba;
    public static BuildingsFragment newInstance() {
        BuildingsFragment fragment = new BuildingsFragment();
      /*  Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
      args.putString(ARG_PARAM2, param2);
      fragment.setArguments(args);*/
        return fragment;
    }
    public BuildingsFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_buildings, container, false);
        RecyclerView recList = (RecyclerView) v.findViewById(R.id.buildingList);
        recList.setHasFixedSize(false);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);
        ba = new BuildingAdapter();
        recList.setAdapter(ba);
        recList.hasFixedSize();
        return v;
    }
}