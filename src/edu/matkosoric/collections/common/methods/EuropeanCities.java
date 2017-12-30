package edu.matkosoric.collections.common.methods;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;

public class EuropeanCities {

    // demonstration of common collections methods

    public static void main(String[] args) {

        List<String> citiesList = new ArrayList<>();

        citiesList.add("London");
        citiesList.add("Paris");
        citiesList.add("Berlin");
        citiesList.add("Zadar");

        // add() method returns a boolean
        System.out.println(citiesList.add("Madrid"));

        System.out.println(citiesList);

        citiesList.remove("Berlin");
        System.out.println(citiesList);

        // remove method returns a boolean
        System.out.println(citiesList.remove("Madrid"));
        System.out.println(citiesList);

        // isEmpty() method returns a boolean
        System.out.println(citiesList.isEmpty());

        // size() method returns an integer
        System.out.println(citiesList.size());

        // contains() method returns a boolean
        System.out.println(citiesList.contains("Zadar"));
        System.out.println(citiesList.contains("Imotski"));

        // clear() method returns void
        System.out.println(citiesList);
        citiesList.clear();
        System.out.println(citiesList);

    }

}
