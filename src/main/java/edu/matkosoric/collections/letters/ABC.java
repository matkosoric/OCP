package edu.matkosoric.collections.letters;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;

public class ABC {

    // what is the result?
    // UnsupportedOperationException

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");

        List list2 = List.copyOf(list1);
        list2.add("C");                         // UnsupportedOperationException

        List<List<String>> list3 = List.of(list1, list2);
        System.out.println(list3);


    }

}
