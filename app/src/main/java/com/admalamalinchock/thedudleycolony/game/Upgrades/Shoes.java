package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class Shoes extends Upgrade
{
    //using the super constructor from the Upgrade class
    public Shoes()
    {
        super(new BigDecimal(140), "Shoes", "Simple leather to wrap around the feet to reduce foot injuries at work. Multiplies Dudley gain by 2.",new BigDecimal("2"));
    }
}
