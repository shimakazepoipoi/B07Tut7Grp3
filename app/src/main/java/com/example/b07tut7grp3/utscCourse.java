package com.example.b07tut7grp3;
import com.google.firebase.database.*;
import java.util.*;

public class utscCourse implements Course{
    private String course_id;
    private List<utscCourse> prerequisites;
    private Semester semester;
    private Subject subject;

    public utscCourse(DataSnapshot data) throws ExceptionMessage{
        if(!data.exists()) throw new ExceptionMessage("Course not found!");
        //TODO: Continue implementation
    }

    //Simple getter methods
    @Override
    public String getCourseId() {
        return course_id;
    }

    @Override
    public List<Course> getPrerequisites() {
        List<? extends Course> prereq = prerequisites;
        //noinspection unchecked
        return (List<Course>)prereq;
    }

    @Override
    public Semester getSemester() {
        return semester;
    }

    @Override
    public Subject getSubject() {
        return subject;
    }
}
