package edu.matkosoric.resources.auto.closing;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class UsingResource {

    public static void main(String[] args) {

        // what is the output?

        // A
        // C
        // close() method
        // D
        // close() is executed after try block and before finally block

        try (Resource r = new Resource()) {
            r.printResource();
        } finally {
            System.out.println("D");
        }
    }
}
