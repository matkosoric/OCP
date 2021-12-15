package edu.matkosoric.lambdas.my.runnable;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

// the only interface provided in here
// that contains exactly single abstract (unimplemented) method

// #TAG2

@FunctionalInterface
interface MyRunnable3 {
    public default void run() {
    }

    public void run(String s);
}
