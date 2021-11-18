package edu.matkosoric.map.tree.map;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Spielberg {

    // demonstration of TreeMap methods

    public static void main(String[] args) {

        Map<Integer, String> spielbergMovies = new TreeMap();

        // adding items
        spielbergMovies.put(2005, "War of the Worlds");
        spielbergMovies.put(1987, "Empire of the Sun");
        spielbergMovies.put(1975, "Jaws");
        System.out.println(spielbergMovies.put(1993, "Jurassic Park"));      // adding new item returns true
        System.out.println(spielbergMovies.put(1993, "Schindler's List"));   // replacing returns old value
//        spielbergMovies.add(null);  // compiles, but throws a NullPointerException at runtime

        // TreeMap is sorted and navigable, which means:
        // 1. items are ordered not by insertion sequence, but by key,
        // 2. items can be fetched from any position in a TreeMap

        // printing values
        System.out.println(spielbergMovies);
        spielbergMovies.forEach((year, title) -> System.out.println(year + ": " + title));

        // getting all the keys
        Set<Integer> years = spielbergMovies.keySet();
        years.forEach(System.out::println);

        // getting all the values
        Collection<String> titles = spielbergMovies.values();
        titles.forEach(System.out::println);

        // getting item by key
        System.out.println(spielbergMovies.get(1987));      // existing item
        System.out.println(spielbergMovies.get(9000));      // non-existing item, returns null

        // checking presence of a key
        System.out.println(spielbergMovies.containsKey(2005));  // true
        System.out.println(spielbergMovies.containsKey(6000));  // false

        // checking presence of a value
        System.out.println(spielbergMovies.containsValue("War of the Worlds"));     // true
        System.out.println(spielbergMovies.containsValue("Casablanca"));            // false

        // deleting an item
        System.out.println(spielbergMovies.remove(2005));   // returns value of a matching key
        System.out.println(spielbergMovies.remove(2005));   // returns null, key does not exist any more

        // deleting complete map
        System.out.println(spielbergMovies.size());
        System.out.println(spielbergMovies.isEmpty());
        spielbergMovies.clear();
        System.out.println(spielbergMovies.size());
        System.out.println(spielbergMovies.isEmpty());

    }

}
