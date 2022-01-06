package edu.matkosoric.assertions.enable;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Enabling {

    // JVM ignores assert statements by default.
    // with -enableassertions option in JVM,
    // program will stop upon detecting a false result of assert statement.
    // java will throw AssertionError and stop execution.

    public static void main(String[] args) {

        System.out.println("This line will be executed.");
        assert 3 < 1;
        System.out.println("This line of code will not be reached, but JVM has to be passed the -ea parameter");

    }
}
