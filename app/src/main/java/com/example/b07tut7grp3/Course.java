package com.example.b07tut7grp3;

import java.util.List;

public interface Course {
    // Course interface
    public String getCourseId();
    public List<String> getPrerequisites();
    public List<Semester> getSemester();
    public Subject getSubject();
}
