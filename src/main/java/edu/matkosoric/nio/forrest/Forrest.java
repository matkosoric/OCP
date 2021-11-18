package edu.matkosoric.nio.forrest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Forrest {

    public static void main(String[] args) throws IOException {

        // normalized paths are the same
        // Files.isSameFile causes NoSuchFileException

        Path path1 = Paths.get("/./forest/./").resolve(Paths.get("tree.txt"));
        Path path2 = new File("/forest/./water/../tree.txt").toPath();

        System.out.println(path1);
        System.out.println(path1.normalize());
        System.out.println(path2);
        System.out.println(path2.normalize());

        System.out.print(" " + path1.equals(path2));
        System.out.print(" " + path1.normalize().equals(path2.normalize()));

        System.out.print(Files.isSameFile(path1, path2));  // NoSuchFileException
    }
}
