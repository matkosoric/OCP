package edu.matkosoric.date.time.instant;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.time.Duration;
import java.time.Instant;

public class InstantExample2 {

    // Instant can be easily used to measure time needed for certain task

    public static void main(String[] args) {

        // benchmark for comparing for loop and while loop
        Instant start = Instant.now();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i * i);
        }
        Instant end = Instant.now();

        Instant start2 = Instant.now();
        int i = 0;
        while (i < 100000) {
            System.out.println(i * i);
            i++;
        }
        Instant end2 = Instant.now();

        System.out.println("FOR LOOP:" + Duration.between(start, end).toMillis());
        System.out.println("WHILE LOOP: " + Duration.between(start2, end2).toMillis());

    }
}
