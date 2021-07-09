package edu.matkosoric.map.hash.map;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.*;

public class RollingStones {

    // demonstration of HashMap methods

    public static void main(String[] args) {

        HashMap<Integer, String> rollingStonesAlbums = new HashMap<>();

        // adding elements
        rollingStonesAlbums.put(1969, "Let It Bleed");
        rollingStonesAlbums.put(1966, "Aftermath");
        rollingStonesAlbums.put(1976, "Black and Blue");
        System.out.println(rollingStonesAlbums.put(2008, "Shine a Light"));     // returns null when adding new pair

        // checking presence of value or key
        System.out.println(rollingStonesAlbums.containsKey(1969));
        System.out.println(rollingStonesAlbums.containsKey(3000));
        System.out.println(rollingStonesAlbums.containsValue("Aftermath"));
        System.out.println(rollingStonesAlbums.containsKey("The Dark Side of The Moon"));

        // getting values by key
        System.out.println(rollingStonesAlbums.get(1966));
        System.out.println(rollingStonesAlbums.get(5000));

        // replacing values
        System.out.println(rollingStonesAlbums);
        System.out.println(rollingStonesAlbums.put(1976, "Stones Story"));
        System.out.println(rollingStonesAlbums);

        // getting all the keys
        Set<Integer> keys = new HashSet<>();
        keys = rollingStonesAlbums.keySet();
        keys.forEach(System.out::println);

        // getting all the values
        Collection<String> values;
        values = rollingStonesAlbums.values();
        values.forEach(System.out::println);

        // delete
        System.out.println(rollingStonesAlbums.remove(1969));   // returns matching value and deletes it
        System.out.println(rollingStonesAlbums.remove(6000));   // non-existing key returns null
        System.out.println(rollingStonesAlbums.remove(2008, "Shine a Light"));  // returns true
        System.out.println(rollingStonesAlbums);

        // checking size
        System.out.println("SIZE: " + rollingStonesAlbums.size());
        System.out.println(rollingStonesAlbums.isEmpty());
        rollingStonesAlbums.clear();
        System.out.println(rollingStonesAlbums.isEmpty());

    }
}
