package edu.matkosoric.resources.auto.closing;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
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
