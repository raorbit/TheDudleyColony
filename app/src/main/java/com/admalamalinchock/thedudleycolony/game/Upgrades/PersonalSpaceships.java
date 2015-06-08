package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class PersonalSpaceships extends Upgrade
{
    public PersonalSpaceships()
    {
        super(new BigDecimal(45000), "Space Ship", "A spaceship for all of your Dudleys. Multiplies Dudley gain by 6.",new BigDecimal("6"));
    }
}
