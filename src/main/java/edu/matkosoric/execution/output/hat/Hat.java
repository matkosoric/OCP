package edu.matkosoric.execution.output.hat;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Hat {

    // what is the output?
    // hat at store 1

    public static void main(String[] args) {

        String s = "hat at store";
        int x = s.indexOf("at");
        s.substring(x + 3);
        x = s.indexOf("at");
        System.out.println(s + " " + x);

    }
}
