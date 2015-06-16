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
    //required method that tells RecyclerView how entries it should create
    @Override
    public int getItemCount() {
        return Game.buildingsList.size();
    }
    //called when a Building View is loaded into memory
    @Override
    public void onBindViewHolder(final BuildingViewHolder viewHolder, int position) {
        viewHolder.bind(Game.buildingsList.get(position));
        final int pn = position;
        //sets an on click listener and details what happens when it is clicked
        viewHolder.buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checking if the thread that increments balanace for a specific building needs to be created and if so starts it
                if (Game.getBuilding(pn).isActive() == false && Game.getBuilding(pn).getPrice().compareTo(Game.getBalance()) <= 0) {
                    viewHolder.run(Game.getBuilding(pn).ID);
                    Game.getBuilding(pn).setActive();
                }
                //buys a Building only if Building price is less than or equal to Balance
                viewHolder.buy(Game.getBuilding(pn));

            }
        });
        viewHolder.progress1.setProgress(Game.buildingsList.get(position).mProgressStatus);
    }
    //Called by RecyclerView to create a ViewHolder on creation of the BuildingsFragment to begin caching data
    @Override
    public BuildingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.building_layout, viewGroup, false);
        return new BuildingViewHolder(itemView);
    }
    //ViewHolder used to cache information about buildings.
    public class BuildingViewHolder extends RecyclerView.ViewHolder {
        //instance data
        protected TextRoundCornerProgressBar progress1;
        protected Button buyButton;
        private Handler mHandler = new Handler();
        private Building b;
        //required constructor
        public BuildingViewHolder(View v) {
            super(v);
            //tells RecyclerView not to recycle the view when offscreen
            setIsRecyclable(false);
        }
        //called when the buy button is clicked
        public void buy(Building a) {
            b = a;
            b.buy();
            Game.checkAchievements();
            update();

        }
        //called to update the screen after values have changed
        public void update() {
            progress1.setTextProgress(Game.format(b.getPayout(),4));
            buyButton.setText(b.getName() + ":" + b.getNumOfBuildings().toString() + "\nBuy:" + Game.format(b.getPrice(),2));
        }
        //call when a View is created in the Building RecyclerView
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
            update();
            if(b.isActive()){
                 progress1.setProgress(b.mProgressStatus);
                updateProgress();
            }
        }
        //Thread that increments balance
        public void run(int i) {
            final int ii=i;
            new Thread(new Runnable() {
                public void run() {
                    while (Game.getBuilding(ii).mProgressStatus < 100) {
                        mHandler.post(new Runnable() {
                            public void run() {
                                progress1.setProgress(Game.getBuilding(ii).mProgressStatus);
                                progress1.setTextProgress(Game.format(b.getPayout(),4));
                            }
                        });
                        Game.getBuilding(ii).mProgressStatus++;
                        if (Game.getBuilding(ii).mProgressStatus == 100) {
                            Game.getBuilding(ii).mProgressStatus = 0;
                            Game.getBuilding(ii).Payout();
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
        //thread that animates the onscreen progress bar
        public void updateProgress(){
            new Thread(new Runnable() {
                public void run() {
                    while (b.mProgressStatus < 100) {
                        mHandler.post(new Runnable() {
                            public void run() {
                                progress1.setProgress(Game.getBuilding(b.ID).mProgressStatus);
                            }
                        });
                        try {
                            Thread.sleep(30);
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
    }
}