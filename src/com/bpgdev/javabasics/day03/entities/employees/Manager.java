package com.bpgdev.javabasics.day03.entities.employees;

import com.bpgdev.javabasics.day03.entities.employees.commons.*;

public class Manager extends Employee{

    public Manager(long id, Name name, int age, double salary, Gender gender) {
        super(id, name, age, salary, gender);
    }

    @Override
    public void print() {
        super.print();
        System.out.println();
    }
}
