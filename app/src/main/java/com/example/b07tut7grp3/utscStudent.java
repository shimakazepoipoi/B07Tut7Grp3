package com.example.b07tut7grp3;

public class utscStudent extends Student{
    public utscStudent(){
        //TODO: create student
    }
    @Override
    public double getCreditsEarned() {
        return coursesTaken.size() * 0.5;
    }

}
