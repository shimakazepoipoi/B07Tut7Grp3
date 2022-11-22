package com.example.b07tut7grp3;
import java.lang.Exception;
public class ExceptionMessage extends Exception{
    private String message;
    public ExceptionMessage(String message){
        this.message = message;
    }
}
