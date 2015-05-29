package com.admalamalinchock.thedudleycolony;

/**
 * Created by Raorbit on 5/29/2015.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import android.os.*;
import android.widget.TextView;

import com.admalamalinchock.thedudleycolony.game.Buildings.Buildings;

import java.util.List;


public class BuildingAdapter extends RecyclerView.Adapter<BuildingAdapter.BuildingViewHolder> {

    private List<Buildings> buildingList;
    private int mProgressStatus=0;
    private Handler mHandler = new Handler();
    public BuildingAdapter(List<Buildings> x) {
        this.buildingList =x;


    }


    @Override
    public int getItemCount() {
        return buildingList.size();
    }

    @Override
    public void onBindViewHolder(final BuildingViewHolder buildingViewHolder, int i) {
        /*new Thread(new Runnable() {
            public void run() {
                while (mProgressStatus < 100) {


                    // Update the progress bar
                    mHandler.post(new Runnable() {
                        public void run() {
                           buildingViewHolder.sellProgress.setProgress(mProgressStatus);
                        }
                    });
                    mProgressStatus++;
                    if(mProgressStatus==100){
                        mProgressStatus=0;
                    }
                }
            }
        }).start();*/

    }

    @Override
    public BuildingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.building_layout, viewGroup, false);

        return new BuildingViewHolder(itemView);
    }

    public static class BuildingViewHolder extends RecyclerView.ViewHolder {

        protected ProgressBar sellProgress;
        protected Button buyButton;

        public BuildingViewHolder(View v) {
            super(v);
            sellProgress =  (ProgressBar) v.findViewById(R.id.progress);
            buyButton = (Button)  v.findViewById(R.id.buy_button);
        }
    }
}