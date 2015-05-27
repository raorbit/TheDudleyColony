package com.admalamalinchock.thedudleycolony.game.Buildings;

/**
 * Created by HoldenMalinchock on 5/20/15.
 */

import java.math.BigDecimal;         //importing the BigDecimal so java can handle hugely ridiculous numbers
public class Continent extends Buildings
{
    public final int ID = 6;
    private double rate;        //like the getPrice method but we can change this for different buildings later in the main class
    public Continent(double rate)
    {
        super(new BigDecimal(200),"Continent");       //using the super class so that we can give the standard price and name of the building
        this.rate=rate;
    }
    public void  incrementPrice() {     //overriding the method so that the specific rate for the building changes
                                        // the price for that building alone.


        price.multiply(new BigDecimal(rate));


    }

}