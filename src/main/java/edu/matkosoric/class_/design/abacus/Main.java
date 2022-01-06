package edu.matkosoric.class_.design.abacus;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

// #TAG3

public class Main {

    // pick Abacus instance that compile
    // (int e, int f) -> { return e * f; };
    // (a, b) -> a * b;

    public static void main(String[] args) {

        int result = 0;

//        Abacus abacus1 = (int m, int n) -> { m * n };             // does not compile
        Abacus abacus2 = (int e, int f) -> { return e * f; };
        Abacus abacus3 = (a, b) -> a * b;
//        Abacus abacus4 = v, w -> x * y;                           // does not compile
//        Abacus abacus5 = (int i, j) -> ( return i * j; };         // does not compile

        result = abacus2.calc(10, 20);
        System.out.println(result);

        result = abacus3.calc(10, 20);
        System.out.println(result);

    }

}
