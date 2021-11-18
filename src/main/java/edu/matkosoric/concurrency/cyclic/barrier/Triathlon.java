package edu.matkosoric.concurrency.cyclic.barrier;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Triathlon {

    // an example without CyclicBarrier

    private void running() {
        System.out.println("...running....");
    }

    private void cycling() {
        System.out.println("...cycling...");
    }

    private void swimming() {
        System.out.println("...swimming...");
    }


    public void participateInACompetition() {
        running();
        cycling();
        swimming();
    }


    public static void main(String[] args) {

        ExecutorService executorService = null;

        try {

            executorService = Executors.newFixedThreadPool(4);
            Triathlon devonport2018 = new Triathlon();

            // there are four competitors that go through each stage at different pace
            for (int i = 0; i < 4; i++)
                executorService.submit(() -> devonport2018.participateInACompetition());

        } finally {
            if (executorService != null) executorService.shutdown();
        }

    }
}
