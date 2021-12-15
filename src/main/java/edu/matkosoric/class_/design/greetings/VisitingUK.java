package edu.matkosoric.class_.design.greetings;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class VisitingUK extends FrenchMan {

//    output is:
//    Bonjour le monde!
//    Hello world!

    private void print() {
        System.out.println("Hello world!");
    }

    public void hello() {
        print();
    }

    public static void main(String[] args) {

        VisitingUK visitingUK = new VisitingUK();

        visitingUK.bonojur();
        visitingUK.hello();

    }

}
