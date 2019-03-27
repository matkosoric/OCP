package edu.matkosoric.io.existence;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.io.File;

public class CheckingFileExistence {

    public static void main(String[] args) {

        File file = new File ("src\\edu\\matkosoric\\io\\existence\\gibberish.txt");
        System.out.println("Does file exists? - " + file.exists());

    }

}
