package edu.matkosoric.resources.auto.closing;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Resource implements AutoCloseable {
    public Resource() {
        System.out.println("A");
    }

    @Override
    public void close() {
        System.out.println("close() method");
    }

    public void printResource() {
        System.out.println("C");
    }
}
