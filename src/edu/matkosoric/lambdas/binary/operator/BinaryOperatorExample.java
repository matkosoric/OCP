package edu.matkosoric.lambdas.binary.operator;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    // demo for BinaryOperator functional interface

    public static void main(String[] args) {

        // both parameter's type and return type are the same,
        // and therefore, it is enough to specify the type only once
        BinaryOperator<String> trimming = ((a,b) -> a.trim().concat(" ") + b.trim());

        System.out.println(trimming.apply("  Zagreb  ", "  Los Angeles  "));
        System.out.println(trimming.apply("  Zagreb  ", "  New    York  "));
        System.out.println(trimming.apply("  Zagreb  ", "568"));
        System.out.println(trimming.apply("  Zagreb  ", "     "));
        System.out.println(trimming.apply("  Zagreb  ", "         Cork"));

    }
}
