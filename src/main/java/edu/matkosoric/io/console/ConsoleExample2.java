package edu.matkosoric.io.console;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

public class ConsoleExample2 {

    // using flush(), readLine() and readPassword()
    // can not be used from IDE, but only through own terminal
    // go to src folder and run:
    // javac edu/matkosoric/io/console/ConsoleExample2.java
    // java edu.matkosoric.io.console.ConsoleExample2

    public static void main(String[] args) throws IOException {

        Console console = System.console();

        if (console == null) {
            throw new RuntimeException();
        } else {

            console.writer().println("Interface 2037 ready for inquiry");
            console.flush();

            String query = console.readLine();
            String why = console.readLine("Why are you calling me 'Mother'? ");

            console.writer().println("Unable to compute! Any questions?");
            console.flush();


            BufferedReader reader = new BufferedReader(console.reader());
            String answer = reader.readLine();

            console.writer().println("Your answer is irrelevant! You will be assimilated. Enter password: ");
            char[] password = console.readPassword("Enter your password: ");
            console.format("Enter your password again: ");
            console.flush();
            char[] passwordAgain = console.readPassword();
            boolean identical = Arrays.equals(password, passwordAgain);

            if (!identical) {
                System.out.println("You entered two different passwords. You will be assimilated.");
            } else {
                System.out.println("Password is changed. You will be assimilated anyway.");
            }

        }
    }
}
