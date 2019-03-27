package edu.matkosoric.lambdas.predicate;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class PredicateExample2 {

    // demonstration of Predicate functional interface and its default methods

    public static void main(String[] args) {

        // predicates can be combined with default methods such as
        // and(), or(), and negate().
        Map<String, String> booksOnEthics = new HashMap();
        booksOnEthics.put("MacIntyre", "After Virtue");
        booksOnEthics.put("Nietzsche", "Beyond Good and Evil");
        booksOnEthics.put("Spinoza", "Ethics");
        booksOnEthics.put("Hume", "An Enquiry Concerning the Principles of Morals");
        booksOnEthics.put("Aristotle", "Nicomachean Ethics");

        Predicate<String> ethicsKeyword = title -> title.contains("Ethics");
        Predicate<String> moralsKeyword = title -> title.contains("Morals");
        Predicate<String> nicomacheanKeyword = title -> title.contains("Nicomachean");

        // this will print out books with the word "Ethics" in the title
        for (Map.Entry<String, String> entry : booksOnEthics.entrySet())
            if (ethicsKeyword.test(entry.getValue()))
                System.out.println(entry.getKey() + ": " + entry.getValue());

        System.out.println("***************************************");

        // this will print out books with the word "Ethics" and "Morals" in the title
        // notice the >or(moralsKeyword)< part
        for (Map.Entry<String, String> entry : booksOnEthics.entrySet())
            if (ethicsKeyword.or(moralsKeyword).test(entry.getValue()))
                System.out.println(entry.getKey() + ": " + entry.getValue());

        System.out.println("***************************************");

        // this will not print out anything, since there is no books
        // that contain both the word "Ethics" and "Morals" in the title.
        // notice the >and(moralsKeyword)< part
        for (Map.Entry<String, String> entry : booksOnEthics.entrySet())
            if (ethicsKeyword.and(moralsKeyword).test(entry.getValue()))
                System.out.println(entry.getKey() + ": " + entry.getValue());

        System.out.println("***************************************");

        // this will print only those books that contain the word "Ethics" in the title,
        // but do not contain the word "Nicomachean",
        // which is Spinoza's Ethics.
        for (Map.Entry<String, String> entry : booksOnEthics.entrySet())
            if (ethicsKeyword.and(nicomacheanKeyword.negate()).test(entry.getValue()))
                System.out.println(entry.getKey() + ": " + entry.getValue());

    }

}
