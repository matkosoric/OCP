package edu.matkosoric.streams.employee.filtering;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BirthdayFilter {

    public static void main(String[] args) {

        List<Employee> roster = new ArrayList<>();
        roster.add(new Employee("Tim", LocalDate.of(1955, 2, 22), 25));
        roster.add(new Employee("Rex", LocalDate.of(1963, 1, 4), 10));
        roster.add(new Employee("Ogi", LocalDate.of(1999, 7, 26), 15));
        roster.add(new Employee("Buz", LocalDate.of(1989, 10, 12), 20));
        roster.add(new Employee("Val", LocalDate.of(1997, 9,3), 5));

        Predicate<Employee> y = (Employee e) -> e.getBirthday()
                .isBefore(IsoChronology.INSTANCE.date(1989, 1, 1));


        Set<String> s1 = roster.stream()
                .collect(Collectors.partitioningBy(y))
                .get(true)
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(s1);


        // does not compile
//        Set<String> s2 = roster.stream()
//                .collect(Collectors.partitioningBy(y))
//                .get(true)
//                .map(Employee::getName)
//                .collect(Collectors.toSet());

        // does not compile
//        Set<String> s3 = roster.stream()
//                .collect(Collectors.partitioningBy(y, Collectors.mapping(Employee::getName, Collectors.toSet())));

        Map<Boolean, Set<String>> s4 = roster.stream()
                .collect(Collectors.partitioningBy(y, Collectors.mapping(Employee::getName, Collectors.toSet())));
        System.out.println(s4);

        // does not compile
//        Set<String> s5 = roster.stream()
//                .collect(Collectors.partitioningBy(y, Collectors.groupingBy(Employee::getName, Collectors.toCollection(TreeSet::new))));
//        System.out.println(s5);

        // compiles, but throws runtime error: cannot be cast to class java.lang.Comparable
//        Map<Boolean, Map<String, Collection<Employee>>> s6 = roster.stream()
//                .collect(Collectors.partitioningBy(y, Collectors.groupingBy(Employee::getName, Collectors.toCollection(TreeSet::new))));
//        System.out.println(s6);

    }
}
