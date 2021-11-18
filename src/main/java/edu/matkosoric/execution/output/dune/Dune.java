package edu.matkosoric.execution.output.dune;

public class Dune {

    // what is the type of local variable?
    // String


    public static void main(String[] args) {

        for (var x : args) {
            System.out.println(x);
            System.out.println(x.getClass());
        }

    }
}
