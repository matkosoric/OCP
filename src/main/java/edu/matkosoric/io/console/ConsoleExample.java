package edu.matkosoric.io.console;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.io.Console;

public class ConsoleExample {

    // demonstration of Console class
    // it can not be used from IDE, but can be used from terminal with:
    // javac edu/matkosoric/io/console/ConsoleExample.java
    // java edu/matkosoric/io/console/ConsoleExample

    public static void main(String[] args) {

        Console console = System.console();

        if (console != null) {

            String horrorOfUserInput = console.readLine();
            console.writer().println("Your valuable input is: " + horrorOfUserInput);

        } else {
            System.out.println("Console is null!");
        }

    }

}
