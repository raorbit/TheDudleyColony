package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 6/2/15.
 */
public class ExoArmour extends Upgrade
{
    public ExoArmour()
    {
        super(new BigDecimal(10500), "Exo Armour", "The highest level of armour available. Nobody will mess with you if you got this handy. A robotic shell built to stop all vital blows to the body. Multiplies Dudley gain by 3.",new BigDecimal("3"));
    }
}
