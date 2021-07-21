package edu.matkosoric.io.parent.child;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.io.File;

public class ParentAndChildPath {

    // getting the path by combining absolute and relative path

    public static void main(String[] args) {

        String currentDirectory = System.getProperty("user.dir");

        // note: linux path
        File parent = new File(currentDirectory + "/src/main/java/edu/matkosoric");
        File child = new File(parent, "io/sample/jelena/rozga/RoditCuTiCerISina.txt");

        System.out.println(child.exists());

    }
}
