package com.example.admintools;

import com.example.b07tut7grp3.Course;
import com.example.b07tut7grp3.User;

public final class Admin extends User {
    // A singleton Admin class
    private static Admin admin;
    private utscCourseModifier courseMod;
    private Admin(){
        // Admin constructor here
    }
    public static Admin getInstance(){
        if(admin == null) admin = new Admin();
        return admin;
    }
    public void addCourse(Course course){

    }
}
