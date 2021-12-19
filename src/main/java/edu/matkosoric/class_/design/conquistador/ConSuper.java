package edu.matkosoric.class_.design.conquistador;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class ConSuper {

    protected ConSuper() {
        this(2);
        System.out.println("3");
    }

    protected ConSuper(int a) {
        System.out.println(a);
    }
}