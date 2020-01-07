package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 87));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());
        employeeList.set(1, new Employee("John", "Adam", 4562));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 422));
        employeeList.forEach(employee -> System.out.println(employee));

        Object [] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

    }
}
