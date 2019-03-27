package edu.matkosoric.io.copying;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.io.*;

public class Copying2 {

    // copying with streams and buffer

    public static void copy (File source, File destination) throws IOException {

        try (InputStream input = new BufferedInputStream(new FileInputStream(source));
             OutputStream output = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte [] buffer = new byte[1024];

            int grip;

            while ((grip = input.read(buffer)) > -1) {
                output.write(buffer, 0, grip);
                output.flush();
            }
        }
    }


    public static void main(String[] args) throws IOException {

        File source = new File("/home/matko/IdeaProjects/OCP/src/edu/matkosoric/io/sample/jelena/rozga/RoditCuTiCerISina.txt");
        File destination = new File ("/home/matko/IdeaProjects/OCP/src/edu/matkosoric/io/copying/rodit_cu.txt");

        copy(source,destination);

    }

}
