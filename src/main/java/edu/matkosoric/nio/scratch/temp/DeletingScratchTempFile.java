package edu.matkosoric.nio.scratch.temp;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// #TAG2

public class DeletingScratchTempFile {

    // what is the output if /exam/temp.txt file exists and
    // scratch/exam/new.txt and /scratch/new.txt files do not exist.
    // java.nio.file.FileAlreadyExistsException

    public static void main(String[] args) throws IOException {

        Path currentFile = Paths.get("src/main/java/edu/matkosoric/nio/scratch/temp/scratch/exam/temp.txt");
        Path outputFile = Paths.get("src/main/java/edu/matkosoric/nio/scratch/temp/scratch/exam/new.txt");
        Path directory = Paths.get("src/main/java/edu/matkosoric/nio/scratch/temp/scratch");
        Files.copy(currentFile, outputFile);
        Files.copy(outputFile, directory);
        Files.delete(outputFile);

    }
}
