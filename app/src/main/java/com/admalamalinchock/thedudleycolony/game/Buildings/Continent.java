package com.admalamalinchock.thedudleycolony.game.Buildings;

/**
 * Created by HoldenMalinchock on 5/20/15.
 */

import java.math.BigDecimal;         //importing the BigDecimal so java can handle hugely ridiculous numbers
public class Continent extends Building
{
    public final int ID = 6;    //creating the ID for this building

    public Continent()
    {
        super(new BigDecimal(35000),new BigDecimal("1.1"),new BigDecimal("6666"),"Continent",2,6); //using the super constructor
    }

}
