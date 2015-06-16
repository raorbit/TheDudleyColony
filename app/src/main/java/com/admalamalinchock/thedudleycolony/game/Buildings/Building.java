package com.admalamalinchock.thedudleycolony.game.Buildings;
/**
 * Created by HoldenMalinchock on 5/18/15.
 */
import com.admalamalinchock.thedudleycolony.game.Game;      //importing the game class
import java.math.BigDecimal;        //importing the BigDecimal class so we can handle large numbers of buildings without rounding errors

public abstract class Building
{
    protected BigDecimal price;
    protected BigDecimal rate;
    protected BigDecimal payout;        //what the building produces in a given amount of time
    protected BigDecimal numOfBuildings;
    private String nameofBuilding = "";
    public double timeToPayout,time;
    public int mProgressStatus;
    private boolean isActive;
    public int ID;
    public Building(){}
    public Building(BigDecimal enteredprice, BigDecimal r,BigDecimal payout, String enteredname,double time,int i)  //constructor with the price payout name and the time till payout and the ID number
    {
        price = enteredprice;
        rate=r;
        nameofBuilding = enteredname;
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
      setScale();
      return price;
    }
    public String getName()
    {
        return nameofBuilding;
    }   //returns the name of the building
    public BigDecimal changePrice(BigDecimal newVal)        //change the price of a building
    {
        price = newVal;
        return price;
    }
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
        return Game.factorUpgrades().multiply(numOfBuildings);
    }
    public void buy()
    {
        if(getPrice().compareTo(Game.getBalance())<=0) {
            numOfBuildings = numOfBuildings.add(new BigDecimal("1"));
            Game.subtractFromBalance(getPrice());
            incrementPrice();
        }
     }
     public void setScale(){
       payout= payout.setScale(2,BigDecimal.ROUND_UP).stripTrailingZeros();
       numOfBuildings=   numOfBuildings.setScale(2,BigDecimal.ROUND_UP).stripTrailingZeros();
        price= price.setScale(2,BigDecimal.ROUND_UP).stripTrailingZeros();
    }
    public boolean isActive(){
        return isActive;
    }   //method to check if there are achievements or upgrades active
    public void setActive(){
        isActive=true;
    }
}
