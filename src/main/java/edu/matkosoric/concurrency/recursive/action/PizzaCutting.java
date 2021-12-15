package edu.matkosoric.concurrency.recursive.action;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class PizzaCutting extends RecursiveAction {

    // pizza cutting is sort of a recursive action.
    // each entity is cut in half until a certain base case is achieved.


    private double currentPercentage;

    public PizzaCutting(double currentPercentage) {
        this.currentPercentage = currentPercentage;
    }

    @Override
    protected void compute() {

        // base case, used for ending recursive process
        if (currentPercentage < 13) {
            System.out.println("This part is " + currentPercentage + " % of original pizza.");
        }

        // recursive case that splits certain pizza part in half, that is, two threads
        else {
            System.out.println("...splitting...");
            invokeAll(new PizzaCutting(currentPercentage / 2), new PizzaCutting(currentPercentage / 2));
        }

    }


    public static void main(String[] args) {

        ForkJoinTask<?> task = new PizzaCutting(100);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);

    }
}
