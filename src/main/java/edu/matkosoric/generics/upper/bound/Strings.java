package edu.matkosoric.generics.upper.bound;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;

public class Strings {

    // example of limiting generics with the upper bound
    // String, StringBuilder, and StringBuffer are implementing CharSequence Interface.

    public static void main(String[] args) {

        List<? super CharSequence> listOfCharacters = new ArrayList<>();

        listOfCharacters.add(new String("matko"));
        listOfCharacters.add(new StringBuilder("soric"));
        listOfCharacters.add(new StringBuffer("zagreb"));

        CharSequence cs = "zadar";
        listOfCharacters.add(cs);       // super class or shared interface can be added to the list also

        System.out.println(listOfCharacters);

    }

}
