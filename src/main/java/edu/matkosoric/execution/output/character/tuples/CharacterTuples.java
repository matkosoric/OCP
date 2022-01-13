package edu.matkosoric.execution.output.character.tuples;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class CharacterTuples {

    // what is the output?
    // ad be cf

    public static void main(String[] args) {

        char[][] arrays = {{'a', 'd'}, {'b', 'e'}, {'c', 'f'}};

        for (char[] xx : arrays) {
            for (char yy : xx) {
                System.out.print(yy);
            }
            System.out.print(" ");
        }

    }
}
