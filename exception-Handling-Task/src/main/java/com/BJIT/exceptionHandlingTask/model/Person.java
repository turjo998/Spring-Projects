package com.BJIT.exceptionHandlingTask.model;

public class Person {
    private String name;
    private String address;

    private Integer weight;

    public Person() {
    }

    public Person(String name, String address, Integer weight) {
        this.name = name;
        this.address = address;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
