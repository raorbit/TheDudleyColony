package com.admalamalinchock.thedudleycolony.game.Achievements;

/**
 * Created by HoldenMalinchock on 6/4/15.
 */
import java.math.BigDecimal;
import com.admalamalinchock.thedudleycolony.game.Game; //importing the game class

public class Achievements
{
    protected String name = "";         //name for the constructor
    protected String description = "";      //description for the constructor
    protected Boolean isActive = false;     //boolean used to check if the achievement is active
    protected int BuildingsID,numofBuildings;       //two more variables for the constructor
    private BigDecimal rate = new BigDecimal("2");      //the standard rate that the achievements will give as a bonus for achieving them




    public Achievements(String title, String definition, int buildingID, int numBuilding)       //constructor with the title, definition, ID of the building it references
    {                                                                                           // and the number of that building the achievement requires
        name = title;
        description = definition;
        BuildingsID = buildingID;
        numofBuildings = numBuilding;

    }
    public boolean isActive()       //method that will allow us to test if the specific achievement is active
    {
        if(isActive == true)
        return true;
        else
            if(Game.buildingsList.get(BuildingsID).getNumOfBuildings().compareTo(new BigDecimal(""+numofBuildings))<=0)
            {
                isActive = true;
            }
        return isActive;

    }
    public BigDecimal getRate()
    {
        return rate;
    }                   //Giving a method to use in another class for multiplying the rate







}
