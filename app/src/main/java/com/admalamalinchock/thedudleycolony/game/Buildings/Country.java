package com.admalamalinchock.thedudleycolony.game.Buildings;

import java.math.BigDecimal;         //importing the BigDecimal so java can handle hugely ridiculous numbers

/**
 * Created by HoldenMalinchock on 5/20/15.
 */
public class Country extends Building
{
    public final int ID = 5;

    public Country()
    {
        super(new BigDecimal(1),new BigDecimal("1.1"),new BigDecimal("5"),"Country",2,5);
    }

}
