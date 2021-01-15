package edu.matkosoric.concurrency.concurrent.collection;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EuropeanUnion {

    // demonstration of deleting an item from ConcurrentHashMap in a for loop

    public static void main(String[] args) {

        Map<Integer, String> eu = new HashMap<>();
        Map<Integer, String> eu_c = new ConcurrentHashMap<>();

        eu.put(1, "United Kingdom");
        eu.put(2, "France");
        eu.put(3, "Italy");
        eu.put(4, "Germany");

        eu_c.put(1, "United Kingdom");
        eu_c.put(2, "France");
        eu_c.put(3, "Italy");
        eu_c.put(4, "Germany");

        for (Integer index : eu.keySet()) {
//            if (index ==  1) eu.remove(index);       // compiles, but throws a ConcurrentModificationException at runtime
        }

        for (Integer index : eu_c.keySet()) {
            if (index == 1) eu_c.remove(1);
        }

        for (Integer index : eu_c.keySet())
            System.out.println(eu_c.get(index));
    }
}
