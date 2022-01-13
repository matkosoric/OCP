package edu.matkosoric.date.time.diary;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;

public class Diary {

    private LocalDate now = LocalDate.now();

    public LocalDate getDate() {
        return now;
    }

}
