package edu.matkosoric.collections.array.deque;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.ArrayDeque;
import java.util.Queue;

public class TomWaitsAlbums {

    // demonstration of ArrayDeque

    public static void main(String[] args) {

        Queue<String> tomWaitsAlbums = new ArrayDeque<>();

        tomWaitsAlbums.add("Rain Dogs");
        tomWaitsAlbums.add("Closing Time");

//        tomWaitsAlbums.add(null);                   // compiles, but throws NullPointerException at runtime
//        tomWaitsAlbums.add(56L);                    // does not compile, wrong type
//        tomWaitsAlbums.add(0, "Small Change");      // does not compile, index can not be defined

        // successful adding returns true
        System.out.println(tomWaitsAlbums);
        System.out.println(tomWaitsAlbums.add("Blue Valentine"));       // adds item at the end
        System.out.println(tomWaitsAlbums.offer("The Heart of Saturday Night"));    // adds item at the end
//        System.out.println(tomWaitsAlbums.push(""));        // does not compile, reference type is Queue, not ArrayDeque

        // retrieving with element() method returns first item
        System.out.println(tomWaitsAlbums.element());

        // printing all elements
        System.out.println(tomWaitsAlbums);

        System.out.println(tomWaitsAlbums.remove("Blue Valentine"));
        System.out.println(tomWaitsAlbums.remove("Let It Bleed"));      // returns false, since there is no such item

        System.out.println(tomWaitsAlbums);
        System.out.println(tomWaitsAlbums.poll());      // removes first element
        System.out.println(tomWaitsAlbums);
        System.out.println(tomWaitsAlbums.peek());      // returns first element
        System.out.println(tomWaitsAlbums);
//        System.out.println(tomWaitsAlbums.pop());       // does not compile, not a Queue method

        tomWaitsAlbums.clear();
        System.out.println(tomWaitsAlbums);         // empty ArrayDeque
        System.out.println(tomWaitsAlbums.poll());  // returns null
        System.out.println(tomWaitsAlbums.peek());  // returns null

//        System.out.println(tomWaitsAlbums.element());   // compiles, but throws NoSuchElementException at runtime
//        System.out.println(tomWaitsAlbums.remove());    // compiles, but throws NoSuchElementException at runtime

    }
}
