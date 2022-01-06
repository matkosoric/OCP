package edu.matkosoric.concurrency.atomic.classes;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AtomicClasses {


    // output of this code can not be predicted without atomic usage of class.
    // since variable nuclearBase is a regular (not atomic) int, every thread can change it >while< it is used in another thread.

    static int nuclearBase = 0;

    private static void printNuclearBase(int threadId) {
        System.out.println("static value: " + nuclearBase++ + " has been changed by the thread " + threadId);
    }

    public static void main(String[] args) throws InterruptedException {


        ExecutorService executorService = null;

        try {
            executorService = Executors.newFixedThreadPool(2000);
            for (int i = 0; i < 40_000; i++) {
                final int a = i;
                executorService.submit(() -> printNuclearBase(a));
            }
        } finally {

            if (executorService != null) executorService.shutdown();
        }

        // waiting for the execution to end
        if (executorService != null) {
            executorService.awaitTermination(3, TimeUnit.SECONDS);

            if (executorService.isTerminated())
                System.out.println("Every thread is complete");
            else
                System.out.println("Something is still running.");

        }
        System.out.println("Final value is: " + nuclearBase);

    }

}
