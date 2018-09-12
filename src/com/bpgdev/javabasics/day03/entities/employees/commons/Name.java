package com.bpgdev.javabasics.day03.entities.employees.commons;

public class Name {
    private String firstName;
    private String secondName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Name(String firstName, String secondName) {
        setFirstName(firstName);
        setSecondName(secondName);
    }

    public String toString(){
        return getFirstName() + " " + getSecondName();
    }
}
