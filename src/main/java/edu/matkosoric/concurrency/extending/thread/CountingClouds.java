package edu.matkosoric.concurrency.extending.thread;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

public class CountingClouds extends Thread {

    String threadMarker;

    CountingClouds (String marker) {
        this.threadMarker = marker;
    }

    public static void main(String[] args) {

        CountingClouds cc = new CountingClouds("thread 1.");

        // this will be executed sequentially
        // run is executed within existing thread
        cc.run();
        cc.run();
        cc.run();

        // this will be executed concurrently
        // output order can not be predicted
        (new CountingClouds("thread 2: ")).start();
        (new CountingClouds("thread 3: ")).start();
        (new CountingClouds("thread 4: ")).start();
        (new CountingClouds("thread 5: ")).start();

        // if run() is called on a Thread object, it is executed concurrently
        Thread cc1 = new Thread(new CountingClouds("wildcard 4000"));
        Thread cc2 = new Thread(new CountingClouds("wildcard 8000"));
        cc1.run();
        cc2.run();

    }

    // overriding the run() method
    public void run () {
        Double a = 0.0;
        for (int i = 0; i < 10_000_000; i++){
            a = a + i/7.917 - i/3.517 + i/5.792 - i/9.327;
        }
        System.out.println("Counting done!  " + a + "  -  "  + threadMarker);
    }

}
