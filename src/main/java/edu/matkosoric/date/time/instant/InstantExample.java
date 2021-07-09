package edu.matkosoric.date.time.instant;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.time.*;

public class InstantExample {

    // Instant class is used to represent a singular moment in time

    public static void main(String[] args) {

        // creating Instance for current moment
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.atZone(ZoneId.systemDefault()));

        // creating Instance from ZonedDateTime
        LocalDate date = LocalDate.of(2049, Month.MAY, 20);
        LocalTime time = LocalTime.of (12, 00);
        ZoneId zone = ZoneId.of("Asia/Tbilisi");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        Instant instant = zonedDateTime.toInstant();
        System.out.println(instant);
        System.out.println(zonedDateTime);

        // creating Instant from epoch seconds
        Instant instant2 = Instant.ofEpochSecond(776588877);
        System.out.println(instant2);

    }

}
