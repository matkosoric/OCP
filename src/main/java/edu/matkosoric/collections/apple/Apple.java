package edu.matkosoric.collections.apple;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.TreeSet;

public class Apple {

    // TreeSet class sorts its elements.
    // ceiling() method returns the first element after the provided parameter.

    public static void main(String[] args) {

        TreeSet<String> appleTree = new TreeSet<>();
        appleTree.add("fruit");
        appleTree.add("apple fruit");
//        appleTree.add(56);      // does not compile
        appleTree.add("apple FRUIT");
        appleTree.add("apple");
        appleTree.add("APPLE FRUIT");
        appleTree.add("APPLE");

        System.out.println(appleTree);

        System.out.println(appleTree.ceiling("apple g"));
        System.out.println(appleTree.ceiling("APPLE "));
        System.out.println(appleTree.ceiling("APPLE"));
        System.out.println(appleTree.ceiling("apple f"));
        System.out.println(appleTree.ceiling("fruit"));     //there are no elements after the last one

    }

}
