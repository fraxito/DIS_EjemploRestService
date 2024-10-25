package com.ufv.restservice.rest_service;

import java.util.ArrayList;

public class DataHandling {
    User getUserInfo (String name){
        User foundUser = null;
        JsonReader reader = new JsonReader();

        ArrayList<User> usersList = reader.readJsonFile("./src/main/resources/users.json");
        for (User user : usersList){
            if (user.getName().equalsIgnoreCase(name)){
                foundUser = user;
            }
        }

        return foundUser;
    }

}
