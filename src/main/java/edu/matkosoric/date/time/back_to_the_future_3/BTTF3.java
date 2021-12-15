package edu.matkosoric.date.time.back_to_the_future_3;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class BTTF3 {

    // what is the output?
    // Sep 2, 1885
    // 9/2/85

    public static void main(String[] args) {

        Locale l = new Locale("en", "US");
        LocalDate today = LocalDate.of(1885, 9, 2);
        String mToday = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String sToday = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(mToday);
        System.out.println(sToday);

    }
}
