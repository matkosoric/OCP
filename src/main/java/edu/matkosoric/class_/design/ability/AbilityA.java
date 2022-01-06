package edu.matkosoric.class_.design.ability;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public interface AbilityA {
    default void action() {
        System.out.println("AbilityA action");
    }
}
