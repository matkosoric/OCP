package edu.matkosoric.date.time.diary;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Tester {

    // what statement is true?
    // A. Class Tester does not need to import java.time.LocalDate because it is
    // already visible to members of the package test

    public static void main(String[] args) {

        Diary d = new Diary();
        System.out.println(d.getDate());

    }
}
