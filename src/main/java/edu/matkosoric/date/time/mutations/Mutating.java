package edu.matkosoric.date.time.mutations;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;
import java.time.Month;

public class Mutating {

    // demonstration of changes on LocalDate object

    public static void main(String[] args) {

        LocalDate laborDay = LocalDate.of(2017, Month.MAY, 1);
        LocalDate valentinesDay = LocalDate.of(2017, Month.FEBRUARY, 14);
        LocalDate christmas = LocalDate.of(2017, Month.DECEMBER, 25);
        LocalDate halloween = LocalDate.of(2017, Month.OCTOBER, 31);

        System.out.println(laborDay);
        System.out.println(valentinesDay.plusDays(3));
        System.out.println(valentinesDay);      // valentinesDay is not changed

        valentinesDay = valentinesDay.plusWeeks(2);
        System.out.println(valentinesDay);

        christmas = christmas.minusMonths(5);
        System.out.println(christmas);

        halloween = halloween.plusYears(4);
        System.out.println(halloween);

    }
}
