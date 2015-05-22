package com.admalamalinchock.thedudleycolony.game;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 5/22/15.
 */
public class World extends Buildings
{

    private double rate;        //like the getPrice method but we can change this for different buildings later in the main class
    public World(double rate)
    {
        super(new BigDecimal(8),"World");       //using the super class so that we can give the standard price and name of the building
        this.rate=rate;
    }
    public void  incrementPrice() {     //overriding the method so that the specific rate for the building changes
        // the price for that building alone.


        price.multiply(new BigDecimal(rate));


    }



}
