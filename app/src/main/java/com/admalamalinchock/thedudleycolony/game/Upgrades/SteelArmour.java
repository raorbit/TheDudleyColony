package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class SteelArmour extends Upgrade
{
    public SteelArmour()
    {
        super(new BigDecimal(5000), "Steel Armour", "Better than Iron but not the best. Multiplies Dudley gain by 2.75.",new BigDecimal("2.75"));
    }
}
