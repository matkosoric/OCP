package edu.matkosoric.execution.output.alpha.gamma;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class AlphaGamma {

    // what is the output
    // Alpha

    public static void main(String[] args) {

        var i = 1234;
        var s = "" + i;

        if ("1234".equals(s))
            System.out.println("Alpha");


        if ("1234" == s)
            System.out.println("Gamma");

    }

}
