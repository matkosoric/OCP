package edu.matkosoric.nio2.usual.methods;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsualPathMethods {

    // demonstration of various Path methods

    public static void main(String[] args) throws IOException {

        String currentDirectory = System.getProperty("user.dir");
        System.out.println(currentDirectory);
        Path belanPath = Paths.get(currentDirectory + "/src/main/java/edu/matkosoric/nio2/sample/neno/belan/kavana.txt");
        Path belanPathDeeper = Paths.get(currentDirectory + "/src/main/java/edu/matkosoric/nio2/sample/neno/belan/more/lyrics/sunny_day.txt");
        Path belanPathRelative = Paths.get("src/main/java/edu/matkosoric/nio2/sample/neno/belan/kavana.txt");
        Path belanPathRelative2 = Paths.get("src/main/java/edu/matkosoric/nio2/sample/neno/belan/more/lyrics/sunny_day.txt");
        Path belanPathPeriod = Paths.get("../../../../../../../../kavana.txt");

        System.out.println("Filename: " + belanPath.getFileName());
        System.out.println("Root: " + belanPath.getRoot());
        System.out.println("Parent: " + belanPath.getParent());

        // traverse each path level
        Path currentPath = belanPath;
        while ((currentPath = currentPath.getParent()) != null)
            System.out.println(currentPath);

        // isAbsolute()
        System.out.println("\nISABSOLUTE():");
        System.out.println(belanPath.isAbsolute());
        System.out.println(belanPathRelative.isAbsolute());
        System.out.println(belanPathRelative.toAbsolutePath());

        // subpath()
        System.out.println("\nsubpath():");
        System.out.println(belanPath.subpath(0, 5));
        System.out.println(belanPath.subpath(0, 10));
        System.out.println(belanPath.subpath(0, 12));
//        System.out.println(belanPath.subpath(0, 13));   // compiles, but throws IllegalArgumentException at runtime
//        System.out.println(belanPath.subpath(0, 20));   // compiles, but throws IllegalArgumentException at runtime
        System.out.println(belanPath.subpath(5, 10));
        System.out.println(belanPath.subpath(8, 12));
//        System.out.println(belanPath.subpath(12, 12));  // compiles, but throws IllegalArgumentException at runtime
        System.out.println(belanPath.subpath(11, 12));
        System.out.println(belanPathPeriod.toAbsolutePath());

        // relativize() will find a common point between two paths
        // both of them have to be either absolute or relative.
        System.out.println("\nrelativize():");
        System.out.println(belanPath.relativize(belanPathDeeper));
        System.out.println(belanPathDeeper.relativize(belanPath));
//        System.out.println(belanPath.relativize(belanPathRelative));    // compiles, but throws a IllegalArgumentException at runtime

        // resolve()
        System.out.println("\nresolve():");
        System.out.println(belanPath.resolve(belanPathDeeper));     // simply returns parameter path
        System.out.println(belanPathDeeper.resolve(belanPath));     // simply returns parameter path
        System.out.println(belanPathRelative.resolve(belanPathRelative2));      // produces meaningless concatenation
        System.out.println(belanPathRelative2.resolve(belanPathRelative));      // produces meaningless concatenation
        Path lyrics = Paths.get(currentDirectory + "/src/main/java/edu/matkosoric/nio2/sample/neno/belan");
        System.out.println(lyrics.resolve(Paths.get("more/lyrics")));

        // normalize()
        System.out.println("\nnormalize():");
        System.out.println(belanPathDeeper.resolve(belanPathDeeper.relativize(belanPath)));
        System.out.println(belanPathDeeper.resolve(belanPathDeeper.relativize(belanPath)).normalize());

        // toRealPath() - checks file existence on the file system
        System.out.println("\ntoRealPath():");
        System.out.println("toRealPath() on a absolute path: " + belanPath.toRealPath());
        System.out.println("toRealPath() on a relative path: " + belanPathRelative.toRealPath());
        System.out.println("toRealPath() = toAbsolutePath(): " + belanPathRelative.toAbsolutePath());
        System.out.println(Paths.get(".").toRealPath());        // get current directory

        // isSameFile() - does not looks the content, but only location on the file system
        System.out.println("\nisSameFile():");
        System.out.println(Files.isSameFile(belanPath, belanPathRelative));
        System.out.println(Files.isSameFile(belanPath, belanPathDeeper));
        System.out.println(Files.isSameFile(belanPathDeeper, belanPath.getParent().resolve(Paths.get("more/lyrics/sunny_day.txt"))));

        // createDirectory() - can create new directory only in a preexisting directory
        // if directory already exists, it will throw FileAlreadyExistsException at runtime
        Path lyrics2 = Paths.get(currentDirectory + "/src/main/java/edu/matkosoric/nio2/sample/neno/belan/lyrics2");
        Path copying = Paths.get(currentDirectory + "/src/main/java/edu/matkosoric/nio2/sample/neno/belan/lyrics2/kavana_kopija");
        Files.deleteIfExists(copying);
        Files.deleteIfExists(lyrics2);
        Files.createDirectory(lyrics2);

        // createDirectories() - creates a directory with its non-existent parent directories
        Files.createDirectories(Paths.get(currentDirectory + "/src/main/java/edu/matkosoric/nio2/sample/neno/belan/second/lyrics/directory"));

        // copy a file with its content
        Files.copy(belanPath, copying);

        // move a file
        Path moving = Paths.get(currentDirectory + "/src/main/java/edu/matkosoric/nio2/sample/neno/belan/more/lyrics/moved.txt");
        Files.deleteIfExists(moving);
        Files.move(belanPath, moving);
        // copy back the file
        Files.copy(moving, belanPath);

    }

}
