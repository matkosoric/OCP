package edu.matkosoric.date.time.duration;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class DurationsExample2 {

    // Durations is a time between two moments in time specified in hours, minutes and seconds
    // It can be used with objects that contain Time, but not with 'pure' Date

    public static void main(String[] args) {

        // how many hours have I been alive?
        LocalDateTime dateOfBirth = LocalDateTime.of(1986, Month.MAY, 24, 15, 40);
        LocalDateTime now = LocalDateTime.now();

        Duration elapsedTime = Duration.between(dateOfBirth, now);

        System.out.println("I have been on this planet for " + elapsedTime.toHours()+ " hours.");

    }

}
