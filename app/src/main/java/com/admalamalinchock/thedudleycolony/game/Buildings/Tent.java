package com.admalamalinchock.thedudleycolony.game.Buildings;

import java.math.BigDecimal;     //importing the BigDecimal so java can handle hugely ridiculous numbers

/**
 * Created by HoldenMalinchock on 5/22/15.
 */
public class Tent extends Building
{
    public final int ID = 0;

    public Tent()
    {
        super(new BigDecimal("1"),new BigDecimal("1.1"),new BigDecimal("2"),"Tent",2,0);       //using the super class so that we can give the standard price and name of the building

    }



}
