package com.admalamalinchock.thedudleycolony.game.Buildings;
/**
 * Created by HoldenMalinchock on 5/18/15.
 */
import com.admalamalinchock.thedudleycolony.game.Game;
import java.math.BigDecimal;
public abstract class Building
{
    protected BigDecimal price;
    protected BigDecimal rate;
    protected BigDecimal payout;
    protected BigDecimal numOfBuildings;
    private String nameofBuilding = "";
    public double timeToPayout,time;
    public int mProgressStatus;
    private boolean isActive;
    public int ID;
    public Building(){}
    public Building(BigDecimal enteredprice, BigDecimal r,BigDecimal payout, String enteredname,double time,int i)
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
    }
    public void  Payout() {
        time=timeToPayout;
        Game.addToBalance(getPayout());
    }
    public BigDecimal getPayout() {
        return payout.multiply(getMultiplier());
    }
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
    }
    public void setActive(){
        isActive=true;
    }
}
