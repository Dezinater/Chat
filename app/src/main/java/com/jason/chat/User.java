package com.jason.chat;

/**
 * Created by Jason on 2/7/2017.
 */

public class User {
    public String id;
    public boolean avaliable = false;

    public User() {
        this.id = "-1";
    }

    public User(String id){
        this.id = id;
    }
}