package edu.matkosoric.streams.items.count;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.List;

// #TAG2

public class ItemCount {

    // find item with count below zero

    public static void main(String[] args) {

        var items = List.of(new Item("A", 10),
                new Item("B", 2),
                new Item("C", 12),
                new Item("D", 5),
                new Item("E", -6));

        if (items.stream().anyMatch(i -> i.count < 0)) {
            System.out.println("There is an item for which the variable count is below zero.");
        }

        if (items.stream().filter(i -> i.count < 0).findAny().isPresent()) {
            System.out.println("There is an item for which the variable count is below zero.");
        }

    }

}
