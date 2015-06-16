package com.admalamalinchock.thedudleycolony.game.Buildings;

import java.math.BigDecimal;         //importing the BigDecimal so java can handle hugely ridiculous numbers

/**
 * Created by HoldenMalinchock on 5/20/15.
 */
public class City extends Building
{
    public final int ID = 3;
    public City()
    {
        super(new BigDecimal(4000),new BigDecimal("1.1"),new BigDecimal("100"),"City",2,3);      //using the super class so that we can give the standard price and name of the building

    }




}
