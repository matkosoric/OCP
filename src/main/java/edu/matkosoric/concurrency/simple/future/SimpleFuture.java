package edu.matkosoric.concurrency.simple.future;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.concurrent.*;

public class SimpleFuture {

    // executor service is running a thread that takes 5 seconds to complete
    // get() method interrupts its execution and produces TimeoutException

    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = null;

        try {

            executorService = Executors.newSingleThreadExecutor();

            Future<?> result = executorService.submit(() -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted!");
                }
            });

            result.get(2, TimeUnit.SECONDS);

            System.out.println("Regular end!");

        } catch (TimeoutException e) {
            System.out.println("Timeout!");
        } finally {
            if (executorService != null) executorService.shutdown();
        }
    }
}
