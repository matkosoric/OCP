package edu.matkosoric.concurrency.reducing;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.List;

public class Reductionism3 {

    // how to parallelize reducing operation?
    // parallelStream()
    // stream().parallel()


    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 3, 0, 8, 1, 9, 5, 7, 6, 4);

        int sum = numbers.stream().reduce(0, (n, m) -> n + m);
        System.out.println(sum);

        int sum2 = numbers.parallelStream().reduce(0, (n, m) -> n + m);
        System.out.println(sum2);

        int sum5 = numbers.stream().parallel().reduce(0, (n, m) -> n + m);
        System.out.println(sum5);


    }
}
