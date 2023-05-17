package com.BJIT.exceptionHandlingTask.exception;

public class PersonNotEligbleException extends RuntimeException{

    public PersonNotEligbleException(String msg){
        super(msg);
    }
}
