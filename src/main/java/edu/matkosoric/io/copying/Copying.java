package edu.matkosoric.io.copying;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.io.*;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.*;

public class Copying {

    // copying files with FileInputStream and FileOutputStream
    // existing version will be overwritten

    public static void copy (File source, File destination)  throws IOException {

        try (InputStream input = new FileInputStream(source);
             OutputStream output = new FileOutputStream(destination)) {
            int line;
            while ((line = input.read()) != -1 ) {
                output.write(line);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // note: linux path
        File source = new File ("src/edu/matkosoric/io/sample/jelena/rozga/Bizuterija.txt");
        File destination = new File ("src/edu/matkosoric/io/copying/kopija_Bizuterije.txt");

        copy (source.getAbsoluteFile(),destination);
        System.out.println(destination.getCanonicalPath());

    }

}
