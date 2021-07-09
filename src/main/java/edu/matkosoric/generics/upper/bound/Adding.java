package edu.matkosoric.generics.upper.bound;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Adding {

    // using upper-bounded generics as a method parameter

    public static void main(String[] args) {

        // any list that extends abstract class Number can be used with summarize() method
        List<Integer> intNumbers = Arrays.asList(1,2,3,4,5);
        List<Double> doubleNumbers = Arrays.asList(6.0, 7.0, 8.0, 9.0, 10.0);
        List<AtomicInteger> aintNumbers = Arrays.asList(new AtomicInteger(11),
                                                        new AtomicInteger(12),
                                                        new AtomicInteger(13),
                                                        new AtomicInteger(14),
                                                        new AtomicInteger(15));


        System.out.println("Sum of integers: " + summarize(intNumbers));
        System.out.println("Sum of doubles: " + summarize(doubleNumbers));
        System.out.println("Sum of atomic integers: " + summarize(aintNumbers));

    }

    private static Double summarize (List<? extends Number> listOfNumbers) {
        Double result = new Double(0);
        for (Number elementNumber : listOfNumbers) {
            result = result + elementNumber.doubleValue();
        }
        return result;
    }

}
