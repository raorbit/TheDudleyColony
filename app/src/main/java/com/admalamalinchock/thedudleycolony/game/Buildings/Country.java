package com.admalamalinchock.thedudleycolony.game.Buildings;

import java.math.BigDecimal;         //importing the BigDecimal so java can handle hugely ridiculous numbers

/**
 * Created by HoldenMalinchock on 5/20/15.
 */
public class Country extends Building
{
    public final int ID = 5;    //creating the ID for this building

    public Country()
    {
        super(new BigDecimal(20000),new BigDecimal("1.1"),new BigDecimal("1000"),"Country",2,5);       //using the super constructor
    }

}
