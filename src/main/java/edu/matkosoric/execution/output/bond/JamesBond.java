package edu.matkosoric.execution.output.bond;

import java.util.ArrayList;
import java.util.List;

public class JamesBond {

    // which annotations should be used to remove compilation warnings?

//    @SuppressWarnings("unchecked")
//    @SuppressWarnings("rawtypes")
    @SuppressWarnings("all")
//    @SuppressWarnings
    public static void main(String[] args) {

        List orderDrink = new ArrayList();
        orderDrink.add("Shaken");
        orderDrink.add("not stirred.");
        print(orderDrink);

    }

//    @SafeVarargs
//    @SafeVarargs
    @SuppressWarnings("all")
//    @SuppressWarnings
    private static void print (List<String>... args) {

        for (List<String> str : args) {
            System.out.println(str);
        }
    }

}
