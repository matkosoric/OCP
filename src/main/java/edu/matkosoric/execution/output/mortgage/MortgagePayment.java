package edu.matkosoric.execution.output.mortgage;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class MortgagePayment {

    // select correct formula for

    public static void main(String[] args) {

        double m;               // monthly payment
        double r = 0.05 / 12;   // monthly interest rate
        int p = 100_000;        // principal
        int n = 180;            // number of payments

        m = p * (r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1));

        System.out.println(m);

    }
}
