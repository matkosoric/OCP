package edu.matkosoric.execution.output.doors.size;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.function.BiPredicate;

public class CompareDoorsSize {

    // how are following BiPredicate functions compiling?

    public static void main(String[] args) {

//        BiPredicate<Integer , Integer> testEquality1 = (var x, y) -> (x.equals(y));             // does not compile - missing y type

//        BiPredicate<Integer , Integer> testEquality2 = var x, var y -> (x.equals(y));           // does not compile - missing brackets

        BiPredicate<Integer , Integer> testEquality3 = (var x, var y) -> (x.equals(y));

//        BiPredicate<Integer , Integer> testEquality4 = (var x, Integer y) -> (x.equals(y));     // does not compile - can not mix var and Integer

    }

}
