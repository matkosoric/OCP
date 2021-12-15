package edu.matkosoric.execution.output.display;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var lst = List.of(1, 2.0f, "4.0");
        for (var c : lst) {
            System.out.println("> " + c);
        }
        System.out.println();
        lst.add(2, 3);                  // runtime error
        for (int c = 0; c < lst.size(); c++) {
//            display(lst.get(c));                    // does not compile
        }
    }

//    public static void display(var c) {               // does not compile
//        System.out.println("> " + c);
//    }

}
