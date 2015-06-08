package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class Rifle extends Upgrade
{
    public Rifle()
    {
        super(new BigDecimal(20000), "Rifle", "A large gun specializing in long range engages. Multiplies Dudley gain by 4.",new BigDecimal("4"));
    }
}
