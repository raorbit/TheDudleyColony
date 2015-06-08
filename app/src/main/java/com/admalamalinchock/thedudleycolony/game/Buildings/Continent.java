package com.admalamalinchock.thedudleycolony.game.Buildings;

/**
 * Created by HoldenMalinchock on 5/20/15.
 */

import java.math.BigDecimal;         //importing the BigDecimal so java can handle hugely ridiculous numbers
public class Continent extends Building
{
    public final int ID = 6;

    public Continent()
    {
        super(new BigDecimal(35000),new BigDecimal("1.1"),new BigDecimal("5"),"Continent",2,6);
    }

}
