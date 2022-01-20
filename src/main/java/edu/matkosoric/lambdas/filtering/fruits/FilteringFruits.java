package edu.matkosoric.lambdas.filtering.fruits;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.List;
import java.util.Optional;

public class FilteringFruits {

    // how to get first element that contains character n
    // Optional<String> result3 = fruits.stream().filter(f -> f.contains ("n")).findFirst ();

    public static void main(String[] args) {

        var fruits = List.of("apple", "orange", "banana", "lemon");

//        String result1 = fruits.stream().filter(f -> f.contains("n")).findAny();                // does not compile
//        fruits.stream().filter(f -> f.contains("n")).forEachOrdered(System.out::print);         // outputs three elements
        Optional<String> result3 = fruits.stream().filter(f -> f.contains("n")).findFirst();
        System.out.println(result3);
//        Optional<String> result4 = fruits.stream().anyMatch(f -> f.contains("n"));              // does not compile

    }
}
