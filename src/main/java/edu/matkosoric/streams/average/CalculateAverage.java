package edu.matkosoric.streams.average;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.List;
import java.util.stream.Collectors;

public class CalculateAverage {

    // pick streams that calculate average value

    public static void main(String[] args) {

        var numbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

//        double avg1 = numbers.stream().parallel().averagingDouble(a -> a);                  // does not compile
        double avg2 = numbers.parallelStream().mapToInt(m -> m).average().getAsDouble();
//        double avg3 = numbers.stream().mapToInt (i -> i).average().parallel();              // does not compile
//        double avg4 = numbers.stream().average().getAsDouble();                             // does not compile
        double avg5 = numbers.stream().collect(Collectors.averagingDouble(n -> n));

        System.out.println(avg2);
        System.out.println(avg5);
    }

}
