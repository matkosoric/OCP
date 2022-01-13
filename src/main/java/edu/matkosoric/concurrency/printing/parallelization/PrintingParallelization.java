package edu.matkosoric.concurrency.printing.parallelization;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintingParallelization {

    // what is true about the output?
    // B. values will be printed out, but the order is unpredictable.
    // D. Replacing forEach() with forEachOrdered(), the program prints 2 1 3 4 5.

    public static void main(String[] args) {

        Integer [] intArray = {2, 1, 3, 4, 5};
        List<Integer> list = new ArrayList<>(Arrays.asList(intArray));

        list.parallelStream().forEach(e -> System.out.println(e + " "));            // unpredictable order

        System.out.println("\n");

        list.parallelStream().forEachOrdered(e -> System.out.println(e + " "));     // prints 2 1 3 4 5

    }
}
