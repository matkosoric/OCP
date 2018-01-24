package edu.matkosoric.concurrency.executor.service;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountingPersonalFlaws {

    // threads within newSingleThreadExecutor will be run sequentially, not concurrently
    // but in a thread separated from the original

    public static void main(String[] args) {

        ExecutorService executorService = null;

        try {
            executorService = Executors.newSingleThreadExecutor();
            System.out.println("the beginning");

            executorService.execute( () -> System.out.println("1. business flaw"));
            executorService.execute( () -> System.out.println("2. character flaw")  );
            executorService.execute( () -> System.out.println("3. intellectual flaw"));

            System.out.println("the end");

        } finally {
            if (executorService != null)
                executorService.shutdown();
        }
    }
}
