package edu.matkosoric.concurrency.ping.pong;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PingPong {

    // how does line 1 have to look like to compile PingPong class?
    // Future<String> future = es.submit(()->"pong");

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(() -> System.out.println("Ping"));

        //Future future = (es) -> es.submit(() -> "Pong");      // line 1 - does not compile
        Future<String> future = es.submit(() -> "pong");          // line 1 - working version

        System.out.println(future.get()); //line 2
        es.shutdown();


    }

}
