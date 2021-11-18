package edu.matkosoric.lambdas.consumer;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample3 {

    // demonstration of Consumer functional interface
    // notice the absence of accept() method from the stream case

    public static void main(String[] args) {

        Consumer<Boolean> consumer = a -> System.out.println(a);

        // printing from a stream
        Stream<Boolean> stream = Stream.of(true, false, false, true, false, true, true, true);
        stream.forEach(consumer);

        System.out.println("******************");

        // printing from a list
        List<Boolean> blist = Arrays.asList(true, false, false, true, false, true, true, true);
        for (Boolean element : blist)
            consumer.accept(element);

    }

}
