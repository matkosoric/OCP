package edu.matkosoric.lambdas.bifunction;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample2 {

    // demonstration of BiFunction functional interface

    public static void main(String[] args) {

        List<String> bohemianRapsody = Arrays.asList(   "Mamaaa just killed a man",
                                                        "Put a gun against his head",
                                                        "Pulled my trigger, now he's dead",
                                                        "Mamaaa, life had just begun",
                                                        "But now I've gone and thrown it all away");

        List<String> theEnd = Arrays.asList("This is the end",
                                            "Beautiful friend",
                                            "This is the end",
                                            "My only friend, the end",
                                            "Of our elaborate plans, the end",
                                            "Of everything that stands, the end",
                                            "No safety or surprise, the end",
                                            "I'll never look into your eyes...again");

        // search through lyrics for keyword, and return verses that match the criteria
        BiFunction<List<String>, String, List<String>>  searchLyrics = (lyrics, query) -> {List<String> returnString = new ArrayList<>();
                                                                                            lyrics
                                                                                                .stream()
                                                                                                .filter(verse -> verse.contains(query))
                                                                                                .forEach(a->returnString.add(a));
                                                                                        return returnString;
        };

        // only two queries will be printed
        // method is the same, only parameters change
        searchLyrics.apply(bohemianRapsody, "trigger").forEach(System.out::println);
        searchLyrics.apply(bohemianRapsody, "highway").forEach(System.out::println);
        searchLyrics.apply(theEnd, "surprise").forEach(System.out::println);
        searchLyrics.apply(theEnd, "Sunday").forEach(System.out::println);

    }
}
