package edu.matkosoric.date.time.period;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample2 {

    // demonstration of Period class with Back to the Future dates

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(1985, Month.OCTOBER, 26);
        LocalDate endDate = LocalDate.of(1955, Month.NOVEMBER, 5);

        Period distance = Period.between(startDate, endDate);

        System.out.println(distance);

        // elements of a Period that are 0 are omitted
        System.out.println(Period.ofMonths(8));
        System.out.println(Period.of(3, 0, 20));
        System.out.println(Period.of(3, 0, 40));
        System.out.println(Period.of(0, 13, 0));

    }

}
