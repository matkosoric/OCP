package edu.matkosoric.class_.design.enums.looping;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Medals {

    // demonstration of looping through the enum
    // and use of name() and ordinal() methods

    public static void main(String[] args) {

        for (Prize element : Prize.values()) {
            System.out.println(element.name() + "  " + element.ordinal());
        }
    }
}

// this enum can not be public in this class,
// but only in its own distinct file
enum Prize {
    GOLD, SILVER, BRONZE
}

