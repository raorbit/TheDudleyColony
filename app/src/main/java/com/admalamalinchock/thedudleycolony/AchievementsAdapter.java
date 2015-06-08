package com.admalamalinchock.thedudleycolony;

import android.support.v7.widget.RecyclerView;
import android.view.*;
import android.widget.TextView;
import com.admalamalinchock.thedudleycolony.game.Achievements.Achievements;
import com.admalamalinchock.thedudleycolony.game.Game;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Upgrade;

/**
 * Created by Rahul on 6/8/2015.
 */
public class AchievementsAdapter extends RecyclerView.Adapter<AchievementsAdapter.AchievementViewHolder>{
    public AchievementsAdapter() {
    }
    @Override
    public int getItemCount() {
        return Game.achievementsList.size();
    }
    @Override
    public void onBindViewHolder(final AchievementViewHolder viewHolder, final int position) {
        final Achievements x=Game.getAchievements(position);
        if(!x.isActive()) {
            viewHolder.bind(x);
        }
    }
    public void activateAchievement(int i){
            notifyItemRemoved(i);
    }
    @Override
    public AchievementViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.achievement_layout, viewGroup, false);
        return new AchievementViewHolder(itemView);
    }
    public class AchievementViewHolder extends RecyclerView.ViewHolder {
        private Achievements a;
        private TextView aTitle,aDescription;
        public AchievementViewHolder(View v) {
            super(v);
        }
        public void bind(Achievements u) {
            this.a=u;
            aTitle=(TextView) itemView.findViewById(R.id.achievement_title);
            aDescription=(TextView) itemView.findViewById(R.id.achievement_description);
            aTitle.setText(a.getName());
            aDescription.setText(a.getDescription());
        }
    }
}

