package edu.matkosoric.streams.maya.angelou;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MayaAngelouNovels {

    // several ways to create a stream of string data

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.empty();
        Stream<String> stream2 = Stream.of("I Know Why the Caged Bird Sings");
        Stream<String> stream3 = Stream.of("And Still I Rise",
                "On The Pulse Of Morning",
                "Gather Together In My Name");
        List<String> ordinaryList = Arrays.asList(
                "Just Give Me a Cool Drink of Water 'fore I Diiie",
                "Life Doesn't Frighten Me",
                "Wouldn't Take Nothing for My Journey",
                "Even the Stars Look Lonesome");
        Stream<String> stream4 = ordinaryList.stream();
        Stream<String> stream5 = ordinaryList.parallelStream();

        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
        stream3.forEach(System.out::println);
        stream4.forEach(System.out::println);
        stream5.forEach(System.out::println);


    }

}
