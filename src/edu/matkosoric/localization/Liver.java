package edu.matkosoric.localization;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.util.Locale;
import java.util.ResourceBundle;

public class Liver {

    // internationalization of hannibal quote with ResourceBundle

    public static void main(String[] args) {

        Locale english = new Locale ("en", "US");
        Locale french = new Locale ("fr", "FR");

        ResourceBundle englishBundle = ResourceBundle.getBundle("edu//matkosoric//localization//liver", english);
        ResourceBundle frenchBundle = ResourceBundle.getBundle("edu//matkosoric//localization//liver", french);

        System.out.println(englishBundle.getString("beans"));
        System.out.println(frenchBundle.getString("beans") + "\n");

        System.out.println(englishBundle.getString("chianti"));
        System.out.println(frenchBundle.getString("chianti"));

    }
}
