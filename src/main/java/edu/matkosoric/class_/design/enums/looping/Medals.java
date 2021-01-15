package edu.matkosoric.class_.design.enums.looping;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
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

