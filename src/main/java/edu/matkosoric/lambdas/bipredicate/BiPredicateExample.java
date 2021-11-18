package edu.matkosoric.lambdas.bipredicate;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    // demonstration of BiPredicate functional interface

    public static void main(String[] args) {

        // Map
        Map<Integer, String> henryFondaMovies = new HashMap<>();
        henryFondaMovies.put(1962, "The Longest Day");
        henryFondaMovies.put(1940, "The Grapes of Wrath");
        henryFondaMovies.put(1964, "Fail-Safe");
        henryFondaMovies.put(1957, "12 Angry Men");
        henryFondaMovies.put(1937, "You Only Live Once");
        henryFondaMovies.put(1938, "The Mad Miss Manton");

        BiPredicate<Integer, String> yearFilter = ((year, title) -> year > 1950);
        BiPredicate<Integer, String> titleFilterNumeric = ((year, title) -> title.matches(".*\\d+.*"));
        BiPredicate<Integer, String> titleFilterThe = ((year, title) -> title.contains("The"));

        // this will print only movies that are released after the 1950
        for (Map.Entry<Integer, String> entry : henryFondaMovies.entrySet())
            if (yearFilter.test(entry.getKey(), entry.getValue()))
                System.out.println("after 1950: " + entry.getValue());

        // this will print only movies that contain number in the title
        for (Map.Entry<Integer, String> entry : henryFondaMovies.entrySet())
            if (titleFilterNumeric.test(entry.getKey(), entry.getValue()))
                System.out.println("number in title: " + entry.getValue());

        // this will print only movies that contain "The" in the title
        for (Map.Entry<Integer, String> entry : henryFondaMovies.entrySet())
            if (titleFilterThe.test(entry.getKey(), entry.getValue()))
                System.out.println("the in title: " + entry.getValue());

    }

}
