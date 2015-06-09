package com.admalamalinchock.thedudleycolony.game;
import android.util.Log;

import java.math.BigDecimal;
import java.util.*;
import com.admalamalinchock.thedudleycolony.*;
import com.admalamalinchock.thedudleycolony.game.Achievements.Achievements;
import com.admalamalinchock.thedudleycolony.game.Achievements.AspiringDictator;
import com.admalamalinchock.thedudleycolony.game.Achievements.AspiringDictatorII;
import com.admalamalinchock.thedudleycolony.game.Achievements.BaneEconomics;
import com.admalamalinchock.thedudleycolony.game.Achievements.BaneEconomicsII;
import com.admalamalinchock.thedudleycolony.game.Achievements.Campsite;
import com.admalamalinchock.thedudleycolony.game.Achievements.CampsiteII;
import com.admalamalinchock.thedudleycolony.game.Achievements.FinalFrontier;
import com.admalamalinchock.thedudleycolony.game.Achievements.FinalFrontierII;
import com.admalamalinchock.thedudleycolony.game.Achievements.PangeaReCreator;
import com.admalamalinchock.thedudleycolony.game.Achievements.PangeaReCreatorII;
import com.admalamalinchock.thedudleycolony.game.Achievements.SgtMayor;
import com.admalamalinchock.thedudleycolony.game.Achievements.SgtMayorII;
import com.admalamalinchock.thedudleycolony.game.Achievements.ShantyTown;
import com.admalamalinchock.thedudleycolony.game.Achievements.ShantyTownII;
import com.admalamalinchock.thedudleycolony.game.Achievements.TheDictator;
import com.admalamalinchock.thedudleycolony.game.Achievements.TheDictatorII;
import com.admalamalinchock.thedudleycolony.game.Achievements.WorldDomination;
import com.admalamalinchock.thedudleycolony.game.Achievements.WorldDominationII;
import com.admalamalinchock.thedudleycolony.game.Buildings.*;
import com.admalamalinchock.thedudleycolony.game.Upgrades.*;
import de.greenrobot.event.EventBus;
/**
 * Created by Rahul Admala on 5/29/15.
 */
public class Game {
    public static List<Building> buildingsList;
    public static List<Upgrade> upgradesList;
    public static List<Upgrade> activatedUpgradesList;
    public static List<Achievements> achievementsList;
    public static List<Achievements> activatedAchievementsList;
    private static BigDecimal Balance,multiplier;
    public static void setup(){
        buildingsList=initializeBuildings();
        upgradesList=initializeUpgrades();
        achievementsList=initializeAchievements();
        activatedUpgradesList=new ArrayList<>();
        activatedAchievementsList=new ArrayList<>();
        Balance=new BigDecimal("1");
        multiplier= new BigDecimal("1");
    }
    public static Building getBuilding(int i){
        return buildingsList.get(i);
    }
    public static Achievements getAchievements(int i){
        return achievementsList.get(i);
    }
    public static BigDecimal getBalance() {
        return Balance;
    }
    public static void activateUpgrade(Upgrade u){
        upgradesList.remove(upgradesList.indexOf(u));
        activatedUpgradesList.add(u);
        multiplier=multiplier.multiply(u.getMultiplier());
    }
    public static int activateAchievement(Achievements a){
        int i=achievementsList.indexOf(a);
        achievementsList.remove(i);
        activatedAchievementsList.add(a);
        multiplier = multiplier.multiply(a.getRate());
        return i;
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
    private static List initializeAchievements(){
        List<Achievements> result = new ArrayList<>();
        for (int i=0; i <= 17; i++) {
            switch (i){
                case 0:{
                    result.add(new Campsite());
                    break;
                }
                case 1:{
                    result.add(new ShantyTown());
                    break;
                }
                case 2:{
                    result.add(new SgtMayor());
                    break;
                }
                case 3:{
                    result.add(new BaneEconomics());
                    break;
                }
                case 4:{
                    result.add(new AspiringDictator());
                    break;
                }
                case 5:{
                    result.add(new TheDictator());
                    break;
                }
                case 6:{
                    result.add(new WorldDomination());
                    break;
                }
                case 7:{
                    result.add(new PangeaReCreator());
                    break;
                }
                case 8:{
                    result.add(new FinalFrontier());
                    break;
                }
                case 9:{
                    result.add(new CampsiteII());
                    break;
                }
                case 10:{
                    result.add(new ShantyTownII());
                    break;
                }
                case 11:{
                    result.add(new SgtMayorII());
                    break;
                }case 12:{
                    result.add(new BaneEconomicsII());
                    break;
                }case 13:{
                    result.add(new AspiringDictatorII());
                    break;
                }case 14:{
                    result.add(new TheDictatorII());
                    break;
                }case 15:{
                    result.add(new WorldDominationII());
                    break;
                }case 16:{
                    result.add(new PangeaReCreatorII());
                    break;
                }case 17:{
                    result.add(new FinalFrontierII());
                    break;
                }
            }
        }
        return result;
    }
    public static Upgrade getUpgrade(int i){

        return upgradesList.get(i);
    }
    public static void addToBalance(BigDecimal a){
        Balance=Balance.add(a);
        Balance= Balance.setScale(4,BigDecimal.ROUND_UP).stripTrailingZeros();
        EventBus.getDefault().post(new BalanceEvent("$"+Balance.toString()));
    }
    public static void subtractFromBalance(BigDecimal a){
        Balance=Balance.subtract(a);
        Balance= Balance.setScale(4,BigDecimal.ROUND_UP).stripTrailingZeros();
        EventBus.getDefault().post(new BalanceEvent("$"+Balance.toString()));
    }
    public static BigDecimal factorUpgrades() {
        return multiplier;
    }
    public static void checkAchievements(){
        int i=0;
        for(Achievements x:achievementsList){
            if(x.isActive()){
                Log.d("Achievement is active:",x.getName());
                i=activateAchievement(x);
                EventBus.getDefault().post(new AchievementEvent(i));
                break;
            }
        }
    }
}