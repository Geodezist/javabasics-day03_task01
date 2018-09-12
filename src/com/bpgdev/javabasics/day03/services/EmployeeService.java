package com.bpgdev.javabasics.day03.services;


import com.bpgdev.javabasics.day03.entities.employees.Employee;

public class EmployeeService {
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public EmployeeService(Employee[] employees) {
        this.setEmployees(employees);
    }

    public void printEmployees() {
        for (Employee employee : getEmployees()) {
            employee.print();
        }
    }

    public void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            employee.print();
        }
    }

    public double calculateSalaryAndBonus() {
        double result = 0d;

        for (Employee employee : getEmployees()
        ) {
            result += employee.calculateSalaryAndBonus();
        }
        return result;
    }

    public Employee getById(long id) {
        for (Employee employee : getEmployees()) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public Employee[] getByName(String firstName) {
        Employee[] employees = new Employee[getEmployees().length];
        int index = 0;
        for (Employee employee : getEmployees()) {
            if (employee.getName().getFirstName().equals(firstName)) {
                employees[index] = employee;
                index++;
            }
        }
        Employee[] result = new Employee[index];
        System.arraycopy(employees,0,result,0,index);
        return result;
    }

    public Employee[] sortByName() {
        int arraySize = getEmployees().length;
        Employee[] employees = new Employee[arraySize];
        System.arraycopy(getEmployees(), 0, employees, 0, arraySize);

        for (int index = 0; index < arraySize; index++) {
            for (int index2 = index + 1; index2 < arraySize; index2++) {
                if (employees[index].getName().toString().compareTo(employees[index2].getName().toString()) > 0) {
                    Employee tempEmployee = employees[index];
                    employees[index] = employees[index2];
                    employees[index2] = tempEmployee;
                }
            }
        }
        return employees;
    }

    /*
    public Employee[] sortByNameAndSalary() {

    }

    public Employee edit(Employee) {

    }

    public Employee[] getByName(String firstName, String secondName) {

    }


    public Employee[] getByName(Name name) {

    }
*/


}
