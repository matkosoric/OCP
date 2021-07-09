package edu.matkosoric.nio2.elements;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.nio.file.Path;
import java.nio.file.Paths;

public class BreakingPath {

    // getting particular elements from the path

    public static void main(String[] args) {

        Path belanPath = Paths.get("/home/matko/IdeaProjects/OCP/src/edu/matkosoric/nio2/sample/neno/belan/divojka_sa_juga.txt");

        System.out.println("Path is: " + belanPath);

        for (int i = 0; i < belanPath.getNameCount(); i++) {
            System.out.println("Element " + i + " is :" + belanPath.getName(i));
        }


    }


}
