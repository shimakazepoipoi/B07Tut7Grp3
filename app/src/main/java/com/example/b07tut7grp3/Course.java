package com.example.b07tut7grp3;

import java.util.List;

interface Course {
    public String getCourseId();
    public List<Course> getPrerequisites();
    public Semester getSemester();
}
