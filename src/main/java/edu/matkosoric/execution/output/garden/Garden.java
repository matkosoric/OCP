package edu.matkosoric.execution.output.garden;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

class Plant {
}

class Tulip extends Plant {
}

public class Garden {

    // what is the output?
    // Take extra care
    // Take extra care

    private static Plant plant;

    public static void main(String[] args) {
        plant = new Tulip();
        feed(plant);
        feed(plant);
    }

    public static void feed(Plant plant) {
        if (plant instanceof Tulip) {
            System.out.println("Take extra care");
        }
        plant = null;
    }
}
