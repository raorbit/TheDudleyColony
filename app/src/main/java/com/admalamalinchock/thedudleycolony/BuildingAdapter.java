package com.admalamalinchock.thedudleycolony;

/**
 * Created by Raorbit on 5/29/2015.
 */
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import android.os.*;
import android.widget.TextView;

import com.admalamalinchock.thedudleycolony.game.Buildings.Buildings;
import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;

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

        protected RoundCornerProgressBar progress1;
        protected Button buyButton;

        public BuildingViewHolder(View v) {
            super(v);
            buyButton = (Button)  v.findViewById(R.id.buy_button);
            progress1 = (RoundCornerProgressBar) itemView.findViewById(R.id.progress);
            progress1.setProgressColor(Color.parseColor("#ed3b27"));
            progress1.setBackgroundColor(Color.parseColor("#808080"));
            progress1.setMax(100);
            progress1.setProgress(15);
        }
    }
}