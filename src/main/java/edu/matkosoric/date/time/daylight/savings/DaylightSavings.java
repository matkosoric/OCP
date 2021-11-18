package edu.matkosoric.date.time.daylight.savings;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.time.*;

public class DaylightSavings {

    // some countries change their official time twice a year -
    // including Croatia and USA - forward one hour in March and back in November
    // timetable of these changes is incorporated into DateTime API

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2026, Month.MARCH, 29);
        LocalTime time = LocalTime.of(1, 59);
        ZoneId zone = ZoneId.of("Europe/Zagreb");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.plusMinutes(1));
        System.out.println(zonedDateTime.plusHours(3).plusMinutes(1));

        // since Detroit, USA, will move the  time one hour forward on the on the 8th of March 2026,
        // it has the time between 2 and 3 in the morning of 29th in March 2026.
        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("America/Detroit")));
        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("America/Detroit")).plusHours(5).plusMinutes(30));


        // moving the clock backwards & comparison with GMT
        LocalDate date2 = LocalDate.of(2026, Month.OCTOBER, 25);
        LocalTime time2 = LocalTime.of(1, 59);
        ZoneId zone2 = ZoneId.of("Europe/Zagreb");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(date2, time2, zone2);

        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime2.minusDays(4).plusMinutes(2));
        System.out.println(zonedDateTime2.minusDays(4).plusMinutes(2).withZoneSameInstant(ZoneId.of("GMT")));
        System.out.println(zonedDateTime2.plusMinutes(2));
        System.out.println(zonedDateTime2.plusMinutes(2).withZoneSameInstant(ZoneId.of("GMT")));
        System.out.println(zonedDateTime2.plusHours(1).plusMinutes(2));
        System.out.println(zonedDateTime2.plusHours(1).plusMinutes(2).withZoneSameInstant(ZoneId.of("GMT")));
        System.out.println(zonedDateTime2.plusHours(2).plusMinutes(2));
        System.out.println(zonedDateTime2.plusHours(2).plusMinutes(2).withZoneSameInstant(ZoneId.of("GMT")));
        System.out.println(zonedDateTime2.plusHours(4).plusMinutes(2));
        System.out.println(zonedDateTime2.plusHours(4).plusMinutes(2).withZoneSameInstant(ZoneId.of("GMT")));

    }
}
