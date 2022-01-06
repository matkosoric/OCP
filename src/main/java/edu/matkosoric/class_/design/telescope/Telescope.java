package edu.matkosoric.class_.design.telescope;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Telescope implements AstronomyService {

    public static void main(String[] args) {
        Telescope telescope = new Telescope();
//        telescope.detectPlanet();       // does not compile - private access
        telescope.calibrate(1);
    }

}
