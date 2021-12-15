package edu.matkosoric.execution.output.stalking.peter;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;

public class StalkingPeter {

    // what is the output?
    // runtime error: java.lang.IndexOutOfBoundsException

    public static void main(String[] args) {

        var data = new ArrayList<>();
        data.add("Peter");
        data.add(30);
        data.add("Market Road");
        data.set(1, 25);
        data.remove(2);
        data.set(3, 1000L);
        System.out.print(data);

    }

}
