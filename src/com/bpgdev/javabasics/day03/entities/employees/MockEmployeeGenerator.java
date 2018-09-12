package com.bpgdev.javabasics.day03.entities.employees;

import com.bpgdev.javabasics.day03.entities.employees.commons.*;

import java.util.Random;

public class MockEmployeeGenerator {

    private String[] femaleFirstNames = {"Anna", "Sveta", "Olga", "Natasha", "Nina"};
    private String[] maleFirstNames = {"Pavlo", "Olexandr", "Sergiy", "Tom"};
    private String[] secondNames = {"Kovalenko", "Petrenko", "Ivanchenko", "Nalivko", "Komarenko"};

    public Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        Name name;

        Random random = new Random();
        int randomEmployee = 0;
        int randomGender = 0;
        int randomAge = 18;
        double randomSalary = 0.;
        Gender gender = Gender.MALE;

        for (int index = 0; index < count; index++) {
            randomEmployee = random.nextInt(3);
            randomGender = random.nextInt(2);
            randomAge = 18 + random.nextInt(42);
            randomSalary = 1000 * random.nextDouble();

            if (randomGender == 0) {
                name = new Name(maleFirstNames[random.nextInt(maleFirstNames.length - 1)],
                        secondNames[random.nextInt(secondNames.length - 1)]);
                gender = Gender.MALE;
            } else {
                name = new Name(femaleFirstNames[random.nextInt(femaleFirstNames.length - 1)],
                        secondNames[random.nextInt(secondNames.length - 1)]);
                gender = Gender.FEMALE;
            }

            if (randomEmployee == 0) {
                employees[index] = new Developer(index, name, randomAge, 2000. + randomSalary, gender, random.nextInt(10));
            } else if (randomEmployee == 1) {
                employees[index] = new Manager(index, name, randomAge, 3000. + randomSalary, gender);
            } else {
                employees[index] = new Cleaner(index, name, randomAge, 500. + randomSalary, gender, random.nextDouble(), random.nextInt(22));
            }
        }
        return employees;
    }
}
