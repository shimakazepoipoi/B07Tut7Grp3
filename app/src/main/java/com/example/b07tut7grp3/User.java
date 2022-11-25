package com.example.b07tut7grp3;

import com.google.firebase.database.*;

import java.util.ArrayList;
import java.util.List;

public class User {
    public List<Course> getCourseList(){
        DatabaseReference dbref = FirebaseDatabase.getInstance()
                .getReference().getRoot().child("Courses");
        List<Course> courses = new ArrayList<>();
        dbref.get().addOnCompleteListener(task -> {
            if(task.isSuccessful()){
                for(DataSnapshot d : task.getResult().getChildren()){
                    try {
                        courses.add(new utscCourse(d, d.getKey()));
                    } catch (ExceptionMessage e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return courses;
    }
}
