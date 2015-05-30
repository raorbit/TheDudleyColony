package com.admalamalinchock.thedudleycolony.game.Buildings;

/**
 * Created by HoldenMalinchock on 5/18/15.
 */
import com.admalamalinchock.thedudleycolony.game.Calculations;
import java.math.BigDecimal;
public abstract class Buildings
{
    protected BigDecimal price,rate,payout;
    protected BigDecimal numOfBuildings;
    private String nameofBuilding = "";
    public double rateOfGrowth,timeToPayout,time;


    public Buildings(){}





    public Buildings(BigDecimal enteredprice,BigDecimal r, String enteredname)
    {
        price = enteredprice;
        rate=r;
        nameofBuilding = enteredname;

    }
    public BigDecimal getPrice()
    {
      return price;
    }
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

    public void  incrementPrice() {     //overriding the method so that the specific rate for the building changes
        // the price for that building alone.


        price.multiply(rate);


    }

    public BigDecimal Payout() {
        time=timeToPayout;
        return payout.multiply(Calculations.factorUpgrades()).multiply(numOfBuildings);
    }
    public void buy()
    {
        numOfBuildings.add(new BigDecimal(1));
        incrementPrice();



    }

}
