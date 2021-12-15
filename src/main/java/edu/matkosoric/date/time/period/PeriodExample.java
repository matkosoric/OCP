package edu.matkosoric.date.time.period;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample {

    // Period is used for time interval between two dates

    public static void main(String[] args) {

        Period period = Period.ofYears(1);
        LocalDate halloween = LocalDate.of(1978, Month.OCTOBER, 31);

        while (halloween.getYear() < 2000) {
            System.out.println(halloween);
            halloween = halloween.plus(period);
        }

    }
}
