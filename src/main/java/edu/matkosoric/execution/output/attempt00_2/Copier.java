package edu.matkosoric.execution.output.attempt00_2;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public interface Copier {
    public default void print(String msg) {
        System.out.println("Message from copier: " + msg);
    }
}
