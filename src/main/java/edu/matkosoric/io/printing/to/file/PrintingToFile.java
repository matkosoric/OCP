package edu.matkosoric.io.printing.to.file;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.io.*;

public class PrintingToFile {

    // print data from application to the file using the PrintWriter class

    public static void main(String[] args) throws IOException {

        String currentDirectory = System.getProperty("user.dir");

        File destination = new File(currentDirectory + "/src/main/java/edu/matkosoric/io/printing/to/file/Kurtz.txt");

        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(destination)))) {
            pw.write("I watched a snail crawl along the edge of a straight razor. ");
            pw.println();
            pw.println();
            pw.format("That's my dream; that's my nightmare. ");
            pw.println();
            pw.printf("Crawling, slithering, along the edge of a straight razor... and surviving.");

        }
    }
}
