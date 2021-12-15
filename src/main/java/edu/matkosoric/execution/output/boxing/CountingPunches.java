package edu.matkosoric.execution.output.boxing;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class CountingPunches {

    // what is the output?
    // 1 3 5 7 9

    public static void main(String[] args) {

        int i = 0;
        for (; i < 10; i++) {
            System.out.print(++i + " ");
        }

    }

}
