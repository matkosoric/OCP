package edu.matkosoric.execution.output.attempt00;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

// #TAG1

public class TestImpl extends AbstractCopier implements Copier {

    // what is the output, if print() is static?
    // message from abstract copier: Attempt00

    public static void main(String[] args) {
        TestImpl impl = new TestImpl();
        impl.print("Attempt00");

    }

}
