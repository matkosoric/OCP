package edu.matkosoric.execution.output.dr.who;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Person {

    private String name;

    public void setName(String name) {
        String title = "Dr.";
        name = title + name;
    }

    public String toString() {
        return name;
    }
}
