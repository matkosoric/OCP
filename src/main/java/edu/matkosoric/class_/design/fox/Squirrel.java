package edu.matkosoric.class_.design.fox;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Squirrel implements Forest {

    // Squirrel class implements only one interface with default method implementation,
    // and therefore does not have to provide its own implementation

    public static void main(String[] args) {

        new Squirrel().inhabit();

    }

}
