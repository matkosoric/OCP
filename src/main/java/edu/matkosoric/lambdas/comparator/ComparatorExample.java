package edu.matkosoric.lambdas.comparator;

import javax.swing.*;
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
