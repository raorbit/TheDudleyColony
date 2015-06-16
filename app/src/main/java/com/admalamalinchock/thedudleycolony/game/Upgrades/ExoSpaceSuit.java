package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class ExoSpaceSuit extends Upgrade
{
    //using the super constructor from the Upgrade class
    public ExoSpaceSuit()
    {
        super(new BigDecimal(40000), "Exo Space Suit", "The newest and greatest space suit available. It is combat ready for space assaults. Multiplies Dudley gain by 5.5.",new BigDecimal("5.5"));
    }
}
