package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class IronArmour extends Upgrade
{
    public IronArmour()
    {
        super(new BigDecimal(2500), "Iron Armour", "Its better than wood. Protects from almost nothing but at least it is something. Multiplies Dudley gain by 2.75.",new BigDecimal("2.75"));
    }
}
