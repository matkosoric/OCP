package edu.matkosoric.localization.camus;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.ListResourceBundle;

public class CamusNovels_fr_FR extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{

                {"1942", "L'Étranger"},
                {"1947", "La Peste"},
                {"1956", "La Chute"},
                {"1971", "La Mort heureuse"},
                {"1995", "Le premier homme"}

        };
    }
}