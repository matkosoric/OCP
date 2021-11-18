package edu.matkosoric.collections.hash.set;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.HashSet;

public class NolanMovies {

    // an example of hashSet of elements with overridden hashCode() and equals()
    // since HashSet treats object with identical hashCode as identical object,
    // dunkirk will not be added to this Set.

    public static void main(String[] args) {

        cnMovie interstellar = new cnMovie("Interstellar", 2014, 10);
        cnMovie dunkirk = new cnMovie("Dunkirk", 2017, 10);
        cnMovie darkKnight = new cnMovie("The Dark Knight", 2008, 0);

        System.out.println(interstellar.hashCode());
        System.out.println(dunkirk.hashCode());
        System.out.println(darkKnight.hashCode());

        HashSet<cnMovie> cnhSet = new HashSet<>();
        cnhSet.add(interstellar);
        cnhSet.add(dunkirk);
        cnhSet.add(darkKnight);
        cnhSet.forEach(movie -> System.out.println(movie.movieTitle));

    }

}


class cnMovie {

    String movieTitle;
    Integer year;
    Integer decade;

    public cnMovie(String title, Integer year, Integer decade) {
        this.movieTitle = title;
        this.year = year;
        this.decade = decade;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof cnMovie)) return false;
        cnMovie movie = (cnMovie) obj;
        return decade.equals(movie.decade);
    }

    @Override
    public int hashCode() {
        return decade;
    }

}