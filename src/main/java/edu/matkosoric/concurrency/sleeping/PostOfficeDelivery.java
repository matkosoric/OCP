package edu.matkosoric.concurrency.sleeping;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class PostOfficeDelivery {

    private static int countingPackages = 0;

    public static void main(String[] args) {

        // creating new thread with lambda
        new Thread(() -> {
            for (int a = 0; a < 10_000_000; PostOfficeDelivery.countingPackages++) ;
        }).start();

        // while is executed in the original thread and constantly checking for the countingPackages value
        while (countingPackages < 90000)
            System.out.println("still counting! current position is: " + countingPackages);
        System.out.println("THE END!");

    }


}
