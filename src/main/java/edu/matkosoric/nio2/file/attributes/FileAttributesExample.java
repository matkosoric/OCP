package edu.matkosoric.nio2.file.attributes;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAttributesExample {

    // various methods for handling file attributes
    // designed for windows, not linux

    public static void main(String[] args) {

        Path directory = Paths.get("E:\\Java projekti\\OCP\\src\\edu\\matkosoric\\nio2\\sample\\neno\\belan");
        Path file = Paths.get("E:\\Java projekti\\OCP\\src\\edu\\matkosoric\\nio2\\sample\\neno\\belan\\rijeka_snova.txt");
        Path link = Paths.get("E:\\Java projekti\\OCP\\src\\edu\\matkosoric\\nio2\\sample\\neno\\belan\\win_shortcut_to_sunny_day.lnk");

        System.out.println(Files.isDirectory(directory));
        System.out.println(Files.isDirectory(file));
        System.out.println(Files.isDirectory(link));
        System.out.println(Files.isDirectory(link, LinkOption.NOFOLLOW_LINKS));

        System.out.println("\n" + Files.isRegularFile(directory));
        System.out.println(Files.isRegularFile(file));
        System.out.println(Files.isRegularFile(link));
        System.out.println(Files.isRegularFile(link, LinkOption.NOFOLLOW_LINKS));

        System.out.println("\n" + Files.isSymbolicLink(directory));
        System.out.println(Files.isSymbolicLink(file));
        System.out.println(Files.isSymbolicLink(link));

    }
}
