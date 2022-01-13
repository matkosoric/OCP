package edu.matkosoric.execution.output.adding.failure;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Test {

    // what is the result?
    // compilation error: variable 'x' might not have been initialized

    public static void main(String[] args) {

        int x;
        int y = 5;

        if (y > 2) {
            x = ++y;
            y = x + 7;
        } else {
            y++;
        }
//        System.out.println(x + " " + y);    // compilation fails
    }

}
