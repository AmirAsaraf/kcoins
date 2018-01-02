package com.kcoins.resources;

import com.kcoins.data.entities.User;
import com.kcoins.services.UserManagementService;
import com.kcoins.services.UserTrophyInfo;
import com.kcoins.services.UserTrophyManager;
import com.kcoins.utils.CorsGenerator;
import com.sun.jersey.api.NotFoundException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/email")
public class MailResource {

    public static final String USER_NAME = "user";
    public static final String PASSWORD = "pass";
    public static final String Authorization = "Authorization";

    final Logger logger = LogManager.getLogger(MailResource.class.getName());

    @OPTIONS
    public Response corsMyResource(@HeaderParam("Access-Control-Request-Headers") String requestH) {
        return CorsGenerator.makeCORS(Response.ok(), requestH);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response  sendEmail(@QueryParam("from") String from,
                               @QueryParam("to") String to,
                               @QueryParam("message") String message,
                               @QueryParam("coinsCount") String coinsCount,
                               @QueryParam("trophyType") String trophyType,
                               @QueryParam("imageUrl") String imageUrl){

        String [] recipients = new String[1];
        recipients[0] = to;

        String result = UserManagementService.getInstance().sendEmail(from, recipients, message, coinsCount);

        return Response.status(200).entity(result).header("Access-Control-Allow-Origin", "*").build();
    }
}
