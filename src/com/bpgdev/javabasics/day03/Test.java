package com.bpgdev.javabasics.day03;

import com.bpgdev.javabasics.day03.entities.employees.*;
import com.bpgdev.javabasics.day03.services.EmployeeService;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat(".##");

        MockEmployeeGenerator mockEmployeeGenerator = new MockEmployeeGenerator();
        Employee[] employees = mockEmployeeGenerator.generateEmployees(10);

        EmployeeService employeeService = new EmployeeService(employees);

        printDelimiter();
        employeeService.printEmployees();

        printDelimiter();
        System.out.println("Total salary with bonuses = " + df2.format(employeeService.calculateSalaryAndBonus()));

        printDelimiter();
        employeeService.getById(5).print();

        printDelimiter();
        employeeService.printEmployees(employeeService.getByName(employeeService.getById(3).getName().getFirstName()));

        printDelimiter();
        employeeService.printEmployees(employeeService.sortByName());

        printDelimiter();
        employeeService.printEmployees();
    }

    static void printDelimiter(){
        System.out.println("---------------------------------------------------------------");
    }

}
