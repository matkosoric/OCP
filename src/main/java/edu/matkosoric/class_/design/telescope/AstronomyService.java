package edu.matkosoric.class_.design.telescope;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public interface AstronomyService {
    private void detectPlanet() {
    }

    default void calibrate(int minItems) {
        System.out.println("Calibrated");
    }
}
