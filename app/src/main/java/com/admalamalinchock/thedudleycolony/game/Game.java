package com.admalamalinchock.thedudleycolony.game;

import java.math.BigDecimal;
import java.util.*;
import com.admalamalinchock.thedudleycolony.game.Buildings.*;
import com.admalamalinchock.thedudleycolony.game.Upgrades.BananaBook;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Clothes;
import com.admalamalinchock.thedudleycolony.game.Upgrades.DiamondArmour;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Earbuds;
import com.admalamalinchock.thedudleycolony.game.Upgrades.ExoArmour;
import com.admalamalinchock.thedudleycolony.game.Upgrades.ExoHelmet;
import com.admalamalinchock.thedudleycolony.game.Upgrades.ExoSpaceSuit;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Gunnars;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Hat;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Headset;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Helmet;
import com.admalamalinchock.thedudleycolony.game.Upgrades.IBanana;
import com.admalamalinchock.thedudleycolony.game.Upgrades.IronArmour;
import com.admalamalinchock.thedudleycolony.game.Upgrades.PersonalSpaceships;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Pistol;
import com.admalamalinchock.thedudleycolony.game.Upgrades.PulsePistol;
import com.admalamalinchock.thedudleycolony.game.Upgrades.PulseRifle;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Rifle;
import com.admalamalinchock.thedudleycolony.game.Upgrades.RunningShoes;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Shoes;
import com.admalamalinchock.thedudleycolony.game.Upgrades.SpaceSuit;
import com.admalamalinchock.thedudleycolony.game.Upgrades.SteelArmour;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Sunglasses;
import com.admalamalinchock.thedudleycolony.game.Upgrades.SuperSpaceSuit;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Upgrade;
import com.admalamalinchock.thedudleycolony.game.Upgrades.WoodArmour;

/**
 * Created by Rahul Admala on 5/29/15.
 */
public class Game {
    public static List<Building> buildingsList;
    public static List<Upgrade> upgradesList;
    private static BigDecimal Balance;


    public static void setup(){
        buildingsList=initializeBuildings();
        upgradesList=initializeUpgrades();
        Balance=new BigDecimal("0");
    }
    public static Building getBuilding(int i){
        return buildingsList.get(i);
    }
    public static void setBuilding(Building x,int i){
        buildingsList.set(i,x);
    }
    private static List initializeBuildings() {
        List<Building> result = new ArrayList<>();
        for (int i=0; i <= 8; i++) {
            switch (i){
                case 0:{
                    result.add(new Tent());
                    break;
                }
                case 1:{
                    result.add(new Shack());
                    break;
                }
                case 2:{
                    result.add(new Town());
                    break;
                }
                case 3:{
                    result.add(new City());
                    break;
                }
                case 4:{
                    result.add(new State());
                    break;
                }
                case 5:{
                    result.add(new Country());
                    break;
                }
                case 6:{
                    result.add(new Continent());
                    break;
                }
                case 7:{
                    result.add(new World());
                    break;
                }
                case 8:{
                    result.add(new SolarSystem());
                    break;
                }
            }


        }

        return result;
    }
    public static BigDecimal getBalance() {
        return Balance;
    }
    public static void setBalance(BigDecimal balance) {
        Balance = balance;
    }
    public String convertToScientificNotation(BigDecimal in){
        return String.format("%6.2e",in.toString());
    }
    private static List initializeUpgrades() {
        List<Upgrade> result = new ArrayList<>();
        for (int i=0; i <= 24; i++) {
            switch (i){
                case 0:{
                    result.add(new Clothes());
                    break;
                }
                case 1:{
                    result.add(new Shoes());
                    break;
                }
                case 2:{
                    result.add(new Hat());
                    break;
                }
                case 3:{
                    result.add(new Sunglasses());
                    break;
                }
                case 4:{
                    result.add(new RunningShoes());
                    break;
                }
                case 5:{
                    result.add(new IBanana());
                    break;
                }
                case 6:{
                    result.add(new BananaBook());
                    break;
                }
                case 7:{
                    result.add(new Earbuds());
                    break;
                }
                case 8:{
                    result.add(new Headset());
                    break;
                }
                case 9:{
                    result.add(new Helmet());
                    break;
                }
                case 10:{
                    result.add(new WoodArmour());
                    break;
                }
                case 11:{
                    result.add(new IronArmour());
                    break;
                }case 12:{
                    result.add(new SteelArmour());
                    break;
                }case 13:{
                    result.add(new DiamondArmour());
                    break;
                }case 14:{
                    result.add(new ExoArmour());
                    break;
                }case 15:{
                    result.add(new ExoHelmet());
                    break;
                }case 16:{
                    result.add(new Pistol());
                    break;
                }case 17:{
                    result.add(new Rifle());
                    break;
                }
                case 18:{
                    result.add(new PulsePistol());
                    break;
                }
                case 19:{
                    result.add(new PulseRifle());
                    break;
                }case 20:{
                    result.add(new SpaceSuit());
                    break;
                }case 21:{
                    result.add(new SuperSpaceSuit());
                    break;
                }case 22:{
                    result.add(new ExoSpaceSuit());
                    break;
                }case 23:{
                    result.add(new PersonalSpaceships());
                    break;
                }case 24:{
                    result.add(new Gunnars());
                    break;
                }
            }


        }

        return result;
    }
    public static Upgrade getUpgrade(int i){

        return upgradesList.get(i);
    }

}
