package edu.matkosoric.streams.employee.filtering;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeCount {

    public static void main(String[] args) {

        List<Employee> roster = new ArrayList<>();
        roster.add(new Employee("Tim", LocalDate.of(1955, 2, 22), 25));
        roster.add(new Employee("Rex", LocalDate.of(1963, 1, 4), 10));
        roster.add(new Employee("Ogi", LocalDate.of(1999, 7, 26), 15));
        roster.add(new Employee("Buz", LocalDate.of(1989, 10, 12), 20));
        roster.add(new Employee("Val", LocalDate.of(1997, 9,3), 5));

        Predicate<Employee> p = e -> e.getSalary() > 13;
        LocalDate cutoffDate = IsoChronology.INSTANCE.date(1980, 1, 1);

        long countEmployees = roster.stream()
                .filter(p)
                .filter(e -> e.getBirthday().isAfter(cutoffDate))
                .peek(element -> System.out.println(element))           // see stream content
                .count();

        System.out.println(countEmployees);

    }

}
