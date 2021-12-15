package edu.matkosoric.localization.winter;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Locale;
import java.util.ResourceBundle;

public class Winter {

    public static void main(String[] args) {

        // TODO: bundle path does not work !

        Locale.setDefault(Locale.FRANCE);

        ResourceBundle winterMessages = ResourceBundle.getBundle("edu.matkosoric.localization.winter.WinterBundle", new Locale("ru"));

        System.out.println("SNOW:" + winterMessages.getString("snow"));
        System.out.println("COLD:" + winterMessages.getString("cold"));
        System.out.println("CLOUDY:" + winterMessages.getString("cloudy"));

    }

}
