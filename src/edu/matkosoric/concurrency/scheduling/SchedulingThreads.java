package edu.matkosoric.concurrency.scheduling;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.util.concurrent.*;

public class SchedulingThreads {

    // in this case, scheduled threads are executed sequentially.

    static int counter = 0;
    static ScheduledFuture<?> t;

    public static void main(String[] args) throws ExecutionException, InterruptedException{


        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        Runnable thread1 = () -> System.out.println("Kenny Rogers");
        Callable<String> thread2 = () -> {System.out.println("Just Dropped In"); return "7";};

        // first task is scheduled 2 seconds in the future
        Future<?> result1 = scheduledExecutorService.schedule(thread1, 2, TimeUnit.SECONDS);
        System.out.println(result1.get());

        // second task is scheduled 4 seconds in the future
        Future<?> result2 = scheduledExecutorService.schedule(thread2, 4, TimeUnit.SECONDS);
        System.out.println(result2.get());


        // scheduling a task that runs in cycles
        // without t.cancel(false), scheduled task would run indefinitely
        Runnable thread3 = () -> {
            System.out.println("Kenny Rogers & Dolly Parton " + counter);
            counter++;
            if (counter > 10)
                t.cancel(false);        // kills a scheduled task

        };
        scheduledExecutorService.scheduleAtFixedRate(thread3, 5, 2, TimeUnit.SECONDS);

    }
}
