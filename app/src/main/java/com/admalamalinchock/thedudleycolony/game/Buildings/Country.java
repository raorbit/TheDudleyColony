package com.admalamalinchock.thedudleycolony.game.Buildings;

import java.math.BigDecimal;         //importing the BigDecimal so java can handle hugely ridiculous numbers

/**
 * Created by HoldenMalinchock on 5/20/15.
 */
public class Country extends Buildings
{
    public final int ID = 5;
    private double rate;        //like the getPrice method but we can change this for different buildings later in the main class
    public Country(double rate)
    {
       // super(new BigDecimal(150),"Country");      //using the super class so that we can give the standard price and name of the building
        this.rate=rate;
    }
    public void  incrementPrice() {     //overriding the method so that the specific rate for the building changes
        // the price for that building alone.


        price.multiply(new BigDecimal(rate));


    }





}
