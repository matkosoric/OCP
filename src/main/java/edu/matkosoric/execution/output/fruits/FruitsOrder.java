package edu.matkosoric.execution.output.fruits;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitsOrder {

    // what is the output ?
    // because of the minus sign ( - a.compareTo(b) ), order is reversed

    public static void main(String[] args) {

        String[] fruitNames = {"appple", "orange", "grape", "lemon", "apricot", "watermelon"};

        var fruits = new ArrayList<>(Arrays.asList(fruitNames));

        // with minus
        fruits.sort((var a, var b) -> -a.compareTo(b));
        fruits.forEach(System.out::println);

        // without minus
        fruits.sort((var a, var b) -> a.compareTo(b));
        fruits.forEach(System.out::println);


    }

}
