package edu.matkosoric.concurrency.runnable;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Executing {

    // simple use of class that implements Runnable interface

    public static void main(String[] args) {


        PrintingRandomNumbers a = new PrintingRandomNumbers("a");
        PrintingRandomNumbers b = new PrintingRandomNumbers("b");
        PrintingRandomNumbers c = new PrintingRandomNumbers("c");

        // these operations are executed in the exact order of calling the run() method
        a.run();
        b.run();
        c.run();
        a.run();
        c.run();

    }

}
