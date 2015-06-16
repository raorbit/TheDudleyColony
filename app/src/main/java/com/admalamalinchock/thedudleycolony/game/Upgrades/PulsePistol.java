package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class PulsePistol extends Upgrade
{
    //using the super constructor from the Upgrade class
    public PulsePistol()
    {
        super(new BigDecimal(25000), "Pulse Pistol", "A largely powerful pistol capable mass killing. Multiplies Dudley gain by 4.5.",new BigDecimal("4.5"));
    }
}
