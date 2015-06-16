package com.admalamalinchock.thedudleycolony.game.Buildings;

import java.math.BigDecimal;        //importing the BigDecimal so java can handle hugely ridiculous numbers

/**
 * Created by HoldenMalinchock on 5/20/15.
 */
public class State extends Building
{
    public final int ID = 4;

    public State()
    {
        super(new BigDecimal(8000),new BigDecimal("1.1"),new BigDecimal("5"),"State",2,4);  //using the super constructor
    }

}
