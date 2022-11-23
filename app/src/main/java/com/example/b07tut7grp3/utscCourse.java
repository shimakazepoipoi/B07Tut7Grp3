package com.example.b07tut7grp3;
import com.google.firebase.database.*;
import java.util.*;

public class utscCourse implements Course{
    protected String course_id;
    protected List<utscCourse> prerequisites;
    protected Semester semester;
    protected Subject subject;
    protected utscCourse(){
        // for initialization in add mode
    }
    public utscCourse(DataSnapshot data, String course_id) throws ExceptionMessage{
        //TODO: Continue implementation
        if(!data.exists()) throw new ExceptionMessage("could not find database!");
        if(!data.child("Courses").hasChild(course_id))
            throw new ExceptionMessage("could not find course!");
        this.course_id = course_id;


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
