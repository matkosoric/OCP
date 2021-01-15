package edu.matkosoric.localization;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Locale;

public class LocaleExample1 {

    // getting and setting system default Locale

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println(locale);

        Locale.setDefault(Locale.ITALY);
        System.out.println(Locale.getDefault());
    }

}
