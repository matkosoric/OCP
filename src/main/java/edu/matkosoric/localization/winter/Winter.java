package edu.matkosoric.localization.winter;

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
