package com.example.b07tut7grp3;

import java.util.HashSet;

abstract class Student extends User{
    public abstract double getCreditsEarned();
    protected String firstName, lastName;
    protected HashSet<Course> coursesTaken;
    protected HashSet<Course> plannedCourses;
    protected int currentYear;
    protected String currentSchool;
    protected String email;
    protected String username;

    public void addPlannedCourse(Course planned){
        //TODO: continue add course implementation
    }
    // Course completion module
    public void completeCourse(Course completed){
        if(!plannedCourses.contains(completed)){
            MessageSystem notice = new MessageSystem("Notice: course not found in planning, " +
                    "adding course anyways");
            addPlannedCourse(completed);
            completeCourse(completed);
        }
        coursesTaken.add(completed);
        plannedCourses.remove(completed);
        MessageSystem success = new MessageSystem("added course " + completed);
        success.successMessage();
    }
    // Getter methods
    public int getCurrentYear(){
        return currentYear;
    }

    public String getCurrentSchool(){
        return currentSchool;
    }

}
