package edu.matkosoric.concurrency.sleeping;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class PostOfficeDelivery2 {

    private static int countingPackages = 0;

    public static void main(String[] args) throws InterruptedException {

        // creating new thread with lambda
        new Thread(() -> {
            for (int a = 0; a < 100_000_000; PostOfficeDelivery2.countingPackages++) ;
        }).start();

        // with Thread.sleepp(), checking will be done once per second, therefore saving CPU time
        while (countingPackages < 90000) {
            System.out.println("still counting! current position is: " + countingPackages);
            Thread.sleep(1000);
        }
        System.out.println("THE END!");

    }
}
