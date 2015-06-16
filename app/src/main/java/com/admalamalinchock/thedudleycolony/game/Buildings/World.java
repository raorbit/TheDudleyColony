package com.admalamalinchock.thedudleycolony.game.Buildings;

import java.math.BigDecimal;     //importing the BigDecimal so java can handle hugely ridiculous numbers

/**
 * Created by HoldenMalinchock on 5/22/15.
 */
public class World extends Building
{
    public final int ID = 7;

    public World() {
        super(new BigDecimal(50000),new BigDecimal("1.1"),new BigDecimal("98765"),"World",2,7); //using the super constructor

    }
}
