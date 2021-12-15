package edu.matkosoric.lambdas.comparator;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Comparator;

public class ComparatorExample {

    // what kind of Comparator code compiles?


//    Does not compile
//    Comparator comparator = new Comparator() {
//        public int compare(Integer i, Integer j) {
//            return i.compareTo(j);
//        }
//    };


//    Does not compile
//    var comparator = new Comparator<>() {
//        public int compare(Integer i, Integer j) {
//            return i.compareTo(j);
//        }
//    };


//    Does not compile
//    Comparator<> comparator = new Comparator() {
//        public int compare(Integer i, Integer j) {
//            return i.compareTo(j);
//        }
//    }


    // Compiles
    Comparator<Integer> comparator = new Comparator<Integer>() {
        public int compare(Integer i, Integer j) {
            return i.compareTo(j);
        }
    };


}
