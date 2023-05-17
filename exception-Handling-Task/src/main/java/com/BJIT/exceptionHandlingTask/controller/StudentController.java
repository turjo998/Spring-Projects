package com.BJIT.exceptionHandlingTask.controller;


import com.BJIT.exceptionHandlingTask.exception.StudentNotEligbleException;
import com.BJIT.exceptionHandlingTask.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/student"})
public class StudentController {

    public StudentController(){

    }
    @GetMapping("/get-info/{age}")
    public ResponseEntity<Object> getStudentInfo(@PathVariable Integer age)  {

        if(age > 18){
            Student student = new Student("Adam Joe" , 45);
            return new ResponseEntity<>(student , HttpStatus.CREATED);
        }else{
            throw new StudentNotEligbleException("This person is not eligible for vote");
        }
    }

}
