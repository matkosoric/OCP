package edu.matkosoric.nio2.hans.zimmer;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

// #TAG1

public class HansZimmerFolder {

    // what has to be added to line 1 to check whether directory exist ?
    // if folder exists, prints true
    // otherwise, throws exception

    public static void main(String[] args) {
        try {
            Path path = Paths.get("c:/music/hans_zimmer");

//            BasicFileAttributes attributes1 = Files.isDirectory (path);                                 // does not compile - type mismatch
//            BasicFileAttributes attributes2 =Files.getAttribute (path, "insdirectory");                 // does not compile - type mismatch
//            BasicFileAttributes attributes3 = Files, readAttributes (path, FileAttributes, class);      // does not compile - wrong syntax
            BasicFileAttributes attributes4 = Files.readAttributes(path, BasicFileAttributes.class); // line 1

            System.out.println(attributes4.isDirectory());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
