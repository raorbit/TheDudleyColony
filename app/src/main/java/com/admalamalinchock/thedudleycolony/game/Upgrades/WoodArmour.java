package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class WoodArmour extends Upgrade
{
    //using the super constructor from the Upgrade class
    public WoodArmour()
    {
        super(new BigDecimal(1700), "Wood Armour", "Little to no protection but its better than nothing. Multiplies Dudley gain by 2.75.",new BigDecimal("2.75"));
    }
}
