package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class Earbuds extends Upgrade
{

    public Earbuds()
    {
        super(new BigDecimal(875), "Earbuds", "Small in-ear devices to play audio. Mostly used for music. The music increases the production of the Dudleys by giving them personalization. Multiplies Dudley gain by 2.5.",new BigDecimal("2.5"));
    }
}
