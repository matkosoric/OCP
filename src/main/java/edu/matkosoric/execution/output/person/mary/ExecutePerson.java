package edu.matkosoric.execution.output.person.mary;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class ExecutePerson {

    // what is the output?
    // null
    // Mary

    public static void main(String[] args) {

        Person p = null;
        checkPerson(p);
        System.out.println(p);

        p = new Person("Mary");
        checkPerson(p);
        System.out.println(p);

    }


    public static Person checkPerson(Person p) {
        if (p == null) {
            p = new Person("Joe");
        } else {
            p = null;
        }
        return p;
    }

}
