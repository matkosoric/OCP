package edu.matkosoric.execution.output.cities;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.Stream;

public class Cities {

    // what is the output?

    // Sydney
    // Dhaka
    // New York
    // London
    // SYDNEY
    // DHAKA
    // NEW YORK
    // LONDON
    // 1

    public static void main(String[] args) {
        Consumer<String> printConsumer = t -> System.out.println(t);
        Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");

        cities.forEach(printConsumer);

        List<String> citiesList = Arrays.asList("Sydney", "Dhaka", "New York", "London");

        Consumer<List<String>> upperCaseConsumer = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).toUpperCase());
            }
        };


        Consumer<List<String>> printConsumerList = list -> list.stream().forEach(System.out::println);

        upperCaseConsumer.andThen(printConsumerList).accept(citiesList);

        IntConsumer intConsumer = t -> System.out.println(t);
        intConsumer.accept(1);

    }

}
