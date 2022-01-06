package edu.matkosoric.io.existence;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.io.File;

public class CheckingFileExistence {

    public static void main(String[] args) {

        File file = new File("src\\edu\\matkosoric\\io\\existence\\gibberish.txt");
        System.out.println("Does file exists? - " + file.exists());

    }

}
