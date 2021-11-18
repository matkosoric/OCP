package edu.matkosoric.collections.vegetables_and_fish;

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
