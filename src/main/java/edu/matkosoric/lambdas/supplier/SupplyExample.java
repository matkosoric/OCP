package edu.matkosoric.lambdas.supplier;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplyExample {

    // demonstration of Supplier functional interface

    public static void main(String[] args) {

        Supplier<String> drHouse =  () -> "Dr. House";
        System.out.println(drHouse.get());

        Supplier<Integer> startingYear = () -> 2004;
        System.out.println(startingYear.get());

        Supplier<Boolean> popularShow = () -> true;
        System.out.println(popularShow.get());

        Supplier<StringBuilder> sb = StringBuilder::new;        // empty string
        System.out.println(sb.get());

        Supplier<LocalDate> date = LocalDate::now;
        System.out.println(date.get());

    }

}
