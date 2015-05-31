package com.admalamalinchock.thedudleycolony.game.Buildings;

/**
 * Created by HoldenMalinchock on 5/18/15.
 */
import android.widget.Button;

import com.admalamalinchock.thedudleycolony.R;
import com.admalamalinchock.thedudleycolony.game.Calculations;
import com.admalamalinchock.thedudleycolony.uicomponents.TextRoundCornerProgressBar;

import java.math.BigDecimal;
public abstract class Building
{
    protected BigDecimal price;
    protected BigDecimal rate;
    protected BigDecimal payout;

    public BigDecimal getNumOfBuildings() {
        return numOfBuildings;
    }

    protected BigDecimal numOfBuildings;

    private String nameofBuilding = "";
    public double timeToPayout,time;
    public Building(){}





    public Building(BigDecimal enteredprice, BigDecimal r,BigDecimal payout, String enteredname,double time)
    {
        price = enteredprice;
        rate=r;
        nameofBuilding = enteredname;
        numOfBuildings=new BigDecimal("1");
        this.payout=payout;
        this.timeToPayout=time;
        this.time=time;
    }
    public BigDecimal getPrice()
    {
      return price;
    }
    public String getName()
    {
        return nameofBuilding;
    }
    public BigDecimal changePrice(BigDecimal newVal)
    {

        price = newVal;
        return price;

    }

    public void  incrementPrice() {     //overriding the method so that the specific rate for the building changes
        // the price for that building alone.


        price=price.multiply(rate);


    }

    public BigDecimal Payout() {
        time=timeToPayout;
        return payout.multiply(Calculations.factorUpgrades()).multiply(numOfBuildings);
    }
    public void buy()
    {
        numOfBuildings=numOfBuildings.add(new BigDecimal("1"));
        incrementPrice();



    }

}
