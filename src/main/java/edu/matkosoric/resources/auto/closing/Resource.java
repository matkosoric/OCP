package edu.matkosoric.resources.auto.closing;

public class Resource implements AutoCloseable {
    public Resource() {
        System.out.println("A");
    }

    @Override
    public void close() {
        System.out.println("close() method");
    }

    public void printResource() {
        System.out.println("C");
    }
}
