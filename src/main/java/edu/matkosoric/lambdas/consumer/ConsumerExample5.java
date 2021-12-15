package edu.matkosoric.lambdas.consumer;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.function.Consumer;

public class ConsumerExample5 {

    // what is the output?
    // c1 accepted
    // c2 accepted
    // after then
    // after then
    // c2 accepted again

    public static void main(String[] args) {

        Consumer<String> c1 = arg -> System.out.println(arg);
        c1.accept("c1 accepted");
        Consumer<String> c2 = arg -> System.out.println(arg);
        c2.accept("c2 accepted");
        c2.andThen(c1).accept("after then");
        c2.accept("c2 accepted again");

    }
}
