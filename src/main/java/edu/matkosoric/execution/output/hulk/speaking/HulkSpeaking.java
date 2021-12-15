package edu.matkosoric.execution.output.hulk.speaking;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class HulkSpeaking {

    // what is the output?
    // gj hk il

    public static void main(String[] args) {

        char[][] arrays = {{'g', 'j'}, {'h', 'k'}, {'i', 'l'}};

        for (char[] xx : arrays) {
            for (char yy : xx) {
                System.out.print(yy);
            }
            System.out.print(" ");
        }

    }

}
