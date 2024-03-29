package edu.matkosoric.streams.werner.heisenberg;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.stream.IntStream;

public class WernerHeisenberg {

    // what is the output?
    // nothing


    public static void main(String[] args) {
        IntStream.range(1, 4)
                .peek(System.out::print)
                .peek(i -> {
                    if (i == 3)
                        throw new RuntimeException("Exception thrown");
                });
    }

}
