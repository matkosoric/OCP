package edu.matkosoric.concurrency.concurrent.collection;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

// #tag0122

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class BluesBrothersSoundtrack {

    // CopyOnWrite is copying entire collection during each modification
    // regular ArrayList would throw a ConcurrentModificationException in this case

    public static void main(String[] args) {

        List<String> bb = new CopyOnWriteArrayList<>();
        bb.add("Think");
        bb.add("Sweet Home Chicago");
        bb.add("The Old Landmark");
        bb.add("Gimme Some Lovin'");


        for (String element : bb) {
            System.out.println(element);
            bb.add("extra song");
        }

        System.out.println("Set size is: " + bb.size());

    }

}
