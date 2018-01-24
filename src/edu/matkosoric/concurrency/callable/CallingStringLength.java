package edu.matkosoric.concurrency.callable;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallingStringLength {

    // interface callable returns an object, in opposition to a runnable interface that returns void

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = null;

        try {

            executorService = Executors.newSingleThreadExecutor();

            Future<Integer> result = executorService.submit( () -> "Denzel Washinton".length());

            System.out.println(result.get());

        } finally {
            if (executorService != null) executorService.shutdown();
        }


    }

}
