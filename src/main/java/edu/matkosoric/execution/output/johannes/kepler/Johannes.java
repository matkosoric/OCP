package edu.matkosoric.execution.output.johannes.kepler;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Johannes {

    // what is the result of the code?
    // compilation fails, static y variable not initialised

    private final int x = 1;

    //    static final int y;         // breaks compilation
    public Johannes() {
        System.out.println(x);
//        System.out.println(y);
    }

    public static void main(String[] args) {
        new Johannes();
    }


}
