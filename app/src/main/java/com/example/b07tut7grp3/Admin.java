package com.example.b07tut7grp3;

public final class Admin extends User{
    // A singleton Admin class
    private static Admin admin;
    private Admin(){
        // Admin constructor here
    }
    public static Admin getInstance(){
        if(admin == null) admin = new Admin();
        return admin;
    }
}
