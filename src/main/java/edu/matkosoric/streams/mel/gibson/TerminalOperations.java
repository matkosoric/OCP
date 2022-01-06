package edu.matkosoric.streams.mel.gibson;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {

    // demonstration of terminal operations on a stream

    public static void main(String[] args) {

        // dataset
        List<String> melGibsonMovies = Arrays.asList("Mad Max",
                "Signs",
                "Lethal Weapon",
                "Air America",
                "Conspiracy Theory",
                "Payback");

        // count() method returns the number of items
        Stream<String> MGStream1 = melGibsonMovies.stream();
        System.out.println(MGStream1.count());

        // min() takes Comparator and searches for a matching value
        Stream<String> MGStream2 = melGibsonMovies.stream();
        System.out.println(MGStream2.min((s1, s2) -> {
            System.out.println(s1.charAt(0) + " " + s2.charAt(0));
            return s1.charAt(0) - s2.charAt(0);
        }));

        // max() also takes Comparator and searches for a matching value
        Stream<String> MGStream3 = melGibsonMovies.stream();
        System.out.println(MGStream3.max((s1, s2) -> {
            System.out.println(s1.length() + " : " + s2.length());
            return s1.length() - s2.length();
        }));

        // findAny()
        Stream<String> MGStream4 = melGibsonMovies.parallelStream();
//        System.out.println(MGStream4.findAny());      // one way to print result
        MGStream4.findAny().ifPresent(System.out::println);

        // findFirst()
        Stream<String> MGStream5 = melGibsonMovies.stream();
        MGStream5.findFirst().ifPresent(System.out::println);

        // allMatch(), anyMatch() & noneMatch()
        Predicate<String> predicate = a -> a.contains(" ");
        System.out.println(melGibsonMovies.stream().allMatch(predicate));
        System.out.println(melGibsonMovies.stream().anyMatch(predicate));
        System.out.println(melGibsonMovies.stream().noneMatch(predicate));

        // reduce()
        Stream<String> MGStream6 = melGibsonMovies.stream();
        String allMGmovies = MGStream6.reduce("", (a, b) -> a + b + " ");
        System.out.println(allMGmovies);

        Stream<String> MGStream7 = melGibsonMovies.stream();
        String allMGmovies2 = MGStream7.reduce("", String::concat);
        System.out.println(allMGmovies2);

        // collect()
        Stream<String> MGStream8 = melGibsonMovies.stream();
        TreeSet<String> treeSetMG = MGStream8.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSetMG);

        Stream<String> MGStream9 = melGibsonMovies.stream();
        StringBuilder treeSetMG2 = MGStream9.collect(StringBuilder::new,
                StringBuilder::append, StringBuilder::append);
        System.out.println(treeSetMG2);

        Stream<String> MGStream10 = melGibsonMovies.stream();
        LinkedList<String> MGlist = MGStream10.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
        System.out.println(MGlist);

    }

}
