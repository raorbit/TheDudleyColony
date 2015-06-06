package com.admalamalinchock.thedudleycolony;

/**
 * Created by Raorbit on 5/29/2015.
 */

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.admalamalinchock.thedudleycolony.game.Buildings.Building;
import com.admalamalinchock.thedudleycolony.game.Game;
import com.admalamalinchock.thedudleycolony.uicomponents.TextRoundCornerProgressBar;

public class BuildingAdapter extends RecyclerView.Adapter<BuildingAdapter.BuildingViewHolder> {

    public BuildingAdapter() {

    }


    @Override
    public int getItemCount() {
        return Game.buildingsList.size();
    }

    @Override
    public void onBindViewHolder(final BuildingViewHolder viewHolder, int position) {
        viewHolder.bind(Game.buildingsList.get(position));
        final int pn = position;
        viewHolder.buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Game.getBuilding(pn).isFirstBuilding()) {
                    viewHolder.run();
                }
                viewHolder.buy(Game.getBuilding(pn));

            }
        });
    }

    @Override
    public BuildingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.building_layout, viewGroup, false);
        return new BuildingViewHolder(itemView);
    }

    public class BuildingViewHolder extends RecyclerView.ViewHolder {

        protected TextRoundCornerProgressBar progress1;
        protected Button buyButton;
        private Handler mHandler = new Handler();
        private Building b;

        public BuildingViewHolder(View v) {
            super(v);
        }

        public void buy(Building a) {
            b = a;
            b.buy();
            update();
        }

        public void update() {
            progress1.setTextProgress(b.getPayout().toString());
            buyButton.setText(b.getName() + ":" + b.getNumOfBuildings().toString() + "\nBuy:" + b.getPrice().toString());
        }

        public void bind(Building b) {
            this.b = b;
            buyButton = (Button) itemView.findViewById(R.id.buy_button);
            progress1 = (TextRoundCornerProgressBar) itemView.findViewById(R.id.progress);
            progress1.setProgressColor(Color.parseColor("#ed3b27"));
            progress1.setBackgroundColor(Color.parseColor("#808080"));
            progress1.setMax(100);
            progress1.setProgress(0);
            progress1.setTextColor(Color.parseColor("#FFFFFF"));
            progress1.setTextSize(20);
            buyButton.setText(b.getName() + ":" + b.getNumOfBuildings().toString() + "\nBuy:" + b.getPrice().toString());
            progress1.setTextProgress(b.getPayout().toString());
        }

        public void run() {
            new Thread(new Runnable() {
                public void run() {
                    while (b.mProgressStatus < 100) {
                        mHandler.post(new Runnable() {
                            public void run() {
                                progress1.setProgress(b.mProgressStatus);
                            }
                        });
                        b.mProgressStatus++;
                        if (b.mProgressStatus == 100) {
                            b.mProgressStatus = 0;
                            b.Payout();


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

    }

}