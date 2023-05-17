package com.BJIT.exceptionHandlingTask.controller;


import com.BJIT.exceptionHandlingTask.exception.PersonNotEligbleException;
import com.BJIT.exceptionHandlingTask.exception.StudentNotEligbleException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    public GlobalExceptionHandler() {
    }

    @ExceptionHandler({StudentNotEligbleException.class, ArithmeticException.class , PersonNotEligbleException.class})
    public ResponseEntity<Object> returnNotEligibleException(Exception ex) {
        if (ex instanceof StudentNotEligbleException) {
            return new ResponseEntity(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
        else {
            return ex instanceof PersonNotEligbleException ? new ResponseEntity(ex.getMessage(), HttpStatus.NOT_FOUND) : new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
}
