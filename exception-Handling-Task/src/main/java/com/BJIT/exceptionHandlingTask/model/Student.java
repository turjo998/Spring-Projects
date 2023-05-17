package com.BJIT.exceptionHandlingTask.model;

public class Student {

    private String name;
    private Integer weight;

    public Student() {
    }

    public Student(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
