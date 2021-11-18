package edu.matkosoric.localization.camus;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.ListResourceBundle;

public class CamusNovels_en_US extends ListResourceBundle {


    @Override
    protected Object[][] getContents() {
        return new Object[][]{

                {"1942", "The Stranger"},
                {"1947", "The Plague"},
                {"1956", "The Fall"},
                {"1971", "A Happy Death"},
                {"1995", "The First Man"}

        };
    }
}
