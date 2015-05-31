package com.admalamalinchock.thedudleycolony.game;

/**
 * Created by HoldenMalinchock on 5/22/15.
 */
import java.math.*;
import com.admalamalinchock.thedudleycolony.game.Upgrades.*;
import com.admalamalinchock.thedudleycolony.game.Buildings.*;
public class Calculations
{
    protected static int IDgetter;
    protected static double price;
    public static int getID(String s)
    {
        for(int i = 0; i<1;i++)
        {
            if(s.equals("Tent"))
                IDgetter = 0;
            else if(s.equals("Shack"))
                IDgetter = 1;
            else if(s.equals("Town"))
                IDgetter = 2;
            else if(s.equals("City"))
                IDgetter = 3;
            else if(s.equals("State"))
                IDgetter = 4;
            else if(s.equals("Country"))
                IDgetter = 5;
            else if(s.equals("Continent"))
                IDgetter = 6;
            else if(s.equals("World"))
                IDgetter = 7;
            else if(s.equals("SolarSystem"))
                IDgetter = 8;

        }
        return IDgetter;
    }  public static BigDecimal factorUpgrades() {
    return new BigDecimal("1");

}






}
