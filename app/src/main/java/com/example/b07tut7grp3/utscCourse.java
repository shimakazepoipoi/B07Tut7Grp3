package com.example.b07tut7grp3;
import com.google.firebase.database.*;
import java.util.*;

public class utscCourse implements Course{
    protected String course_id;
    protected List<String> prerequisites;
    protected List<Semester> semester;
    protected Subject subject;
    protected utscCourse(){
        // for initialization in add mode
        //TODO: implement course addition
    }
    public utscCourse(DataSnapshot data, String course_id) throws ExceptionMessage{
        if(!data.exists() || !data.hasChild("Courses"))
            throw new ExceptionMessage("could not find database!");
        if(!data.child("Courses").hasChild(course_id))
            throw new ExceptionMessage("could not find course!");
        this.course_id = course_id;
        DataSnapshot courseInfo = data.child("Courses").child(course_id);
        this.subject = Subject.valueOf((String)(courseInfo.child("Subject").getValue()));
        prerequisites = new ArrayList<String>();
        for(DataSnapshot i : courseInfo.child("Prerequisites").getChildren())
            prerequisites.add((String)i.getValue());
        semester = new ArrayList<Semester>();
        for(DataSnapshot i : courseInfo.child("Semesters").getChildren())
            semester.add(Semester.valueOf((String)i.getValue()));
    }

    //Simple getter methods
    @Override
    public String getCourseId() {
        return course_id;
    }

    @Override
    public List<String> getPrerequisites() {
        return this.prerequisites;
    }

    @Override
    public List<Semester> getSemester() {
        return semester;
    }

    @Override
    public Subject getSubject() {
        return subject;
    }

    @Override
    public int hashCode() {
        return course_id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)return true;
        if(obj == null || (!(obj instanceof utscCourse)))return false;
        if(this.course_id.equals(((utscCourse) obj).getCourseId())) return true;
        return false;
    }
}
