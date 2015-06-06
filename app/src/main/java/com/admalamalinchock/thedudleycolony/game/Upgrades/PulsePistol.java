package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class PulsePistol extends Upgrade
{
    public PulsePistol()
    {
        super(new BigDecimal(500), "Pulse Pistol", "A largely powerful pistol capable mass killing. Multiplies Dudley gain by 4.5.",new BigDecimal("4.5"));
    }
}
