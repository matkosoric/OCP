package edu.matkosoric.nio.song;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.nio.file.Path;
import java.nio.file.Paths;

public class Song {

    public static void main(String[] args) {

        // returns: \
        Path path2 = Paths.get("/song").getParent().getRoot();
        System.out.println(path2);

        // returns: \
        Path path3 = Paths.get("/song").getRoot().getRoot();
        System.out.println(path3);

        // returns: null
        Path path4 = Paths.get("../song").getParent().getParent();
        System.out.println(path4);

        // NullPointerException
        Path path = Paths.get("../song").getRoot().getParent();
        System.out.println(path);

    }

}
