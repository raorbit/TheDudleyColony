package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class SuperSpaceSuit extends Upgrade
{
    public SuperSpaceSuit()
    {
        super(new BigDecimal(680), "Super Space Suit", "Not combat ready but lasts much longer than the regular suit. No more running out of oxygen! Multiplies Dudley gain by 5.",new BigDecimal("5"));
    }
}
