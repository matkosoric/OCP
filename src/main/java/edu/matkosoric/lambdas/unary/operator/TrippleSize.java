package edu.matkosoric.lambdas.unary.operator;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Arrays;
import java.util.function.UnaryOperator;

// #TAG2

public class TrippleSize {

    // find new method that will tipple values
    // in the same way trippled1 UnaryOperator ?
    // (var x ) -> (x * 3);
    // x -> { return x * 3; };

    public static void main(String[] args) {

        Integer[] ints = {1, 2, 3, 4, 5, 6, 7, 8};

        var list = Arrays.asList(ints);

        UnaryOperator<Integer> trippled1 = x -> x * 3;
        list.replaceAll(trippled1);
        System.out.println(list);

        UnaryOperator<Integer> trippled2 = (var x ) -> (x * 3);
        list.replaceAll(trippled2);
        System.out.println(list);

//        UnaryOperator<Integer> trippled3 = var x -> { return x 3 ; };   // does not compile

        UnaryOperator<Integer> trippled4 = x -> { return x * 3; };
        list.replaceAll(trippled4);
        System.out.println(list);

//        UnaryOperator<Integer> trippled5 = (int x) -> x * 3;            // does not compile



    }

}
