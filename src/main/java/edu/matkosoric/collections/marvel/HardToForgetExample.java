package edu.matkosoric.collections.marvel;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HardToForgetExample {

    // what is the output?
    // 3 5 3 3

    public static void main(String[] args) {

        List<String> list1 = new LinkedList<String>();
        Set<String> hs1 = new HashSet<String>();
        String[] v = {"a", "b", "c", "b", "a"};
        for (String s : v) {
            list1.add(s);
            hs1.add(s);
        }
        System.out.print(hs1.size() + " " + list1.size() + " ");
        HashSet hs2 = new HashSet(list1);
        LinkedList list2 = new LinkedList(hs1);
        System.out.print(hs2.size() + " " + list2.size());

    }
}
