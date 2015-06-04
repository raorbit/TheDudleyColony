package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class Clothes extends Upgrade
{

    public Clothes()
    {
        super(new BigDecimal(1), "Clothes", "Simple cover ups for the Dudleys. This provides privacy to the Dudleys to increase production. Multiplies Dudley gain by 2.",new BigDecimal("2."));
    }
}
