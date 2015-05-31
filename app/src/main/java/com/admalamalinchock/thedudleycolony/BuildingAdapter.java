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
import android.os.*;
import com.admalamalinchock.thedudleycolony.game.Buildings.Buildings;
import com.admalamalinchock.thedudleycolony.uicomponents.*;

import java.util.List;


public class BuildingAdapter extends RecyclerView.Adapter<BuildingAdapter.BuildingViewHolder> {

    private List<Buildings> buildingList;

    public BuildingAdapter(List<Buildings> x) {
        this.buildingList =x;


    }


    @Override
    public int getItemCount() {
        return buildingList.size();
    }

    @Override
    public void onBindViewHolder(final BuildingViewHolder viewHolder, int position) {
        viewHolder.buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewHolder.setProgress(0);
            }
        });
    }

    @Override
    public BuildingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.building_layout, viewGroup,false);
        return new BuildingViewHolder(itemView);
    }

    public static class BuildingViewHolder extends RecyclerView.ViewHolder {

        protected TextRoundCornerProgressBar progress1;
        protected Button buyButton;
        public int mProgressStatus=0;
        private Handler mHandler = new Handler();

        public BuildingViewHolder(View v) {
            super(v);
            buyButton = (Button)  v.findViewById(R.id.buy_button);
            progress1 = (TextRoundCornerProgressBar) itemView.findViewById(R.id.progress);
            progress1.setProgressColor(Color.parseColor("#ed3b27"));
            progress1.setBackgroundColor(Color.parseColor("#808080"));
            progress1.setMax(100);
            progress1.setProgress(100);
            progress1.setTextProgress("6.5498E8");
            progress1.setTextColor(Color.parseColor("#FFFFFF"));
            progress1.setTextSize(20);
            new Thread(new Runnable() {
                public void run() {
                    while (mProgressStatus < 100) {


                        mHandler.post(new Runnable() {
                            public void run() {
                               progress1.setProgress(mProgressStatus);
                            }
                        });
                        mProgressStatus++;
                        if(mProgressStatus==100){
                            mProgressStatus=0;
                        }
                        try {
                            Thread.sleep(25);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();

        }
        public void setProgress(float x){
            mProgressStatus=0;
            progress1.setProgress(mProgressStatus);
        }
    }
}