package edu.matkosoric.class_.design.hashtag.methods;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Test {

    // what is the result?
    // compilation fails on line ac = sc;

    public static void main(String[] args) {
        AnotherClass ac = new AnotherClass();
        SomeClass sc = new AnotherClass();
        //ac = sc;

        sc.methodA();
        ac.methodA();
    }

}
