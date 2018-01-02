package com.kcoins.utils;

import com.kcoins.data.entities.User;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import java.io.IOException;

public class UserIdJsonSerializer extends JsonSerializer<User> {
    @Override
    public void serialize(User user, JsonGenerator j, SerializerProvider s) throws IOException, JsonProcessingException {
        if(user == null) {
            j.writeNull();
        } else {
            j.writeString(user.getId().toString());
        }
    }
}
