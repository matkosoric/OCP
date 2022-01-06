package edu.matkosoric.lambdas.salary.doubling;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

// #TAG2

import java.util.List;
import java.util.function.Function;

public class SalaryDoubling {

    public static void main(String[] args) {

        var salaries = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        StringBuilder sb = new StringBuilder();

        Function<Integer, Integer> f = n -> n * 2;
//    Function<Integer> f = n -> n * 2;             // does not compile
//    Function<int> f = n -> n * 2;                 // does not compile
//    Function<int, int> f = n -> n * 2;            // does not compile
//    Function f = n -> n * 2;                      // does not compile

        for (int a : salaries) {
            sb.append(f.apply(a));
            sb.append(" ");
        }

        System.out.println(sb);

    }



}
