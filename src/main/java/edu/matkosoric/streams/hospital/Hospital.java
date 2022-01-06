package edu.matkosoric.streams.hospital;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Hospital {

    // what is the output?
    // 20 30 40

    public static void main(String[] args) {

        IntStream str = IntStream.of(2, 3, 4);
        IntFunction<IntUnaryOperator> func = x -> y -> x * y;
        str.map(func.apply(10)).forEach(System.out::println);

        // does not compile
//        BiFunction<Integer> func2 = x -> y -> x*y;
//        str.map(func2.apply(10)).forEach(System.out::println);


    }
}
