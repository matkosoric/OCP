package edu.matkosoric.collections.hominins;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;

public class HumanAncestors {

    // demonstration of add() method in ArrayList

    public static void main(String[] args) {

        // this array list is declared without specifying a type,
        // which makes it capable of receiving any object
        List humanAncestors = new ArrayList<>();
        humanAncestors.add("homo habilis");
        humanAncestors.add("homo erectus");
        humanAncestors.add(0, "homo floresiensis");
        humanAncestors.add(null);
        humanAncestors.add(5);
        humanAncestors.add(false);
        humanAncestors.add(2, 3.0);
        humanAncestors.add('Y');
//        humanAncestors.add(2L, 2);          // does not compile, index can not be long
//        humanAncestors.add(true, false);    // does not compile, index can not be boolean
        System.out.println(humanAncestors);


        // this array list is declared with the String type
        // therefore, it can receive only strings and null, but no other type
        ArrayList<String> humanAncestors2 = new ArrayList<String>();
        humanAncestors2.add("homo habilis");
        humanAncestors2.add("homo erectus");
        humanAncestors2.add(0, "homo floresiensis");
        humanAncestors2.add(null);
//        humanAncestors2.add(5);              // does not compile
//        humanAncestors2.add(false);          // does not compile
//        humanAncestors2.add(2,3.0);          // does not compile
//        humanAncestors2.add('Y');            // does not compile
//        humanAncestors2.add(2L, 2);          // does not compile, index can not be long
//        humanAncestors2.add(true, false);    // does not compile, index can not be boolean
        System.out.println(humanAncestors2);


        // this array list is declared with a reference type of a List,
        // and, although object type is as array list of strings,
        // it can receive other types than string.
        List humanAncestors3 = new ArrayList<String>();
        humanAncestors3.add("homo habilis");
        humanAncestors3.add("homo erectus");
        humanAncestors3.add(0, "homo floresiensis");
        humanAncestors3.add(null);
        humanAncestors3.add(5);              // does not compile
        humanAncestors3.add(false);          // does not compile
        humanAncestors3.add(2, 3.0);          // does not compile
        humanAncestors3.add('Y');            // does not compile
//        humanAncestors3.add(2L, 2);          // does not compile, index can not be long
//        humanAncestors3.add(true, false);    // does not compile, index can not be boolean
        System.out.println(humanAncestors3);


    }
}
