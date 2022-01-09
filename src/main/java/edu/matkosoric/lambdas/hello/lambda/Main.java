package edu.matkosoric.lambdas.hello.lambda;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.function.Consumer;

public class Main {

    // replace line 1 so that code compiles
    // Consumer consumer4 = System.out::print;

    public static void main(String[] args) {

//        Consumer consumer = msg -> System.out::print;       // line 1

//        Consumer consumer1 = msg -> { return System.out.print(msg); };      // does not compile
//        Consumer consumer2 = var arg -> {System.out.print(arg);};           // does not compile
//        Consumer consumer3 = (String args) -> System.out.print(args);       // does not compile

        Consumer consumer4 = System.out::print;

        consumer4.accept("Hello Lambda");

    }

}
