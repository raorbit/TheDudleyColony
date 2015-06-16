package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class Hat extends Upgrade
{
    //using the super constructor from the Upgrade class
    public Hat()
    {
        super(new BigDecimal(300), "Hat", "A simple cover-up to block the sun off the face. Multiplies Dudley gain by 2.",new BigDecimal("2"));
    }
}
