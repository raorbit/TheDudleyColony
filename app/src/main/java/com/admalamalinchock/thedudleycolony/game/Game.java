package com.admalamalinchock.thedudleycolony.game;

import java.math.BigDecimal;
import java.util.*;
import com.admalamalinchock.thedudleycolony.game.Buildings.*;
import com.admalamalinchock.thedudleycolony.game.Upgrades.Upgrade;

/**
 * Created by Rahul Admala on 5/29/15.
 */
public class Game {
    public static List<Building> buildingsList;
    public static List<Upgrade> upgradesList;
    private static BigDecimal Balance;


    public static void setup(){
        buildingsList=initializeBuildings();
        Balance=new BigDecimal("0");
    }
    public static Building getBuilding(int i){
        Building x=null;
        switch (i){
            case 0:{
                x=buildingsList.get(i);
                break;
            }
            case 1:{
                x=buildingsList.get(i);
                break;
            }
            case 2:{
                x=buildingsList.get(i);
                break;
            }
            case 3:{
                x=buildingsList.get(i);
                break;
            }
            case 4:{
                x=buildingsList.get(i);
                break;
            }
            case 5:{
                x=buildingsList.get(i);
                break;
            }
            case 6:{
                x=buildingsList.get(i);
                break;
            }
            case 7:{
                x=buildingsList.get(i);
                break;
            }
            case 8:{
                x=buildingsList.get(i);
                break;
            }
        }
        return x;
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
}
