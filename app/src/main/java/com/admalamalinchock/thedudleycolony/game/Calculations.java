package com.admalamalinchock.thedudleycolony.game;

/**
 * Created by HoldenMalinchock on 5/22/15.
 */
import java.math.*;
import com.admalamalinchock.thedudleycolony.game.Upgrades.*;
import com.admalamalinchock.thedudleycolony.game.Buildings.*;
public class Calculations
{
    public static BigDecimal factorUpgrades() {
    BigDecimal multiplier= new BigDecimal("1");
        for(Upgrade u:Game.activatedUpgradesList){
            multiplier=u.getMultiplier().multiply(multiplier);
        }
        return multiplier;
}







}
