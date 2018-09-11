package com.bpgdev.javabasics.day03.entities.employees;

import java.util.Random;

import com.bpgdev.javabasics.day03.entities.employees.commons.*;

public class Developer extends Employee {

    private int fixedBugs;
    private double coefficient = 1.5;

    public int getFixedBugs() {
        return fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public Developer(long id, Name name, int age, double salary, Gender gender, int fixedBugs) {
        super(id, name, age, salary, gender);
        setFixedBugs(fixedBugs);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("; Fixed bug(s) - " + getFixedBugs());
    }

    @Override
    public double calculateSalaryAndBonus() {
        return (super.calculateSalaryAndBonus() + getFixedBugs()*coefficient) * (new Random().nextBoolean() ? 2 : 0);
    }
}
