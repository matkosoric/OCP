package edu.matkosoric.lambdas.predicate;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.function.Predicate;

public class PredicateExample {

    // demonstration of Predicate functional interface

    public static void main(String[] args) {

        String stevensonNovel = "Strange Case of Dr. Jekyll and Mr. Hyde";
        String slauerhoffNovel = "The Forbidden Realm";

        Predicate<String> searchForJekyll = a -> a.contains("Jekyll");

        System.out.println(searchForJekyll.test(stevensonNovel));
        System.out.println(searchForJekyll.test(slauerhoffNovel));

    }

}
