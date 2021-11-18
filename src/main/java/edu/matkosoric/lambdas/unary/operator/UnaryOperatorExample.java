package edu.matkosoric.lambdas.unary.operator;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    // demonstration of UnaryOperator functional interface

    public static void main(String[] args) {

        // UnaryOperator has to have a matching between its parameter and return type

        UnaryOperator<Integer> square = a -> a * a;
        System.out.println(square.apply(3));
        System.out.println(square.apply(4));
        System.out.println(square.apply(5));

//        UnaryOperator<Long> squre2 = b -> b.toString();     // does not compile, type mismatch

        UnaryOperator<String> upperCase = str -> str.toUpperCase();
        System.out.println(upperCase.apply("matko"));
        System.out.println(upperCase.apply("philosophy"));
        System.out.println(upperCase.apply("programming"));

        UnaryOperator<LocalDate> plusYear = date -> date.plusYears(1);
        System.out.println(plusYear.apply(LocalDate.of(2000, 3, 20)));
        System.out.println(plusYear.apply(LocalDate.of(1994, 10, 30)));
        System.out.println(plusYear.apply(LocalDate.of(1873, 9, 25)));

    }
}
