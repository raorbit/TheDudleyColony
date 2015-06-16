package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class ExoHelmet extends Upgrade
{
    //using the super constructor from the Upgrade class
    public ExoHelmet()
    {
        super(new BigDecimal(11500), "Exo Helmet", "Similar to a roman battle helmet these helmets are crafted robotics that cover the head and face leaving only the eyes visible. Multiplies Dudley gain by 3.",new BigDecimal("3"));
    }
}
