package edu.matkosoric.execution.output.painters;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourPainters {

    // what is the output?
    // Map: 4 Keys: 0 Values: 0

    static Map<String, String> map = new HashMap<>();
    static List<String> keys = new ArrayList<>(List.of("van Gogh", "Monet", "Picasso", "Renoir"));
    static String[] values = {"one", "two", "three", "four"};

    static {
        for (var i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values[i]);
        }
    }

    public static void main(String[] args) {

        keys.clear();
        values = new String[0];
        System.out.println("Map: " + map.size() +
                " Keys: " + keys.size() +
                " Values: " + values.length);

    }

}
