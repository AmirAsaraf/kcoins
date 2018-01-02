package com.kcoins;

import com.kcoins.services.TrophyType;
import com.kcoins.services.UserManagementService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class AppServerDemo {

    static final Logger logger = LogManager.getLogger(AppServerDemo.class.getName());

    public static final String SERVER_PORT = "server.port";
    public static final String WEB_XML = "WEB-INF/web.xml";
    public static final String RESOURCE_BASE = "web";

    public static void main(String[] args) throws Exception {

        String [] recipients = new String[1];
        recipients[0] = "amir.asaraf@gmail.com";

        String result = UserManagementService.getInstance().sendEmail("Amir Asaraf", recipients, "This is the message" ,"2,45");
        System.out.println(result);

    }
}
