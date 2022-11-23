package com.example.b07tut7grp3;

abstract class Student extends User{
    public abstract double getCreditsEarned();
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
}
