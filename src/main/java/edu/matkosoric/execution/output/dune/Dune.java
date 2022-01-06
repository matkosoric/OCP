package edu.matkosoric.execution.output.dune;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Dune {

    // what is the type of local variable?
    // String


    public static void main(String[] args) {

        for (var x : args) {
            System.out.println(x);
            System.out.println(x.getClass());
        }

    }
}
