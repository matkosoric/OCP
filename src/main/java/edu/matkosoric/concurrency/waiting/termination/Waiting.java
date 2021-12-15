package edu.matkosoric.concurrency.waiting.termination;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.concurrent.*;

public class Waiting {

    // with newCachedThreadPool(), threads are executed concurrently
    // while methods awaitTermination() and isTerminated() check status of the submitted tasks

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = null;

        try {

            executorService = Executors.newCachedThreadPool();

            Future<?> result = executorService.submit(() -> {
                System.out.println("Thread 1 start");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted! 1");
                }
                System.out.println("Thread 1 end");
            });

            result = executorService.submit(() -> {
                System.out.println("Thread 2 start");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted! 2");
                }
                System.out.println("Thread 2 end");
            });

            result = executorService.submit(() -> {
                System.out.println("Thread 3 start");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted! 3");
                }
                System.out.println("Thread 3 end");
            });

        } finally {
            if (executorService != null) executorService.shutdown();
            System.out.println("Executor service shutdown");
        }

        if (executorService != null) {

            executorService.awaitTermination(2, TimeUnit.SECONDS);

            if (executorService.isTerminated())
                System.out.println("Every thread is complete");
            else
                System.out.println("Something is still running.");

        }
    }
}
