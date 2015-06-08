package com.admalamalinchock.thedudleycolony;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class UpgradesFragment extends Fragment  {
    public static UpgradesFragment newInstance() {
        UpgradesFragment fragment = new UpgradesFragment();
        return fragment;
    }
    public UpgradesFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_upgrades, container, false);
        RecyclerView recList = (RecyclerView) v.findViewById(R.id.upgradeList);
        recList.setHasFixedSize(false);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);
        UpgradeAdapter ua = new UpgradeAdapter();
        recList.setAdapter(ua);
        return v;
    }
}