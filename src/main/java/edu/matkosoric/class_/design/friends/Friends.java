package edu.matkosoric.class_.design.friends;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Friends {

    // checking compilation

    final int num; // line 1

    public Friends(int num) {
        this.num = num;
    }

    final void method() {
        System.out.println("Friends method");
    }
}
