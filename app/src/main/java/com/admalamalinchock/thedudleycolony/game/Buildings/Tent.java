package com.admalamalinchock.thedudleycolony.game.Buildings;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 5/22/15.
 */
public class Tent extends Building
{
    public final int ID = 0;
           //like the getPrice method but we can change this for different buildings later in the main class
    public Tent()
    {
        super(new BigDecimal("1"),new BigDecimal("1.1"),new BigDecimal("5"),"Tent",2,0);       //using the super class so that we can give the standard price and name of the building

    }



}
