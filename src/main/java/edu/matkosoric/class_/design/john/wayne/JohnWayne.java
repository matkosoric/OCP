package edu.matkosoric.class_.design.john.wayne;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class JohnWayne extends Man implements Cowboy {

    // out of five statements, see which compile

    public void ridingHorse(String first) {
    }

    public void ridingHorse(String first, String second) {
    }

    public static void main(String[] args) {
        Cowboy theInstance = new JohnWayne();

//        theInstance.ridingHorse(Man.origin, Cowboy.origin);     // does not compile
        theInstance.ridingHorse(Man.origin);
//        theInstance.ridingHorse(origin);                        // does not compile
        ((JohnWayne) theInstance).ridingHorse("Japan", "Mexico");
        theInstance.ridingHorse("France");

    }
}
