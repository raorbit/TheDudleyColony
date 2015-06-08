package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class DiamondArmour extends Upgrade
{
    public DiamondArmour()
    {
        super(new BigDecimal(10000), "Diamond Armour", "The second most powerful armour possible. Crafted from pure diamonds and cut to perfectly fit the wearer. Multiplies Dudley gain by 2.75.",new BigDecimal("2.75"));
    }
}
