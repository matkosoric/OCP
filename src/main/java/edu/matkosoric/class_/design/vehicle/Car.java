package edu.matkosoric.class_.design.vehicle;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;

public class Car extends Vehicle {

    // is @Override necessary ?
    // no

//    @Override
    public void run() {
        var list = new ArrayList<>();
        list.add("hello");
        System.out.println(list);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.run();
    }
}
