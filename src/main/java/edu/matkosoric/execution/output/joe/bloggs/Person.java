package edu.matkosoric.execution.output.joe.bloggs;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Person {

    private String name = "Joe Bloggs";

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
