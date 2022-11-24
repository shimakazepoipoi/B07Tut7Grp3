package com.example.admintools;

import com.example.b07tut7grp3.*;
import com.google.firebase.database.*;

import java.util.List;

public final class utscCourseModifier extends utscCourse {
    private DatabaseReference dbref;

    public utscCourseModifier(User user) throws ExceptionMessage{
        // initialization in add mode
        //TODO: implement add mode
        //Security check, utscCourseModifier must be instantiated with Admin credentials
        if(!(user instanceof Admin)) throw new ExceptionMessage("Action restricted");
        dbref = FirebaseDatabase.getInstance().getReference().getRoot().child("Courses");

    }

    public void setCourseID(String id){
        // TODO: implement add/change course id
    }
    public void setPrereqs(List<String> prereqs){
        // TODO: implement add/change prereqs
    }
    public void setSemester(List<Semester> semesters){
        // TODO: implement add/change semester
    }
    public void setSubject(Subject sub){
        // TODO: implement add/change subject
    }
}
