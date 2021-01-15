package edu.matkosoric.concurrency.atomic.classes;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClasses2 {


    // although is is unknown which thread changes which value, final result can be predicted (4000)
    // because there is no overlapping in reading and writing back incremented value

    static AtomicInteger nuclearBase = new AtomicInteger(0);

    private static void printNuclearBase (int threadId) {
        System.out.println("static value: " + nuclearBase.incrementAndGet() + " has been changed by the thread " + threadId);
    }

    public static void main(String[] args) throws InterruptedException{

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

            if(executorService.isTerminated())
                System.out.println("Every thread is complete");
            else
                System.out.println("Something is still running.");

        }
        System.out.println("Final value is: " + nuclearBase);

    }

}
