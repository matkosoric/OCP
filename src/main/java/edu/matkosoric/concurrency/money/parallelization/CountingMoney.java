package edu.matkosoric.concurrency.money.parallelization;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;

public class CountingMoney {


    // simulation of a small time-consuming task
    public Long smallTransaction(Long transactionProfit) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException ie) {

        }
//        System.out.print (transactionProfit + " ");
        return transactionProfit + 1L;
    }


    // regular Stream()
    public void processMyMoney(List<Long> data) {
        data.stream().map(i -> smallTransaction(i)).count();    // created map object is not used
    }

    // parallelStream()
    public void processMyMoneyWithConcurrency(List<Long> data) {
        data.parallelStream().map(i -> smallTransaction(i)).count();    // created map object is not used
    }


    public static void main(String[] args) {


        CountingMoney countingMoney = new CountingMoney();

        // initial data set
        List<Long> listOfDailyTransactions = new ArrayList<>();
        for (int i = 0; i < 2000; i++)
            listOfDailyTransactions.add((Long) (new Double(Math.random() * 10L).longValue()));


        // sequential processing, lasts about 20 seconds
        long startTime = System.currentTimeMillis();
        countingMoney.processMyMoney(listOfDailyTransactions);
        long endTime = System.currentTimeMillis();
        System.out.println("Time for sequential processing: " + (endTime - startTime));


        // concurrent processing, lasts about 5 seconds
        startTime = System.currentTimeMillis();
        countingMoney.processMyMoneyWithConcurrency(listOfDailyTransactions);
        endTime = System.currentTimeMillis();
        System.out.println("Time for concurrent processing: " + (endTime - startTime));

        // number of available CPU
        System.out.println("Available CPU's: " + Runtime.getRuntime().availableProcessors());
    }
}
