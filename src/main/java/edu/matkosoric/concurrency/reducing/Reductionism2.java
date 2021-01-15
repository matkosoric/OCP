package edu.matkosoric.concurrency.reducing;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Arrays;

public class Reductionism2 {

    // omitting the combiner and non-associative accumulator will produce different results
    // for usual stream and parallel stream

    public static void main(String[] args) {

        // ordinal stream
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,10)
            .stream()
            .reduce(0,(a,b) ->(a-b))
        );

        // parallel stream
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                .parallelStream()
                .reduce(0,(a,b) ->(a-b))
        );

    }
}
