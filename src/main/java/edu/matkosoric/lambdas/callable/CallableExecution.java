package edu.matkosoric.lambdas.callable;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExecution {

    // Which type of lambda expression is passed into submit() in provided example?
    // Callable

    public static void main(String[] args) {

        var pool = Executors.newFixedThreadPool(5);
        Future outcome = pool.submit(() -> 1);

    }
}
