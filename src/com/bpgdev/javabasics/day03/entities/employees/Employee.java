package com.bpgdev.javabasics.day03.entities.employees;

import com.bpgdev.javabasics.day03.entities.employees.commons.*;

import java.text.DecimalFormat;

public class Employee {
    private long id;
    private Name name;
    private int age;
    private double salary;
    private Gender gender;

    protected static DecimalFormat df2 = new DecimalFormat("#0.##");
    protected static DecimalFormat lf = new DecimalFormat("#0");

    // ---------- Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    // ----------

    // ---------- Constructors
    public Employee(long id, Name name, int age, double salary, Gender gender) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
        this.setGender(gender);
    }
    // ----------

    public void print() {
        System.out.print(this.getClass().getSimpleName() +
                "; ID - " + lf.format(getId()) +
                "; Name - " + getName().toString() +
                "; Age - " + getAge() +
                "; Salary - " + df2.format(getSalary()) +
                "; Gender - " + getGender());
    }

    public double calculateSalaryAndBonus() {
        return getSalary();
    }
}
