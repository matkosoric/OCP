package edu.matkosoric.concurrency.concurrent.collection;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SpaceAgencies {


    public static void main(String[] args) throws InterruptedException {

        // output can not be predicted with ordinary LinkedList

        CopyOnWriteArrayList<String> spaceAgencies_regular = new CopyOnWriteArrayList<>();
//        spaceAgencies_regular.add("National Aeronautics and Space Administration");
//        spaceAgencies_regular.add("European Space Agency");
//        spaceAgencies_regular.add("Russian Federal Space Agency");
//        spaceAgencies_regular.add("French Space Agency");
//        spaceAgencies_regular.add("German Aerospace Center");
//        spaceAgencies_regular.add("Japan Aerospace Exploration Agency");
//        spaceAgencies_regular.add("Italian Space Agency");
//        spaceAgencies_regular.add("China National Space Administration");
//        spaceAgencies_regular.add("Indian Space Research Organisation");
//        spaceAgencies_regular.add("Canadian Space Agency");
//        spaceAgencies_regular.add("UK Space Agency");

        ExecutorService executorService = null;

        try {

            executorService = Executors.newFixedThreadPool(7);

            for (int i = 0; i < 100; i++) {
                final int a = i;
                executorService.submit(() -> {
                    System.out.println(a + " " + spaceAgencies_regular.get(a));
                });
                executorService.submit(() -> spaceAgencies_regular.add(String.valueOf(a)));
            }

        } finally {
            if (executorService != null) executorService.shutdown();
        }
        if (executorService != null) {
            executorService.awaitTermination(2, TimeUnit.SECONDS);
        }

//
//        // concurrent LinkedDeque
//
//        Deque<String> spaceAgencies_con_deq = new ConcurrentLinkedDeque<>();
//        spaceAgencies_con_deq.add("National Aeronautics and Space Administration");
//        spaceAgencies_con_deq.add("European Space Agency");
//        spaceAgencies_con_deq.add("Russian Federal Space Agency");
//        spaceAgencies_con_deq.add("French Space Agency");
//        spaceAgencies_con_deq.add("German Aerospace Center");
//        spaceAgencies_con_deq.add("Japan Aerospace Exploration Agency");
//        spaceAgencies_con_deq.add("Italian Space Agency");
//        spaceAgencies_con_deq.add("China National Space Administration");
//        spaceAgencies_con_deq.add("Indian Space Research Organisation");
//        spaceAgencies_con_deq.add("Canadian Space Agency");
//        spaceAgencies_con_deq.add("UK Space Agency");
//
//        ExecutorService executorService2 = null;
//
//        try {
//
//            executorService2 = Executors.newFixedThreadPool(2);
//
//            for (int i = 0; i < 11; i ++) {
//                final int a = i;
//                executorService2.submit( () -> {System.out.println("Thread-safe: " +a + " " + spaceAgencies_con_deq.pop());});
//            }
//
//        } finally {
//            if (executorService2 != null) executorService.shutdown();
//        }
    }
}
