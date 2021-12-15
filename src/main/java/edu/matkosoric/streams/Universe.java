package edu.matkosoric.streams;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.stream.Stream;

public class Universe {

    // immediately after the first mismatch, allMatch returns false
    // despite the stream being indefinite.

    public static void main(String[] args) {

        Stream<String> voyage = Stream.generate(() -> "go further ");
        boolean theEnd = voyage.allMatch(String::isEmpty);
        System.out.println(theEnd);

    }
}
