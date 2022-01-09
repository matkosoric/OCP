package edu.matkosoric.streams.execution.output.counting;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Counting {

    // what is the output?
    // 6104 3

    public static void main(String[] args) {

        int arr[][] = {{5, 10}, {8, 12}, {9, 3}};
        long count = Stream.of(arr)
                .flatMapToInt(IntStream::of)
                .map(n -> n + 1)
                .filter(n -> (n % 2 == 0))
                .peek(System.out::print)
                .count();
        System.out.println(" " + count);

    }

}
