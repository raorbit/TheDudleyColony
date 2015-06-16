package com.admalamalinchock.thedudleycolony;

/**
 * Created by Rahul on 6/8/2015.
 */
//This class is used for communication from an anonymous thread to tell the application that an Achievement has been achieved and must be removed from view
public class AchievementEvent {
    //only needs to send an int to tell the AchievementsFragment RecyclerView to remove an Achievement from view
    public int pos;
    public AchievementEvent(int i){
        pos=i;
    }
}
