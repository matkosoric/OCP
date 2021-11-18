package edu.matkosoric.class_.design.greetings2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FrenchRun {

    // notice that c variable is ArrayList
    // and irrelevant in calling overriden greeting()

    public static void main(String[] args) {

        FrenchMan frenchMan1 = new FrenchMan();
        FrenchMan frenchMan2 = new FrenchManAbroad();
        FrenchManAbroad frenchMan3 = new FrenchManAbroad();
        Collection<String> c = new ArrayList<>();


        System.out.println(c instanceof Collection);
        System.out.println(c instanceof ArrayList);
        System.out.println(c.getClass());

        frenchMan1.greeting();
//        frenchMan1.greeting(c);       // does not compile

        frenchMan2.greeting();
//        frenchMan2.greeting(c);       // does not compile

        frenchMan3.greeting();
        frenchMan3.greeting(c);

    }
}
