package edu.matkosoric.lambdas.wrong.syntax;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

public class LambdaOrNotLambda {

    // valid lambda expression mostly depends on functional interface ih its background.
    // however, some general rules apply to all lambda expressions,
    // regarding the parameters type, return keyword, and parentheses,
    // that is, optional parts in the lambda statement.

    public static void main(String[] args) {

        BlackMagic bm1 = (int a, int b) -> {return "" + a*b;};            // valid, full
        BlackMagic bm2 = (int a, int b) -> "" + a*b;                      // valid
        BlackMagic bm3 = (a, b) -> "" + a*b;                              // valid
//        BlackMagic bm4 = a, b -> "" + a*b;                         // does not compile
//        BlackMagic bm5 = ( a,  b) -> a*b;                          // does not compile, wrong return type
//        BlackMagic bm6 = (int x, int y) -> {"" + x*y;};            // does not compile, missing return keyword
//        BlackMagic bm7 = (int a, b) -> {return "" + a*b;};          // does not compile, type for the second argument is missing

        Halloween h1 = (Pumpkin pumpkin) -> {return "horror";};
//        Halloween h2 = Pumpkin pumpkin -> {return "horror";};           // does not compile, return type is not primitive
        Halloween h3 = (Pumpkin pumpkin) -> "horror";
//        Halloween h3 = (Pumpkin pumpkin) -> ;                       // does not compile, missing second part of the lambda statement

        System.out.println(bm3.witchCraft(4,3));
        System.out.println(h3.horrorSpree(new Pumpkin()));

    }

    interface BlackMagic {
        public String witchCraft (int a, int b);
    }

    interface Halloween {
        public String horrorSpree (Pumpkin pumpkin);
    }

}

class Pumpkin {}

