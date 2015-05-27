package com.admalamalinchock.thedudleycolony.game;

/**
 * Created by HoldenMalinchock on 5/22/15.
 */
import java.math.*;
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
    }

    public static double getPrice(int specificIDnum)        //Still need to factor Upgrades and presteiges
    {

        for(int i = 0; i<9;i++)
        {
            if(specificIDnum == i)
                IDgetter =i;
        }
        if(IDgetter == 0)
            return 1.0;
        else if(IDgetter == 1)
            return 10.0;
        else if(IDgetter == 2)
            return 45.0;
        else if(IDgetter == 3)
            return 75.0;
        else if(IDgetter == 4)
            return 100.0;
        else if(IDgetter == 5)
            return 150.0;
        else if(IDgetter == 6)
            return 200.0;
        else if(IDgetter == 7)
            return 265.0;
        else
        return 350.0;



    }




}
