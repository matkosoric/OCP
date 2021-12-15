package edu.matkosoric.lambdas.consumer;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.function.Consumer;

public class ConsumerExample4 {

    public static void main(String[] args) {

        // Demonstration of Consumer functional interface
        // using andThen() method results with accept() method being executed for each consumer separately

        Consumer<Integer> increaseBy1Consumer = arg -> {
            arg++;
            System.out.println(arg);
        };
        increaseBy1Consumer.accept(1);

        Consumer<Integer> increaseBy2Consumer = arg -> {
            arg = arg + 2;
            System.out.println(arg);
        };
        increaseBy2Consumer.accept(2);


        increaseBy2Consumer.andThen(increaseBy1Consumer).accept(10);

        increaseBy2Consumer.accept(20);

        increaseBy2Consumer.andThen(increaseBy1Consumer).andThen(increaseBy2Consumer).andThen(increaseBy2Consumer).accept(30);

    }

}
