package edu.matkosoric.execution.output.fruits;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class FruitsOrder2 {

    // what is the output?
    // notice that collect() method triggers execution
    // and that joining parameter does not affect output

    public static void main(String[] args) {

        List<String> fruits = List.of("banana", "orange", "apple", "lemon");
        Stream<String> s1 = fruits.stream();
        Stream<String> s2 = s1.peek(i -> System.out.println(i + " 1"));

        System.out.println("-------");
        Stream<String> s3 = s2.sorted().map(String::toUpperCase);
        Stream<String> s4 = s3.peek(i -> System.out.println(i + " 2"));

        System.out.println("--------");
//        s4.collect(joining());
        String strFruits = s4.collect(joining(" , $$$$"));

    }

}
