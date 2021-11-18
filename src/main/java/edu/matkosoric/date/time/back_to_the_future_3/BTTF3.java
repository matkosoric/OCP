package edu.matkosoric.date.time.back_to_the_future_3;

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
        LocalDate today = LocalDate.of(1885 ,9,2);
        String mToday = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String sToday = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(mToday);
        System.out.println(sToday);

    }
}
