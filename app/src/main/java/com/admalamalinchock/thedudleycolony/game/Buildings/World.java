package com.admalamalinchock.thedudleycolony.game.Buildings;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 5/22/15.
 */
public class World extends Building
{
    public final int ID = 7;

    public World() {
        super(new BigDecimal(50000),new BigDecimal("1.1"),new BigDecimal("5"),"World",2,7);

    }
}
