package edu.matkosoric.class_.design.equality;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Planet {

    // equals method can be overridden and take various properties as a criteria of comparison


    public int id;
    public String name;
    public boolean innerPlanet;

    @Override
    public int hashCode() {
        return id;
    }

    //    @Override         // does not compile, not a proper override
    public boolean equals(Planet planet) {
        return this.innerPlanet == planet.innerPlanet;
    }

    public static void main(String[] args) {

        Planet mercury = new Planet();
        mercury.id = 1;
        mercury.name = "Mercury";
        mercury.innerPlanet = true;

        Planet earth = new Planet();
        earth.id = 3;
        earth.name = "Earth";
        earth.innerPlanet = true;

        Planet jupiter = new Planet();
        jupiter.id = 5;
        jupiter.name = "Jupiter";
        jupiter.innerPlanet = false;

        if (mercury.equals(earth)) System.out.println("Mercury and Earth are inner planets!");
        else System.out.println("Mercury and Earth are not in the same group of planets!");

        if (earth.equals(jupiter)) System.out.println("Earth and Jupiter are in the same group of planets!");
        else System.out.println("Earth and Jupiter are not in the same group of planets!");

    }
}
