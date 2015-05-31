package com.admalamalinchock.thedudleycolony.game.Buildings;

import java.math.BigDecimal;         //importing the BigDecimal so java can handle hugely ridiculous numbers

/**
 * Created by HoldenMalinchock on 5/20/15.
 */
public class City extends Building
{
    public final int ID = 3;
    public City(double rate)
    {
        super(new BigDecimal(75),new BigDecimal(rate),"City");      //using the super class so that we can give the standard price and name of the building

    }




}
