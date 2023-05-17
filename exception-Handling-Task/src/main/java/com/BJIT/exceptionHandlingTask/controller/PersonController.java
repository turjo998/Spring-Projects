package com.BJIT.exceptionHandlingTask.controller;

import com.BJIT.exceptionHandlingTask.exception.PersonNotEligbleException;
import com.BJIT.exceptionHandlingTask.exception.StudentNotEligbleException;
import com.BJIT.exceptionHandlingTask.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/person"})
public class PersonController {

    public PersonController(){

    }
    @GetMapping("/get-info/{age}")
    public ResponseEntity<Object> getPersonInfo(@PathVariable Integer age)  {

        if(age >= 18){
            Person person = new Person("Adam Joe" , "Danmondi" , 55);
            return new ResponseEntity<>(person , HttpStatus.CREATED);
        }else{
            throw new PersonNotEligbleException("Can't go to ramna park");
        }
    }



}
