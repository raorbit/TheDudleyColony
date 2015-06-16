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
//The Game class is used to store all data and used to relay data between various fragments and the MainActivity
//This class is static because only one instance of the data is needed and eliminates the need to keep references of the Game object in each class that needs to access it
//This keeps data consistent between the many different classes and threads that access it
public class Game {
    //a List that keeps track of all of the Buildings
    public static List<Building> buildingsList;
    //a List that keeps track of all of Upgrades that are not activated and are to be displayed in the UpgradesFragment
    public static List<Upgrade> upgradesList;
    //a List that keeps track of all of Upgrades that are activated and should be used to calculate the multiplier
    public static List<Upgrade> activatedUpgradesList;
    //a List that keeps track of all of Achievements that are not activated and are to be displayed in the AchievementsFragment
    public static List<Achievements> achievementsList;
    //a List that keeps track of all of Achievements that are activated and should be used to calculate the multiplier
    public static List<Achievements> activatedAchievementsList;
    //The Balance BigDecimal keeps track of the the current balance and is used to update the MainActivity's title
    //The Multiplier BigDecimal is multiplied by a Building object's base payout inorder to calculate the true payout
    private static BigDecimal Balance,multiplier;
    //called to setup the Game class initially
    public static void setup(){
        buildingsList=initializeBuildings();
        upgradesList=initializeUpgrades();
        achievementsList=initializeAchievements();
        activatedUpgradesList=new ArrayList<>();
        activatedAchievementsList=new ArrayList<>();
        //Initializes variable with default value
        Balance=new BigDecimal("1");
        multiplier= new BigDecimal("1");
    }
    //returns a building from the buildingsList
    public static Building getBuilding(int i){
        return buildingsList.get(i);
    }
    //returns an achievement from the achievementsList
    public static Achievements getAchievements(int i){
        return achievementsList.get(i);
    }
    //returns the Balance BigDecimal
    public static BigDecimal getBalance() {
        return Balance;
    }
    /*
    Called to activate an individual Upgrade
    This is done by removing the upgrade from the upgradesList then adding it to the activatedUpgradesList.
    The multiplier is then increased by the Upgrade's multiplier
    */
    public static void activateUpgrade(Upgrade u){
        upgradesList.remove(upgradesList.indexOf(u));
        activatedUpgradesList.add(u);
        multiplier=multiplier.multiply(u.getMultiplier());
    }
    /*
    Called to activate an individual Achievement
    This is done by removing the upgrade from the achievementsList then adding it to the activatedAchievementsList.
    The multiplier is then increased by the Achievement's multiplier
    */
    public static int activateAchievement(Achievements a){
        int i=achievementsList.indexOf(a);
        achievementsList.remove(i);
        activatedAchievementsList.add(a);
        multiplier = multiplier.multiply(a.getRate());
        return i;
    }
    //initializes the buildingsList ArrayList by creating one instance of each type of building and ands it to the list
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
    //initializes the upgradesList ArrayList by creating one instance of each type of upgrade and ands it to the list
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
    //initializes the achievementsList ArrayList by creating one instance of each type of achievement and ands it to the list
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
    //returns an Upgrade
    public static Upgrade getUpgrade(int i){

        return upgradesList.get(i);
    }
    //Called when the Balance increases
    public static void addToBalance(BigDecimal a){
        //increments the Balance object
        Balance=Balance.add(a);
        //rounds the Balance object
        Balance= Balance.setScale(4,BigDecimal.ROUND_UP).stripTrailingZeros();
        //Posts a BalanceEvent to the default EventBus
        //The MainActivity is listening for these events and upon posting this changes the MainActivity's Title
        EventBus.getDefault().post(new BalanceEvent("$"+Balance.toString()));
    }
    //Called when the Balance decreases
    public static void subtractFromBalance(BigDecimal a){
        //subtracts from the Balance object
        Balance=Balance.subtract(a);
        //rounds the Balance object
        Balance= Balance.setScale(4,BigDecimal.ROUND_UP).stripTrailingZeros();
        //Posts a BalanceEvent to the default EventBus
        //The MainActivity is listening for these events and upon posting this changes the MainActivity's Title
        EventBus.getDefault().post(new BalanceEvent("$"+Balance.toString()));
    }
    //returns the multiplier
    public static BigDecimal getMultiplier() {
        return multiplier;
    }
    //Checks whether an achievement should activate
    //Called when a building is bought
    public static void checkAchievements(){
        int i=0;
        for(Achievements x:achievementsList){
            if(x.isActive()){
                //Prints to Android Logcat like the System.out.println(); would
                Log.d("Achievement is active:",x.getName());
                //activates an achievement
                i=activateAchievement(x);
                //Posts a AchievementEvent to the default EventBus
                //The MainActivity is listening for these events and upon posting this removes the achievement of ID i from view in AchievementsFragment
                EventBus.getDefault().post(new AchievementEvent(i));
                break;
            }
        }
    }
}