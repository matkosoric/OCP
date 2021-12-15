package edu.matkosoric.lambdas.bifunction;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.function.BiFunction;

public class BiFunctionExample {

    // demonstration of BiFunction functional interface

    public static void main(String[] args) {

        BiFunction<String, String, Integer> calculateNameSurname = (name, surname) -> (name.concat(surname).length());

        System.out.println(calculateNameSurname.apply("Sean", "Connery"));
        System.out.println(calculateNameSurname.apply("Roger", "Moore"));
        System.out.println(calculateNameSurname.apply("Daniel", "Craig"));
        System.out.println(calculateNameSurname.apply("Matko", "Sorić"));

    }
}
