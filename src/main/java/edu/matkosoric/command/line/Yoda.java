package edu.matkosoric.command.line;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Yoda {

    public static void main(String[] args) {

        System.out.println(args[1] + "--" + args[3] + "--" + args[0]);

        // if executed with arguments: Patience you must have my young Padawan
        // result will be: you--have--Patience

        // if executed with arguments: My Car is red
        // result will be: Car--red--My

    }
}
