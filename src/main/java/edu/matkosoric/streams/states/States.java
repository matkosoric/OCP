package edu.matkosoric.streams.states;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.List;

public class States {

    // what is the output?

    public static void main(String[] args) {
        List<String> states = List.of("NY", "CA", "WA", "NC", "CO");

//        states.forEach(var s -> (System.out.println(s));                // does not compile
//        states.forEach((String s) -> ( return System.out.println(s););  // does not compile
//        states.forEach((s) -> System.out.println(s););                  // does not compile
        states.forEach((var s) -> System.out.println(s));

    }


}
