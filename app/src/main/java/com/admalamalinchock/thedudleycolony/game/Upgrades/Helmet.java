package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class Helmet extends Upgrade
{
    //using the super constructor from the Upgrade class
    public Helmet()
    {
        super(new BigDecimal(1250), "Helmet", "A cover to perfect deaths, from falling construction while Dudleys are working. Multiplies Dudley gain by 2.5.",new BigDecimal("2.5"));
    }
}
