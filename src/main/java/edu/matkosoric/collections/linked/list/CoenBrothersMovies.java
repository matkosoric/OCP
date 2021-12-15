package edu.matkosoric.collections.linked.list;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.Iterator;
import java.util.LinkedList;

public class CoenBrothersMovies {

    // demonstration of methods for LinkedList

    public static void main(String[] args) {

        // linkedList is created with String as its parameterized type
        LinkedList<String> coenMovies = new LinkedList();

        // adding elements to the list
        coenMovies.add("Fargo");
        coenMovies.add(0, "The Big Lebowski");
        coenMovies.addFirst("O Brother, Where Art Thou?");
        coenMovies.addLast("The LadyKillers");

        // due to the fact of List interface allows duplicate entries,
        // this is allowed
        coenMovies.add("Fargo");
        coenMovies.add("O Brother, Where Art Thou?");

        // null is also allowed, including multiple nulls
        coenMovies.add(null);
        coenMovies.add(null);


        // getting the content out of linkedList
        System.out.println(coenMovies);

        // looping through the LinkedList
        for (String particularMovie : coenMovies)
            System.out.println(particularMovie);

        // looping with iterator, used before Java 5
        Iterator iter = coenMovies.iterator();
        int index = 0;
        while (iter.hasNext()) {
            System.out.println(index + ": " + (String) iter.next());
            index++;
        }

        // looping with method reference
        System.out.println("METHOD REFERENCE: ");
        coenMovies.forEach(System.out::println);


        // getting only one element
        System.out.println("Second element is: " + coenMovies.get(2));
//        System.out.println(coenMovies.get(-6));     // compiles, but throws IndexOutOfBoundsException at runtime
//        System.out.println(coenMovies.get(300));    // compiles, but throws IndexOutOfBoundsException at runtime
        System.out.println("FIRST ELEMENT: " + coenMovies.getFirst());
        System.out.println("LAST ELEMENT: " + coenMovies.getLast());

        // getting the position of particular element
        System.out.println(coenMovies.indexOf("Fargo"));        // returns first occurrence of element
        System.out.println(coenMovies.lastIndexOf("Fargo")); // returns last position of element
        System.out.println(coenMovies.indexOf("Terminator"));   // returns -1, signifying missing element

        // deleting elements
        System.out.println(coenMovies);
        System.out.println(coenMovies.remove());    // remove() method removes first element, and returns it
        System.out.println(coenMovies);

        System.out.println(coenMovies.remove(6));
        System.out.println(coenMovies);

        System.out.println(coenMovies.remove("Fargo"));     // removes first occurrence of the element, and returns true
        System.out.println(coenMovies);

        System.out.println(coenMovies.remove("12 Angry Men"));  // returns false, since this element is not in the list
        System.out.println(coenMovies);


        // updating item value
        System.out.println(coenMovies.set(4, "No Country for Old Men")); // returns old element and replaces it with new one
        System.out.println(coenMovies);

    }

}
