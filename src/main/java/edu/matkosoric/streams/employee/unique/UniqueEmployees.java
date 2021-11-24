package edu.matkosoric.streams.employee.unique;

import java.util.ArrayList;
import java.util.List;

public class UniqueEmployees {

    public static void main(String[] args) {

        List<Employee> roster = new ArrayList<>();
        roster.add(new Employee("Tom", "Brooklyn"));
        roster.add(new Employee("Max", "Brooklyn"));
        roster.add(new Employee("Jim", "Bronx"));
        roster.add(new Employee("Pam", "Manhattan"));
        roster.add(new Employee("Liz", "Manhattan"));


        long employeeCount1 = roster.stream()
                .map(Employee::getLocality)
                .distinct()
                .count();
        System.out.println(employeeCount1);

        // compiles, but provides wrong result
        long employeeCount2 = roster.stream()
                .map(e -> e.getLocality())
                .count();
        System.out.println(employeeCount2);

//        long employeeCount3 = roster.stream()
//                .map(e -> e.getLocality())
//                .collect(Collectors.toSet())
//                .count();                               // compilation fails, no count() method on set
//        System.out.println(employeeCount3);

//        long employeeCount4 = roster.stream()
//                .filter(Employee::getLocality)      // compilation fails, not boolean
//                .distinct()
//                .count();
//        System.out.println(employeeCount4);



    }

}
