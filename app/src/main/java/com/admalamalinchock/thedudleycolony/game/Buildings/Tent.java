package com.admalamalinchock.thedudleycolony.game.Buildings;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 5/22/15.
 */
public class Tent extends Building
{
    public final int ID = 0;
    private double rate;        //like the getPrice method but we can change this for different buildings later in the main class
    public Tent(double rate)
    {
      //  super(new BigDecimal(1),"Tent");       //using the super class so that we can give the standard price and name of the building
        this.rate=rate;
    }
    public void  incrementPrice()       //overriding the method so that the specific rate for the building changes
    // the price for that building alone.
    {


        price.multiply(new BigDecimal(rate));





    }


}
