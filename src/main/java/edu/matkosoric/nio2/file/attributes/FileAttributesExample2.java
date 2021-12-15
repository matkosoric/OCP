package edu.matkosoric.nio2.file.attributes;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttributesExample2 {

    // more methods for checking file attributes
    // designed on windows.

    public static void main(String[] args) throws IOException {

        Path divojka_sa_juga = Paths.get("E:\\Java projekti\\OCP\\src\\edu\\matkosoric\\nio2\\sample\\neno\\belan\\divojka_sa_juga.txt");

        System.out.println("Hidden: " + Files.isHidden(divojka_sa_juga));
        System.out.println("Readable: " + Files.isReadable(divojka_sa_juga));
        System.out.println("Executable: " + Files.isExecutable(divojka_sa_juga));
        System.out.println("Size: " + Files.size(divojka_sa_juga));
        System.out.println("Last modification time: " + Files.getLastModifiedTime(divojka_sa_juga));
        System.out.println("Owner: " + Files.getOwner(divojka_sa_juga));

        // getting file attributes in one fetch
        BasicFileAttributes attributes = Files.readAttributes(divojka_sa_juga, BasicFileAttributes.class);
        System.out.println("Directory: " + attributes.isDirectory());
        System.out.println("Ordinary file: " + attributes.isRegularFile());
        System.out.println("Symbolic link: " + attributes.isSymbolicLink());
        System.out.println("Other than file, directory, or symolic link: " + attributes.isOther());
        System.out.println("Time of creation: " + attributes.creationTime());
        System.out.println("Last modification time: " + attributes.lastModifiedTime());
        System.out.println("Last access time: " + attributes.lastAccessTime());
        System.out.println("Unique file identifier: " + attributes.fileKey());

    }
}
