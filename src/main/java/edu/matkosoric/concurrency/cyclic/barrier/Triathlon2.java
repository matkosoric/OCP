package edu.matkosoric.concurrency.cyclic.barrier;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Triathlon2 {

    // an example with CyclicBarrier
    // every thread (competitor) has to complete one stage before all proceed to the next one
    // CyclicBarrier2 is deployed with a lambda that gets executed after that point in execution

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

            executorService = Executors.newFixedThreadPool(4);
            Triathlon2 devonport2018 = new Triathlon2();

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
