package edu.matkosoric.io.copying;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Copying3 {

    // copying with BufferedReader and BufferedWriter

    // read data
    public static List<String> readFile(File source) throws IOException {

        List<String> dataSet = new ArrayList<>();

        try (BufferedReader input = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = input.readLine()) != null) {
                dataSet.add(line);
            }
            return dataSet;
        }
    }

    // write data
    public static void writeFile(List<String> data, File destination) throws IOException {

        try (BufferedWriter output = new BufferedWriter(new FileWriter(destination))) {
            for (String element : data) {
                output.write(element);
                output.newLine();
            }
        }

    }


    public static void main(String[] args) throws IOException {

        String currentDirectory = System.getProperty("user.dir");

        File source = new File(currentDirectory + "/src/main/java/edu/matkosoric/io/sample/jelena/rozga/GospeMoja.txt");
        File destination = new File(currentDirectory + "/src/main/java/edu/matkosoric/io/copying/GM.txt");

        List<String> lyrics = readFile(source);
        writeFile(lyrics, destination);

    }

}
