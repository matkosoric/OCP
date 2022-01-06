package edu.matkosoric.localization.default_locale;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.Locale;

public class DefaultLocale {

    // getting and setting system default Locale

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println(locale);

        Locale.setDefault(Locale.ITALY);
        System.out.println(Locale.getDefault());
    }

}
