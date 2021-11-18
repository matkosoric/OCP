package edu.matkosoric.io.buffering;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class Buffering {

    // BufferedReader is wrapping low-level FileReader

    public static void main(String[] args) {

        String currentDirectory = System.getProperty("user.dir");

        // linux path, does not work on windows
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader(currentDirectory + "/src/main/java/edu/matkosoric/io/sample/jelena/rozga/GospeMoja.txt"))) {
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
