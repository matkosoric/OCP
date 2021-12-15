package edu.matkosoric.class_.design.fox;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public interface Town extends Habitat {

    default void inhabit() {
        System.out.println("Inhabiting town");
    }

}
