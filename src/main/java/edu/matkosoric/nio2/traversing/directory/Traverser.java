package edu.matkosoric.nio2.traversing.directory;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Traverser {

    // going through a directory content with Files class

    public static void main(String[] args) throws IOException {

        Path belan = Paths.get("E:\\Java projekti\\OCP\\src\\edu\\matkosoric\\nio2\\sample\\neno\\belan");

        // printing all files and folders
        Files.walk(belan).forEach(System.out::println);

        // printing only windows shortcuts
        Files.walk(belan).filter(p -> p.toString().endsWith(".lnk")).forEach(System.out::println);

        // printing only directories
        Files.walk(belan).filter(a -> a.toFile().isDirectory()).forEach(System.out::println);

        // printing only files
        Files.walk(belan).filter(b -> b.toFile().isFile()).forEach(System.out::println);

        // printing all java files in the current project
        Files.walk(Paths.get(".")).filter(c -> c.toString().endsWith(".java")).forEach(System.out::println);

        // count all java files in the current project
        long count = Files.walk(Paths.get(".")).filter(d -> d.toString().endsWith(".java")).count();
        System.out.println("Number of java file in this project is: " + count);

        // find all java files in the current project modified in the last 24 hours
        Files.find(Paths.get("."), 10, (a, b) -> a.toString().endsWith(".java") &&
                b.lastModifiedTime().toMillis() / 1000 > LocalDateTime.now().minusHours(24).toEpochSecond(ZoneOffset.UTC)).forEach(System.out::println);

        // printing file content in a particular path
        Files.lines(belan).forEach(System.out::println);    // will not work without reading permissions

    }
}
