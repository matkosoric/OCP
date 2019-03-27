package edu.matkosoric.date.time.duration;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationsExample {

    // Durations is a time between two moments in time specified in hours, minutes and seconds
    // It can be used with objects that contain Time, but not with 'pure' Date

    public static void main(String[] args) {

        // creating Duration instance
        Duration daily1 = Duration.ofDays(1);
        System.out.println(daily1);

        Duration daily2 = Duration.ofHours(24);
        System.out.println(daily2);

        Duration hourly = Duration.ofHours(1);
        System.out.println(hourly);

        Duration everyHalfHour = Duration.ofMinutes(30);
        System.out.println(everyHalfHour);

        Duration everyTenMilisecond = Duration.ofMillis(10);
        System.out.println(everyTenMilisecond);

        Duration everyNanosecond = Duration.ofNanos(1);
        System.out.println(everyNanosecond);



        // creating Duration with ChronoUnit
        Duration chrDaily1 = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(chrDaily1);

        Duration chrDaily2 = Duration.of(24, ChronoUnit.HOURS);
        System.out.println(chrDaily2);

        Duration chrHourly = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(chrHourly);

        Duration chrEveryHalfHour = Duration.of(30, ChronoUnit.MINUTES);
        System.out.println(chrEveryHalfHour);

        Duration chrEveryTenMilisecond = Duration.of(10, ChronoUnit.MILLIS);
        System.out.println(chrEveryTenMilisecond);

        Duration chrEveryNanosecond = Duration.of(1, ChronoUnit.NANOS);
        System.out.println(chrEveryNanosecond);

    }
}
