package edu.matkosoric.lambdas.fruits;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplacingFruits {

    // pick functional interface that compiles

    public static void main(String[] args) {

//        Function function1 = String::toUpperCase;
//        UnaryOperator function2 = s -> s.toUpperCase();
        UnaryOperator<String> function3 = String::toUpperCase;
//        Function<String> function4 = m -> m.toUpperCase();

        List<String> fruits = new ArrayList<>(List.of("apple", "orange", "banana"));

        fruits.replaceAll(function3);

        System.out.println(fruits);

    }

}
