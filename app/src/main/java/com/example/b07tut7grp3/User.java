package com.example.b07tut7grp3;
import java.util.HashSet;
public class User {
    protected HashSet<Course> coursesTaken;
    protected HashSet<Course> plannedCourses;
    protected int currentYear;
    protected String currentSchool;
    protected Subject currentPOSt;
    // Getter methods
    public int getCurrentYear(){
        return currentYear;
    }

    public String getCurrentSchool(){
        return currentSchool;
    }
    public Subject getCurrentPOSt() {
        return currentPOSt;
    }
}
