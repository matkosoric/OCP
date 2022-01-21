package edu.matkosoric.execution.output.object;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Over {

    // what is the output?
    // I am an Object

    public void analyse(Object[] o) {
        System.out.println("I am an object array");
    }

    public void analyse(long[] l) {
        System.out.println("I am an array");
    }

    public void analyse(Object o) {
        System.out.println("I am an Object");
    }

    public static void main(String[] args) {

        int[] nums = new int[10];
        new Over().analyse(nums);

    }

}
