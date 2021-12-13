package edu.matkosoric.execution.output.tester;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Tester {

    // what is the output?
    // a
    // b
    // c
    // d

    public static void main(String[] args) {

        try {
            doA();
            doB();
        } catch (IOException e) {
            System.out.println("c");
            return;
        } finally {
            System.out.println("d");
        }

        System.out.println("f");

    }

    private static void doA() {
        System.out.println("a");
        if (false) {
            throw new IndexOutOfBoundsException();
        }
    }

    private static void doB() throws FileNotFoundException {
        System.out.println("b");
        if (true) {
            throw new FileNotFoundException();
        }

    }

}
