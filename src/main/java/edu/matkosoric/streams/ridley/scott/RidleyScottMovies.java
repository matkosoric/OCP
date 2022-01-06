package edu.matkosoric.streams.ridley.scott;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class RidleyScottMovies {

    // demonstration of intermediate operations on streams

    public static void main(String[] args) {

        // dataset
        List<String> ridleyScottMovies = Arrays.asList("Prometheus",
                "Hannibal",
                "Thelma & Louise",
                "Thelma & Louise",
                "Blade Runner",
                "Alien");

        // filter()
        System.out.println("*************** FILTER ********");
        Stream<String> RSStream = ridleyScottMovies.stream();
        Predicate<String> predicate = a -> a.contains("nn");
        RSStream.filter(predicate).forEach(System.out::println);

        // distinct() - removes duplicate entries
        System.out.println("*************** DISTINCT ********");
        Stream<String> RSStream2 = ridleyScottMovies.stream();
        RSStream2.distinct().forEach(System.out::println);

        // limit() & skip() - skip neglects first N elements
        System.out.println("*************** LIMIT & SKIP ********");
        Stream<String> RSStream3 = ridleyScottMovies.stream();
        RSStream3.skip(2).limit(4).forEach(System.out::println);

        Stream<Integer> intStream = Stream.iterate(2, n -> n + n);
        intStream.limit(10).forEach(System.out::println);

        // map()
        System.out.println("*************** MAP ********");
        Stream<String> RSStream4 = ridleyScottMovies.stream();
        RSStream4.map(String::length).forEach(System.out::println);

        // flatMap() - combines lists and removes empty items
        System.out.println("*************** FLATMAP ********");
        List<String> rsmovies2 = Arrays.asList("Gladiator", "American Gangster");
        List<String> rsmovies3 = Arrays.asList();
        Stream<List<String>> RSStream5 = Stream.of(ridleyScottMovies, rsmovies3, rsmovies2);
        RSStream5.flatMap(x -> x.stream()).forEach(System.out::println);

        // sorted() - orders items
        System.out.println("*************** SORTED ********");
        Stream<String> RSStream6 = ridleyScottMovies.stream();
        RSStream6.sorted().forEach(System.out::println);

        // reversing order
        Stream<String> RSStream7 = ridleyScottMovies.stream();
        RSStream7.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // custom order by number of characters
        Stream<String> RSStream8 = ridleyScottMovies.stream();
        RSStream8.sorted((x, y) -> x.length() - y.length()).forEach(System.out::println);

        // peek() - does not change the stream, helps in debugging
        System.out.println("*************** PEEK ********");
        Stream<String> RSStream9 = ridleyScottMovies.stream();
        RSStream9.peek(System.out::println).max((s1, s2) -> s1.length() - s2.length());
    }

}
