package com.kcoins.services;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Atara on 02-Jan-2018.
 */
public class UserTrophyManager {

    static UserTrophyManager instance = new UserTrophyManager();

    private Map<String, UserTrophyInfo> usersInfo = new HashMap<>();

    private UserTrophyManager() {
    }

    public static UserTrophyManager getInstance() {
        return instance;
    }

    public void addTrophyToUser(String user, TrophyType trophyType, int coinsCount) {
        if (!usersInfo.containsKey(user)) {
            usersInfo.put(user, new UserTrophyInfo());
        }
        usersInfo.get(user).addTrophy(trophyType, coinsCount);
    }

    public UserTrophyInfo getUserTrophies(String user) {
        UserTrophyInfo result = usersInfo.get(user);
        if (result == null) {
            result = new UserTrophyInfo();
        }
        return result;
    }

    public static void main(String[] args) {
        UserTrophyManager manager = UserTrophyManager.getInstance();
        manager.addTrophyToUser("user1", TrophyType.BUGS_TERMINATOR, 1);
        manager.addTrophyToUser("user3", TrophyType.NOT_YOUR_BEST_CODE, 3);
        manager.addTrophyToUser("user1", TrophyType.BUILDER_BREAKER, 2);
        manager.addTrophyToUser("user4", TrophyType.TOO_LOAD_IN_OPEN_SPACE, -1);
        manager.addTrophyToUser("user2", TrophyType.THANKS_FOR_PATIENCE, 2);
        manager.addTrophyToUser("user1", TrophyType.BUGS_TERMINATOR, 3);
        manager.addTrophyToUser("user4", TrophyType.TOO_LOAD_IN_OPEN_SPACE, -1);

        System.out.println("[user1]" + manager.getUserTrophies("user1"));
        System.out.println("[user2]" + manager.getUserTrophies("user2"));
        System.out.println("[user3]" + manager.getUserTrophies("user3"));
        System.out.println("[user4]" + manager.getUserTrophies("user4"));
        System.out.println("[user5]" + manager.getUserTrophies("user5"));

    }
}
