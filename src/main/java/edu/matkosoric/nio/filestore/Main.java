package edu.matkosoric.nio.filestore;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// #TAG2

public class Main {

    // what is the output if file does not exist?
    // \ u01\work\filestore.txt is not deleted.

    public static void main(String[] args) {

        try {
            Path path = Paths.get("/u01/work/filestore.txt");
            boolean result = Files.deleteIfExists(path);
            if (result) System.out.println(path + "is deleted.");
            else System.out.println(path + "is not deleted.");
        } catch (IOException e) {
            System.out.println("Exception");
        }

    }

}
