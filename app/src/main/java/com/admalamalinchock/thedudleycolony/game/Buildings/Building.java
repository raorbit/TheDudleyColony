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
        setScale();
    }
    public BigDecimal getNumOfBuildings() {
    setScale();
        return numOfBuildings;
    }
    public BigDecimal getPrice()
    {
        setScale();
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

    public void  incrementPrice() {

        price=price.multiply(rate);
        setScale();

    }

    public void  Payout() {
        time=timeToPayout;
        setScale();
        Game.addToBalance(getPayout());

    }
    public BigDecimal getPayout(){
        setScale();
       return payout.multiply(getMultiplier());
    }
    public BigDecimal getMultiplier(){
        return Calculations.factorUpgrades().multiply(numOfBuildings);
    }
    public void buy()
    {
        numOfBuildings=numOfBuildings.add(new BigDecimal("1"));
        incrementPrice();
        setScale();
     }
    public boolean isFirstBuilding(){
        return numOfBuildings.intValue()==0;

    }
    public void setScale(){
       payout= payout.setScale(2).stripTrailingZeros();
       numOfBuildings=   numOfBuildings.setScale(2).stripTrailingZeros();
       price= price.setScale(2).stripTrailingZeros();

    }


}
