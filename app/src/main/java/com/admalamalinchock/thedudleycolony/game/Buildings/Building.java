package com.admalamalinchock.thedudleycolony.game.Buildings;

/**
 * Created by HoldenMalinchock on 5/18/15.
 */
import android.widget.Button;

import com.admalamalinchock.thedudleycolony.R;
import com.admalamalinchock.thedudleycolony.game.Calculations;
import com.admalamalinchock.thedudleycolony.game.Game;
import com.admalamalinchock.thedudleycolony.uicomponents.TextRoundCornerProgressBar;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Building
{
    protected BigDecimal price;
    protected BigDecimal rate;
    protected BigDecimal payout;
    protected BigDecimal numOfBuildings;
    private String nameofBuilding = "";
    public double timeToPayout,time;
    public int mProgressStatus;
    public Building(){}





    public Building(BigDecimal enteredprice, BigDecimal r,BigDecimal payout, String enteredname,double time)
    {
        price = enteredprice;
        rate=r;
        nameofBuilding = enteredname;
        numOfBuildings=new BigDecimal("0");
        this.payout=payout;
        this.timeToPayout=time;
        this.time=time;
        mProgressStatus=0;
        setRounding();
    }
    public BigDecimal getNumOfBuildings() {
        setRounding();
        return numOfBuildings;
    }
    public BigDecimal getPrice()
    {
        setRounding();
      return price;
    }
    public String getName()
    {
        return nameofBuilding;
    }
    public BigDecimal changePrice(BigDecimal newVal)
    {

        price = newVal;
        setRounding();
        return price;


    }

    public void  incrementPrice() {     //overriding the method so that the specific rate for the building changes
        // the price for that building alone.


        price=price.multiply(rate);
        setRounding();

    }

    public void  Payout() {
        time=timeToPayout;
        Game.addToBalance(getPayout());

    }
    public BigDecimal getPayout(){
       return payout.multiply(getMultiplier());
    }
    public BigDecimal getMultiplier(){
        return Calculations.factorUpgrades().multiply(numOfBuildings);
    }
    public void buy()
    {
        numOfBuildings=numOfBuildings.add(new BigDecimal("1"));
        incrementPrice();
        setRounding();
     }
    private void setRounding(){
        price=price.setScale(2, RoundingMode.HALF_EVEN).stripTrailingZeros();
        numOfBuildings= numOfBuildings.setScale(5, RoundingMode.HALF_EVEN).stripTrailingZeros();
        rate=rate.setScale(5, RoundingMode.HALF_EVEN).stripTrailingZeros();
        payout=payout.setScale(5, RoundingMode.HALF_EVEN).stripTrailingZeros();
    }
    public boolean isFirstBuilding(){
        return numOfBuildings.equals(new BigDecimal("0"));

    }


}
