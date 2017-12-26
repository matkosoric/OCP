package edu.matkosoric.assertions.enable;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2017.
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
        System.out.println("This line of code will not be reached.");

    }
}
