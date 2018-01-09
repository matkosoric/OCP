package edu.matkosoric.lambdas.supplier;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

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

    }

}
