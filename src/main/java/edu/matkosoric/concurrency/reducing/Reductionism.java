package edu.matkosoric.concurrency.reducing;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Arrays;

public class Reductionism {

    // reduction with proper accumulators and combiners

    public static void main(String[] args) {

        // both examples produce the same result,
        // since accumulator and combiner follow suggested requirements

        // ordinary stream
        System.out.println(Arrays.asList('s', 'o', 'u', 'n', 'd', ' ', 'o', 'f', ' ', 's', 'i', 'l', 'e', 'n', 'c', 'e')
            .stream()
            .reduce("", ((a,b) -> a+b), (c,d) -> c+d)
        );

        // parallel stream
        System.out.println(Arrays.asList('s', 'o', 'u', 'n', 'd', ' ', 'o', 'f', ' ', 's', 'i', 'l', 'e', 'n', 'c', 'e')
                .parallelStream()
                .reduce("", ((a,b) -> a+b), (c,d) -> c+d)
        );
    }
}
