package edu.matkosoric.localization.camus;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class AlbertCamus {

    // using java class as a source of information for internationalisation

    public static void main(String[] args) {

        // class locations can be specified with file location or package full name
        ResourceBundle camusEng = ResourceBundle.getBundle("edu.matkosoric.localization.camus.CamusNovels", Locale.US);
        ResourceBundle camusFr = ResourceBundle.getBundle("edu.matkosoric.localization.camus.CamusNovels", Locale.FRANCE);

        Set<String> keys = camusEng.keySet();
        keys.stream().map(k -> k  + " - " + camusEng.getString(k)
                + " (" + camusFr.getString(k) + ")").forEach(System.out::println);

    }

}
