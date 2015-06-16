package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class Sunglasses extends Upgrade
{
    //using the super constructor from the Upgrade class
    public Sunglasses()
    {
        super(new BigDecimal(350), "Sunglasses", "Gets the sun out of your eyes. Multiplies Dudley gain by 2.",new BigDecimal("2"));

    }

}
