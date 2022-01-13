package edu.matkosoric.streams.employee.salary;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    // Create map that contains the employee with the highest salary for each neighborhood?
    // firstly  grouping, secondly maxBy
    // Map<String, Optional<Employee>> resultMap = roster.stream()
    //      .collect(Collectors.groupingBy(Employee::getNeighborhood, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

    public static void main(String[] args) {

        List<Employee> roster = new ArrayList<>();
        roster.add(new Employee("Tom", 300, "Brooklyn"));
        roster.add(new Employee("Jim", 600, "Brooklyn"));
        roster.add(new Employee("Max", 500, "Manhattan"));
        roster.add(new Employee("Pam", 400, "Manhattan"));
        roster.add(new Employee("Liz", 700, "Manhattan"));

        Map<String, Optional<Employee>> resultMap = roster.stream()
                .collect(Collectors.groupingBy(Employee::getNeighborhood, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(resultMap);

    }
}
