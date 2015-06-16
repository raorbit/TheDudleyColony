package com.admalamalinchock.thedudleycolony.game.Buildings;
/**
 * Created by HoldenMalinchock on 5/18/15.
 */
import com.admalamalinchock.thedudleycolony.game.Game;      //importing the game class
import java.math.BigDecimal;        //importing the BigDecimal class so we can handle large numbers of buildings without rounding errors

public abstract class Building
{
    private BigDecimal price;
    private BigDecimal rate;
    private BigDecimal payout;        //what the building produces in a given amount of time
    private BigDecimal numOfBuildings;
    private String nameOfBuilding = "";
    public double timeToPayout,time;
    public int mProgressStatus;
    private boolean isActive;
    public int ID;
    public Building(){}
    public Building(BigDecimal enteredPrice, BigDecimal r,BigDecimal payout, String enteredName,double time,int i)  //constructor with the price payout name and the time till payout and the ID number
    {
        price = enteredPrice;
        rate=r;
        nameOfBuilding = enteredName;
        numOfBuildings=new BigDecimal("0");
        this.payout=payout;
        this.timeToPayout=time*100;
        this.time=time*100;
        mProgressStatus=0;
        ID=i;
        isActive=false;
    }
    public BigDecimal getNumOfBuildings() {
    return numOfBuildings;
    }   //get the number of buildings that they own
    public BigDecimal getPrice()    //get the price of the next building
    {
      return price;
    }
    public String getName()
    {
        return nameOfBuilding;
    }   //returns the name of the building
    public void  incrementPrice() {
        price=price.multiply(rate);
    }   //the method called whenever you buy a building, it increases at a rate specific to each building
    public void  Payout() {     //calculating the payout of a building
        time=timeToPayout;
        Game.addToBalance(getPayout());
    }
    public BigDecimal getPayout() {
        return payout.multiply(getMultiplier());
    }       //get the payout
    public BigDecimal getMultiplier(){
        return Game.getMultiplier().multiply(numOfBuildings);
    }
    //Called to check if another building can be bought
    public void buy()
    {
        if(getPrice().compareTo(Game.getBalance())<=0) {
            numOfBuildings = numOfBuildings.add(new BigDecimal("1"));
            Game.subtractFromBalance(getPrice());
            incrementPrice();
        }
     }
    //method to check if there are achievements or upgrades active
    public boolean isActive(){
        return isActive;
    }
    //sets isActive to true
    public void setActive(){
        isActive=true;
    }
}
