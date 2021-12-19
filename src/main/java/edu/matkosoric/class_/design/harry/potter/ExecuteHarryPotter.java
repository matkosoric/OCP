package edu.matkosoric.class_.design.harry.potter;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

// #TAG2

public class ExecuteHarryPotter {

    // what is the output?
    // Good Night, Potter
    // greeting() method is called on type, and field name() on instance

    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.greeting() + ", "+ s.name());
    }

}
