package edu.matkosoric.execution.output.nihilism;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Nihilism {

    // what is the output?
    // nothing

    public static void main(String[] args) {

        int x = 0;

        do {
            x++;
            if (x == 1) {
                continue;
            }
            System.out.println(x);
        } while (x < 0);

    }

}
