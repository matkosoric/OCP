package edu.matkosoric.lambdas.consumer;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Consumer;

public class ConsumerExample2 {

    // consumer with andThen() default method
    // this example reverses order of values and turns them to strings

    public static void main(String[] args) {

        TreeMap<Integer, String> resultMap = new TreeMap<>();


        Consumer<Integer> consumer = a -> resultMap.put(a, String.valueOf(10 - a) + " string");
        consumer = consumer.andThen(b -> System.out.println("Row insertion complete"));
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numbers.forEach(consumer);
        resultMap.forEach((a, b) -> System.out.println("Key: " + a + ", Value: " + b));

    }

}
