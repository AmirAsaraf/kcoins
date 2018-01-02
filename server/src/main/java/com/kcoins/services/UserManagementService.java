package com.kcoins.services;

import com.kcoins.data.entities.User;
import com.sun.jersey.api.NotFoundException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.bson.types.ObjectId;
import org.mongodb.morphia.mapping.Mapper;

public class UserManagementService {

    private static UserManagementService userManagementService =  null;
    public static final String USER_NAME = "userName";
    public static final String THUMBNAIL = "thumbnail";


    final Logger logger = LogManager.getLogger(UserManagementService.class.getName());

    private UserManagementService() {}

    public static UserManagementService getInstance() {
        if (userManagementService == null)
            userManagementService = new UserManagementService();

        return userManagementService;
    }


    public User loginUser(String userName, String password) throws NotFoundException,SecurityException{
        return null;
    }

    public User updateUser(String accessToken, String userId, User userForUpdate) throws NotFoundException,SecurityException{
        return null;
    }

    public User createUser(User user) throws NotFoundException,SecurityException{
       return null;
    }

    public String getEmailHtml(String from,String to,String message,int coinsCount,String imageUrl){
        return  null;
    }

    public Boolean sendEmail(String from, String to, String message, int coinsCount, String imageUrl) {
        return null;
    }
}
