package com.kcoins.services;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Atara on 02-Jan-2018.
 */
public class UserTrophyInfo {

    private Map<TrophyType,Integer> trophiesCount = new HashMap<>();
    private int totalCoins = 0;


    public void addTrophy(TrophyType trophyType,int coins){
        if(!trophiesCount.containsKey(trophyType)){
            trophiesCount.put(trophyType,1);
        }else {
            trophiesCount.put(trophyType,trophiesCount.get(trophyType)+1);
        }
        totalCoins += coins;
    }

    public Map<TrophyType, Integer> getTrophiesCount() {
        return trophiesCount;
    }

    public int getTotalCoins() {
        return totalCoins;
    }

    @Override
    public String toString() {
        return "UserTrophyInfo{" +
                "trophiesCount=" + trophiesCount +
                ", totalCoins=" + totalCoins +
                '}';
    }
}
