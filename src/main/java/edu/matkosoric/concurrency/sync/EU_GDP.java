package edu.matkosoric.concurrency.sync;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.text.DecimalFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EU_GDP {

    // access to the gdp variable is synchronised

    private double gdp = 0.0D;

    private void increaseGDP () {
        synchronized (this) {
            gdp = gdp + 0.1D;
            System.out.println(new DecimalFormat("#0.0").format(gdp));
        }
    }

    public static void main(String[] args) {

        ExecutorService executorService = null;

        try {

            executorService = Executors.newFixedThreadPool(10);

            EU_GDP eu_gdp = new EU_GDP();

            for (int i = 0; i < 10; i ++) {
                executorService.submit( () -> eu_gdp.increaseGDP());
            }

        } finally {
            if (executorService != null) executorService.shutdown();
        }
    }
}
