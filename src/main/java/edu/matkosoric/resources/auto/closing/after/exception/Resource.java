package edu.matkosoric.resources.auto.closing.after.exception;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

public class Resource implements AutoCloseable {

    // close() method from AutoCloseable interface within try-with-resources
    // gets executed before actual Exception handling

    @Override
    public void close() throws Exception {
        System.out.println("Clean up");
    }

    public static void main(String[] args) {
        try (var a = new Resource()) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }

}
