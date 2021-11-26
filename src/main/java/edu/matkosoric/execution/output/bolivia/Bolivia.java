package edu.matkosoric.execution.output.bolivia;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Bolivia {

    // what is output?
    // 3

    public static void main(String[] args) {

        char letter = 'b';
        int i = 0;

        switch (letter) {

            case 'a':
                i++;
                break;
            case 'b':
                i++;
            case 'c' | 'd': // line 1
                i++;
            case 'e':
                i++;
                break;
            case 'f':
                i++;
                break;
            default:
                System.out.println(letter);
        }
        System.out.println(i);

    }

}
