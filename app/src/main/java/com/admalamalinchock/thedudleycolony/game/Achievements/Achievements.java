package com.admalamalinchock.thedudleycolony.game.Achievements;

/**
 * Created by HoldenMalinchock on 6/4/15.
 */
import java.math.BigDecimal;
import com.admalamalinchock.thedudleycolony.game.Game;
public class Achievements
{
    protected String name = "";
    protected String description = "";
    protected Boolean isActive = false;
    protected int BuildingsID,numofBuildings;
    private BigDecimal rate = new BigDecimal("2");
    public Achievements(String title, String definition, int buildingID, int numBuilding)
    {
        name = title;
        description = definition;
        BuildingsID = buildingID;
        numofBuildings = numBuilding;
    }
    public boolean isActive()
    {
        if(isActive == true)
        return true;
        else
            if(Game.buildingsList.get(BuildingsID).getNumOfBuildings().compareTo(new BigDecimal(""+numofBuildings))>=0)
            {
                isActive = true;
            }
        return isActive;
    }
    public BigDecimal getRate()
    {
        return rate;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
}
