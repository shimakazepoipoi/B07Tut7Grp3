package com.example.b07tut7grp3;

import androidx.annotation.NonNull;

@SuppressWarnings("unused")
public enum Semester {
    FALL("Fall"),
    WINTER("Winter"),
    SUMMER("Summer");
    private String semester;
    private Semester(String term) {
        this.semester = term;
    }

    @Override
    public String toString(){
        return this.semester;
    }
}
