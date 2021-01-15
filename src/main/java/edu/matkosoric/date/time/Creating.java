package edu.matkosoric.date.time;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Creating {

    // creating instances of date and time objects

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        System.out.println(LocalDate.of (2018, Month.JANUARY, 11));
        System.out.println(LocalDate.of (2018, 1, 11));
        System.out.println(LocalDate.ofYearDay(2018, 232));
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        System.out.println(LocalTime.of(14,59));
        System.out.println(LocalTime.of(14, 59, 57));
        System.out.println(LocalTime.of(14, 59, 57, 978678499));
        System.out.println(LocalTime.ofSecondOfDay(123));
        System.out.println(LocalTime.ofNanoOfDay(89237489));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
//        System.out.println(LocalTime.of(14,90));    // compiles, but throws a DateTimeException at runtime
//        System.out.println(LocalTime.of(24,14));    // compiles, but throws a DateTimeException at runtime

        System.out.println(LocalDateTime.of(2023, Month.DECEMBER, 29,23,57));
        System.out.println(LocalDateTime.of(2023, Month.DECEMBER, 29,23,57, 57));
        System.out.println(LocalDateTime.of(2023, Month.DECEMBER, 29,23,57, 57, 347812));
        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));
        System.out.println(LocalDateTime.MIN);
//        System.out.println(LocalDateTime.MIN.minusNanos(5));    // compiles, but throws a DateTimeException at runtime
        System.out.println(LocalDateTime.MAX);
//        System.out.println(LocalDateTime.MAX.plusHours(1)); // compiles, but throws a DateTimeException at runtime

        ZoneId zone1 = ZoneId.of("Europe/Podgorica");
        ZoneId zone2 = ZoneId.of("Africa/Casablanca");
        ZonedDateTime zoned1 = ZonedDateTime.of(2018, 9, 23,12,30,5, 900, zone1);
        ZonedDateTime zoned2 = ZonedDateTime.now(zone2);
        ZonedDateTime zoned3 = ZonedDateTime.now();

        // print system zone
        System.out.println(ZoneId.systemDefault());

        // print all available zones
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        allZones.forEach(System.out::println);

    }
}
