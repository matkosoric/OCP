package edu.matkosoric.class_.design.enums.voyage;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Voyage {

    // demonstration of enum values with methods and additional values

    public static void main(String[] args) {
        Travelling.SHIP.printInfo();
        Travelling.AEROPLANE.printInfo();
        Travelling.TRAIN.printInfo();
    }

}

enum Travelling {
    SHIP ("water", true), TRAIN("land", false), AEROPLANE("air", true);
    private String medium;
    private boolean hasCaptain;
    private Travelling (String medium, boolean hasCaptain) {
        this.medium = medium;
        this.hasCaptain = hasCaptain;
    }

    public void printInfo () {
        System.out.println(this.name() + " uses " + this.medium + " as a medium of transportation.");
        if (this.hasCaptain) System.out.println(this. name() + " has a captain.");
        if (!this.hasCaptain) System.out.println(this.name() + " does not have a captain.");
    }
}
