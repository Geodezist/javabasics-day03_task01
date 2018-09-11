package com.bpgdev.javabasics.day03.entities.employees;

import com.bpgdev.javabasics.day03.entities.employees.commons.*;

public class Cleaner extends Employee {

    private double rate;
    private int workedDays;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }

    public Cleaner(long id, Name name, int age, double salary, Gender gender, double rate, int workedDays) {
        super(id, name, age, salary, gender);
        setRate(rate);
        setWorkedDays(workedDays);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("; Rate - " + df2.format(getRate()) + "; Worked day(s) - " + getWorkedDays());
    }

    @Override
    public double calculateSalaryAndBonus() {
        return super.calculateSalaryAndBonus() + getRate() * getWorkedDays();
    }
}
