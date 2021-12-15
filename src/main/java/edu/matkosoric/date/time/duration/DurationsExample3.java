package edu.matkosoric.date.time.duration;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationsExample3 {

    // Durations is a time between two moments in time specified in hours, minutes and seconds
    // It can be used with objects that contain Time, but not with 'pure' Date

    public static void main(String[] args) {

        // 3 hour example
        LocalDateTime localDateTime1 = LocalDateTime.of(2018, 5, 23, 23, 45);
        LocalTime time1 = LocalTime.of(23, 45);
        LocalDate date1 = LocalDate.of(2018, 5, 23);
        Duration duration1 = Duration.ofHours(3);
        System.out.println(localDateTime1.plus(duration1));
        System.out.println(time1.plus(duration1));
//        System.out.println(date1.plus(duration1));       // compiles, but throws a UnsupportedTemporalTypeException at runtime

        // 25 hour example
        LocalDateTime localDateTime2 = LocalDateTime.of(2018, 5, 23, 23, 45);
        LocalTime time2 = LocalTime.of(23, 45);
        LocalDate date2 = LocalDate.of(2018, 5, 23);
        Duration duration2 = Duration.ofHours(25);
        System.out.println(localDateTime2.plus(duration2));
        System.out.println(time2.plus(duration2));
//        System.out.println(date2.plus(duration2));       // compiles, but throws a UnsupportedTemporalTypeException at runtime

        Duration duration3 = Duration.ofDays(1);
        LocalDate date3 = LocalDate.of(2018, 3, 4);
//        System.out.println(date3.plus(duration3));      // compiles, but throws a UnsupportedTemporalTypeException at runtime

    }
}
