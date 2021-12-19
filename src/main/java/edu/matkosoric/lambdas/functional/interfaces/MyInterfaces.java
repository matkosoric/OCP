package edu.matkosoric.lambdas.functional.interfaces;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class MyInterfaces {

    // which two of following interfaces are functional?
    // add @FunctionalInterface annotation and see

}

@FunctionalInterface
interface MyInterface1 {
    public int method() throws Exception;

    private void pMethod() { /* an implementation of pMethod */ }
}

@FunctionalInterface
interface MyInterface2 {
    public static void sMethod() { /* an implementation of sMethod */ }

    public boolean equals();
}

//@FunctionalInterface
//interface MyInterface3 {
//    public void method();
//
//    public void method(String str);
//}

//interface MyInterface4 {
//    public void dMethod() { /* an implementation of dMethod */ }
//
//    public void method();
//}

//interface MyInterface5 {
//    public static void sMethod();
//
//    public void method(String str);
//}
