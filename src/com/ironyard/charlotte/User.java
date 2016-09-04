package com.ironyard.charlotte;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by lindseyringwald on 9/3/16.
 */
public class User {
    String name;
    String password;

    ArrayList<Wine> wines = new ArrayList<>();

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


}