package com.admalamalinchock.thedudleycolony.game.Buildings;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 5/22/15.
 */
public class SolarSystem extends Building
{
    public final int ID = 8;

    public SolarSystem()
    {
        super(new BigDecimal(75000),new BigDecimal("1.1"),new BigDecimal("999999"),"SolarSystem",2,8);   //using the super constructor
    }
}
