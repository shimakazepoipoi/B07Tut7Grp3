package com.example.b07tut7grp3;
import com.google.firebase.database.*;
import java.util.*;

public class utscCourse implements Course{
    protected String course_id;
    protected List<utscCourse> prerequisites;
    protected List<Semester> semester;
    protected Subject subject;
    protected utscCourse(){
        // for initialization in add mode
    }
    public utscCourse(DataSnapshot data, String course_id) throws ExceptionMessage{
        if(!data.exists() || !data.hasChild("Courses"))
            throw new ExceptionMessage("could not find database!");
        if(!data.child("Courses").hasChild(course_id))
            throw new ExceptionMessage("could not find course!");
        this.course_id = course_id;
        this.subject = Subject.valueOf((String)data.child("Courses").
                child(course_id).child("Subject").getValue());
        //TODO: Continue implementation

    }
    /*
    private List<utscCourse> getCourses(){

    }*/
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
    public List<Semester> getSemester() {
        return semester;
    }

    @Override
    public Subject getSubject() {
        return subject;
    }
}
