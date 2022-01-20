package edu.matkosoric.collections.ordering.persons;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderingPersons {

    // what is the output?
    //  Tom Peter Aman

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>(List.of(new Person(44, "Tom"),
                new Person(40, "Aman"),
                new Person(40, "Peter")));

        persons.sort(Comparator.comparing((Person::getAge))
                .thenComparing(Person::getName)
                .reversed());

        persons.forEach(p1 -> System.out.print(" " + p1.getName()));

    }

}
