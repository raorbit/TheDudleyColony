package com.admalamalinchock.thedudleycolony.game.Upgrades;
import com.admalamalinchock.thedudleycolony.game.Game;  //importing the game class(runs everything)
import java.math.BigDecimal;
/**
 * Created by HoldenMalinchock on 5/27/15.
 */
public abstract class Upgrade
{
    protected BigDecimal reduction,rate;    //the bonus that the upgrade gives
    private String nameofUpgrade = "";      //name of the upgrade
    protected String description = "";      //description fo the upgrade
    private Boolean isActive;
    public Upgrade(){}
    public Upgrade(BigDecimal enteredprice, String enteredname, String nDescription,BigDecimal multiplier)  //constructor with the price, name, description, and the multiplier
    {
        reduction = enteredprice;
        description = nDescription;
        rate=multiplier;
        nameofUpgrade = enteredname;
        isActive=false;
    }
    public BigDecimal getPrice()
    {
        return reduction;
    }   //returns the price
    public String getName()
    {
        return nameofUpgrade;
    }   //returns the name of the upgrade
    public BigDecimal changePrice(BigDecimal newVal){   //method so you can change the price
        reduction = newVal;
        return reduction;
    }
    public BigDecimal getMultiplier()   //gets the multiplier of a building
    {
        if(isActive)
            return rate;
        else
            return new BigDecimal("1");
    }
    public boolean isActive(){
        return isActive;
    }   //boolean test to see if the upgrade has been activated
    public void setActive()
    {
        isActive = true;
    }
    public String getDescription() {
        return description;
    }   //gets the decription
    public boolean buy(){                                       //method for what happens when you buy a upgrade
        if(getPrice().compareTo(Game.getBalance())<=0) {
            Game.subtractFromBalance(getPrice());
            setActive();
            return true;
        }
        return false;
    }
}