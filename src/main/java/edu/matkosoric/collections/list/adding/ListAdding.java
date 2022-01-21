package edu.matkosoric.collections.list.adding;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.List;

public class ListAdding {

    // what is the result?
    // runtime exception: UnsupportedOperationException

    public static void main(String[] args) {

        List<Integer> even = List.of();
        even.add(0, -1);        // UnsupportedOperationException
        even.add(0, -2);
        even.add(0, -3);
        System.out.println(even);

    }
}
