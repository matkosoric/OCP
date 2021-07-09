package edu.matkosoric.concurrency.deadlock;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Triathlon3 {

    // demonstration of thread dead lock
    // CyclicBarrier is used with only 2 threads that end up hanging indefinitely
    // waiting for other threads to complete
    // program has to be killed manually.

    private void running () { System.out.println("...running...."); }

    private void cycling () { System.out.println("...cycling..."); }

    private void swimming () { System.out.println("...swimming..."); }


    public void participateInACompetition (CyclicBarrier cb1, CyclicBarrier cb2) {

        try {
            running();
            cb1.await();
            cycling();
            cb2.await();
            swimming();
        } catch (InterruptedException | BrokenBarrierException e) {

        }
    }


    public static void main(String[] args) {

        ExecutorService executorService = null;

        try {

            // number of threads is originally set to 4
            executorService = Executors.newFixedThreadPool(2);
            Triathlon3 devonport2018 = new Triathlon3();

            CyclicBarrier barrier1 = new CyclicBarrier(4);
            CyclicBarrier barrier2 = new CyclicBarrier(4, () -> System.out.println("Throw away your bicycles!"));

            // there are four competitors that go through each stage at different pace
            for (int i = 0; i < 4; i ++)
                executorService.submit( () -> devonport2018.participateInACompetition(barrier1, barrier2));

        } finally {
            if (executorService != null) executorService.shutdown();
        }

    }
}
