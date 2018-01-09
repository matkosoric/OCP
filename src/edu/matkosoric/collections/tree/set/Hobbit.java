package edu.matkosoric.collections.tree.set;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

public class Hobbit {

    // demonstration of TreeSet
    // elements are sorted with compareTo() method from the Comparable interface.
    // in the case of String type, compareTo sorts elements alphabetically.

    public static void main(String[] args) {

        TreeSet<String> hobbitMovies = new TreeSet<>();
        hobbitMovies.add("An Unexpected Journey");
        hobbitMovies.add("The Desolation of Smaug");
        hobbitMovies.add("The Battle of Five Armies");
//        hobbitMovies.add(null);     // compiles, but throws a NullPointerException at runtime
        hobbitMovies.forEach(title -> System.out.println(title));
        System.out.println();

        // methods from NavigableSet interface
        System.out.println("LOWER: " + hobbitMovies.lower("The Desolation of Smaug"));  // returns previous element
        System.out.println("LOWER: " + hobbitMovies.lower("An Unexpected Journey"));    // there is no item before this one

        System.out.println("HIGHER: " + hobbitMovies.higher("An Unexpected Journey"));      // returns the next element
        System.out.println("HIGHER: " + hobbitMovies.higher("The Desolation ..."));         // 'completes' the string
        System.out.println("HIGHER: " + hobbitMovies.higher("The Desolation of Smaug"));    // returns null, this is the last item

        System.out.println("FLOOR: " + hobbitMovies.floor("The Battle of Five Armies"));
        System.out.println("FLOOR: " + hobbitMovies.floor("The Desolation ..."));           // returns previous item

        System.out.println("CEILING: " + hobbitMovies.ceiling("An Unexpected Journey"));
        System.out.println("CEILING: " + hobbitMovies.ceiling("The Battle of 888"));        // 'completes' the string

        System.out.println();

        // LOTR movies are 'automatically' sorted by release year,
        // not by title, nor by insertion order,
        // due to the compareTo implementation.
        TreeSet<LordOfTheRings> lotrtSet = new TreeSet<>();
        lotrtSet.add(new LordOfTheRings("The Two Towers", 2002));
        lotrtSet.add(new LordOfTheRings("The Fellowship of the Ring", 2001));
        lotrtSet.add(new LordOfTheRings("The Return of the King", 2003));
        lotrtSet.forEach(sequel -> System.out.println(sequel.title));

    }
}

class LordOfTheRings implements Comparable{

    String title;
    Integer releaseYear;

    public LordOfTheRings(String title, Integer releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    @Override
    public int compareTo(Object o) {
        LordOfTheRings compareMovie = (LordOfTheRings) o;
        return releaseYear.compareTo(compareMovie.releaseYear);
//        return compareMovie.releaseYear.compareTo(releaseYear); // this is reversed order by year
    }
}
