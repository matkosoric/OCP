package edu.matkosoric.class_.design.conquistador;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

// #TAG1

public class ConSub extends ConSuper {

    // what is the output?
    // 234

    ConSub() {
        this(4);
        System.out.println("1");
    }

    ConSub(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        new ConSub(4);
    }

}
