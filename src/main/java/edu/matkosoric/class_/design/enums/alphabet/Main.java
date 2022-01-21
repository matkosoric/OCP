package edu.matkosoric.class_.design.enums.alphabet;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Main {

    // how to print A
    // static String getFirstLetter3() { return A.toString(); }

    public static void main(String[] args) {

//        System.out.println(Alphabet.getFirstLetter1());       // does not compile
        System.out.println(Alphabet.getFirstLetter2());
        System.out.println(Alphabet.getFirstLetter3());
//        System.out.println(Alphabet.getFirstLetter4());       // does not compile

    }
}
