package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class SpaceSuit extends Upgrade
{
    //using the super constructor from the Upgrade class
    public SpaceSuit()
    {
        super(new BigDecimal(35000), "Space Suit", "A suit that you can use to get around in space and perform maintenance tasks on aircraft. Multiplies Dudley gain by 5.",new BigDecimal("5"));
    }
}
