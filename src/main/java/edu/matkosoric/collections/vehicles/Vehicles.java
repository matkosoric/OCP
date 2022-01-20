package edu.matkosoric.collections.vehicles;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;

public class Vehicles {

    // what is the output?
    // true

    public static void main(String... args) {

        List<String> list1 = new ArrayList<>(List.of("Plane", "Automobile", "Motorcycle"));
        List<String> list2 = new ArrayList<>(List.copyOf(list1));

        list1.sort((String item1, String item2) -> item1.compareTo(item2));
        list2.sort((String item1, String item2) -> item1.compareTo(item2));

        System.out.println(list1.equals(list2));

    }
}
