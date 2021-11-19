package edu.matkosoric.resources.auto.closing;

public class UsingResource {

    public static void main(String[] args) {

        // what is the output?

        // A
        // C
        // close() method
        // D
        // close() is executed after try block and before finally block

        try (Resource r = new Resource()) {
            r.printResource();
        } finally {
            System.out.println("D");

        }
    }
}
