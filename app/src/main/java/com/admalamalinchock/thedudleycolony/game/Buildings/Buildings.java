package com.admalamalinchock.thedudleycolony.game.Buildings;

/**
 * Created by HoldenMalinchock on 5/18/15.
 */

import java.math.BigDecimal;
public abstract class Buildings
{
    protected BigDecimal price;

    private String nameofBuilding = "";
    public double rateOfGrowth;

    public Buildings(){}





    public Buildings(BigDecimal enteredprice, String enteredname)
    {
        price = enteredprice;

        nameofBuilding = enteredname;

    }
    public BigDecimal getPrice()
    {
      return price;
    }
    public abstract void incrementPrice();
    public String getName()
    {
        return nameofBuilding;
    }
    public double getRateofGrowth()
    {
        return rateOfGrowth;
    }
    public BigDecimal changePrice(BigDecimal newVal)
    {

        price = newVal;
        return price;

    }
















}
