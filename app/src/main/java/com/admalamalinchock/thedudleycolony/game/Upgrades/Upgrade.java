package com.admalamalinchock.thedudleycolony.game.Upgrades;

import java.math.BigDecimal;

/**
 * Created by HoldenMalinchock on 5/27/15.
 */
public abstract class Upgrade
{
    protected BigDecimal reduction,rate;

    private String nameofUpgrade = "";

    protected String description = "";
    private Boolean isActive;

    public Upgrade(){}





    public Upgrade(BigDecimal enteredprice, String enteredname, String nDescription,BigDecimal multiplier)
    {
        reduction = enteredprice;
        description = nDescription;
        rate=multiplier;
        nameofUpgrade = enteredname;


    }
    public BigDecimal getPrice()
    {
        return reduction;
    }

    public String getName()
    {
        return nameofUpgrade;
    }
    public BigDecimal changePrice(BigDecimal newVal)
    {

        reduction = newVal;
        return reduction;

    }




}
