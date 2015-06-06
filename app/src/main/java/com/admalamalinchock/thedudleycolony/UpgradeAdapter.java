package com.admalamalinchock.thedudleycolony;

/**
 * Created by Raorbit on 6/2/2015.
 */

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.admalamalinchock.thedudleycolony.game.Buildings.Building;
import com.admalamalinchock.thedudleycolony.game.Game;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Upgrade;
import com.admalamalinchock.thedudleycolony.uicomponents.TextRoundCornerProgressBar;

public class UpgradeAdapter extends RecyclerView.Adapter<UpgradeAdapter.UpgradeViewHolder> {


    public UpgradeAdapter() {


    }


    @Override
    public int getItemCount() {
        return Game.upgradesList.size();
    }

    @Override
    public void onBindViewHolder(final UpgradeViewHolder viewHolder, int position) {
        Upgrade x=Game.getUpgrade(position);
        if(!x.isActive()) {
            viewHolder.bind(x);
        }

    }

    @Override
    public UpgradeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.upgrade_layout, viewGroup, false);
        return new UpgradeViewHolder(itemView);
    }

    public class UpgradeViewHolder extends RecyclerView.ViewHolder {

        private Upgrade u;
        private Button buyButton;
        private TextView uTitle,uDescription;
        public UpgradeViewHolder(View v) {
            super(v);
        }

        public void buy(Upgrade a) {
            u = a;
            update();
        }

        public void update() {

        }

        public void bind(Upgrade u) {
            this.u=u;
            buyButton=(Button) itemView.findViewById(R.id.buyButton);
            uTitle=(TextView) itemView.findViewById(R.id.upgrade_title);
            uDescription=(TextView) itemView.findViewById(R.id.upgrade_description);
            uTitle.setText(u.getName());
            uDescription.setText(u.getDescription());

        }



    }

}