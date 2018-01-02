package com.kcoins.services;

import com.kcoins.data.entities.User;
import com.kcoins.mail.MailService;
import com.sun.jersey.api.NotFoundException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class UserManagementService {

    private static UserManagementService userManagementService = null;
    public static final String USER_NAME = "userName";
    public static final String THUMBNAIL = "thumbnail";


    final Logger logger = LogManager.getLogger(UserManagementService.class.getName());

    private UserManagementService() {
    }

    public static UserManagementService getInstance() {
        if (userManagementService == null)
            userManagementService = new UserManagementService();

        return userManagementService;
    }


    public User loginUser(String userName, String password) throws NotFoundException, SecurityException {
        return null;
    }

    public User updateUser(String accessToken, String userId, User userForUpdate) throws NotFoundException, SecurityException {
        return null;
    }

    public User createUser(User user) throws NotFoundException, SecurityException {
        return null;
    }

    public String getEmailHtml(String from, String to, String message, int coinsCount, String imageUrl) {
        return null;
    }

    public String sendEmail(String from, String to, String message, int coinsCount, String trophyType, String imageUrl) {
        String html = getEmailHtml(from, to, message, coinsCount, imageUrl);
        UserTrophyManager.getInstance().addTrophyToUser(to, TrophyType.valueOf(trophyType), coinsCount);
        // String dummyHtml = "<div> test</div>";

        return MailService.getInstance().sendMail("Congratulation you WON Kenshoo trophy", "kenshoo trophy", html, to);
    }

    public static void main(String[] args) {
        String result = UserManagementService.getInstance().sendEmail("atara.tenne@gmail.com", "atara.tenne@gmail.com", "hackaton test", 5, TrophyType.BUGS_TERMINATOR.name(), "www.imageUrl.com");
        System.out.println("aa");
    }


}
