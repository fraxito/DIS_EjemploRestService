package com.ufv.restservice.rest_service;

import java.util.Arrays;

public class User {
    private String name;
    private String email;
    private String [] roles;
    private boolean admin;

    public User(String email, boolean admin, String name, String[] roles) {
        this.email = email;
        this.admin = admin;
        this.name = name;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", roles=" + Arrays.toString(roles) +
                ", admin=" + admin +
                '}';
    }
}
