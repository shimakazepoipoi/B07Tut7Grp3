package com.example.admintools;

import com.example.b07tut7grp3.ExceptionMessage;
import com.example.b07tut7grp3.utscCourse;
import com.google.firebase.database.*;

class utscCourseModifier extends utscCourse {
    public utscCourseModifier(DataSnapshot data, String course_id) throws ExceptionMessage {
        // initialization in read/edit mode
        super(data, course_id);
    }
    public utscCourseModifier(){
        // initialization in add mode
    }
}
