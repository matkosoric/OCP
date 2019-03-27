package edu.matkosoric.class_.design.instance.of;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

public class Life {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Horse horse = new Horse();
        Plant plant = new Plant();
        Pine pine = new Pine();
        Rock rock = new Rock();
        Reproducing human = new Animal();

        System.out.println(animal instanceof Animal);               // true
        System.out.println(animal instanceof Horse);                // false
        System.out.println(animal instanceof Reproducing);          // true
//        System.out.println(animal instanceof Pine);               // does not compile

        System.out.println(horse instanceof Animal);                // true
        System.out.println(horse instanceof Horse);                 // true
        System.out.println(horse instanceof Reproducing);           // true

        System.out.println(plant instanceof Plant);                 // true
        System.out.println(plant instanceof Pine);                  // false
        System.out.println(plant instanceof Reproducing);           // false
//        System.out.println(plant instanceof Animal);              // does not compile
//        System.out.println(plant instanceof Rock);                // does not compile

        System.out.println(pine instanceof Plant);                  // true
        System.out.println(pine instanceof Pine);                   // true
        System.out.println(pine instanceof Reproducing);            // true
//        System.out.println(pine instanceof Rock);                 // does not compile
//        System.out.println(pine instanceof Animal);               // does not compile

        System.out.println(rock instanceof Rock);                   // true
        System.out.println(rock instanceof Reproducing);            // false
//        System.out.println(rock instanceof Animal);               // does not compile
//        System.out.println(rock instanceof Horse);                // does not compile
//        System.out.println(rock instanceof Plant);                // does not compile
//        System.out.println(rock instanceof Pine);                 // does not compile

        System.out.println(human instanceof Animal);                // true
        System.out.println(human instanceof Plant);                 // false
        System.out.println(human instanceof Rock);                  // false
        System.out.println(human instanceof Reproducing);           // true
        System.out.println(human instanceof Pine);                  // false

    }

}

class Animal implements Reproducing{}

class Horse extends Animal {}

class Plant {}

class Pine extends Plant implements Reproducing{}

class Rock {}

interface Reproducing {}
