package edu.matkosoric.collections.vegetables_and_fish;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;

public class VegetablesAndFish {

    // List interface does not accept char type

    public static void main(String[] args) {

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Kale");
        vegetables.add(0, "Lettuce");
        System.out.println(vegetables);

//        List<char> fish = new ArrayList<>();      // does not compile
//        fish.add("Salmon");
//        fish.add(0,"Seabass");
//        System.out.println(fish);

    }

}
