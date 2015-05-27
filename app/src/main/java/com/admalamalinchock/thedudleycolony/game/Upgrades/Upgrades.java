package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 5/27/15.
 */
public abstract class Upgrades
{
    protected BigDecimal reduction;

    private String nameofUpgrade = "";
    public double rateOfGrowth;

    public Upgrades(){}





    public Upgrades(BigDecimal enteredprice, String enteredname)
    {
        reduction = enteredprice;

        nameofUpgrade = enteredname;

    }
    public BigDecimal getPrice()
    {
        return reduction;
    }
    public abstract void incrementPrice();
    public String getName()
    {
        return nameofUpgrade;
    }
    public double getRateofGrowth()
    {
        return rateOfGrowth;
    }
    public BigDecimal changePrice(BigDecimal newVal)
    {

        reduction = newVal;
        return reduction;

    }







}
