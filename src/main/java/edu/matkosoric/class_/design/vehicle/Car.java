package edu.matkosoric.class_.design.vehicle;

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
