package edu.matkosoric.lambdas.consumer;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

public class ConsumerExample {

    // Consumer interface does not return anything

    public static void main(String[] args) {

        Consumer<String> consumer1 = System.out::println;
        Consumer<String> consumer2 = a -> System.out.println(a);
        Consumer<Integer> consumer3 = System.out::println;
        Consumer<Boolean> consumer4 = b -> System.out.println(b);

        consumer1.accept("First consumer");
        consumer2.accept("Second consumer");
        consumer3.accept(555);
        consumer4.accept(false);

    }

}
