package edu.matkosoric.execution.output.aqcd;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class AQCD {

    // how to get AQCD string?
    // s2.replace(s2.indexOf("B"), s2.indexOf("C"), "Q");

    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("ABCD");
        s1.replace(s1.indexOf("A"), s1.indexOf("C"), "Q");
        System.out.println(s1);

        StringBuilder s2 = new StringBuilder("ABCD");
        s2.replace(s2.indexOf("B"), s2.indexOf("C"), "Q");
        System.out.println(s2);

        StringBuilder s3 = new StringBuilder("ABCD");
        s3.replace(s3.indexOf("B"), s3.indexOf("B"), "Q");
        System.out.println(s3);

        StringBuilder s4 = new StringBuilder("ABCD");
        s4.replace(s4.indexOf("A"), s4.indexOf("B"), "Q");
        System.out.println(s4);

    }
}
