package com.admalamalinchock.thedudleycolony.game.Achievements;

/**
 * Created by HoldenMalinchock on 6/4/15.
 */
import java.math.BigDecimal;
import com.admalamalinchock.thedudleycolony.game.Game;
public class Achievements
{
    protected String name = "";         //Variable for the name
    protected String description = "";      //variable for the description
    protected Boolean isActive = false;     //the test if the achievement is active, when it is active then the boolean is true
    protected int BuildingsID,numofBuildings;       //getting the ID of the building the achievement refers to and the number of buildings they own
    private BigDecimal rate = new BigDecimal("2");      //the multiplier for the achievements
    public Achievements(String title, String definition, int buildingID, int numBuilding)   //Constructor with the title defintion building it refers to and the number of that building they have
    {
        name = title;
        description = definition;
        BuildingsID = buildingID;
        numofBuildings = numBuilding;
    }
    public boolean isActive()   //method to check if the achievement is active
    {
        if(isActive == true)
        return true;
        else
            if(Game.buildingsList.get(BuildingsID).getNumOfBuildings().compareTo(new BigDecimal(""+numofBuildings))>=0)     //using the compareTo method to see if the number of buildings they have applies to the amount needed
            {
                isActive = true;
            }
        return isActive;
    }
    public BigDecimal getRate()
    {
        return rate;
    }   //returns rate
    public String getName(){
        return name;
    }       //returns the name
    public String getDescription(){
        return description;
    }       //returns the description
}
