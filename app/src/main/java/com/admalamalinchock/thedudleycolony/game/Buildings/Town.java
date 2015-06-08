package com.admalamalinchock.thedudleycolony.game.Buildings;

/**
 * Created by HoldenMalinchock on 5/20/15.
 */

import java.math.BigDecimal;         //importing the BigDecimal so java can handle hugely ridiculous numbers
public class Town extends Building {
    public final int ID = 2;

    public Town() {
        super(new BigDecimal(1000),new BigDecimal("1.1"),new BigDecimal("5"),"Town",2,2);
    }
}
