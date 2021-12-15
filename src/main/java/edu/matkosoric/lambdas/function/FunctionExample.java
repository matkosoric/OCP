package edu.matkosoric.lambdas.function;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    // demonstration of Function functional interface

    public static void main(String[] args) {

        // dataset
        List<String> sovietLeaders = new ArrayList<>();
        sovietLeaders.addAll(Arrays.asList("Lenin", "Stalin", "Malenkov", "Khrushchev", "Brezhnev",
                "Andropov", "Chernenko", "Gorbachev", "Yanayev"));

        Function<String, String> reversingSurnames = str -> new StringBuilder(str).reverse().toString();

        for (String element : sovietLeaders)
            System.out.println(reversingSurnames.apply(element));


    }

}
