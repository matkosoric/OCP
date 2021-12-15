package edu.matkosoric.execution.output.fruits;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class FruitsOrder {

    // what is the output ?
    // because of the minus sign ( - a.compareTo(b) ), order is reversed

    public static void main(String[] args) {

        String[] fruitNames = {"appple", "orange", "grape", "lemon", "apricot", "watermelon"};

        var fruits = new ArrayList<>(Arrays.asList(fruitNames));

        // with minus
        fruits.sort((var a, var b) -> -a.compareTo(b));
        fruits.forEach(System.out::println);

        // without minus
        fruits.sort((var a, var b) -> a.compareTo(b));
        fruits.forEach(System.out::println);


    }

}
