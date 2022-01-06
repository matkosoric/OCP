package edu.matkosoric.lambdas.calculator;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.function.Function;

public class Calculator {

    // Which interface from the java.util.function
    // package can be used to refactor the Calculator class?
    // Function

    public static void main(String[] args) {
        MyInterface myInterface = a -> a + 1;
        System.out.println(myInterface.add(10));

        // refactored version
        Function<Integer, Integer> func2 = x -> x + 1;
        System.out.println(func2.apply(10));
    }
}

interface MyInterface {
    int add(int x);
}
