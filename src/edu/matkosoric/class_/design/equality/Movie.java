package edu.matkosoric.class_.design.equality;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2017.
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
    public boolean equals (Object obj) {
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

        Movie alteredStates = new Movie();
        alteredStates.id = 6;
        alteredStates.genreCode = 500;



    }

}
