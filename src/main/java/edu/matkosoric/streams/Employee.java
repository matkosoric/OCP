package edu.matkosoric.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {

    private String name;
    private String neighborhood;

    public Employee(String name, String neighborhood) {
        this.name = name;
        this.neighborhood = neighborhood;
    }

    public String getNeighborhood () {
        return neighborhood;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", neighborhood=" + neighborhood + "]";
    }




    public static void main(String[] args) {

        List<Employee> roster = new ArrayList<>();
        roster.add(new Employee( "Tom", "Brooklyn"));
        roster.add(new Employee( "Jim", "Brooklyn"));
        roster.add(new Employee( "Max", "Brooklyn"));
        roster.add(new Employee( "Pam", "Manhattan"));
        roster.add(new Employee( "Liz", "Manhattan"));

        Predicate<Employee> brooklynPredicate = e -> e.getNeighborhood().equals("Brooklyn");
        Function<Employee, Optional<String>> f = e -> Optional.ofNullable(e.getNeighborhood());

        // group1
        Map<String, List<Employee>> group1 = roster.stream()
                .collect(Collectors.groupingBy(
                        e -> Optional.ofNullable(e.getNeighborhood()).get()
                ));

        System.out.println(group1);


        // group2
        Map<Object, List<Employee>> group2 = roster.stream()
                .collect(Collectors.groupingBy(
                        e -> Optional.ofNullable(e.getNeighborhood())
                ));

        System.out.println(group2);


        // group3
        Map<Object, List<Employee>> group3 = roster.stream()
                .collect(Collectors.groupingBy(
                        (e -> Optional.ofNullable(e.getNeighborhood()).get())
                ));

        System.out.println(group3);


        // group4
        Map<String, List<Employee>> group4 = roster.stream()
                .filter(brooklynPredicate)
                .collect(Collectors.groupingBy(
                        (e -> Optional.ofNullable(e.getNeighborhood()).get())
                ));

        System.out.println(group4);


        // does not compile
        // cannot find symbol method filtering(java.util.function.Predicate<edu.matkosoric.streams.Employee>,java.util.stream.Collector<java.lang.Object,capture#1 of ?,java.util.List<java.lang.Object>>)
//        // group5
//        Map<String, List<Employee>> group5 = roster.stream()
//                .collect(Collectors.groupingBy(Employee::getNeighborhood,
//                        Collectors.filtering(brooklynPredicate,Collectors.toList())
//                ));
//
//        System.out.println(group5);


        // does not compile
        // expected String, not Optional<String>
        // group6
//        Map<String, List<Employee>> group6 = roster.stream()
//                .filter(brooklynPredicate)
//                .collect(Collectors.groupingBy(
//                        f,Collectors.filtering(brooklynPredicate, Collectors.toList())
//                ));
//
//        System.out.println(group6);

    }

}

