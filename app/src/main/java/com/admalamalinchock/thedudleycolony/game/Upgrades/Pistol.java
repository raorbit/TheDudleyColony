package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class Pistol extends Upgrade
{
    //using the super constructor from the Upgrade class
    public Pistol()
    {
        super(new BigDecimal(15000), "Pistol", "A basic weapon. Requires a skilled shot. Its not an army without weapons. Multiplies Dudley gain by 4.",new BigDecimal("4"));
    }
}
