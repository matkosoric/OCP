package edu.matkosoric.nio2.normalization;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNormalization {

    // what is the output?
    // output: data\another-project

    public static void main(String[] args) {

        String originalPath = "data\\projects\\a-project\\..\\..\\another-project";
        Path path = Paths.get(originalPath);
        System.out.print(path.normalize());

    }
}
