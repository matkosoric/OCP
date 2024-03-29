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

public class MarvelHeroes {

    // output is: 3 5 3 3

    public static void main(String[] args) {

        List<String> linkedList1 = new LinkedList<>();
        Set<String> hashSet1 = new HashSet<>();
        String[] heroes = {"Hulk", "Ironman", "Spiderman", "Hulk", "Ironman"};

        for (String hero : heroes) {
            linkedList1.add(hero);
            hashSet1.add(hero);
        }

        System.out.print(hashSet1.size() + " " + linkedList1.size() + " ");
        HashSet hashSet2 = new HashSet(linkedList1);
        LinkedList linkedList2 = new LinkedList(hashSet1);

        System.out.print(hashSet2.size() + " " + linkedList2.size());

    }

}
