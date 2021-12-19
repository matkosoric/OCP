package edu.matkosoric.execution.output.attempt00;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public abstract class AbstractCopier {
    protected void print(String load) {
        System.out.println("message from abstract copier: " + load);
    }
}
