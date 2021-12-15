package edu.matkosoric.io.file.methods;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.io.File;

public class MateMisoKovac {

    // demonstration of methods for File object

    public static void main(String[] args) {


        // windows path, does not work on Linux
        File nemamRazlogaLyrics = new File("src\\edu\\matkosoric\\io\\file\\methods\\Ja_nemam_vise_razloga_da_zivim.txt");
        File MMKfolder = new File("src\\edu\\matkosoric\\io\\file\\methods\\MMK-lyrics");

        // checking file info
        if (nemamRazlogaLyrics.exists()) {
            System.out.println("ABSOLUTE PATH: " + nemamRazlogaLyrics.getAbsolutePath());
            System.out.println("PARENT PATH: " + nemamRazlogaLyrics.getParent());
            System.out.println("IS THIS DIRECTORY? " + nemamRazlogaLyrics.isDirectory());
            System.out.println("IS THIS DIRECTORY? " + MMKfolder.isDirectory());

            if (nemamRazlogaLyrics.isFile()) {
                System.out.println("FILE LENGTH: " + nemamRazlogaLyrics.length());
                System.out.println("LAST MODIFIED: " + nemamRazlogaLyrics.lastModified());
            }
        }

        // checking directory content
        if (MMKfolder.exists() & MMKfolder.isDirectory()) {
            for (File lyrics : MMKfolder.listFiles())
                System.out.println(lyrics.getName());
        }
    }

}
