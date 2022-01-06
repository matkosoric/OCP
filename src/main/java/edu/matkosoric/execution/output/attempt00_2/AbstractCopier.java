package edu.matkosoric.execution.output.attempt00_2;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public abstract class AbstractCopier {
    protected void print(String load) {
        System.out.println("Message from Abstract copier: " + load);
    }
}
