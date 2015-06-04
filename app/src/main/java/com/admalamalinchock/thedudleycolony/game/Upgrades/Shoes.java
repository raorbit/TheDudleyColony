package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class Shoes extends Upgrade
{
    public Shoes()
    {
        super(new BigDecimal(4), "Shoes", "Simple leather to wrap around the feet to reduce foot injuries at work. Multiplies Dudley gain by 2.",new BigDecimal("2"));
    }
}
