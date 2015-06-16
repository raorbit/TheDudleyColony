package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class RunningShoes extends Upgrade
{
    //using the super constructor from the Upgrade class
    public RunningShoes()
    {
        super(new BigDecimal(475), "Running Shoes", "Lightweight shoes used for running as well as making them more comfortable than regular shoes. Multiplies Dudley gain by 2.",new BigDecimal("2"));
    }
}
