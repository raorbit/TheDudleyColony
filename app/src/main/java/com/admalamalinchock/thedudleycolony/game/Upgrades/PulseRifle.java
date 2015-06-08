package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class PulseRifle extends Upgrade
{
    public PulseRifle()
    {
        super(new BigDecimal(30000), "Pulse Rifle", "The most powerful weapon of its time.Multiplies Dudley gain by 4.5",new BigDecimal("4.5"));
    }
}
