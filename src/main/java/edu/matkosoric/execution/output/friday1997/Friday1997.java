package edu.matkosoric.execution.output.friday1997;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Friday1997 {

    public static void main(String[] args) {

        // Which pattern formats the date as: Friday 7th of February 1997?
        // pattern4 - "eeee d'th of' MMMM yyyy"

        String pattern1 = "eeee dd+'th of'+ MMM yyyy";
        String pattern2 = "eeee dd'th of' MMM yyyy";
        String pattern3 = "eeee d+'th of'+ MMMM yyyy";
        String pattern4 = "eeee d'th of' MMMM yyyy";

        LocalDate localDate = LocalDate.of(1997, 2, 7);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern(pattern1);
        System.out.println(dtf1.format(localDate));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(pattern2);
        System.out.println(dtf2.format(localDate));

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern(pattern3);
        System.out.println(dtf3.format(localDate));

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern(pattern4);
        System.out.println(dtf4.format(localDate));

    }

}
