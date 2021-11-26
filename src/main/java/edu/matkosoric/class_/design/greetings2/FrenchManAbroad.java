package edu.matkosoric.class_.design.greetings2;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Collection;
import java.util.List;

public class FrenchManAbroad extends FrenchMan {

    public void greeting(Collection arg) {
        System.out.println("Hello world!");
    }

    public void greeting(List arg) {
        System.out.println("Ola Mundo!");
    }

}
