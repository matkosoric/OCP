package edu.matkosoric.execution.output.senate;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Senate {

    // what is the output?
    // Keys: 0 Values: 0 Map: 4

    static Map<String, String> map = new HashMap<>();
    static List<String> keys = new ArrayList<>(List.of("S", "P", "Q", "R"));
    static String[] values = {"senate", "people", "of", "rome"};

    static {
        for (var i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values[i]);
        }
    }

    public static void main(String[] args) {
        keys.clear();
        values = new String[0];
        System.out.println("Keys: " + keys.size() +
                " Values: " + values.length +
                " Map: " + map.size());
    }

}
