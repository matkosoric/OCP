package edu.matkosoric.class_.design.fox;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public interface Forest extends Habitat {

    default void inhabit() {
        System.out.println("Inhabiting forrest");
    }

}
