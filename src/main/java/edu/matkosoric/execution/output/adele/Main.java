package edu.matkosoric.execution.output.adele;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Main {

    // what is the result?
    // Hello

    public static void greet(String... args) {
        System.out.println("Hello ");
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {

        Main c = null;
        c.greet();

    }

}
