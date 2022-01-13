package edu.matkosoric.execution.output.oracle;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Oracle {

    // what is the output?
    // false true false

    public static void main(String[] args) {

        String s1 = new String("ORACLE");
        String s2 = "ORACLE";
        String s3 = s1.intern();

        System.out.print((s1 == s2) + " ");
        System.out.print((s2 == s3) + " ");
        System.out.println(s1 == s3);
    }
}
