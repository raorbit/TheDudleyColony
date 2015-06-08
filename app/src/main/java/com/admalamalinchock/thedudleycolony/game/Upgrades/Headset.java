package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class Headset extends Upgrade
{
    public Headset()
    {
        super(new BigDecimal(1000), "Headset", "Over the ear audio out putters to improve sounds. Also considered very fashionable. Multiplies Dudley gain by 2.5.",new BigDecimal("2.5"));
    }
}
