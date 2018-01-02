package com.kcoins.services;

import com.kcoins.data.entities.User;
import com.kcoins.mail.MailService;
import com.sun.jersey.api.NotFoundException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.File;

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


//    public String getEmailHtml(String from, String to, String message, int coinsCount, String imageUrl) {
//        try{
//
//            File file = new File("mail_preview.html");
//            Document doc = Jsoup.parse(file, "UTF-8", "");
//            Element dummy_to = doc.getElementById("to");
//            dummy_to.text(to);
//            Element dummy_from = doc.getElementById("from");
//            dummy_from.text(from);
//            Element dummy_msg = doc.getElementById("message");
//            dummy_msg.text(message);
//            String congrats = "Congratulations!!!! You won " + coinsCount +" Kcoins";
//            Element dummy_Kcoins = doc.getElementById("kcoins");
//            dummy_Kcoins.text(congrats);
//            Element dummy_img_url = doc.getElementById("img");
//            dummy_img_url.attr("src", imageUrl);
//            String safe = Jsoup.clean(doc.outerHtml(), Whitelist.basic());
//            return safe;
//        }
//        catch (IOException ex)
//        {
//            return ex.getMessage();
//        }
//    }


    public String sendEmail(String from, String[] to, String message) {
        String html = MailTemplate.MAIL_TEMPLATE
                .replace(MailTemplate.TEMPLATE_FROM_IDENTIFYER, from)
                .replace(MailTemplate.TEMPLATE_MESSAGE_IDENTIFYER, message);

        return MailService.getInstance().sendMail("Congratulation you got a Kenshoo Reward", html, to);
    }

}
