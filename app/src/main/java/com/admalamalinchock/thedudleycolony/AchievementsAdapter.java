package com.admalamalinchock.thedudleycolony;
import android.support.v7.widget.RecyclerView;
import android.view.*;
import android.widget.TextView;
import com.admalamalinchock.thedudleycolony.game.Achievements.Achievements;
import com.admalamalinchock.thedudleycolony.game.Game;
/**
 * Created by Rahul on 6/8/2015.
 */
public class AchievementsAdapter extends RecyclerView.Adapter<AchievementsAdapter.AchievementViewHolder>{
    //Required constructor. Leaving it empty so that we can store all data in the Game class
    public AchievementsAdapter() {
    }
    //required method that tells RecyclerView how entries it should create
    @Override
    public int getItemCount() {
        return Game.achievementsList.size();
    }
    //called when a Achievement View is loaded into memory
    @Override
    public void onBindViewHolder(final AchievementViewHolder viewHolder, final int position) {
        viewHolder.bind(Game.getAchievements(position));

    }
    //Called by MainActivity when an AchievementEvent is created to tell the RecyclerView to remove a specific Achievement from view.
    public void activateAchievement(int i){
        notifyItemRemoved(i);
    }
    //Called by RecyclerView to create a ViewHolder on creation of the AchievementsFragment to begin caching data
    @Override
    public AchievementViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.achievement_layout, viewGroup, false);
        return new AchievementViewHolder(itemView);
    }
    //ViewHolder used to cache information about Achievements.
    public class AchievementViewHolder extends RecyclerView.ViewHolder {
        private TextView aTitle,aDescription;
        public AchievementViewHolder(View v) {
            super(v);
        }
        //called to display cached information on screen
        public void bind(Achievements a) {
            aTitle=(TextView) itemView.findViewById(R.id.achievement_title);
            aDescription=(TextView) itemView.findViewById(R.id.achievement_description);
            aTitle.setText(a.getName());
            aDescription.setText(a.getDescription());
        }
    }
}

