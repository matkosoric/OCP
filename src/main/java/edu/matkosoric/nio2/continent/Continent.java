package edu.matkosoric.nio2.continent;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class Continent {

    // what is the output?
    // ...\src\main\java\edu\matkosoric\nio2\continent
    // ...\src\main\java\edu\matkosoric\nio2\continent\country

    public static void main(String[] args) {

        BiPredicate<Path, BasicFileAttributes> pred = (path, fileAttrs) -> {
            return fileAttrs.isDirectory();
        };
        int depth = 1;
        try (var stream = Files.find(Paths.get(System.getProperty("user.dir") + "\\src\\main\\java\\edu\\matkosoric\\nio2\\continent\\"), depth, pred)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
