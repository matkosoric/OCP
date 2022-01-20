package edu.matkosoric.streams.fruits.products;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.List;
import java.util.stream.IntStream;

public class FruitProducts {

    // what is the result?
    // Orange Juice
    // Apple Pie
    // Lemmon Ice
    // Raspberry Tart

    public static void main(String[] args) {

        final List<String> fruits = List.of("Orange", "Apple", "Lemmon", "Raspberry");
        final List<String> types = List.of("Juice", "Pie", "Ice", "Tart");
        final var stream = IntStream.range(0, Math.min(fruits.size(), types.size())).mapToObj((i) -> fruits.get(i) + " " + types.get(i));

        stream.forEach(System.out::println);

    }
}
