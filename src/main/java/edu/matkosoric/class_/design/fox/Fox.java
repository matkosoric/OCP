package edu.matkosoric.class_.design.fox;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Fox implements Forest, Town{

    // Fox class must provide implementation for the inhabit method
    // since it is implementing two interfaces.
    // Otherwise, compilation fails
    // If Fox class was implementing only one interface, as Squirrel class,
    // it would not have to implement inhabit() method

    public void inhabit() {
        System.out.println("Fox class call");
    }

    public static void main(String[] args) {
        new Fox().inhabit();
    }
}
