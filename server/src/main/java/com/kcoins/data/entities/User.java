package com.kcoins.data.entities;

import com.kcoins.utils.*;
import org.bson.types.ObjectId;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.utils.IndexDirection;

import java.util.Date;

@Entity("users")
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class User {

    @Id
    private ObjectId id;

    @Indexed(value= IndexDirection.ASC,unique=true, dropDups=true)
    private String userName;

    private String password;

    private Date creationDate;

    private String thumbnail;

    private String access_token;

    public User() {}

    public User(String userName, String password, Date creationDate, String thumbnail) {
        this.userName = userName;
        this.password = password;
        this.creationDate = creationDate;
        this.thumbnail = thumbnail;
    }

    @JsonSerialize(using=ObjectIdJsonSerializer.class)
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
