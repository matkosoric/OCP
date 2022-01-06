package edu.matkosoric.collections.hash.set;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CarpenterMovies {

    // demonstration of HashSet methods

    public static void main(String[] args) {

        HashSet<String> carpenterMovies = new HashSet<>();

        carpenterMovies.add("They Live");

        // successful adding returns true
        System.out.println(carpenterMovies.add("The Fog"));

        // Set interface does not allow duplicate values
        // an attempt to add already present value will return false
        System.out.println(carpenterMovies.add("They Live"));

        // any form of Collection interface, such as ArrayList, can be added to the HashSet
        Collection<String> collectionToAdd = new ArrayList<>();
        collectionToAdd.add("The Thing");
        collectionToAdd.add("Halloween");
        carpenterMovies.addAll(collectionToAdd);
        System.out.println(carpenterMovies);

        // each element has a unique hash code.
        // if several objects have identical hash code,
        // linkedList will treat them as the same object
        for (String movie : carpenterMovies)
            System.out.println(movie + ": " + movie.hashCode());

        System.out.println(carpenterMovies.contains("The Thing"));   // true
        System.out.println(carpenterMovies.contains("Casablanca"));  // false

        // remove element
        System.out.println(carpenterMovies.remove("The Fog"));
        carpenterMovies.forEach(System.out::println);       // looping with method reference

        System.out.println("EMPTY? " + carpenterMovies.isEmpty());
        System.out.println(carpenterMovies.size());
        carpenterMovies.clear();
        System.out.println("EMPTY? " + carpenterMovies.isEmpty());
        System.out.println(carpenterMovies.size());

    }
}
