package edu.matkosoric.class_.design.equality;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Movie {

    // wrong implementation of hashCode() method.
    // two objects that return true with equals() should return
    // the same value with hashCode().

    private int id;
    private String title;
    private int genreCode;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Movie)) return false;
        Movie parameterMovie = (Movie) obj;
        return this.id == parameterMovie.id;
    }

    @Override
    public int hashCode() {
        return this.genreCode;
    }

    public static void main(String[] args) {

        Movie alien = new Movie();
        alien.id = 1;
        alien.genreCode = 500;

        Movie interstellar = new Movie();
        interstellar.id = 1;
        interstellar.genreCode = 600;

        Movie alteredStates = new Movie();
        alteredStates.id = 6;
        alteredStates.genreCode = 500;

        System.out.println(alien.equals(interstellar));
        System.out.println(alien == interstellar);

        System.out.println(alien.equals(alteredStates));
        System.out.println(alien == alteredStates);

    }

}
