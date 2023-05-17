package com.BJIT.exceptionHandlingTask.exception;

public class StudentNotEligbleException extends RuntimeException{

    public StudentNotEligbleException(String msg){
        super(msg);
    }
}
