package com.ufv.restservice.rest_service;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/users")
    public ArrayList<User> users(){
        JsonReader reader = new JsonReader();
        ArrayList<User> userList = reader.readJsonFile("./src/main/resources/users.json");
        return userList;
    }

    @GetMapping("/users/{name}")
    public ResponseEntity<User> getByName(@PathVariable String name){
        DataHandling dataHandling = new DataHandling();
        User foundUser = dataHandling.getUserInfo(name);
        return new ResponseEntity<>(foundUser, HttpStatus.OK);

    }
}

















