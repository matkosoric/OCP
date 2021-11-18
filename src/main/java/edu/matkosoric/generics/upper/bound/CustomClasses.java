package edu.matkosoric.generics.upper.bound;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import edu.matkosoric.class_.design.implementing.Human;

import java.util.ArrayList;
import java.util.List;

public class CustomClasses {

    public static void main(String[] args) {

        List<Life> list5 = new ArrayList<>();
//        list5.add(new Object());            // does not compile
        list5.add(new Life());
        list5.add(new Animals());
        list5.add(new Humans());

        List<Animals> list1 = new ArrayList<>();
//        list1.add(new Object());    // does not compile
//        list1.add(new Life());      // does not compile
        list1.add(new Animals());
        list1.add(new Humans());

        List<Humans> list9 = new ArrayList<>();
//        list9.add(new Object());    // does not compile
//        list9.add(new Life());      // does not compile
//        list9.add(new Animals());   // does not compile
        list9.add(new Humans());


        // nothing can be added to the list with lower bound.
        // they are used as a method parameter.
        List<? extends Life> list2 = new ArrayList<>();
//        list2.add(new Object());        // does not compile
//        list2.add(new Life());          // does not compile
//        list2.add(new Animals());       // does not compile
//        list2.add(new Humans());        // does not compile

        // nothing can be added to the list with lower bound
        ArrayList<? extends Animals> list7 = new ArrayList<>();
//        list7.add(new Object());        // does not compile
//        list7.add(new Life());          // does not compile
//        list7.add(new Animals());       // does not compile
//        list7.add(new Humans());        // does not compile

        // nothing can be added to the list with lower bound
        List<? extends Human> list8 = new ArrayList<>();
//        list8.add(new Object());        // does not compile
//        list8.add(new Life());          // does not compile
//        list8.add(new Animals());       // does not compile
//        list8.add(new Humans());        // does not compile


        // a list with the upper bound
        List<? super Life> list4 = new ArrayList<>();
//        list4.add(new Object());        // does not compile
        list4.add(new Life());
        list4.add(new Animals());
        list1.add(new Humans());

        // a list with the upper bound
        List<? super Animals> list3 = new ArrayList<>();
//        list3.add(new Object());        // does not compile
//        list3.add(new Life());          // does not compile
        list3.add(new Animals());
        list3.add(new Humans());

        // a list with the upper bound
        List<? super Humans> list6 = new ArrayList<>();
//        list6.add(new Object());        // does not compile
//        list6.add(new Life());          // does not compile
//        list6.add(new Animals());       // does not compile
        list6.add(new Humans());


    }
}


class Life {
}

class Animals extends Life {
}

class Humans extends Animals {
}
