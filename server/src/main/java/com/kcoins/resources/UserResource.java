package com.kcoins.resources;

import com.kcoins.data.entities.User;
import com.kcoins.services.UserManagementService;
import com.kcoins.utils.CorsGenerator;
import com.sun.jersey.api.NotFoundException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserResource {

    public static final String USER_NAME = "user";
    public static final String PASSWORD = "pass";
    public static final String Authorization = "Authorization";

    final Logger logger = LogManager.getLogger(UserResource.class.getName());

    @OPTIONS
    public Response corsMyResource(@HeaderParam("Access-Control-Request-Headers") String requestH) {
        return CorsGenerator.makeCORS(Response.ok(), requestH);
    }

    @OPTIONS
    @Path("{id}")
    public Response corsMyResourceId(@HeaderParam("Access-Control-Request-Headers") String requestH) {
        return CorsGenerator.makeCORS(Response.ok(), requestH);
    }

    /*   Example
    PUT http://localhost:8081/devteam/users/<user_id>?access-token=AT1234
   {
             "userName": "amir",
             "thumbnail": null
          }
    */
    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateUser(@HeaderParam(Authorization) String accessToken,
                               @PathParam("id") String userId,
                               User userForUpdate) {
        try{
            User user = UserManagementService.getInstance().updateUser(accessToken, userId, userForUpdate);
            return Response.status(200).entity(user).header("Access-Control-Allow-Origin", "*").build();
        }
        catch (NotFoundException nfe) {
            logger.debug("User " + userForUpdate.getUserName() + " can't be found!!");
            return Response.status(400).entity("User " + userForUpdate.getUserName() + " can't be found!").header("Access-Control-Allow-Origin", "*").build();
        }
        catch (SecurityException se) {
            logger.debug("User " + userForUpdate.getUserName() + " failed to authenticate!!");
            return Response.status(401).header("Access-Control-Allow-Origin", "*").build();
        }
        catch (Exception e) {
            logger.error(e.getMessage());
            return Response.status(500).header("Access-Control-Allow-Origin", "*").build();
        }
    }

    /*   Example
        POST http://localhost:8081/devteam/users
       {
                 "userName": "amir",
                 "password": "1234"
              }
        */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(User userToCreate) {
        try{
            User user = UserManagementService.getInstance().createUser(userToCreate);
            return Response.status(200).entity(user).header("Access-Control-Allow-Origin", "*").build();
        }
        catch (NotFoundException nfe) {
            logger.debug("User " + userToCreate.getUserName() + " can't be found!!");
            return Response.status(400).entity("User " + userToCreate.getUserName() + " can't be found!").header("Access-Control-Allow-Origin", "*").build();
        }
        catch (SecurityException se) {
            logger.debug("User " + userToCreate.getUserName() + " failed to authenticate!!");
            return Response.status(401).header("Access-Control-Allow-Origin", "*").build();
        }
        catch (Exception e) {
            logger.error(e.getMessage());
            return Response.status(500).header("Access-Control-Allow-Origin", "*").build();
        }
    }
    
    //send an email
    Boolean sendEmail(String from,String to,String message,int coinsCount,String imageUrl){
        return UserManagementService.getInstance().sendEmail(from,to,message,coinsCount,imageUrl);
    }
    
    
}
