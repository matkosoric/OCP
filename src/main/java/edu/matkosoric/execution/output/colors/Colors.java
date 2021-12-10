package edu.matkosoric.execution.output.colors;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Colors {

    // what is the output?

    public static void main(String[] args) {

        String[][] arr = {
                {"Red", "White"},
                {"Black"},
                {"Blue", "Yellow", "Green", "Violet"}
        };
        for (int row = 0; row < arr.length; row++) {
            int column = 0;
            for (; column < arr[row].length; column++) {
                System.out.println("[" + row + "," + column + "] = " + arr[row][column]);
            }
        }


    }

}
