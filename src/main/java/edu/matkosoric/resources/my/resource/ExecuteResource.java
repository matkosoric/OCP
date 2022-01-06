package edu.matkosoric.resources.my.resource;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class ExecuteResource {

    // how to use custom class in try-with-resources statement?
    // implement AutoCloseable interface

    public static void main(String[] args) {

        // does not compile
//        try (MyResource1 myResource1 = new MyResource1()) {
//            System.out.println("Does not work");
//        }

        try (MyResource2 myResource2 = new MyResource2()) {
            System.out.println("Works");
        }


    }
}
